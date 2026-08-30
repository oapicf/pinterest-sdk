package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidOptionsGenderMultipliers   {
  @JsonProperty("female")
  @Valid

  private BigDecimal female;

  @JsonProperty("male")
  @Valid

  private BigDecimal male;

  public BidOptionsGenderMultipliers female(BigDecimal female) {
    this.female = female;
    return this;
  }

   /**
   * Get female
   * @return female
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

