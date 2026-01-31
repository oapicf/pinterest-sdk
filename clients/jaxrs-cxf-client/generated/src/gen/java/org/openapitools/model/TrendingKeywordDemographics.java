package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendingKeywordDemographicsAgeDistribution;
import org.openapitools.model.TrendingKeywordDemographicsGenderDistribution;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.
 */
@ApiModel(description="A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.")

public class TrendingKeywordDemographics  {
  
  @ApiModelProperty(value = "")

  private TrendingKeywordDemographicsAgeDistribution ageDistribution;

  @ApiModelProperty(value = "")

  private TrendingKeywordDemographicsGenderDistribution genderDistribution;
 /**
   * Get ageDistribution
   * @return ageDistribution
  **/
  @JsonProperty("age_distribution")
  public TrendingKeywordDemographicsAgeDistribution getAgeDistribution() {
    return ageDistribution;
  }

  public void setAgeDistribution(TrendingKeywordDemographicsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  public TrendingKeywordDemographics ageDistribution(TrendingKeywordDemographicsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

 /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  @JsonProperty("gender_distribution")
  public TrendingKeywordDemographicsGenderDistribution getGenderDistribution() {
    return genderDistribution;
  }

  public void setGenderDistribution(TrendingKeywordDemographicsGenderDistribution genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  public TrendingKeywordDemographics genderDistribution(TrendingKeywordDemographicsGenderDistribution genderDistribution) {
    this.genderDistribution = genderDistribution;
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
    TrendingKeywordDemographics trendingKeywordDemographics = (TrendingKeywordDemographics) o;
    return Objects.equals(this.ageDistribution, trendingKeywordDemographics.ageDistribution) &&
        Objects.equals(this.genderDistribution, trendingKeywordDemographics.genderDistribution);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

