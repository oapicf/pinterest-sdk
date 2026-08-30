package apimodels;

import apimodels.IneligibleProductTagReason;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Error item for a product tag that failed eligibility check.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IneligibleProductTagErrorItem   {
  @JsonProperty("error_message")
  @NotNull
@Valid

  private IneligibleProductTagReason errorMessage;

  @JsonProperty("pin_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String pinId;

  public IneligibleProductTagErrorItem errorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Reason why the pin is ineligible for tagging.
   * @return errorMessage
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

