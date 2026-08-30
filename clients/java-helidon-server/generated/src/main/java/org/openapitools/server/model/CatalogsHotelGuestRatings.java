package org.openapitools.server.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelGuestRatings   {

    private BigDecimal maxScore;
    private Integer numberOfReviewers;
    private String ratingSystem;
    private BigDecimal score;

    /**
     * Default constructor.
     */
    public CatalogsHotelGuestRatings() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelGuestRatings.
     *
     * @param maxScore Max value for the hotel rating score.
     * @param numberOfReviewers Total number of people who have rated this hotel.
     * @param ratingSystem System you use for guest reviews.
     * @param score Your hotel&#39;s rating.
     */
    public CatalogsHotelGuestRatings(
        BigDecimal maxScore, 
        Integer numberOfReviewers, 
        String ratingSystem, 
        BigDecimal score
    ) {
        this.maxScore = maxScore;
        this.numberOfReviewers = numberOfReviewers;
        this.ratingSystem = ratingSystem;
        this.score = score;
    }



    /**
     * Max value for the hotel rating score.
     * @return maxScore
     */
    public BigDecimal getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(BigDecimal maxScore) {
        this.maxScore = maxScore;
    }

    /**
     * Total number of people who have rated this hotel.
     * @return numberOfReviewers
     */
    public Integer getNumberOfReviewers() {
        return numberOfReviewers;
    }

    public void setNumberOfReviewers(Integer numberOfReviewers) {
        this.numberOfReviewers = numberOfReviewers;
    }

    /**
     * System you use for guest reviews.
     * @return ratingSystem
     */
    public String getRatingSystem() {
        return ratingSystem;
    }

    public void setRatingSystem(String ratingSystem) {
        this.ratingSystem = ratingSystem;
    }

    /**
     * Your hotel's rating.
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelGuestRatings {\n");
        
        sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
        sb.append("    numberOfReviewers: ").append(toIndentedString(numberOfReviewers)).append("\n");
        sb.append("    ratingSystem: ").append(toIndentedString(ratingSystem)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

