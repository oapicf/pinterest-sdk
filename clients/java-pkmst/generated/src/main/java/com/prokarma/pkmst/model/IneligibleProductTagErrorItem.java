package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.IneligibleProductTagReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Error item for a product tag that failed eligibility check.
 */
@ApiModel(description = "Error item for a product tag that failed eligibility check.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IneligibleProductTagErrorItem   {
  @JsonProperty("error_message")
  private IneligibleProductTagReason errorMessage;

  @JsonProperty("pin_id")
  private String pinId;

  public IneligibleProductTagErrorItem errorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Reason why the pin is ineligible for tagging.
   * @return errorMessage
   */
  @ApiModelProperty(required = true, value = "Reason why the pin is ineligible for tagging.")
  public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
  }

  public IneligibleProductTagErrorItem pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID that failed eligibility check.
   * @return pinId
   */
  @ApiModelProperty(required = true, value = "Pin ID that failed eligibility check.")
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

