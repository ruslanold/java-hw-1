public class Admin extends User {

    private long id;
    private String name;
    private String password;
    private boolean active;

    public Admin () {}

    public Admin (long id, String name, String password, boolean active) {
        super(id, name, password, active);
        this.id = id;
        this.name = name;
        this.password = password;
        this.active = active;
    }
    public void deleteByUserID(int userId) {
        deleteUser(userId);
    }
    private void deleteUser(int userId) {
       System.out.println("Deleted userId - " + userId);
    }



    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                '}';
    }
}
