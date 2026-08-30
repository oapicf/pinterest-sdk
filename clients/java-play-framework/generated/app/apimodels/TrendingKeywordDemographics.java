package apimodels;

import apimodels.TrendsAgeDistribution;
import apimodels.TrendsGenderDistribution;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingKeywordDemographics   {
  @JsonProperty("age_distribution")
  @Valid

  private TrendsAgeDistribution ageDistribution;

  @JsonProperty("gender_distribution")
  @Valid

  private TrendsGenderDistribution genderDistribution;

  public TrendingKeywordDemographics ageDistribution(TrendsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

   /**
   * Get ageDistribution
   * @return ageDistribution
  **/
  public TrendsAgeDistribution getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(TrendsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  public TrendingKeywordDemographics genderDistribution(TrendsGenderDistribution genderDistribution) {
    this.genderDistribution = genderDistribution;
    return this;
  }

   /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  public TrendsGenderDistribution getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(TrendsGenderDistribution genderDistribution) {
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
    return Objects.equals(ageDistribution, trendingKeywordDemographics.ageDistribution) &&
        Objects.equals(genderDistribution, trendingKeywordDemographics.genderDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, genderDistribution);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

