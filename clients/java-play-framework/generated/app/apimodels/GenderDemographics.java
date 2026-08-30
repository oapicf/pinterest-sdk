package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Gender demographic distribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenderDemographics   {
  @JsonProperty("female")
  @NotNull
@Valid

  private BigDecimal female;

  @JsonProperty("male")
  @NotNull
@Valid

  private BigDecimal male;

  @JsonProperty("unspecified")
  @NotNull
@Valid

  private BigDecimal unspecified;

  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

   /**
   * Percentage of female users
   * @return female
  **/
  public BigDecimal getFemale() {
    return female;
  }

  public void setFemale(BigDecimal female) {
    this.female = female;
  }

  public GenderDemographics male(BigDecimal male) {
    this.male = male;
    return this;
  }

   /**
   * Percentage of male users
   * @return male
  **/
  public BigDecimal getMale() {
    return male;
  }

  public void setMale(BigDecimal male) {
    this.male = male;
  }

  public GenderDemographics unspecified(BigDecimal unspecified) {
    this.unspecified = unspecified;
    return this;
  }

   /**
   * Percentage of users with unspecified gender
   * @return unspecified
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

