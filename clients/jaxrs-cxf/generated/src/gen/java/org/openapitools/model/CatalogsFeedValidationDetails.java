package org.openapitools.model;

import org.openapitools.model.CatalogsFeedValidationErrors;
import org.openapitools.model.CatalogsFeedValidationWarnings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedValidationDetails  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedValidationErrors errors;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedValidationWarnings warnings;
 /**
   * Get errors
   * @return errors
  **/
  @JsonProperty("errors")
  @NotNull
  public CatalogsFeedValidationErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedValidationDetails errors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
    return this;
  }

 /**
   * Get warnings
   * @return warnings
  **/
  @JsonProperty("warnings")
  @NotNull
  public CatalogsFeedValidationWarnings getWarnings() {
    return warnings;
  }

  public void setWarnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
  }

  public CatalogsFeedValidationDetails warnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

