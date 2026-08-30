package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VideoMetadataWithItemType;



/**
 * Pin with multiple videos.
 **/

@ApiModel(description = "Pin with multiple videos.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaWithVideos   {
  @JsonProperty("items")
  private List<VideoMetadataWithItemType> items = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MULTIPLE_VIDEOS("multiple_videos");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("media_type")
  private MediaTypeEnum mediaType;

  /**
   **/
  public PinMediaWithVideos items(List<VideoMetadataWithItemType> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public List<VideoMetadataWithItemType> getItems() {
    return items;
  }
  public void setItems(List<VideoMetadataWithItemType> items) {
    this.items = items;
  }

  /**
   **/
  public PinMediaWithVideos mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

