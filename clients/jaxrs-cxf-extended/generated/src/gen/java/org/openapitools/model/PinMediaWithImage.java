package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaWithImageAllOfImages;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin with image.
 */
@ApiModel(description="Pin with image.")

public class PinMediaWithImage extends PinMedia {
  
  @ApiModelProperty(value = "")
  @Valid
  private PinMediaWithImageAllOfImages images;
 /**
  * Get images
  * @return images
  */
  @JsonProperty("images")
  public PinMediaWithImageAllOfImages getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

