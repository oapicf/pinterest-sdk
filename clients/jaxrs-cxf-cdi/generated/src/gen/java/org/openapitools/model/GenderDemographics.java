package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Gender demographic distribution
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Gender demographic distribution")
public class GenderDemographics   {
  
  private BigDecimal female;

  private BigDecimal male;

  private BigDecimal unspecified;

  /**
   * Percentage of female users
   **/
  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of female users")
  @JsonProperty("female")
  @NotNull
  public BigDecimal getFemale() {
    return female;
  }
  public void setFemale(BigDecimal female) {
    this.female = female;
  }


  /**
   * Percentage of male users
   **/
  public GenderDemographics male(BigDecimal male) {
    this.male = male;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of male users")
  @JsonProperty("male")
  @NotNull
  public BigDecimal getMale() {
    return male;
  }
  public void setMale(BigDecimal male) {
    this.male = male;
  }


  /**
   * Percentage of users with unspecified gender
   **/
  public GenderDemographics unspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of users with unspecified gender")
  @JsonProperty("unspecified")
  @NotNull
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
    return Objects.equals(this.female, genderDemographics.female) &&
        Objects.equals(this.male, genderDemographics.male) &&
        Objects.equals(this.unspecified, genderDemographics.unspecified);
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

