package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.VideoMetadataWithItemType;

/**
 * Pin with multiple videos.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithVideos   {
  
  private List<VideoMetadataWithItemType> items = new ArrayList<>();


  public enum MediaTypeEnum {
    MULTIPLE_VIDEOS("multiple_videos");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MediaTypeEnum mediaType;

  public PinMediaWithVideos () {

  }

  public PinMediaWithVideos (List<VideoMetadataWithItemType> items, MediaTypeEnum mediaType) {
    this.items = items;
    this.mediaType = mediaType;
  }

    
  @JsonProperty("items")
  public List<VideoMetadataWithItemType> getItems() {
    return items;
  }
  public void setItems(List<VideoMetadataWithItemType> items) {
    this.items = items;
  }

    
  @JsonProperty("media_type")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
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
    PinMediaWithVideos pinMediaWithVideos = (PinMediaWithVideos) o;
    return Objects.equals(items, pinMediaWithVideos.items) &&
        Objects.equals(mediaType, pinMediaWithVideos.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideos {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
