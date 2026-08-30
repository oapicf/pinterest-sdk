package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description = "This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsGenderMultipliers   {
  @JsonProperty("female")
  private BigDecimal female;

  @JsonProperty("male")
  private BigDecimal male;

  public BidOptionsGenderMultipliers female(BigDecimal female) {
    this.female = female;
    return this;
  }

   /**
   * Get female
   * @return female
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFemale() {
    return female;
  }

  public void setFemale(BigDecimal female) {
    this.female = female;
  }

  public BidOptionsGenderMultipliers male(BigDecimal male) {
    this.male = male;
    return this;
  }

   /**
   * Get male
   * @return male
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMale() {
    return male;
  }

  public void setMale(BigDecimal male) {
    this.male = male;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidOptionsGenderMultipliers bidOptionsGenderMultipliers = (BidOptionsGenderMultipliers) o;
    return Objects.equals(this.female, bidOptionsGenderMultipliers.female) &&
        Objects.equals(this.male, bidOptionsGenderMultipliers.male);
  }

  @Override
  public int hashCode() {
    return Objects.hash(female, male);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidOptionsGenderMultipliers {\n");
    
    sb.append("    female: ").append(toIndentedString(female)).append("\n");
    sb.append("    male: ").append(toIndentedString(male)).append("\n");
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

