package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsHotelGuestRatings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelGuestRatings   {
  private BigDecimal maxScore;
  private Integer numberOfReviewers;
  private String ratingSystem;
  private BigDecimal score;

  public CatalogsHotelGuestRatings() {
  }

  /**
   * Max value for the hotel rating score.
   **/
  public CatalogsHotelGuestRatings maxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
    return this;
  }

  
  @ApiModelProperty(value = "Max value for the hotel rating score.")
  @JsonProperty("max_score")
  @Valid public BigDecimal getMaxScore() {
    return maxScore;
  }

  @JsonProperty("max_score")
  public void setMaxScore(BigDecimal maxScore) {
    this.maxScore = maxScore;
  }

  /**
   * Total number of people who have rated this hotel.
   **/
  public CatalogsHotelGuestRatings numberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
    return this;
  }

  
  @ApiModelProperty(value = "Total number of people who have rated this hotel.")
  @JsonProperty("number_of_reviewers")
  public Integer getNumberOfReviewers() {
    return numberOfReviewers;
  }

  @JsonProperty("number_of_reviewers")
  public void setNumberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

  /**
   * System you use for guest reviews.
   **/
  public CatalogsHotelGuestRatings ratingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
    return this;
  }

  
  @ApiModelProperty(value = "System you use for guest reviews.")
  @JsonProperty("rating_system")
  public String getRatingSystem() {
    return ratingSystem;
  }

  @JsonProperty("rating_system")
  public void setRatingSystem(String ratingSystem) {
    this.ratingSystem = ratingSystem;
  }

  /**
   * Your hotel&#39;s rating.
   **/
  public CatalogsHotelGuestRatings score(BigDecimal score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(value = "Your hotel's rating.")
  @JsonProperty("score")
  @Valid public BigDecimal getScore() {
    return score;
  }

  @JsonProperty("score")
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
