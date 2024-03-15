package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Used for including extra details to a base error
 **/
@ApiModel(description="Used for including extra details to a base error")

public class DetailedError  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer code;

  @ApiModelProperty(required = true, value = "")
  private String message;

  @ApiModelProperty(required = true, value = "")
  private Object details;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public DetailedError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DetailedError message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public DetailedError details(Object details) {
    this.details = details;
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
    DetailedError detailedError = (DetailedError) o;
    return Objects.equals(this.code, detailedError.code) &&
        Objects.equals(this.message, detailedError.message) &&
        Objects.equals(this.details, detailedError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

