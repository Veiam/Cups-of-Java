// Where does the dependency go?
// your application code sheds its heavy weight dependencies
public class TweetClientFactory {
    private static TweetClient testValue;

    // you still have to write boilerplate code to build stuff
    public static TweetClient get() {
        if (testValue != null) {
            return testValue;
        }

        Shortener shortener = ShortenerFactory.get();
        Tweeter tweeter = TweeterFactory.get();
        return new TweetClient(shortener, tweeter);
    }
}
