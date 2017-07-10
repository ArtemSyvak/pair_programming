package pack.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;




@Entity
public class User implements UserDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    public boolean accountNonExpired = true;
    public boolean accountNonLocked = true;
    public boolean credentialsNonExpired = true;
    public boolean enabled = true;
    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<Product> product = new ArrayList<Product>();

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAccountNonExpired(){
        return accountNonExpired;
    }

    public boolean isAccountNonLocked(){
        return accountNonLocked;
    }

    public boolean isCredentialsNonExpired(){
        return credentialsNonExpired;
    }

    public boolean isEnabled(){
        return enabled;
    }

    public Collection<? extends GrantedAuthority> getAuthorities(){
        List<SimpleGrantedAuthority> authority = new ArrayList<SimpleGrantedAuthority>();
        authority.add(new SimpleGrantedAuthority(role.name()));
        return authority;

    }



    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public User(){

    }

    public User(String username) {

    }

    public User(String username, String password, List<Product> product) {
        this.username = username;
        this.password = password;
        this.product = product;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
