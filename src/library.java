import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.util.ArrayList;
import java.util.List;



class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private String isbn;
    private double price;
    private String currency;
    private Publisher publisher;
    private List<Review> reviews;
    private List<Award> awards;

    public Book(String id, String title, String author, int year, String genre, double price, String currency, String isbn, Publisher publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.currency = currency;
        this.isbn = isbn;
        this.publisher = publisher;
        this.reviews = new ArrayList<>();
        this.awards = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Award> getAwards() {
        return awards;
    }

    // Adders for reviews and awards
    public void addReview(Review review) {
        reviews.add(review);
    }

    public void addAward(Award award) {
        awards.add(award);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Book ID: ").append(id)
                .append("\nTitle: ").append(title)
                .append("\nAuthor: ").append(author)
                .append("\nYear: ").append(year)
                .append("\nGenre: ").append(genre)
                .append("\nPrice: ").append(price).append(" ").append(currency)
                .append("\nISBN: ").append(isbn)
                .append("\nPublisher:\n").append(publisher);
        result.append("\nReviews:\n");
        for (Review review : reviews) {
            result.append(review.toString()).append("\n");
        }
        result.append("Awards:\n");
        for (Award award : awards) {
            result.append(award.toString()).append("\n");
        }

        return result.toString();
    }
}

class Publisher {
    private String name;
    private Address address;

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", " + address;
    }
}

class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}

class Review {
    private String user;
    private int rating;
    private String comment;

    public Review(String user, int rating, String comment) {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return user + " (" + rating + "): " + comment;
    }
}

class Award {
    private String name;

    public Award(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
