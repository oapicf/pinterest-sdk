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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-07-01T11:59:44.239108Z[Etc/UTC]")
public class ItemValidationEvent   {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  public ItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * The attribute that the item validation event references
   * @return attribute
  **/
  @ApiModelProperty(example = "title", value = "The attribute that the item validation event references")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public ItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The event code that the item validation event references
   * @return code
  **/
  @ApiModelProperty(example = "106", value = "The event code that the item validation event references")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Title message describing the item validation event
   * @return message
  **/
  @ApiModelProperty(example = "Title is missing from product metadata.", value = "Title message describing the item validation event")
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

