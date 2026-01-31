package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 **/
@ApiModel(description = "This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")
@JsonTypeName("TrendingKeyword_demographics_age_distribution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeywordDemographicsAgeDistribution extends HashMap<String, Double>  {
  public enum AgeDistributionEnum {

    _18_24(String.valueOf("18-24")), _25_34(String.valueOf("25-34")), _35_44(String.valueOf("35-44")), _45_49(String.valueOf("45-49")), _50_54(String.valueOf("50-54")), _55_64(String.valueOf("55-64")), _65_(String.valueOf("65+"));


    private String value;

    AgeDistributionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AgeDistributionEnum fromString(String s) {
        for (AgeDistributionEnum b : AgeDistributionEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AgeDistributionEnum fromValue(String value) {
        for (AgeDistributionEnum b : AgeDistributionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AgeDistributionEnum ageDistribution;

  public TrendingKeywordDemographicsAgeDistribution() {
  }

  /**
   **/
  public TrendingKeywordDemographicsAgeDistribution ageDistribution(AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_distribution")
  public AgeDistributionEnum getAgeDistribution() {
    return ageDistribution;
  }

  @JsonProperty("age_distribution")
  public void setAgeDistribution(AgeDistributionEnum ageDistribution) {
    this.ageDistribution = ageDistribution;
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
    return Objects.equals(this.ageDistribution, trendingKeywordDemographicsAgeDistribution.ageDistribution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageDistribution, super.hashCode());
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

