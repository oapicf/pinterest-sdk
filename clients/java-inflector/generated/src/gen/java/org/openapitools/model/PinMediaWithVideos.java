package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMedia;
import org.openapitools.model.VideoMetadata;



/**
 * Pin with multiple videos.
 **/

@ApiModel(description = "Pin with multiple videos.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaWithVideos extends PinMedia  {
  @JsonProperty("items")
  private List<VideoMetadata> items = null;

  /**
   **/
  public PinMediaWithVideos items(List<VideoMetadata> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

