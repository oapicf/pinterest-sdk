package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidOptionsGenderMultipliers   {
  
  private BigDecimal female;
  private BigDecimal male;

  public BidOptionsGenderMultipliers () {

  }

  public BidOptionsGenderMultipliers (BigDecimal female, BigDecimal male) {
    this.female = female;
    this.male = male;
  }

    
  @JsonProperty("female")
  public BigDecimal getFemale() {
    return female;
  }
  public void setFemale(BigDecimal female) {
    this.female = female;
  }

    
  @JsonProperty("male")
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
    return Objects.equals(female, bidOptionsGenderMultipliers.female) &&
        Objects.equals(male, bidOptionsGenderMultipliers.male);
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
