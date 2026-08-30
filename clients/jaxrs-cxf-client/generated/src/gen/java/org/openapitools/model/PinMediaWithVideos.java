package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VideoMetadataWithItemType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin with multiple videos.
 */
@ApiModel(description="Pin with multiple videos.")

public class PinMediaWithVideos  {
  
  @ApiModelProperty(value = "")

  private List<VideoMetadataWithItemType> items = new ArrayList<>();

public enum MediaTypeEnum {

MULTIPLE_VIDEOS(String.valueOf("multiple_videos"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String value) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private MediaTypeEnum mediaType;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<VideoMetadataWithItemType> getItems() {
    return items;
  }

  public void setItems(List<VideoMetadataWithItemType> items) {
    this.items = items;
  }

  public PinMediaWithVideos items(List<VideoMetadataWithItemType> items) {
    this.items = items;
    return this;
  }

  public PinMediaWithVideos addItemsItem(VideoMetadataWithItemType itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  public String getMediaType() {
    if (mediaType == null) {
      return null;
    }
    return mediaType.value();
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithVideos mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
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
    return Objects.equals(this.items, pinMediaWithVideos.items) &&
        Objects.equals(this.mediaType, pinMediaWithVideos.mediaType);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

