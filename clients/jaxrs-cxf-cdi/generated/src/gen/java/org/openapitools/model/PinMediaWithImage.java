package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.PinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pin with image.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Pin with image.")
public class PinMediaWithImage extends PinMedia  {
  
  private ImageMetadataImages images;

  /**
   **/
  public PinMediaWithImage images(ImageMetadataImages images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  public ImageMetadataImages getImages() {
    return images;
  }
  public void setImages(ImageMetadataImages images) {
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
    return super.equals(o) && Objects.equals(this.images, pinMediaWithImage.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), images);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

