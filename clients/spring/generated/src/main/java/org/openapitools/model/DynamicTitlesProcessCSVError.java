package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DynamicTitlesProcessCSVError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesProcessCSVError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String errorType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer rowNumber;

  public DynamicTitlesProcessCSVError errorType(@Nullable String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.
   * @return errorType
   */
  
  @Schema(name = "error_type", example = "ROW_VALIDATION_FAILED", description = "The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_type")
  public @Nullable String getErrorType() {
    return errorType;
  }

  @JsonProperty("error_type")
  public void setErrorType(@Nullable String errorType) {
    this.errorType = errorType;
  }

  public DynamicTitlesProcessCSVError rowNumber(@Nullable Integer rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

  /**
   * The row number with a validation error. -1 indicates a file-level error.
   * @return rowNumber
   */
  
  @Schema(name = "row_number", example = "15", description = "The row number with a validation error. -1 indicates a file-level error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("row_number")
  public @Nullable Integer getRowNumber() {
    return rowNumber;
  }

  @JsonProperty("row_number")
  public void setRowNumber(@Nullable Integer rowNumber) {
    this.rowNumber = rowNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesProcessCSVError dynamicTitlesProcessCSVError = (DynamicTitlesProcessCSVError) o;
    return Objects.equals(this.errorType, dynamicTitlesProcessCSVError.errorType) &&
        Objects.equals(this.rowNumber, dynamicTitlesProcessCSVError.rowNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, rowNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesProcessCSVError {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

