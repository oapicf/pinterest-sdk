package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;
import org.openapitools.model.CatalogsFeedIngestionWarnings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedIngestionDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsFeedIngestionDetails {

  private CatalogsFeedIngestionErrors errors;

  private CatalogsFeedIngestionInfo info;

  private CatalogsFeedIngestionWarnings warnings;

  public CatalogsFeedIngestionDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsFeedIngestionDetails(CatalogsFeedIngestionErrors errors, CatalogsFeedIngestionInfo info, CatalogsFeedIngestionWarnings warnings) {
    this.errors = errors;
    this.info = info;
    this.warnings = warnings;
  }

  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @NotNull @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedIngestionDetails info(CatalogsFeedIngestionInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
  @NotNull @Valid 
  @Schema(name = "info", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("info")
  public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }

  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }

  public CatalogsFeedIngestionDetails warnings(CatalogsFeedIngestionWarnings warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Get warnings
   * @return warnings
  */
  @NotNull @Valid 
  @Schema(name = "warnings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warnings")
  public CatalogsFeedIngestionWarnings getWarnings() {
    return warnings;
  }

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

