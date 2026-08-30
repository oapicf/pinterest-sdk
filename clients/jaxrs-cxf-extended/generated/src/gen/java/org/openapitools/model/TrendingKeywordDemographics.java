package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrendsAgeDistribution;
import org.openapitools.model.TrendsGenderDistribution;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 */
@ApiModel(description="A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.")

public class TrendingKeywordDemographics  {
  
  @ApiModelProperty(value = "")
  @Valid
  private TrendsAgeDistribution ageDistribution;

  @ApiModelProperty(value = "")
  @Valid
  private TrendsGenderDistribution genderDistribution;
 /**
  * Get ageDistribution
  * @return ageDistribution
  */
  @JsonProperty("age_distribution")
  public TrendsAgeDistribution getAgeDistribution() {
    return ageDistribution;
  }

  /**
   * Sets the <code>ageDistribution</code> property.
   */
 public void setAgeDistribution(TrendsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  /**
   * Sets the <code>ageDistribution</code> property.
   */
  public TrendingKeywordDemographics ageDistribution(TrendsAgeDistribution ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

 /**
  * Get genderDistribution
  * @return genderDistribution
  */
  @JsonProperty("gender_distribution")
  public TrendsGenderDistribution getGenderDistribution() {
    return genderDistribution;
  }

  /**
   * Sets the <code>genderDistribution</code> property.
   */
 public void setGenderDistribution(TrendsGenderDistribution genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  /**
   * Sets the <code>genderDistribution</code> property.
   */
  public TrendingKeywordDemographics genderDistribution(TrendsGenderDistribution genderDistribution) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

