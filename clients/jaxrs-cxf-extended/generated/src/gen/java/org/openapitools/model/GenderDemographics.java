package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Gender demographic distribution
 */
@ApiModel(description="Gender demographic distribution")

public class GenderDemographics  {
  
 /**
  * Percentage of female users
  */
  @ApiModelProperty(required = true, value = "Percentage of female users")
  @Valid
  private BigDecimal female;

 /**
  * Percentage of male users
  */
  @ApiModelProperty(required = true, value = "Percentage of male users")
  @Valid
  private BigDecimal male;

 /**
  * Percentage of users with unspecified gender
  */
  @ApiModelProperty(required = true, value = "Percentage of users with unspecified gender")
  @Valid
  private BigDecimal unspecified;
 /**
  * Percentage of female users
  * @return female
  */
  @JsonProperty("female")
  @NotNull
  public BigDecimal getFemale() {
    return female;
  }

  /**
   * Sets the <code>female</code> property.
   */
 public void setFemale(BigDecimal female) {
    this.female = female;
  }

  /**
   * Sets the <code>female</code> property.
   */
  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

 /**
  * Percentage of male users
  * @return male
  */
  @JsonProperty("male")
  @NotNull
  public BigDecimal getMale() {
    return male;
  }

  /**
   * Sets the <code>male</code> property.
   */
 public void setMale(BigDecimal male) {
    this.male = male;
  }

  /**
   * Sets the <code>male</code> property.
   */
  public GenderDemographics male(BigDecimal male) {
    this.male = male;
    return this;
  }

 /**
  * Percentage of users with unspecified gender
  * @return unspecified
  */
  @JsonProperty("unspecified")
  @NotNull
  public BigDecimal getUnspecified() {
    return unspecified;
  }

  /**
   * Sets the <code>unspecified</code> property.
   */
 public void setUnspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
  }

  /**
   * Sets the <code>unspecified</code> property.
   */
  public GenderDemographics unspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

