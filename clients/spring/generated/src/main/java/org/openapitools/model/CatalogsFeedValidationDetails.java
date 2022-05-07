package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsFeedValidationErrors;
import org.openapitools.model.CatalogsFeedValidationWarnings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedValidationDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class CatalogsFeedValidationDetails   {

  @JsonProperty("errors")
  private CatalogsFeedValidationErrors errors;

  @JsonProperty("warnings")
  private CatalogsFeedValidationWarnings warnings;

  public CatalogsFeedValidationDetails errors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", required = true)
  public CatalogsFeedValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedValidationDetails warnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  @NotNull @Valid 
  @Schema(name = "warnings", required = true)
  public CatalogsFeedValidationWarnings getWarnings() {
    return warnings;
  }

  public void setWarnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationDetails catalogsFeedValidationDetails = (CatalogsFeedValidationDetails) o;
    return Objects.equals(this.errors, catalogsFeedValidationDetails.errors) &&
        Objects.equals(this.warnings, catalogsFeedValidationDetails.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationDetails {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

