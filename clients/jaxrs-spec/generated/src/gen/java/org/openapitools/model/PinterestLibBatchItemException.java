package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Exception details for a batch operation item.
 **/
@ApiModel(description = "Exception details for a batch operation item.")
@JsonTypeName("Pinterest.Lib.BatchItemException")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinterestLibBatchItemException   {
  private Integer code;
  private String message;

  public PinterestLibBatchItemException() {
  }

  @JsonCreator
  public PinterestLibBatchItemException(
    @JsonProperty(required = true, value = "message") String message
  ) {
    this.message = message;
  }

  /**
   **/
  public PinterestLibBatchItemException code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  public PinterestLibBatchItemException message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Advertiser not found.", required = true, value = "")
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
    PinterestLibBatchItemException pinterestLibBatchItemException = (PinterestLibBatchItemException) o;
    return Objects.equals(this.code, pinterestLibBatchItemException.code) &&
        Objects.equals(this.message, pinterestLibBatchItemException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestLibBatchItemException {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
