package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GenderFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GenderFilter {

  private CatalogsProductGroupMultipleGenderCriteria GENDER;

  public GenderFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenderFilter(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  public GenderFilter GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  /**
   * Get GENDER
   * @return GENDER
  */
  @NotNull @Valid 
  @Schema(name = "GENDER", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderFilter genderFilter = (GenderFilter) o;
    return Objects.equals(this.GENDER, genderFilter.GENDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GENDER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderFilter {\n");
    sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
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

