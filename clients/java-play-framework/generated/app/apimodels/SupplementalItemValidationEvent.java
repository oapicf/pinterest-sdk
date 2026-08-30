package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Item validation event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SupplementalItemValidationEvent   {
  @JsonProperty("attribute")
  @NotNull

  private String attribute;

  @JsonProperty("code")
  @NotNull

  private Integer code;

  @JsonProperty("message")
  @NotNull

  private String message;

  public SupplementalItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   * @return attribute
  **/
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
    return Objects.equals(attribute, supplementalItemValidationEvent.attribute) &&
        Objects.equals(code, supplementalItemValidationEvent.code) &&
        Objects.equals(message, supplementalItemValidationEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

