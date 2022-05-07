package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.ImageDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithImageAllOf   {
  
  private Map<String, ImageDetails> images = new HashMap<>();

  public PinMediaWithImageAllOf () {

  }

  public PinMediaWithImageAllOf (Map<String, ImageDetails> images) {
    this.images = images;
  }

    
  @JsonProperty("images")
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
