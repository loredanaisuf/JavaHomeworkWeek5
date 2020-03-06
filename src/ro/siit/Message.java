package ro.siit;

public class Message {
    private String phoneNumber;
    private String message;

    Message(String phoneNumber, String message){
        this.phoneNumber=phoneNumber;
        this.message=message;
    }

    @Override
    public String toString() {
        return "Phone number: "+this.phoneNumber+" Message: "+this.message;
    }
}
