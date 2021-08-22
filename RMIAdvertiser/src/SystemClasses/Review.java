package SystemClasses;

import java.io.Serializable;
import java.util.Objects;

public class Review implements Serializable {
    private int id;
    private String reviewText;
    private int rating;

    public Review(int id, String reviewText, int rating) {
        this.id = id;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Review other = (Review) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.reviewText, other.reviewText)) {
            return false;
        }
        if (this.rating != other.rating) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", reviewText=" + reviewText + ", rating=" + rating + '}';
    }
    
}
