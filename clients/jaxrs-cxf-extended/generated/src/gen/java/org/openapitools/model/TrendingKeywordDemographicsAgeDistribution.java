package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */
@ApiModel(description="This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")

public class TrendingKeywordDemographicsAgeDistribution extends HashMap<String, Double> {
  
public enum AgeDistributionEnum {

    @JsonProperty("18-24") _18_24(String.valueOf("18-24")),
    @JsonProperty("25-34") _25_34(String.valueOf("25-34")),
    @JsonProperty("35-44") _35_44(String.valueOf("35-44")),
    @JsonProperty("45-49") _45_49(String.valueOf("45-49")),
    @JsonProperty("50-54") _50_54(String.valueOf("50-54")),
    @JsonProperty("55-64") _55_64(String.valueOf("55-64")),
    @JsonProperty("65+") _65_(String.valueOf("65+"));

    private String value;

    AgeDistributionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AgeDistributionEnum fromValue(String value) {
        for (AgeDistributionEnum b : AgeDistributionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private AgeDistributionEnum ageDistribution;
 /**
  * Get ageDistribution
  * @return ageDistribution
  */
  @JsonProperty("age_distribution")
  public String getAgeDistribution() {
    return ageDistribution == null ? null : ageDistribution.value();
  }

  /**
   * Sets the <code>ageDistribution</code> property.
   */
 public void setAgeDistribution(AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
  }

  /**
   * Sets the <code>ageDistribution</code> property.
   */
  public TrendingKeywordDemographicsAgeDistribution ageDistribution(AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
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
    TrendingKeywordDemographicsAgeDistribution trendingKeywordDemographicsAgeDistribution = (TrendingKeywordDemographicsAgeDistribution) o;
    return super.equals(o) && Objects.equals(this.ageDistribution, trendingKeywordDemographicsAgeDistribution.ageDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), ageDistribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordDemographicsAgeDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ageDistribution: ").append(toIndentedString(ageDistribution)).append("\n");
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

