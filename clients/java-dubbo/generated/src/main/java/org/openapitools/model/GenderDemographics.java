package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Gender demographic distribution
 */
public class GenderDemographics implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Percentage of female users
   */
  @JsonProperty("female")
  private BigDecimal female;

  /**
   * Percentage of male users
   */
  @JsonProperty("male")
  private BigDecimal male;

  /**
   * Percentage of users with unspecified gender
   */
  @JsonProperty("unspecified")
  private BigDecimal unspecified;

  /**
   * Percentage of female users
   * @return female
   */
  public BigDecimal getFemale() {
    return female;
  }

  public void setFemale(BigDecimal female) {
    this.female = female;
  }

  /**
   * Percentage of male users
   * @return male
   */
  public BigDecimal getMale() {
    return male;
  }

  public void setMale(BigDecimal male) {
    this.male = male;
  }

  /**
   * Percentage of users with unspecified gender
   * @return unspecified
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
