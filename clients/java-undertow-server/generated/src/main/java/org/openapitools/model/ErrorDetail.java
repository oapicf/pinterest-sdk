/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ErrorDetail   {
  
  private Integer count;
  private Integer errorCode;
  private String message;

  /**
   * Number of records with this error
   */
  public ErrorDetail count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of records with this error")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Numeric error code
   */
  public ErrorDetail errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Numeric error code")
  @JsonProperty("error_code")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Error message description
   */
  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Error message description")
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
    return Objects.equals(count, errorDetail.count) &&
        Objects.equals(errorCode, errorDetail.errorCode) &&
        Objects.equals(message, errorDetail.message);
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

