package org.openapitools.model;

import org.openapitools.model.IneligibleProductTagReason;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Error item for a product tag that failed eligibility check.
 */
public class IneligibleProductTagErrorItem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Reason why the pin is ineligible for tagging.
   */
  @JsonProperty("error_message")
  private IneligibleProductTagReason errorMessage;

  /**
   * Pin ID that failed eligibility check.
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * Reason why the pin is ineligible for tagging.
   * @return errorMessage
   */
  public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Pin ID that failed eligibility check.
   * @return pinId
   */
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IneligibleProductTagErrorItem ineligibleProductTagErrorItem = (IneligibleProductTagErrorItem) o;
    return Objects.equals(this.errorMessage, ineligibleProductTagErrorItem.errorMessage) &&
        Objects.equals(this.pinId, ineligibleProductTagErrorItem.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IneligibleProductTagErrorItem {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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
