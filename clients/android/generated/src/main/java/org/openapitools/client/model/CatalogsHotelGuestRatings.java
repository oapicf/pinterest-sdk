/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * If specified, you must provide all properties
 **/
@ApiModel(description = "If specified, you must provide all properties")
public class CatalogsHotelGuestRatings {
  
  @SerializedName("score")
  private BigDecimal score = null;
  @SerializedName("number_of_reviewers")
  private Integer numberOfReviewers = null;
  @SerializedName("max_score")
  private BigDecimal maxScore = null;
  @SerializedName("rating_system")
  private String ratingSystem = null;

  /**
   * Your hotel's rating.
   **/
  @ApiModelProperty(value = "Your hotel's rating.")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * Total number of people who have rated this hotel.
   **/
  @ApiModelProperty(value = "Total number of people who have rated this hotel.")
  public Integer getNumberOfReviewers() {
    return numberOfReviewers;
  }
  public void setNumberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

  /**
   * Max value for the hotel rating score.
   **/
  @ApiModelProperty(value = "Max value for the hotel rating score.")
  public BigDecimal getMaxScore() {
    return maxScore;
  }
  public void setMaxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
  }

  /**
   * System you use for guest reviews.
   **/
  @ApiModelProperty(value = "System you use for guest reviews.")
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
    return (this.score == null ? catalogsHotelGuestRatings.score == null : this.score.equals(catalogsHotelGuestRatings.score)) &&
        (this.numberOfReviewers == null ? catalogsHotelGuestRatings.numberOfReviewers == null : this.numberOfReviewers.equals(catalogsHotelGuestRatings.numberOfReviewers)) &&
        (this.maxScore == null ? catalogsHotelGuestRatings.maxScore == null : this.maxScore.equals(catalogsHotelGuestRatings.maxScore)) &&
        (this.ratingSystem == null ? catalogsHotelGuestRatings.ratingSystem == null : this.ratingSystem.equals(catalogsHotelGuestRatings.ratingSystem));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.numberOfReviewers == null ? 0: this.numberOfReviewers.hashCode());
    result = 31 * result + (this.maxScore == null ? 0: this.maxScore.hashCode());
    result = 31 * result + (this.ratingSystem == null ? 0: this.ratingSystem.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelGuestRatings {\n");
    
    sb.append("  score: ").append(score).append("\n");
    sb.append("  numberOfReviewers: ").append(numberOfReviewers).append("\n");
    sb.append("  maxScore: ").append(maxScore).append("\n");
    sb.append("  ratingSystem: ").append(ratingSystem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}