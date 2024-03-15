package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedValidationErrors;
import org.openapitools.model.CatalogsFeedValidationWarnings;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsFeedValidationDetails   {
  
  private CatalogsFeedValidationErrors errors;

  private CatalogsFeedValidationWarnings warnings;

  /**
   **/
  public CatalogsFeedValidationDetails errors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("errors")
  @NotNull
  public CatalogsFeedValidationErrors getErrors() {
    return errors;
  }
  public void setErrors(CatalogsFeedValidationErrors errors) {
    this.errors = errors;
  }


  /**
   **/
  public CatalogsFeedValidationDetails warnings(CatalogsFeedValidationWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("warnings")
  @NotNull
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

