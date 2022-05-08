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

/**
 * Object describing an item validation event
 **/
@ApiModel(description = "Object describing an item validation event")
@JsonTypeName("ItemValidationEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class ItemValidationEvent   {
  
  private @Valid String attribute;
  private @Valid Integer code;
  private @Valid String message;

  /**
   * The attribute that the item validation event references
   **/
  public ItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  

  
  @ApiModelProperty(example = "title", value = "The attribute that the item validation event references")
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }

  @JsonProperty("attribute")
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

/**
   * The event code that the item validation event references
   **/
  public ItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

  

  
  @ApiModelProperty(example = "106", value = "The event code that the item validation event references")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(Integer code) {
    this.code = code;
  }

/**
   * Title message describing the item validation event
   **/
  public ItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

  

  
  @ApiModelProperty(example = "Title is missing from product metadata.", value = "Title message describing the item validation event")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
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
    ItemValidationEvent itemValidationEvent = (ItemValidationEvent) o;
    return Objects.equals(this.attribute, itemValidationEvent.attribute) &&
        Objects.equals(this.code, itemValidationEvent.code) &&
        Objects.equals(this.message, itemValidationEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemValidationEvent {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

