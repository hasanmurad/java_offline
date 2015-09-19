package newpackage;

/**
 * Created by MURAD on 9/17/2015.
 */
public class Author {
    private String name=new String();
    private String email=new String();
        Author() {

        }
    public   Author(String name, String email) {
        this.name = name;
        setEmail(email);
        }

    public    Author(String name) {
        this.name = name;
        }

    public    String getName()  {
        return name;
        }

    public    String getEmail()  {
        return email;
        }

    public    void setEmail(String email) {
        this.email = email;
        }

    public     void print()  {
            System.out.println(name+" at "+email);
        }
}
