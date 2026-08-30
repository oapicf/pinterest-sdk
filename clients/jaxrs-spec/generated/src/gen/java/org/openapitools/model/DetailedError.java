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

/**
 * Used for including extra details to a base error
 **/
@ApiModel(description = "Used for including extra details to a base error")
@JsonTypeName("DetailedError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DetailedError   {
  private Integer code;
  private Object details;
  private String message;

  public DetailedError() {
  }

  @JsonCreator
  public DetailedError(
    @JsonProperty(required = true, value = "code") Integer code,
    @JsonProperty(required = true, value = "details") Object details,
    @JsonProperty(required = true, value = "message") String message
  ) {
    this.code = code;
    this.details = details;
    this.message = message;
  }

  /**
   **/
  public DetailedError code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "code")
  @NotNull public Integer getCode() {
    return code;
  }

  @JsonProperty(required = true, value = "code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  public DetailedError details(Object details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "details")
  @NotNull public Object getDetails() {
    return details;
  }

  @JsonProperty(required = true, value = "details")
  public void setDetails(Object details) {
    this.details = details;
  }

  /**
   **/
  public DetailedError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    DetailedError detailedError = (DetailedError) o;
    return Objects.equals(this.code, detailedError.code) &&
        Objects.equals(this.details, detailedError.details) &&
        Objects.equals(this.message, detailedError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
