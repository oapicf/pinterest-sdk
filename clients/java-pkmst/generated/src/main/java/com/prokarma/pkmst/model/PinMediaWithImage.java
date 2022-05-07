package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ImageDetails;
import com.prokarma.pkmst.model.PinMedia;
import com.prokarma.pkmst.model.PinMediaWithImageAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Pin with image.
 */
@ApiModel(description = "Pin with image.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
public class PinMediaWithImage extends PinMedia  {
  @JsonProperty("images")
  
  private Map<String, ImageDetails> images = null;

  public PinMediaWithImage images(Map<String, ImageDetails> images) {
    this.images = images;
    return this;
  }

  public PinMediaWithImage putImagesItem(String key, ImageDetails imagesItem) {
    if (this.images == null) {
      this.images = new HashMap<>();
    }
    this.images.put(key, imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public Map<String, ImageDetails> getImages() {
    return images;
  }

  public void setImages(Map<String, ImageDetails> images) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

