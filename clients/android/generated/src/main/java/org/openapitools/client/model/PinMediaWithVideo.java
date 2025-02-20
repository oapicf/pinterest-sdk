/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import org.openapitools.client.model.PinMedia;
import org.openapitools.client.model.PinMediaWithImageAllOfImages;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Pin with video.
 **/
@ApiModel(description = "Pin with video.")
public class PinMediaWithVideo extends PinMedia {
  
  @SerializedName("media_type")
  private String mediaType = null;
  @SerializedName("images")
  private PinMediaWithImageAllOfImages images = null;
  @SerializedName("cover_image_url")
  private String coverImageUrl = null;
  @SerializedName("video_url")
  private String videoUrl = null;
  @SerializedName("duration")
  private BigDecimal duration = null;
  @SerializedName("height")
  private Integer height = null;
  @SerializedName("width")
  private Integer width = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PinMediaWithImageAllOfImages getImages() {
    return images;
  }
  public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
   **/
  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Duration (in milliseconds)
   **/
  @ApiModelProperty(value = "Duration (in milliseconds)")
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels)
   **/
  @ApiModelProperty(value = "Height (in pixels)")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Width (in pixels)
   **/
  @ApiModelProperty(value = "Width (in pixels)")
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
    PinMediaWithVideo pinMediaWithVideo = (PinMediaWithVideo) o;
    return (this.mediaType == null ? pinMediaWithVideo.mediaType == null : this.mediaType.equals(pinMediaWithVideo.mediaType)) &&
        (this.images == null ? pinMediaWithVideo.images == null : this.images.equals(pinMediaWithVideo.images)) &&
        (this.coverImageUrl == null ? pinMediaWithVideo.coverImageUrl == null : this.coverImageUrl.equals(pinMediaWithVideo.coverImageUrl)) &&
        (this.videoUrl == null ? pinMediaWithVideo.videoUrl == null : this.videoUrl.equals(pinMediaWithVideo.videoUrl)) &&
        (this.duration == null ? pinMediaWithVideo.duration == null : this.duration.equals(pinMediaWithVideo.duration)) &&
        (this.height == null ? pinMediaWithVideo.height == null : this.height.equals(pinMediaWithVideo.height)) &&
        (this.width == null ? pinMediaWithVideo.width == null : this.width.equals(pinMediaWithVideo.width));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mediaType == null ? 0: this.mediaType.hashCode());
    result = 31 * result + (this.images == null ? 0: this.images.hashCode());
    result = 31 * result + (this.coverImageUrl == null ? 0: this.coverImageUrl.hashCode());
    result = 31 * result + (this.videoUrl == null ? 0: this.videoUrl.hashCode());
    result = 31 * result + (this.duration == null ? 0: this.duration.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideo {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  mediaType: ").append(mediaType).append("\n");
    sb.append("  images: ").append(images).append("\n");
    sb.append("  coverImageUrl: ").append(coverImageUrl).append("\n");
    sb.append("  videoUrl: ").append(videoUrl).append("\n");
    sb.append("  duration: ").append(duration).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
