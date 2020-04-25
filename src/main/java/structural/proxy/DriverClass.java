package structural.proxy;

public class DriverClass {

    public static void main(String []args){
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        try{
            System.out.println(twitterService.getTimeLine());
            System.out.println(twitterService.postToTimeline());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
