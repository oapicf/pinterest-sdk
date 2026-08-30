package org.openapitools.model;

import org.openapitools.model.IneligibleProductTagReason;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error item for a product tag that failed eligibility check.
 */
@ApiModel(description="Error item for a product tag that failed eligibility check.")

public class IneligibleProductTagErrorItem  {
  
 /**
  * Reason why the pin is ineligible for tagging.
  */
  @ApiModelProperty(required = true, value = "Reason why the pin is ineligible for tagging.")

  private IneligibleProductTagReason errorMessage;

 /**
  * Pin ID that failed eligibility check.
  */
  @ApiModelProperty(required = true, value = "Pin ID that failed eligibility check.")

  private String pinId;
 /**
   * Reason why the pin is ineligible for tagging.
   * @return errorMessage
  **/
  @JsonProperty("error_message")
  public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
  }

  public IneligibleProductTagErrorItem errorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
   * Pin ID that failed eligibility check.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public IneligibleProductTagErrorItem pinId(String pinId) {
    this.pinId = pinId;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

