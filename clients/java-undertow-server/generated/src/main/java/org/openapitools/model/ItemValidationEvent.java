/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
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



/**
 * Object describing an item validation event
 */

@ApiModel(description = "Object describing an item validation event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemValidationEvent   {
  
  private String attribute;
  private Integer code;
  private String message;

  /**
   * The attribute that the item validation event references
   */
  public ItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  
  @ApiModelProperty(example = "title", value = "The attribute that the item validation event references")
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  /**
   * The event code that the item validation event references
   */
  public ItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "106", value = "The event code that the item validation event references")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Title message describing the item validation event
   */
  public ItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Title is missing from product metadata.", value = "Title message describing the item validation event")
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
    ItemValidationEvent itemValidationEvent = (ItemValidationEvent) o;
    return Objects.equals(attribute, itemValidationEvent.attribute) &&
        Objects.equals(code, itemValidationEvent.code) &&
        Objects.equals(message, itemValidationEvent.message);
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

