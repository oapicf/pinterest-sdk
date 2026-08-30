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
import org.openapitools.model.ImageSize;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Pin with video.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaWithVideo   {
  
  private String coverImageUrl;
  private BigDecimal duration;
  private Integer height;
  private ImageSize images;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    VIDEO("video");
    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private MediaTypeEnum mediaType;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }
  public void setImages(ImageSize images) {
    this.images = images;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_type")
  @NotNull
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
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
    PinMediaWithVideo pinMediaWithVideo = (PinMediaWithVideo) o;
    return Objects.equals(this.coverImageUrl, pinMediaWithVideo.coverImageUrl) &&
        Objects.equals(this.duration, pinMediaWithVideo.duration) &&
        Objects.equals(this.height, pinMediaWithVideo.height) &&
        Objects.equals(this.images, pinMediaWithVideo.images) &&
        Objects.equals(this.mediaType, pinMediaWithVideo.mediaType) &&
        Objects.equals(this.videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(this.videoUrlHls, pinMediaWithVideo.videoUrlHls) &&
        Objects.equals(this.width, pinMediaWithVideo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImageUrl, duration, height, images, mediaType, videoUrl, videoUrlHls, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideo {\n");
    
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

