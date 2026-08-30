package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Item validation event
 */
public class SupplementalItemValidationEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   */
  @JsonProperty("attribute")
  private String attribute;

  /**
   * The event code that the item validation event references
   */
  @JsonProperty("code")
  private Integer code;

  /**
   * Title message describing the item validation event
   */
  @JsonProperty("message")
  private String message;

  /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   * @return attribute
   */
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  /**
   * The event code that the item validation event references
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Title message describing the item validation event
   * @return message
   */
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
