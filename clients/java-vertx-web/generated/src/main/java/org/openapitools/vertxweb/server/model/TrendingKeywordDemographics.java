package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.TrendingKeywordDemographicsAgeDistribution;
import org.openapitools.vertxweb.server.model.TrendingKeywordDemographicsGenderDistribution;

/**
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingKeywordDemographics   {
  
  private TrendingKeywordDemographicsAgeDistribution ageDistribution;
  private TrendingKeywordDemographicsGenderDistribution genderDistribution;

  public TrendingKeywordDemographics () {

  }

  public TrendingKeywordDemographics (TrendingKeywordDemographicsAgeDistribution ageDistribution, TrendingKeywordDemographicsGenderDistribution genderDistribution) {
    this.ageDistribution = ageDistribution;
    this.genderDistribution = genderDistribution;
  }

    
  @JsonProperty("age_distribution")
  public TrendingKeywordDemographicsAgeDistribution getAgeDistribution() {
    return ageDistribution;
  }
  public void setAgeDistribution(TrendingKeywordDemographicsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

    
  @JsonProperty("gender_distribution")
  public TrendingKeywordDemographicsGenderDistribution getGenderDistribution() {
    return genderDistribution;
  }
  public void setGenderDistribution(TrendingKeywordDemographicsGenderDistribution genderDistribution) {
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
