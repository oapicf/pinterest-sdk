package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.IneligibleProductTagReason;

/**
 * Error item for a product tag that failed eligibility check.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IneligibleProductTagErrorItem   {
  
  private IneligibleProductTagReason errorMessage;
  private String pinId;

  public IneligibleProductTagErrorItem () {

  }

  public IneligibleProductTagErrorItem (IneligibleProductTagReason errorMessage, String pinId) {
    this.errorMessage = errorMessage;
    this.pinId = pinId;
  }

    
  @JsonProperty("error_message")
  public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
  }

    
  @JsonProperty("pin_id")
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
    return Objects.equals(errorMessage, ineligibleProductTagErrorItem.errorMessage) &&
        Objects.equals(pinId, ineligibleProductTagErrorItem.pinId);
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
