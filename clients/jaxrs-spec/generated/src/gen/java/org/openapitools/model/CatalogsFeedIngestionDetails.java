package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;
import org.openapitools.model.CatalogsFeedIngestionWarnings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsFeedIngestionDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestionDetails   {
  private CatalogsFeedIngestionErrors errors;
  private CatalogsFeedIngestionInfo info;
  private CatalogsFeedIngestionWarnings warnings;

  public CatalogsFeedIngestionDetails() {
  }

  @JsonCreator
  public CatalogsFeedIngestionDetails(
    @JsonProperty(required = true, value = "errors") CatalogsFeedIngestionErrors errors,
    @JsonProperty(required = true, value = "info") CatalogsFeedIngestionInfo info,
    @JsonProperty(required = true, value = "warnings") CatalogsFeedIngestionWarnings warnings
  ) {
    this.errors = errors;
    this.info = info;
    this.warnings = warnings;
  }

  /**
   **/
  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "errors")
  @NotNull @Valid public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  @JsonProperty(required = true, value = "errors")
  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  /**
   **/
  public CatalogsFeedIngestionDetails info(CatalogsFeedIngestionInfo info) {
    this.info = info;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "info")
  @NotNull @Valid public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }

  @JsonProperty(required = true, value = "info")
  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }

  /**
   **/
  public CatalogsFeedIngestionDetails warnings(CatalogsFeedIngestionWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "warnings")
  @NotNull @Valid public CatalogsFeedIngestionWarnings getWarnings() {
    return warnings;
  }

  @JsonProperty(required = true, value = "warnings")
  public void setWarnings(CatalogsFeedIngestionWarnings warnings) {
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
    CatalogsFeedIngestionDetails catalogsFeedIngestionDetails = (CatalogsFeedIngestionDetails) o;
    return Objects.equals(this.errors, catalogsFeedIngestionDetails.errors) &&
        Objects.equals(this.info, catalogsFeedIngestionDetails.info) &&
        Objects.equals(this.warnings, catalogsFeedIngestionDetails.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, info, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionDetails {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
