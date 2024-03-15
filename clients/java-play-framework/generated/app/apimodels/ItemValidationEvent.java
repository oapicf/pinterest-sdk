package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an item validation event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

