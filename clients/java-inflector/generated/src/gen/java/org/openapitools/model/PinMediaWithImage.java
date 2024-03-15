package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.PinMedia;



/**
 * Pin with image.
 **/

@ApiModel(description = "Pin with image.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaWithImage extends PinMedia  {
  @JsonProperty("images")
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
    return super.equals(o) && Objects.equals(images, pinMediaWithImage.images);
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

