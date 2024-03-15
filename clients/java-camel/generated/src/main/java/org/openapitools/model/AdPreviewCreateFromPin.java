package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdPreviewCreateFromPin
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdPreviewCreateFromPin implements AdPreviewRequest {

  private String pinId;

  public AdPreviewCreateFromPin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPreviewCreateFromPin(String pinId) {
    this.pinId = pinId;
  }

  public AdPreviewCreateFromPin pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID.
   * @return pinId
  */
  @NotNull 
  @Schema(name = "pin_id", example = "7389479023", description = "Pin ID.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    AdPreviewCreateFromPin adPreviewCreateFromPin = (AdPreviewCreateFromPin) o;
    return Objects.equals(this.pinId, adPreviewCreateFromPin.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewCreateFromPin {\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

