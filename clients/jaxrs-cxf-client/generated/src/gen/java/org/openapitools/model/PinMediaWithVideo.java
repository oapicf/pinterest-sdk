package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.PinMedia;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin with video.
 **/
@ApiModel(description="Pin with video.")

public class PinMediaWithVideo extends PinMedia {
  
  @ApiModelProperty(value = "")
  private ImageMetadataImages images;

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
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public ImageMetadataImages getImages() {
    return images;
  }

  public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

  public PinMediaWithVideo images(ImageMetadataImages images) {
    this.images = images;
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

  public PinMediaWithVideo coverImageUrl(String coverImageUrl) {
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

  public PinMediaWithVideo videoUrl(String videoUrl) {
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

  public PinMediaWithVideo duration(BigDecimal duration) {
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

  public PinMediaWithVideo height(Integer height) {
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

  public PinMediaWithVideo width(Integer width) {
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
    PinMediaWithVideo pinMediaWithVideo = (PinMediaWithVideo) o;
    return Objects.equals(this.images, pinMediaWithVideo.images) &&
        Objects.equals(this.coverImageUrl, pinMediaWithVideo.coverImageUrl) &&
        Objects.equals(this.videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(this.duration, pinMediaWithVideo.duration) &&
        Objects.equals(this.height, pinMediaWithVideo.height) &&
        Objects.equals(this.width, pinMediaWithVideo.width) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, coverImageUrl, videoUrl, duration, height, width, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

