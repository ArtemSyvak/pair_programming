package pack.entity;


import javax.persistence.*;
import pack.entity.User;


@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    private String artistName;
    private String releaseName;
    private String genre;
    private String description;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    User user = new User();


    public Product() {
    }

    public Product(String releaseName) {
        this.releaseName = releaseName;
    }

    public Product(int price, String artistName, String releaseName, String genre, String description) {
        this.price = price;
        this.artistName = artistName;
        this.releaseName = releaseName;
        this.genre = genre;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product(int price, String artistName, String releaseName, String genre, String description, User user) {
        this.price = price;
        this.artistName = artistName;
        this.releaseName = releaseName;
        this.genre = genre;
        this.description = description;
        this.user = user;
    }
}
