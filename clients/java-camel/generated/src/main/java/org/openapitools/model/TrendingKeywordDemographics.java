package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendingKeywordDemographicsAgeDistribution;
import org.openapitools.model.TrendingKeywordDemographicsGenderDistribution;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

@Schema(name = "TrendingKeyword_demographics", description = "A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.")
@JsonTypeName("TrendingKeyword_demographics")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeywordDemographics {

  private JsonNullable<TrendingKeywordDemographicsAgeDistribution> ageDistribution = JsonNullable.<TrendingKeywordDemographicsAgeDistribution>undefined();

  private JsonNullable<TrendingKeywordDemographicsGenderDistribution> genderDistribution = JsonNullable.<TrendingKeywordDemographicsGenderDistribution>undefined();

  public TrendingKeywordDemographics ageDistribution(TrendingKeywordDemographicsAgeDistribution ageDistribution) {
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
  public JsonNullable<TrendingKeywordDemographicsAgeDistribution> getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(JsonNullable<TrendingKeywordDemographicsAgeDistribution> ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  public TrendingKeywordDemographics genderDistribution(TrendingKeywordDemographicsGenderDistribution genderDistribution) {
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
  public JsonNullable<TrendingKeywordDemographicsGenderDistribution> getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(JsonNullable<TrendingKeywordDemographicsGenderDistribution> genderDistribution) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

