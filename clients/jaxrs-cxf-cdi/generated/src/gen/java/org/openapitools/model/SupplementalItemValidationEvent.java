package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Item validation event
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Item validation event")
public class SupplementalItemValidationEvent   {
  
  private String attribute;

  private Integer code;

  private String message;

  /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   **/
  public SupplementalItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  
  @ApiModelProperty(example = "price", required = true, value = "The item attribute referenced by the validation event eg. price, availability, ad_link")
  @JsonProperty("attribute")
  @NotNull
  public String getAttribute() {
    return attribute;
  }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  /**
   * The event code that the item validation event references
   **/
  public SupplementalItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "113", required = true, value = "The event code that the item validation event references")
  @JsonProperty("code")
  @NotNull
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Title message describing the item validation event
   **/
  public SupplementalItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "Some supplemental item data was not published due to incorrect formatting", required = true, value = "Title message describing the item validation event")
  @JsonProperty("message")
  @NotNull
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

