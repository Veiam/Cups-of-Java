// Applying scopes
// the best way is to annotate a class with its scope
@Singleton
public class TweetClient {
    public void postButtonClicked() {
        String text = textField.getText();
        if (text.length() > 140) {
            // Getting dependencies via their constructors
            // calling new directly doesn't afford testing
            Shortener shortener = new TinyUrlShortener();
            text = shortener.shorten(text);
        }
        if (text.length() <= 140) {
            Tweeter tweeter = new SmsTweeter();
            tweeter.send(text);
            textField.clear();
        }
    }

    // Injecting a provider
    @Inject
    Provider<Shortener> shortenerProvider;
    // to load lazily
    // to get multiple instances
    // to mix scopes

    public void postButtonClickedFactory() {
        String text = textField.getText();
        if (text.length() > 140) {
            Shortener shortener = shortenerProvider.get();
            text = shortener.shorten(text);
        }
        if (text.length() <= 140) {
            // Getting dependenceis from factories
            Tweeter tweeter = TweeterFactory.get();
            tweeter.send(text);
            textField.clear();
        }
    }

    // Dependency injection by hand
    // Constructor injection
    // to supply dependencies when creating an object
    private final Shortener shorterner;
    private final Twetter tweeter;

    // Field injection
    // sets dependencies into a new or existing instance
    // @Inject Shortener shortener;
    // @Inject Twetter tweeter;
    // Concise, but difficult to test

    // objects come to you
    // Telling Guice to use your constructor
    // annote a constructor with @Inject
    @Inject
    public TweetClient(Shortener shortener, Tweeter tweeter) {
        this.shorterner = shortener;
        this.tweeter = tweeter;
    }

    // Method injection
    // sets dependencies into a new or existing instance
    @Inject
    void setShortener(Shortener shortener) {
        this.shortener = shortener;
    }

    @Inject
    void setTwetter(Tweeter tweeter) {
        this.tweeter = tweeter;
    }

    // Bootstrapping Guice
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TweetModule());

        TweetClient tweetClient = injector.getInstance(TweetClient.class);
        tweetClient.show();
    }
}
