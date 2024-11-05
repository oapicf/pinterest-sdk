package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.PinMedia;
import org.openapitools.server.api.model.VideoMetadata;

/**
 * Pin with multiple videos.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithVideos extends PinMedia  {
  
  private List<VideoMetadata> items = new ArrayList<>();

  public PinMediaWithVideos () {

  }

  public PinMediaWithVideos (List<VideoMetadata> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<VideoMetadata> getItems() {
    return items;
  }
  public void setItems(List<VideoMetadata> items) {
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
    PinMediaWithVideos pinMediaWithVideos = (PinMediaWithVideos) o;
    return super.equals(o) && Objects.equals(items, pinMediaWithVideos.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideos {\n");
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
