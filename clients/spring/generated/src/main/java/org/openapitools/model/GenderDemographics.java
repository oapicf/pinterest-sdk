package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Gender demographic distribution
 */

@Schema(name = "GenderDemographics", description = "Gender demographic distribution")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GenderDemographics {

  private BigDecimal female;

  private BigDecimal male;

  private BigDecimal unspecified;

  public GenderDemographics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenderDemographics(BigDecimal female, BigDecimal male, BigDecimal unspecified) {
    this.female = female;
    this.male = male;
    this.unspecified = unspecified;
  }

  public GenderDemographics female(BigDecimal female) {
    this.female = female;
    return this;
  }

  /**
   * Percentage of female users
   * @return female
   */
  @NotNull @Valid 
  @Schema(name = "female", description = "Percentage of female users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("female")
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
   */
  @NotNull @Valid 
  @Schema(name = "male", description = "Percentage of male users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("male")
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
   */
  @NotNull @Valid 
  @Schema(name = "unspecified", description = "Percentage of users with unspecified gender", requiredMode = Schema.RequiredMode.REQUIRED)
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

