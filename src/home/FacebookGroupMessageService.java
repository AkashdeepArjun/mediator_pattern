package home;
interface FacebookGroupMessageService{
    
    public void sendMessage(String message,FacebookUser owner);
    public void addUser(FacebookUser user);
}