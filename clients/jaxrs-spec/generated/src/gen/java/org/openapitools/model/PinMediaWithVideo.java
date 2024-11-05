package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaWithImageAllOfImages;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Pin with video.
 **/
@ApiModel(description = "Pin with video.")
@JsonTypeName("PinMediaWithVideo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaWithVideo extends PinMedia  {
  private PinMediaWithImageAllOfImages images;
  private String coverImageUrl;
  private String videoUrl;
  private BigDecimal duration;
  private Integer height;
  private Integer width;

  /**
   **/
  public PinMediaWithVideo images(PinMediaWithImageAllOfImages images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  @Valid public PinMediaWithImageAllOfImages getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

  /**
   **/
  public PinMediaWithVideo coverImageUrl(String coverImageUrl) {
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
  public PinMediaWithVideo videoUrl(String videoUrl) {
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
  public PinMediaWithVideo duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(value = "Duration (in milliseconds)")
  @JsonProperty("duration")
  @Valid public BigDecimal getDuration() {
    return duration;
  }

  @JsonProperty("duration")
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels)
   **/
  public PinMediaWithVideo height(Integer height) {
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
  public PinMediaWithVideo width(Integer width) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

