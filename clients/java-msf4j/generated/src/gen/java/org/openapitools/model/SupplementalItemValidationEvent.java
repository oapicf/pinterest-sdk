package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Item validation event
 */
@ApiModel(description = "Item validation event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalItemValidationEvent   {
  @JsonProperty("attribute")
  private String attribute;

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  public SupplementalItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   * @return attribute
  **/
  @ApiModelProperty(example = "price", required = true, value = "The item attribute referenced by the validation event eg. price, availability, ad_link")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public SupplementalItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * The event code that the item validation event references
   * @return code
  **/
  @ApiModelProperty(example = "113", required = true, value = "The event code that the item validation event references")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public SupplementalItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Title message describing the item validation event
   * @return message
  **/
  @ApiModelProperty(example = "Some supplemental item data was not published due to incorrect formatting", required = true, value = "Title message describing the item validation event")
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

