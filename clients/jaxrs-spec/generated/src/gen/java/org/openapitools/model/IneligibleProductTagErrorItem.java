package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IneligibleProductTagReason;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Error item for a product tag that failed eligibility check.
 **/
@ApiModel(description = "Error item for a product tag that failed eligibility check.")
@JsonTypeName("IneligibleProductTagErrorItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IneligibleProductTagErrorItem   {
  private IneligibleProductTagReason errorMessage;
  private String pinId;

  public IneligibleProductTagErrorItem() {
  }

  @JsonCreator
  public IneligibleProductTagErrorItem(
    @JsonProperty(required = true, value = "error_message") IneligibleProductTagReason errorMessage,
    @JsonProperty(required = true, value = "pin_id") String pinId
  ) {
    this.errorMessage = errorMessage;
    this.pinId = pinId;
  }

  /**
   * Reason why the pin is ineligible for tagging.
   **/
  public IneligibleProductTagErrorItem errorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Reason why the pin is ineligible for tagging.")
  @JsonProperty(required = true, value = "error_message")
  @NotNull public IneligibleProductTagReason getErrorMessage() {
    return errorMessage;
  }

  @JsonProperty(required = true, value = "error_message")
  public void setErrorMessage(IneligibleProductTagReason errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Pin ID that failed eligibility check.
   **/
  public IneligibleProductTagErrorItem pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pin ID that failed eligibility check.")
  @JsonProperty(required = true, value = "pin_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getPinId() {
    return pinId;
  }

  @JsonProperty(required = true, value = "pin_id")
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
