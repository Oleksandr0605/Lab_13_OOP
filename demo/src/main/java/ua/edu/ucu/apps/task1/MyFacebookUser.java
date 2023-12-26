package ua.edu.ucu.apps.task1;

public class MyFacebookUser implements MyUser{
    private FacebookUser facebookUser;
    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Object getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
