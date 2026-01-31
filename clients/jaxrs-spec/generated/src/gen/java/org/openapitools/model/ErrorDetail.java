package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ErrorDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ErrorDetail   {
  private Integer count;
  private Integer errorCode;
  private String message;

  public ErrorDetail() {
  }

  @JsonCreator
  public ErrorDetail(
    @JsonProperty(required = true, value = "count") Integer count,
    @JsonProperty(required = true, value = "error_code") Integer errorCode,
    @JsonProperty(required = true, value = "message") String message
  ) {
    this.count = count;
    this.errorCode = errorCode;
    this.message = message;
  }

  /**
   * Number of records with this error
   **/
  public ErrorDetail count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(example = "20", required = true, value = "Number of records with this error")
  @JsonProperty(required = true, value = "count")
  @NotNull public Integer getCount() {
    return count;
  }

  @JsonProperty(required = true, value = "count")
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Numeric error code
   **/
  public ErrorDetail errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(example = "42", required = true, value = "Numeric error code")
  @JsonProperty(required = true, value = "error_code")
  @NotNull public Integer getErrorCode() {
    return errorCode;
  }

  @JsonProperty(required = true, value = "error_code")
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Error message description
   **/
  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Invalid email", required = true, value = "Error message description")
  @JsonProperty(required = true, value = "message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty(required = true, value = "message")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

