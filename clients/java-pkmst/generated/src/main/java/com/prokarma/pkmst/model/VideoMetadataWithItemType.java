package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * VideoMetadataWithItemType
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class VideoMetadataWithItemType   {
  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  @JsonProperty("duration")
  private BigDecimal duration;

  @JsonProperty("height")
  private Integer height;

  /**
   * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
   */
  public enum ItemTypeEnum {
    VIDEO("video");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemTypeEnum fromValue(String text) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("item_type")
  private ItemTypeEnum itemType;

  @JsonProperty("video_url")
  private String videoUrl;

  @JsonProperty("video_url_hls")
  private String videoUrlHls;

  @JsonProperty("width")
  private Integer width;

  public VideoMetadataWithItemType coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Get coverImageUrl
   * @return coverImageUrl
   */
  @ApiModelProperty(value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public VideoMetadataWithItemType duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
   */
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public VideoMetadataWithItemType height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
   */
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public VideoMetadataWithItemType itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
   * @return itemType
   */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")
  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public VideoMetadataWithItemType videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
   */
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public VideoMetadataWithItemType videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
   */
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public VideoMetadataWithItemType width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
   */
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

