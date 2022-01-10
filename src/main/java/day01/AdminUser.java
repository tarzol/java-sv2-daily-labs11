package day01;

public class AdminUser implements User{

    private String email;
    private String password;

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        int length = password.length();
        StringBuilder stars = new StringBuilder();
        while (length > 0 ) {
            stars.append("*");
            length--;
        }
        return stars.toString();
    }

    public static void main(String[] args) {
        NormalUser normalUser = new NormalUser("normal@gmail.com", "1234");
        AdminUser adminUser = new AdminUser("admin@gmail.com", "1234");
        System.out.println("Normal user: "+ normalUser.getUserEmail()+" "+normalUser.getPassword());
        System.out.println("Admin user: "+adminUser.getUserEmail()+" "+adminUser.getPassword());
    }
}
