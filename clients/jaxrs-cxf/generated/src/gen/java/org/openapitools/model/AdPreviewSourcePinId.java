package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AdPinPreviewCreativeType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ad preview source from an existing Pin.
 */
@ApiModel(description="Ad preview source from an existing Pin.")

public class AdPreviewSourcePinId  {
  
 /**
  * Creative type of the ad preview.
  */
  @ApiModelProperty(example = "MAX_WIDTH_VIDEO_COLLECTION", value = "Creative type of the ad preview.")

  @Valid

  private AdPinPreviewCreativeType creativeType;

 /**
  * Pin ID.
  */
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")

  private String pinId;
 /**
   * Creative type of the ad preview.
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public AdPinPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdPreviewSourcePinId creativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
   * Pin ID.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  @NotNull
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdPreviewSourcePinId pinId(String pinId) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

