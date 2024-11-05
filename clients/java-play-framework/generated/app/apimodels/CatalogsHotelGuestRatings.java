package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * If specified, you must provide all properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelGuestRatings   {
  @JsonProperty("score")
  @Valid

  private BigDecimal score;

  @JsonProperty("number_of_reviewers")
  
  private Integer numberOfReviewers;

  @JsonProperty("max_score")
  @Valid

  private BigDecimal maxScore;

  @JsonProperty("rating_system")
  
  private String ratingSystem;

  public CatalogsHotelGuestRatings score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * Your hotel's rating.
   * @return score
  **/
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public CatalogsHotelGuestRatings numberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
    return this;
  }

   /**
   * Total number of people who have rated this hotel.
   * @return numberOfReviewers
  **/
  public Integer getNumberOfReviewers() {
    return numberOfReviewers;
  }

  public void setNumberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

  public CatalogsHotelGuestRatings maxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
    return this;
  }

   /**
   * Max value for the hotel rating score.
   * @return maxScore
  **/
  public BigDecimal getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
  }

  public CatalogsHotelGuestRatings ratingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
    return this;
  }

   /**
   * System you use for guest reviews.
   * @return ratingSystem
  **/
  public String getRatingSystem() {
    return ratingSystem;
  }

  public void setRatingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
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
    return Objects.equals(score, catalogsHotelGuestRatings.score) &&
        Objects.equals(numberOfReviewers, catalogsHotelGuestRatings.numberOfReviewers) &&
        Objects.equals(maxScore, catalogsHotelGuestRatings.maxScore) &&
        Objects.equals(ratingSystem, catalogsHotelGuestRatings.ratingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, numberOfReviewers, maxScore, ratingSystem);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelGuestRatings {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    numberOfReviewers: ").append(toIndentedString(numberOfReviewers)).append("\n");
    sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
    sb.append("    ratingSystem: ").append(toIndentedString(ratingSystem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

