package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * If specified, you must provide all properties
 */
@ApiModel(description = "If specified, you must provide all properties")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelGuestRatings   {
  @JsonProperty("score")
  private BigDecimal score;

  @JsonProperty("number_of_reviewers")
  private Integer numberOfReviewers;

  @JsonProperty("max_score")
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
  @ApiModelProperty(value = "Your hotel's rating.")
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
  @ApiModelProperty(value = "Total number of people who have rated this hotel.")
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
  @ApiModelProperty(value = "Max value for the hotel rating score.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

