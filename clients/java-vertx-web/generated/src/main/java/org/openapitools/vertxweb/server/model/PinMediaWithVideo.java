package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ImageSize;

/**
 * Pin with video.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithVideo   {
  
  private String coverImageUrl;
  private BigDecimal duration;
  private Integer height;
  private ImageSize images;


  public enum MediaTypeEnum {
    VIDEO("video");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MediaTypeEnum mediaType;
  private String videoUrl;
  private String videoUrlHls;
  private Integer width;

  public PinMediaWithVideo () {

  }

  public PinMediaWithVideo (String coverImageUrl, BigDecimal duration, Integer height, ImageSize images, MediaTypeEnum mediaType, String videoUrl, String videoUrlHls, Integer width) {
    this.coverImageUrl = coverImageUrl;
    this.duration = duration;
    this.height = height;
    this.images = images;
    this.mediaType = mediaType;
    this.videoUrl = videoUrl;
    this.videoUrlHls = videoUrlHls;
    this.width = width;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

    
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

    
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }
  public void setImages(ImageSize images) {
    this.images = images;
  }

    
  @JsonProperty("media_type")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

    
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

    
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }
  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

    
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
    return Objects.equals(coverImageUrl, pinMediaWithVideo.coverImageUrl) &&
        Objects.equals(duration, pinMediaWithVideo.duration) &&
        Objects.equals(height, pinMediaWithVideo.height) &&
        Objects.equals(images, pinMediaWithVideo.images) &&
        Objects.equals(mediaType, pinMediaWithVideo.mediaType) &&
        Objects.equals(videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(videoUrlHls, pinMediaWithVideo.videoUrlHls) &&
        Objects.equals(width, pinMediaWithVideo.width);
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
