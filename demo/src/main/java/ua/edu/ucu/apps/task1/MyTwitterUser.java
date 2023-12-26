package ua.edu.ucu.apps.task1;

public class MyTwitterUser implements MyUser{
    private TwitterUser twitterUser;
    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Object getLastActiveTime() {
        return twitterUser.getLastActiveTime().toLocalDate();
    }
}
