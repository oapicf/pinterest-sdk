package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ErrorDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ErrorDetail {

  private Integer count;

  private Integer errorCode;

  private String message;

  public ErrorDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorDetail(Integer count, Integer errorCode, String message) {
    this.count = count;
    this.errorCode = errorCode;
    this.message = message;
  }

  public ErrorDetail count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of records with this error
   * @return count
   */
  @NotNull 
  @Schema(name = "count", description = "Number of records with this error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ErrorDetail errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Numeric error code
   * @return errorCode
   */
  @NotNull 
  @Schema(name = "error_code", description = "Numeric error code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error_code")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message description
   * @return message
   */
  @NotNull 
  @Schema(name = "message", description = "Error message description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.count, errorDetail.count) &&
        Objects.equals(this.errorCode, errorDetail.errorCode) &&
        Objects.equals(this.message, errorDetail.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, errorCode, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

