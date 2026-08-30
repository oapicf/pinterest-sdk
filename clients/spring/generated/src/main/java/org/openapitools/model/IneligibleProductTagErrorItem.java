package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.IneligibleProductTagReason;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Error item for a product tag that failed eligibility check.
 */

@Schema(name = "IneligibleProductTagErrorItem", description = "Error item for a product tag that failed eligibility check.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IneligibleProductTagErrorItem {

  private IneligibleProductTagReason errorMessage;

  private String pinId;

  public IneligibleProductTagErrorItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IneligibleProductTagErrorItem(IneligibleProductTagReason errorMessage, String pinId) {
    this.errorMessage = errorMessage;
    this.pinId = pinId;
  }

  public IneligibleProductTagErrorItem errorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Reason why the pin is ineligible for tagging.
   * @return errorMessage
   */
  @NotNull @Valid 
  @Schema(name = "error_message", description = "Reason why the pin is ineligible for tagging.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("error_message")
  public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty("error_message")
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
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", description = "Pin ID that failed eligibility check.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

