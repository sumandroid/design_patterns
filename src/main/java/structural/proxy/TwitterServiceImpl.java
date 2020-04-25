package structural.proxy;

public class TwitterServiceImpl implements TwitterService{

    @Override
    public String getTimeLine() {
        return "Suman's timeline";
    }

    @Override
    public String postToTimeline() {
        return "posted";
    }
}
