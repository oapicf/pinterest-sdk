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

import org.openapitools.client.model.PinMedia;
import org.openapitools.client.model.PinMediaWithImageAllOfImages;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Pin with image.
 **/
@ApiModel(description = "Pin with image.")
public class PinMediaWithImage extends PinMedia {
  
  @SerializedName("media_type")
  private String mediaType = null;
  @SerializedName("images")
  private PinMediaWithImageAllOfImages images = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PinMediaWithImageAllOfImages getImages() {
    return images;
  }
  public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImage pinMediaWithImage = (PinMediaWithImage) o;
    return (this.mediaType == null ? pinMediaWithImage.mediaType == null : this.mediaType.equals(pinMediaWithImage.mediaType)) &&
        (this.images == null ? pinMediaWithImage.images == null : this.images.equals(pinMediaWithImage.images));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mediaType == null ? 0: this.mediaType.hashCode());
    result = 31 * result + (this.images == null ? 0: this.images.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImage {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  mediaType: ").append(mediaType).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
