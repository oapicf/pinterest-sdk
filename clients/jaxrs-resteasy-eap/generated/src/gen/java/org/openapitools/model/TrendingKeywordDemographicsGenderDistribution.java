package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeywordDemographicsGenderDistribution extends HashMap<String, Double>  {
  

  /**
   * Gets or Sets genderDistribution
   */
  public enum GenderDistributionEnum {
    MALE("male"),

        FEMALE("female"),

        UNSPECIFIED("unspecified");
    private String value;

    GenderDistributionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private GenderDistributionEnum genderDistribution;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_distribution")
  public GenderDistributionEnum getGenderDistribution() {
    return genderDistribution;
  }
  public void setGenderDistribution(GenderDistributionEnum genderDistribution) {
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
    TrendingKeywordDemographicsGenderDistribution trendingKeywordDemographicsGenderDistribution = (TrendingKeywordDemographicsGenderDistribution) o;
    return super.equals(o) && Objects.equals(this.genderDistribution, trendingKeywordDemographicsGenderDistribution.genderDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), genderDistribution);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

