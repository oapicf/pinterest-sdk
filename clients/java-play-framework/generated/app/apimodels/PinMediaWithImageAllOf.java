package apimodels;

import apimodels.ImageDetails;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * PinMediaWithImageAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaWithImageAllOf   {
  @JsonProperty("images")
  @Valid

  private Map<String, ImageDetails> images = null;

  public PinMediaWithImageAllOf images(Map<String, ImageDetails> images) {
    this.images = images;
    return this;
  }

  public PinMediaWithImageAllOf putImagesItem(String key, ImageDetails imagesItem) {
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
    PinMediaWithImageAllOf pinMediaWithImageAllOf = (PinMediaWithImageAllOf) o;
    return Objects.equals(images, pinMediaWithImageAllOf.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAllOf {\n");
    
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
