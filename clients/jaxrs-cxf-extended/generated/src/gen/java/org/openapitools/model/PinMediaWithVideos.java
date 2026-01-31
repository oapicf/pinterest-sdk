package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VideoMetadataWithItemType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin with multiple videos.
 */
@ApiModel(description="Pin with multiple videos.")

public class PinMediaWithVideos  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid VideoMetadataWithItemType> items = new ArrayList<>();

public enum MediaTypeEnum {

    @JsonProperty("multiple_videos") MULTIPLE_VIDEOS(String.valueOf("multiple_videos"));

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
  */
  @JsonProperty("items")
  public List<@Valid VideoMetadataWithItemType> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid VideoMetadataWithItemType> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public PinMediaWithVideos items(List<@Valid VideoMetadataWithItemType> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public PinMediaWithVideos addItemsItem(VideoMetadataWithItemType itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get mediaType
  * @return mediaType
  */
  @JsonProperty("media_type")
  @NotNull
  public String getMediaType() {
    return mediaType == null ? null : mediaType.value();
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
 public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

