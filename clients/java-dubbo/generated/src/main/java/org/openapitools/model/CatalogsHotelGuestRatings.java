package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsHotelGuestRatings implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Max value for the hotel rating score.
   */
  @JsonProperty("max_score")
  private BigDecimal maxScore;

  /**
   * Total number of people who have rated this hotel.
   */
  @JsonProperty("number_of_reviewers")
  private Integer numberOfReviewers;

  /**
   * System you use for guest reviews.
   */
  @JsonProperty("rating_system")
  private String ratingSystem;

  /**
   * Your hotel&#39;s rating.
   */
  @JsonProperty("score")
  private BigDecimal score;

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
   * Your hotel&#39;s rating.
   * @return score
   */
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelGuestRatings catalogsHotelGuestRatings = (CatalogsHotelGuestRatings) o;
    return Objects.equals(this.maxScore, catalogsHotelGuestRatings.maxScore) &&
        Objects.equals(this.numberOfReviewers, catalogsHotelGuestRatings.numberOfReviewers) &&
        Objects.equals(this.ratingSystem, catalogsHotelGuestRatings.ratingSystem) &&
        Objects.equals(this.score, catalogsHotelGuestRatings.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxScore, numberOfReviewers, ratingSystem, score);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
