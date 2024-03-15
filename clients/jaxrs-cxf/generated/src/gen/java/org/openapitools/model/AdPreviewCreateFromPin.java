package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdPreviewCreateFromPin  {
  
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
 /**
   * Pin ID.
  **/
  private String pinId;
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

  public AdPreviewCreateFromPin pinId(String pinId) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

