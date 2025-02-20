/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdPreviewCreateFromPin {
  
  @SerializedName("pin_id")
  private String pinId = null;

  /**
   * Pin ID.
   **/
  @ApiModelProperty(required = true, value = "Pin ID.")
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
    return (this.pinId == null ? adPreviewCreateFromPin.pinId == null : this.pinId.equals(adPreviewCreateFromPin.pinId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pinId == null ? 0: this.pinId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewCreateFromPin {\n");
    
    sb.append("  pinId: ").append(pinId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
