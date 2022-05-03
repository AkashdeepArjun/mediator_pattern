package home;

import java.util.ArrayList;
import java.util.List;

public class FacebookGroupMessageServiceImp implements FacebookGroupMessageService{
    
    private List<FacebookUser> facebook_users;

    public FacebookGroupMessageServiceImp(){
        facebook_users=new ArrayList<FacebookUser>();
    }
    @Override
    public void addUser(FacebookUser user) {
        facebook_users.add(user);
        
    }
    @Override
    public void sendMessage(String message, FacebookUser owner) {
       for(FacebookUser u:facebook_users){
           if(owner!=u){
               u.recieveText(message);
           }
       }
        
    }
}
