// Implementing the facotry
// all of this boilerplate slows you down
// End up compiling eveything
public class TweeterFactory {
    private static Tweeter testValue;

    public static Tweeter get() {
        if (textValue != null) {
            return testValue;
        }
        return new SmsTweeter();
    }

    public static void setForTesting(Tweeter tweeter) {
        testValue = tweeter;
    }

    // Testing with a factory
    public void testSendTweet() {
        MockTweeter tweeter = new MockTweeter();
        TweeterFactory.setForTesting(tweeter);
        try {
            TweetClient tweetClient = new TweetClient();
            tweetClient.getEditor().setText("Hello!");
            tweetClient.postButtonClicked();
            assertEquals("Hello!", tweeter.getSent());
            // but don't forget to clean up afterwards
        } finally {
            // properly
            TweeterFactory.setForTesting(null);
        }
    }

    // Testing with dependency injection
    public void testSendTweetIC() {
        MockShortener shortener = new MockShortener();
        MockTweeter tweeter = new MockTweeter();
        // No clean up required
        TweetClient tweetClient = new TweetClient(shortener, tweeter);
        tweetClient.getEditor().setText("Hello!");
        tweetClient.postButtonClicked();
        assertEquals("Hello!", tweeter.getSent());
    }
}