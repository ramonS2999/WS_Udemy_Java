package ospedi;

/**
 * Ospedi
 */
public class Ospedi {

    private String name;
    private String email;

    public Ospedi() {}

    public Ospedi(String name, String email) {
        setName(name);
        setEmail(email);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + ", " + email;
        }

}

