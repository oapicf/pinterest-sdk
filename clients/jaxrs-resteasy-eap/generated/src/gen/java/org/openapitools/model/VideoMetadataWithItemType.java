package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class VideoMetadataWithItemType   {
  
  private String coverImageUrl;
  private BigDecimal duration;
  private Integer height;

  /**
   * Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
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
  }

  private ItemTypeEnum itemType;
  private String videoUrl;
  private String videoUrlHls;
  private Integer width;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   **/
  
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   **/
  
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
   **/
  
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")
  @JsonProperty("item_type")
  @NotNull
  public ItemTypeEnum getItemType() {
    return itemType;
  }
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   **/
  
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   **/
  
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }
  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   **/
  
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")
  @JsonProperty("width")
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

