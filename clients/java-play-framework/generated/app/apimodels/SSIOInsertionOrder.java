package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An SSIO insertion order.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SSIOInsertionOrder   {
  @JsonProperty("pin_order_id")
  
  private String pinOrderId;

  public SSIOInsertionOrder pinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
    return this;
  }

   /**
   * Salesforce order id
   * @return pinOrderId
  **/
  public String getPinOrderId() {
    return pinOrderId;
  }

  public void setPinOrderId(String pinOrderId) {
    this.pinOrderId = pinOrderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSIOInsertionOrder ssIOInsertionOrder = (SSIOInsertionOrder) o;
    return Objects.equals(pinOrderId, ssIOInsertionOrder.pinOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinOrderId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSIOInsertionOrder {\n");
    
    sb.append("    pinOrderId: ").append(toIndentedString(pinOrderId)).append("\n");
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

