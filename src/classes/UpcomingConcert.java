package classes;

public class UpcomingConcert {
    String date;
    String place;
    String price;
    String PGRating;

    public UpcomingConcert(String date, String place, String price, String PGRating) {
        this.date = date;
        this.place = place;
        this.price = price;
        this.PGRating = PGRating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPGRating() {
        return PGRating;
    }

    public void setPGRating(String PGRating) {
        this.PGRating = PGRating;
    }
}
