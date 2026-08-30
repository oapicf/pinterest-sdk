package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdPinPreviewCreativeType;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad preview source from an existing Pin.
 */

@Schema(name = "AdPreviewSourcePinId", description = "Ad preview source from an existing Pin.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewSourcePinId implements AdPreviewRequest {

  private AdPinPreviewCreativeType creativeType;

  private String pinId;

  public AdPreviewSourcePinId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPreviewSourcePinId(String pinId) {
    this.pinId = pinId;
  }

  public AdPreviewSourcePinId creativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Creative type of the ad preview.
   * @return creativeType
   */
  @Valid 
  @Schema(name = "creative_type", example = "MAX_WIDTH_VIDEO_COLLECTION", description = "Creative type of the ad preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_type")
  public AdPinPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdPreviewSourcePinId pinId(String pinId) {
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
    AdPreviewSourcePinId adPreviewSourcePinId = (AdPreviewSourcePinId) o;
    return Objects.equals(this.creativeType, adPreviewSourcePinId.creativeType) &&
        Objects.equals(this.pinId, adPreviewSourcePinId.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeType, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewSourcePinId {\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
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

