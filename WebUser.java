
public class WebUser {
    private String loginId;
    private String password;
    private UserState userState;
    private Customer customer;

    public enum UserState {
        New,
        Active,
        Blocked,
        Banned
    }

    public WebUser() {
    };

    // we dont set userstate because its useless, we're not gonna use it for this
    // application.
    public WebUser(String loginId, String password, Customer customer) {
        this.loginId = loginId;
        this.password = password;
        this.customer = customer;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
