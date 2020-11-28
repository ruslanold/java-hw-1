public class Index {
    public static void main(String[] args) {

        User user = new User();
        System.out.println(user.toString());
        Admin admin = new Admin(1,"admin", "11111", true);
        admin.deleteByUserID(2);

    }
}
