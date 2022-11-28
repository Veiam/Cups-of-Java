
// Configuring the injector using modules
import com.google.inject.AbstractModule;

// This boilerplate defines a binding annotation
// Everything is compile-time checked
// IDE autocomplete, import, find usages
// Avoids clumsy string matching
@BindingAnnotation
@Retention(RUNTIME)
@Target({ FIELD, PARAMETER, METHOD })
public @interface Username {
}

public class TweetModule extends AbstractModule {
    protected void configure() {
        // Bindings, map types to their implementations
        // to resolve a type, call its constructor
        bind(TweetClient.class);

        // Linked Bindings, to resolve a type, user another binding
        bind(Tweeter.class).to(SmsTweeter.class);
        bind(Shortener.class).to(TinyUrlShortener.class);

        // Binding Annotations
        // Uniquely identify a binding
        bind(String.class).annotatedWith(Username.class).toInstance("jesse");

        // Instance Bindings
        // always use the same value
        bind(Integer.class).annotatedWith(Port.class).toInstance(8080);

        // you can specify scopes in a module
        bind(ConnectedPool.class).to(ExecutorServicePool.class).in(Singleton.class);
    }

    // Provider methods
    // to resolve a type, call this method
    @Provides
    @Singleton
    Shortener provideShortener() {
        return new TinyUrlShortener();
    }

    @Inject
    public SmsTweeter(@Username String username) {
        this.username = username;
    }
}
