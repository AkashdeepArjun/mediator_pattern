package home;

public class FacebookUserImp extends FacebookUser{
    
    public FacebookUserImp(FacebookGroupMessageService groupMessageService, String name) {
        super(groupMessageService, name);
        
    }

    @Override
    public void recieveText(String message) {
        MyUtils.log("FACEBOOK USER "+this.name+" RECIEVED MESSAGE", message);
        
    }

    @Override
    public void sendText(String message) {
            MyUtils.log("FACEBOOK USER "+this.name+
            " SENDING MESSAGE EVENT ",message);
        groupMessageService.sendMessage(message, this);
    }
}
