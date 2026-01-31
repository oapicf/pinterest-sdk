package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description="This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")

public class TrendingKeywordDemographicsGenderDistribution extends HashMap<String, Double> {
  
public enum GenderDistributionEnum {

MALE(String.valueOf("male")), FEMALE(String.valueOf("female")), UNSPECIFIED(String.valueOf("unspecified"));


    private String value;

    GenderDistributionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GenderDistributionEnum fromValue(String value) {
        for (GenderDistributionEnum b : GenderDistributionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private GenderDistributionEnum genderDistribution;
 /**
   * Get genderDistribution
   * @return genderDistribution
  **/
  @JsonProperty("gender_distribution")
  public String getGenderDistribution() {
    if (genderDistribution == null) {
      return null;
    }
    return genderDistribution.value();
  }

  public void setGenderDistribution(GenderDistributionEnum genderDistribution) {
    this.genderDistribution = genderDistribution;
  }

  public TrendingKeywordDemographicsGenderDistribution genderDistribution(GenderDistributionEnum genderDistribution) {
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
    TrendingKeywordDemographicsGenderDistribution trendingKeywordDemographicsGenderDistribution = (TrendingKeywordDemographicsGenderDistribution) o;
    return Objects.equals(this.genderDistribution, trendingKeywordDemographicsGenderDistribution.genderDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genderDistribution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordDemographicsGenderDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

