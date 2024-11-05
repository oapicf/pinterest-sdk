package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PinMedia;
import org.openapitools.vertxweb.server.model.PinMediaMetadata;

/**
 * Pin with a mix of images and videos.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithImageAndVideo extends PinMedia  {
  
  private List<PinMediaMetadata> items = new ArrayList<>();

  public PinMediaWithImageAndVideo () {

  }

  public PinMediaWithImageAndVideo (List<PinMediaMetadata> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<PinMediaMetadata> getItems() {
    return items;
  }
  public void setItems(List<PinMediaMetadata> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImageAndVideo pinMediaWithImageAndVideo = (PinMediaWithImageAndVideo) o;
    return super.equals(o) && Objects.equals(items, pinMediaWithImageAndVideo.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAndVideo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
