package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DynamicTitlesProcessCSVError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DynamicTitlesProcessCSV
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesProcessCSV {

  @Valid
  private List<@Valid DynamicTitlesProcessCSVError> errors = new ArrayList<>();

  private String status;

  public DynamicTitlesProcessCSV errors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
    return this;
  }

  public DynamicTitlesProcessCSV addErrorsItem(DynamicTitlesProcessCSVError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * List of validation errors. Empty on success.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", accessMode = Schema.AccessMode.READ_ONLY, description = "List of validation errors. Empty on success.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid DynamicTitlesProcessCSVError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid DynamicTitlesProcessCSVError> errors) {
    this.errors = errors;
  }

  public DynamicTitlesProcessCSV status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Processing status. Present on success.
   * @return status
   */
  
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "SUCCESS", description = "Processing status. Present on success.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesProcessCSV dynamicTitlesProcessCSV = (DynamicTitlesProcessCSV) o;
    return Objects.equals(this.errors, dynamicTitlesProcessCSV.errors) &&
        Objects.equals(this.status, dynamicTitlesProcessCSV.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesProcessCSV {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

