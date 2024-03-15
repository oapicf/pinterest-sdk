package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VideoMetadata  {
  
  @ApiModelProperty(value = "")
  private String itemType;

  @ApiModelProperty(value = "")
  private String coverImageUrl;

  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
 /**
   * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  **/
  private String videoUrl;

  @ApiModelProperty(value = "Duration (in milliseconds)")
 /**
   * Duration (in milliseconds)
  **/
  private BigDecimal duration;

  @ApiModelProperty(value = "Height (in pixels)")
 /**
   * Height (in pixels)
  **/
  private Integer height;

  @ApiModelProperty(value = "Width (in pixels)")
 /**
   * Width (in pixels)
  **/
  private Integer width;
 /**
   * Get itemType
   * @return itemType
  **/
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public VideoMetadata itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

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

  public VideoMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
   * @return videoUrl
  **/
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public VideoMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

 /**
   * Duration (in milliseconds)
   * @return duration
  **/
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public VideoMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Height (in pixels)
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public VideoMetadata height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Width (in pixels)
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public VideoMetadata width(Integer width) {
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
    VideoMetadata videoMetadata = (VideoMetadata) o;
    return Objects.equals(this.itemType, videoMetadata.itemType) &&
        Objects.equals(this.coverImageUrl, videoMetadata.coverImageUrl) &&
        Objects.equals(this.videoUrl, videoMetadata.videoUrl) &&
        Objects.equals(this.duration, videoMetadata.duration) &&
        Objects.equals(this.height, videoMetadata.height) &&
        Objects.equals(this.width, videoMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, coverImageUrl, videoUrl, duration, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMetadata {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

