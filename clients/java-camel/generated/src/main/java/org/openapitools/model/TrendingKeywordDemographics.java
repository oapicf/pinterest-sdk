package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendsAgeDistribution;
import org.openapitools.model.TrendsGenderDistribution;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

@Schema(name = "TrendingKeywordDemographics", description = "A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingKeywordDemographics {

  private JsonNullable<TrendsAgeDistribution> ageDistribution = JsonNullable.<TrendsAgeDistribution>undefined();

  private JsonNullable<TrendsGenderDistribution> genderDistribution = JsonNullable.<TrendsGenderDistribution>undefined();

  public TrendingKeywordDemographics ageDistribution(TrendsAgeDistribution ageDistribution) {
    this.ageDistribution = JsonNullable.of(ageDistribution);
    return this;
  }

  /**
   * Get ageDistribution
   * @return ageDistribution
   */
  @Valid 
  @Schema(name = "age_distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_distribution")
  public JsonNullable<TrendsAgeDistribution> getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(JsonNullable<TrendsAgeDistribution> ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  public TrendingKeywordDemographics genderDistribution(TrendsGenderDistribution genderDistribution) {
    this.genderDistribution = JsonNullable.of(genderDistribution);
    return this;
  }

  /**
   * Get genderDistribution
   * @return genderDistribution
   */
  @Valid 
  @Schema(name = "gender_distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_distribution")
  public JsonNullable<TrendsGenderDistribution> getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(JsonNullable<TrendsGenderDistribution> genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingKeywordDemographics trendingKeywordDemographics = (TrendingKeywordDemographics) o;
    return equalsNullable(this.ageDistribution, trendingKeywordDemographics.ageDistribution) &&
        equalsNullable(this.genderDistribution, trendingKeywordDemographics.genderDistribution);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ageDistribution), hashCodeNullable(genderDistribution));
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
    sb.append("class TrendingKeywordDemographics {\n");
    sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
    sb.append("    genderDistribution: ").append(toIndentedString(genderDistribution)).append("\n");
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

