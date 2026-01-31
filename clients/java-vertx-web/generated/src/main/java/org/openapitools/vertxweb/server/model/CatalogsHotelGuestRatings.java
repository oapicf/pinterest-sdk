package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * If specified, you must provide all properties
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelGuestRatings   {
  
  private BigDecimal maxScore;
  private Integer numberOfReviewers;
  private String ratingSystem;
  private BigDecimal score;

  public CatalogsHotelGuestRatings () {

  }

  public CatalogsHotelGuestRatings (BigDecimal maxScore, Integer numberOfReviewers, String ratingSystem, BigDecimal score) {
    this.maxScore = maxScore;
    this.numberOfReviewers = numberOfReviewers;
    this.ratingSystem = ratingSystem;
    this.score = score;
  }

    
  @JsonProperty("max_score")
  public BigDecimal getMaxScore() {
    return maxScore;
  }
  public void setMaxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
  }

    
  @JsonProperty("number_of_reviewers")
  public Integer getNumberOfReviewers() {
    return numberOfReviewers;
  }
  public void setNumberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

    
  @JsonProperty("rating_system")
  public String getRatingSystem() {
    return ratingSystem;
  }
  public void setRatingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
  }

    
  @JsonProperty("score")
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
    return Objects.equals(maxScore, catalogsHotelGuestRatings.maxScore) &&
        Objects.equals(numberOfReviewers, catalogsHotelGuestRatings.numberOfReviewers) &&
        Objects.equals(ratingSystem, catalogsHotelGuestRatings.ratingSystem) &&
        Objects.equals(score, catalogsHotelGuestRatings.score);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
