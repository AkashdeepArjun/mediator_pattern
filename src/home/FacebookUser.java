package home;

public abstract class FacebookUser {
    protected FacebookGroupMessageService  groupMessageService;
    protected String name;

    public FacebookUser(FacebookGroupMessageService groupMessageService,String name){
        this.groupMessageService=groupMessageService;
        this.name=name;
    }
    public abstract void sendText(String message);
    public abstract void recieveText(String message);

}
