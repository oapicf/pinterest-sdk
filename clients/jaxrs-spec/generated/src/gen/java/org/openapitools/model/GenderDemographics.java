package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
 * Gender demographic distribution
 **/
@ApiModel(description = "Gender demographic distribution")
@JsonTypeName("GenderDemographics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class GenderDemographics   {
  private BigDecimal female;
  private BigDecimal male;
  private BigDecimal unspecified;

  public GenderDemographics() {
  }

  @JsonCreator
  public GenderDemographics(
    @JsonProperty(required = true, value = "female") BigDecimal female,
    @JsonProperty(required = true, value = "male") BigDecimal male,
    @JsonProperty(required = true, value = "unspecified") BigDecimal unspecified
  ) {
    this.female = female;
    this.male = male;
    this.unspecified = unspecified;
  }

  /**
   * Percentage of female users
   **/
  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage of female users")
  @JsonProperty(required = true, value = "female")
  @NotNull @Valid public BigDecimal getFemale() {
    return female;
  }

  @JsonProperty(required = true, value = "female")
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
  @JsonProperty(required = true, value = "male")
  @NotNull @Valid public BigDecimal getMale() {
    return male;
  }

  @JsonProperty(required = true, value = "male")
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
  @JsonProperty(required = true, value = "unspecified")
  @NotNull @Valid public BigDecimal getUnspecified() {
    return unspecified;
  }

  @JsonProperty(required = true, value = "unspecified")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
