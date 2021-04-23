package hu.proba.demo;

public class Fordito {

    private String c;

    public Fordito(String c)
    { this.c = c; }

    public void fordit()
    {   StringBuilder sc = new StringBuilder();
        sc.append(this.c);
        this.c = sc.reverse().toString(); }

    public void setMessages(String c)
    {  this.c = c; }

    public String getMessages() {
        return this.c;
    }

}






