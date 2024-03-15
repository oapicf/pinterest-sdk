package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.PinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Pin with video.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaWithVideo extends PinMedia  {
  
  private ImageMetadataImages images;
  private String coverImageUrl;
  private String videoUrl;
  private BigDecimal duration;
  private Integer height;
  private Integer width;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  @Valid
  public ImageMetadataImages getImages() {
    return images;
  }
  public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

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
   * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
   **/
  
  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
  @JsonProperty("video_url")
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
  @JsonProperty("duration")
  @Valid
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
  @JsonProperty("height")
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
    PinMediaWithVideo pinMediaWithVideo = (PinMediaWithVideo) o;
    return super.equals(o) && Objects.equals(this.images, pinMediaWithVideo.images) &&
        Objects.equals(this.coverImageUrl, pinMediaWithVideo.coverImageUrl) &&
        Objects.equals(this.videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(this.duration, pinMediaWithVideo.duration) &&
        Objects.equals(this.height, pinMediaWithVideo.height) &&
        Objects.equals(this.width, pinMediaWithVideo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), images, super.hashCode(), coverImageUrl, super.hashCode(), videoUrl, super.hashCode(), duration, super.hashCode(), height, super.hashCode(), width);
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

