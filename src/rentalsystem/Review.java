package rentalsystem;

import java.util.Objects;

public class Review {
    private int id;
    private String reviewText;
    private int rating;

    public Review(int id, String reviewText, int rating) {
        this.id = id;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public Review() {
    }

    public int getId() {
        return id;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", reviewText=" + reviewText + ", rating=" + rating + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
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
        if (this.rating != other.rating) {
            return false;
        }
        if (!Objects.equals(this.reviewText, other.reviewText)) {
            return false;
        }
        return true;
    }
    
    
}
