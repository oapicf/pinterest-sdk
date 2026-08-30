package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ErrorDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ErrorDetail   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("error_code")
  private Integer errorCode;

  @JsonProperty("message")
  private String message;

  public ErrorDetail count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of records with this error
   * @return count
   */
  @ApiModelProperty(required = true, value = "Number of records with this error")
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
  @ApiModelProperty(required = true, value = "Numeric error code")
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
  @ApiModelProperty(required = true, value = "Error message description")
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

