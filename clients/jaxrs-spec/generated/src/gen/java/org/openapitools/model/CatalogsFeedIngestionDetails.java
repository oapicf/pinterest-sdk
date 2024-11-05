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



@JsonTypeName("CatalogsFeedIngestionDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsFeedIngestionDetails   {
  private CatalogsFeedIngestionErrors errors;
  private CatalogsFeedIngestionInfo info;
  private CatalogsFeedIngestionWarnings warnings;

  /**
   **/
  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("errors")
  @NotNull @Valid public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  @JsonProperty("errors")
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
  @JsonProperty("info")
  @NotNull @Valid public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }

  @JsonProperty("info")
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
  @JsonProperty("warnings")
  @NotNull @Valid public CatalogsFeedIngestionWarnings getWarnings() {
    return warnings;
  }

  @JsonProperty("warnings")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

