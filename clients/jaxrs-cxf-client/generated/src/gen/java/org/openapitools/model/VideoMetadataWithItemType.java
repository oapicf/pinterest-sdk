package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VideoMetadataWithItemType  {
  
  @ApiModelProperty(value = "")

  private String coverImageUrl;

 /**
  * Duration (in miliseconds). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")

  private BigDecimal duration;

 /**
  * Height (in pixels). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")

  private Integer height;

public enum ItemTypeEnum {

VIDEO(String.valueOf("video"));


    private String value;

    ItemTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemTypeEnum fromValue(String value) {
        for (ItemTypeEnum b : ItemTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")

  private ItemTypeEnum itemType;

 /**
  * Video url (720p).  **Note:** This field is limited and not available to all apps.
  */
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")

  private String videoUrl;

 /**
  * Video url (HLS).  **Note:** This field is limited and not available to all apps.
  */
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")

  private String videoUrlHls;

 /**
  * Width (in pixels). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")

  private Integer width;
 /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public VideoMetadataWithItemType coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
  **/
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public VideoMetadataWithItemType duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public VideoMetadataWithItemType height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
   * @return itemType
  **/
  @JsonProperty("item_type")
  public String getItemType() {
    if (itemType == null) {
      return null;
    }
    return itemType.value();
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public VideoMetadataWithItemType itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

 /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
  **/
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public VideoMetadataWithItemType videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

 /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
  **/
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public VideoMetadataWithItemType videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

 /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public VideoMetadataWithItemType width(Integer width) {
    this.width = width;
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
    VideoMetadataWithItemType videoMetadataWithItemType = (VideoMetadataWithItemType) o;
    return Objects.equals(this.coverImageUrl, videoMetadataWithItemType.coverImageUrl) &&
        Objects.equals(this.duration, videoMetadataWithItemType.duration) &&
        Objects.equals(this.height, videoMetadataWithItemType.height) &&
        Objects.equals(this.itemType, videoMetadataWithItemType.itemType) &&
        Objects.equals(this.videoUrl, videoMetadataWithItemType.videoUrl) &&
        Objects.equals(this.videoUrlHls, videoMetadataWithItemType.videoUrlHls) &&
        Objects.equals(this.width, videoMetadataWithItemType.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImageUrl, duration, height, itemType, videoUrl, videoUrlHls, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMetadataWithItemType {\n");
    
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoUrlHls: ").append(toIndentedString(videoUrlHls)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

