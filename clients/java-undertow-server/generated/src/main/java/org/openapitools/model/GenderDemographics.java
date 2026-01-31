/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Gender demographic distribution
 */

@ApiModel(description = "Gender demographic distribution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GenderDemographics   {
  
  private BigDecimal female;
  private BigDecimal male;
  private BigDecimal unspecified;

  /**
   * Percentage of female users
   */
  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of female users")
  @JsonProperty("female")
  public BigDecimal getFemale() {
    return female;
  }
  public void setFemale(BigDecimal female) {
    this.female = female;
  }

  /**
   * Percentage of male users
   */
  public GenderDemographics male(BigDecimal male) {
    this.male = male;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of male users")
  @JsonProperty("male")
  public BigDecimal getMale() {
    return male;
  }
  public void setMale(BigDecimal male) {
    this.male = male;
  }

  /**
   * Percentage of users with unspecified gender
   */
  public GenderDemographics unspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of users with unspecified gender")
  @JsonProperty("unspecified")
  public BigDecimal getUnspecified() {
    return unspecified;
  }
  public void setUnspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderDemographics genderDemographics = (GenderDemographics) o;
    return Objects.equals(female, genderDemographics.female) &&
        Objects.equals(male, genderDemographics.male) &&
        Objects.equals(unspecified, genderDemographics.unspecified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(female, male, unspecified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDemographics {\n");
    
    sb.append("    female: ").append(toIndentedString(female)).append("\n");
    sb.append("    male: ").append(toIndentedString(male)).append("\n");
    sb.append("    unspecified: ").append(toIndentedString(unspecified)).append("\n");
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

