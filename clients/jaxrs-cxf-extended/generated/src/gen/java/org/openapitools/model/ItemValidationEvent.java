package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing an item validation event
 */
@ApiModel(description="Object describing an item validation event")

public class ItemValidationEvent  {
  
 /**
  * The attribute that the item validation event references
  */
  @ApiModelProperty(example = "title", value = "The attribute that the item validation event references")
  private String attribute;

 /**
  * The event code that the item validation event references
  */
  @ApiModelProperty(example = "106", value = "The event code that the item validation event references")
  private Integer code;

 /**
  * Title message describing the item validation event
  */
  @ApiModelProperty(example = "Title is missing from product metadata.", value = "Title message describing the item validation event")
  private String message;
 /**
  * The attribute that the item validation event references
  * @return attribute
  */
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }

  /**
   * Sets the <code>attribute</code> property.
   */
 public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  /**
   * Sets the <code>attribute</code> property.
   */
  public ItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

 /**
  * The event code that the item validation event references
  * @return code
  */
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public ItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Title message describing the item validation event
  * @return message
  */
  @JsonProperty("message")
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
  public ItemValidationEvent message(String message) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

