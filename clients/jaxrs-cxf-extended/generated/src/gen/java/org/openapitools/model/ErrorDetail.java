package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ErrorDetail  {
  
 /**
  * Number of records with this error
  */
  @ApiModelProperty(example = "20", required = true, value = "Number of records with this error")
  private Integer count;

 /**
  * Numeric error code
  */
  @ApiModelProperty(example = "42", required = true, value = "Numeric error code")
  private Integer errorCode;

 /**
  * Error message description
  */
  @ApiModelProperty(example = "Invalid email", required = true, value = "Error message description")
  private String message;
 /**
  * Number of records with this error
  * @return count
  */
  @JsonProperty("count")
  @NotNull
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the <code>count</code> property.
   */
 public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * Sets the <code>count</code> property.
   */
  public ErrorDetail count(Integer count) {
    this.count = count;
    return this;
  }

 /**
  * Numeric error code
  * @return errorCode
  */
  @JsonProperty("error_code")
  @NotNull
  public Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   */
 public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   */
  public ErrorDetail errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
  * Error message description
  * @return message
  */
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public ErrorDetail message(String message) {
    this.message = message;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

