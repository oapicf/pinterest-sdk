package org.openapitools.model;

import org.openapitools.model.AdPinPreviewCreativeType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Ad preview source from an existing Pin.
 */
public class AdPreviewSourcePinId implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Creative type of the ad preview.
   */
  @JsonProperty("creative_type")
  private AdPinPreviewCreativeType creativeType;

  /**
   * Pin ID.
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * Creative type of the ad preview.
   * @return creativeType
   */
  public AdPinPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdPinPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Pin ID.
   * @return pinId
   */
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
