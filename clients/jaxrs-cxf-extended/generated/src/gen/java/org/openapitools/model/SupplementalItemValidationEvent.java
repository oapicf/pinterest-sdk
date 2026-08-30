package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Item validation event
 */
@ApiModel(description="Item validation event")

public class SupplementalItemValidationEvent  {
  
 /**
  * The item attribute referenced by the validation event eg. price, availability, ad_link
  */
  @ApiModelProperty(example = "price", required = true, value = "The item attribute referenced by the validation event eg. price, availability, ad_link")
  private String attribute;

 /**
  * The event code that the item validation event references
  */
  @ApiModelProperty(example = "113", required = true, value = "The event code that the item validation event references")
  private Integer code;

 /**
  * Title message describing the item validation event
  */
  @ApiModelProperty(example = "Some supplemental item data was not published due to incorrect formatting", required = true, value = "Title message describing the item validation event")
  private String message;
 /**
  * The item attribute referenced by the validation event eg. price, availability, ad_link
  * @return attribute
  */
  @JsonProperty("attribute")
  @NotNull
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
  public SupplementalItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

 /**
  * The event code that the item validation event references
  * @return code
  */
  @JsonProperty("code")
  @NotNull
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
  public SupplementalItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Title message describing the item validation event
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
  public SupplementalItemValidationEvent message(String message) {
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
    SupplementalItemValidationEvent supplementalItemValidationEvent = (SupplementalItemValidationEvent) o;
    return Objects.equals(this.attribute, supplementalItemValidationEvent.attribute) &&
        Objects.equals(this.code, supplementalItemValidationEvent.code) &&
        Objects.equals(this.message, supplementalItemValidationEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalItemValidationEvent {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

