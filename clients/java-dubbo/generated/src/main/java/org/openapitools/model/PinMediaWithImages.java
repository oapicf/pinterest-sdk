package org.openapitools.model;

import org.openapitools.model.ImageMetadata;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Pin with multiple images.
 */
public class PinMediaWithImages implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("items")
  private List<ImageMetadata> items = new ArrayList<>();

  @JsonProperty("media_type")
  private String mediaType;

  /**
   * 
   * @return items
   */
  public List<ImageMetadata> getItems() {
    return items;
  }

  public void setItems(List<ImageMetadata> items) {
    this.items = items;
  }

  /**
   * 
   * @return mediaType
   */
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImages pinMediaWithImages = (PinMediaWithImages) o;
    return Objects.equals(this.items, pinMediaWithImages.items) &&
        Objects.equals(this.mediaType, pinMediaWithImages.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImages {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
