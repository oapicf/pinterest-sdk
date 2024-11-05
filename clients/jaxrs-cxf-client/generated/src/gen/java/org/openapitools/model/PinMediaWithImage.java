package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaWithImageAllOfImages;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin with image.
 **/
@ApiModel(description="Pin with image.")

public class PinMediaWithImage extends PinMedia {
  
  @ApiModelProperty(value = "")
  private PinMediaWithImageAllOfImages images;
 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public PinMediaWithImageAllOfImages getImages() {
    return images;
  }

  public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

  public PinMediaWithImage images(PinMediaWithImageAllOfImages images) {
    this.images = images;
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
    PinMediaWithImage pinMediaWithImage = (PinMediaWithImage) o;
    return Objects.equals(this.images, pinMediaWithImage.images) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

