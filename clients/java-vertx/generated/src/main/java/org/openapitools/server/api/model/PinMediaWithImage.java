package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.PinMedia;
import org.openapitools.server.api.model.PinMediaWithImageAllOfImages;

/**
 * Pin with image.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithImage extends PinMedia  {
  
  private PinMediaWithImageAllOfImages images;

  public PinMediaWithImage () {

  }

  public PinMediaWithImage (PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

    
  @JsonProperty("images")
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
