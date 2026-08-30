/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdPinPreviewCreativeType;



/**
 * Ad preview source from an existing Pin.
 */

@ApiModel(description = "Ad preview source from an existing Pin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewSourcePinId   {
  
  private AdPinPreviewCreativeType creativeType;
  private String pinId;

  /**
   * Creative type of the ad preview.
   */
  public AdPreviewSourcePinId creativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(example = "MAX_WIDTH_VIDEO_COLLECTION", value = "Creative type of the ad preview.")
  @JsonProperty("creative_type")
  public AdPinPreviewCreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Pin ID.
   */
  public AdPreviewSourcePinId pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
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
    return Objects.equals(creativeType, adPreviewSourcePinId.creativeType) &&
        Objects.equals(pinId, adPreviewSourcePinId.pinId);
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

