package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Gender demographic distribution
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenderDemographics   {
  
  private BigDecimal female;
  private BigDecimal male;
  private BigDecimal unspecified;

  public GenderDemographics () {

  }

  public GenderDemographics (BigDecimal female, BigDecimal male, BigDecimal unspecified) {
    this.female = female;
    this.male = male;
    this.unspecified = unspecified;
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
