package home;

public class Test {
    public static void main(String[] args){

    FacebookGroupMessageServiceImp service = new FacebookGroupMessageServiceImp();
    FacebookUser user_aman = new FacebookUserImp(service, "aman");
    FacebookUser user_akash = new FacebookUserImp(service, "akash");
    FacebookUser user_gaurav = new FacebookUserImp(service, "gaurav");
    FacebookUser user_gurasees= new FacebookUserImp(service,"gurasees");
    service.addUser(user_akash);
    service.addUser(user_aman);
    service.addUser(user_gaurav);
    service.addUser(user_gurasees);

    user_akash.sendText("hello kida sare");
    user_aman.sendText("vdia");

    }
    
}
