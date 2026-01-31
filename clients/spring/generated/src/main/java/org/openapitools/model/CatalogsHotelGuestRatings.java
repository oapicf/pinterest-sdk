package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * If specified, you must provide all properties
 */

@Schema(name = "CatalogsHotelGuestRatings", description = "If specified, you must provide all properties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelGuestRatings {

  private JsonNullable<BigDecimal> maxScore = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Integer> numberOfReviewers = JsonNullable.<Integer>undefined();

  private JsonNullable<String> ratingSystem = JsonNullable.<String>undefined();

  private JsonNullable<BigDecimal> score = JsonNullable.<BigDecimal>undefined();

  public CatalogsHotelGuestRatings maxScore(BigDecimal maxScore) {
    this.maxScore = JsonNullable.of(maxScore);
    return this;
  }

  /**
   * Max value for the hotel rating score.
   * @return maxScore
   */
  @Valid 
  @Schema(name = "max_score", description = "Max value for the hotel rating score.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_score")
  public JsonNullable<BigDecimal> getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(JsonNullable<BigDecimal> maxScore) {
    this.maxScore = maxScore;
  }

  public CatalogsHotelGuestRatings numberOfReviewers(Integer numberOfReviewers) {
    this.numberOfReviewers = JsonNullable.of(numberOfReviewers);
    return this;
  }

  /**
   * Total number of people who have rated this hotel.
   * @return numberOfReviewers
   */
  
  @Schema(name = "number_of_reviewers", description = "Total number of people who have rated this hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_of_reviewers")
  public JsonNullable<Integer> getNumberOfReviewers() {
    return numberOfReviewers;
  }

  public void setNumberOfReviewers(JsonNullable<Integer> numberOfReviewers) {
    this.numberOfReviewers = numberOfReviewers;
  }

  public CatalogsHotelGuestRatings ratingSystem(String ratingSystem) {
    this.ratingSystem = JsonNullable.of(ratingSystem);
    return this;
  }

  /**
   * System you use for guest reviews.
   * @return ratingSystem
   */
  
  @Schema(name = "rating_system", description = "System you use for guest reviews.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating_system")
  public JsonNullable<String> getRatingSystem() {
    return ratingSystem;
  }

  public void setRatingSystem(JsonNullable<String> ratingSystem) {
    this.ratingSystem = ratingSystem;
  }

  public CatalogsHotelGuestRatings score(BigDecimal score) {
    this.score = JsonNullable.of(score);
    return this;
  }

  /**
   * Your hotel's rating.
   * @return score
   */
  @Valid 
  @Schema(name = "score", description = "Your hotel's rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public JsonNullable<BigDecimal> getScore() {
    return score;
  }

  public void setScore(JsonNullable<BigDecimal> score) {
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
    return equalsNullable(this.maxScore, catalogsHotelGuestRatings.maxScore) &&
        equalsNullable(this.numberOfReviewers, catalogsHotelGuestRatings.numberOfReviewers) &&
        equalsNullable(this.ratingSystem, catalogsHotelGuestRatings.ratingSystem) &&
        equalsNullable(this.score, catalogsHotelGuestRatings.score);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(maxScore), hashCodeNullable(numberOfReviewers), hashCodeNullable(ratingSystem), hashCodeNullable(score));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

