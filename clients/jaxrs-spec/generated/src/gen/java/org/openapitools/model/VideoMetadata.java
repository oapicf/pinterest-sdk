package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("VideoMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VideoMetadata   {
  private @Valid String itemType;
  private @Valid String coverImageUrl;
  private @Valid String videoUrl;
  private @Valid BigDecimal duration;
  private @Valid Integer height;
  private @Valid Integer width;

  /**
   **/
  public VideoMetadata itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  @JsonProperty("item_type")
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  /**
   **/
  public VideoMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  @JsonProperty("cover_image_url")
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
   **/
  public VideoMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  @JsonProperty("video_url")
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Duration (in milliseconds)
   **/
  public VideoMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(value = "Duration (in milliseconds)")
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels)
   **/
  public VideoMetadata height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(value = "Height (in pixels)")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Width (in pixels)
   **/
  public VideoMetadata width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(value = "Width (in pixels)")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  @JsonProperty("width")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

