package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * If specified, you must provide all properties
 */
@ApiModel(description="If specified, you must provide all properties")

public class CatalogsHotelGuestRatings  {
  
 /**
  * Your hotel's rating.
  */
  @ApiModelProperty(value = "Your hotel's rating.")
  @Valid
  private BigDecimal score;

 /**
  * Total number of people who have rated this hotel.
  */
  @ApiModelProperty(value = "Total number of people who have rated this hotel.")
  private Integer numberOfReviewers;

 /**
  * Max value for the hotel rating score.
  */
  @ApiModelProperty(value = "Max value for the hotel rating score.")
  @Valid
  private BigDecimal maxScore;

 /**
  * System you use for guest reviews.
  */
  @ApiModelProperty(value = "System you use for guest reviews.")
  private String ratingSystem;
 /**
  * Your hotel&#39;s rating.
  * @return score
  */
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }

  /**
   * Sets the <code>score</code> property.
   */
 public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * Sets the <code>score</code> property.
   */
  public CatalogsHotelGuestRatings score(BigDecimal score) {
    this.score = score;
    return this;
  }

 /**
  * Total number of people who have rated this hotel.
  * @return numberOfReviewers
  */
  @JsonProperty("number_of_reviewers")
  public Integer getNumberOfReviewers() {
    return numberOfReviewers;
  }

  /**
   * Sets the <code>numberOfReviewers</code> property.
   */
 public void setNumberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

  /**
   * Sets the <code>numberOfReviewers</code> property.
   */
  public CatalogsHotelGuestRatings numberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
    return this;
  }

 /**
  * Max value for the hotel rating score.
  * @return maxScore
  */
  @JsonProperty("max_score")
  public BigDecimal getMaxScore() {
    return maxScore;
  }

  /**
   * Sets the <code>maxScore</code> property.
   */
 public void setMaxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
  }

  /**
   * Sets the <code>maxScore</code> property.
   */
  public CatalogsHotelGuestRatings maxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
    return this;
  }

 /**
  * System you use for guest reviews.
  * @return ratingSystem
  */
  @JsonProperty("rating_system")
  public String getRatingSystem() {
    return ratingSystem;
  }

  /**
   * Sets the <code>ratingSystem</code> property.
   */
 public void setRatingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
  }

  /**
   * Sets the <code>ratingSystem</code> property.
   */
  public CatalogsHotelGuestRatings ratingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
    return this;
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
    return Objects.equals(this.score, catalogsHotelGuestRatings.score) &&
        Objects.equals(this.numberOfReviewers, catalogsHotelGuestRatings.numberOfReviewers) &&
        Objects.equals(this.maxScore, catalogsHotelGuestRatings.maxScore) &&
        Objects.equals(this.ratingSystem, catalogsHotelGuestRatings.ratingSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, numberOfReviewers, maxScore, ratingSystem);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

