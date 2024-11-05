package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.PinMedia;
import org.openapitools.server.api.model.PinMediaWithImageAllOfImages;

/**
 * Pin with video.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaWithVideo extends PinMedia  {
  
  private PinMediaWithImageAllOfImages images;
  private String coverImageUrl;
  private String videoUrl;
  private BigDecimal duration;
  private Integer height;
  private Integer width;

  public PinMediaWithVideo () {

  }

  public PinMediaWithVideo (PinMediaWithImageAllOfImages images, String coverImageUrl, String videoUrl, BigDecimal duration, Integer height, Integer width) {
    this.images = images;
    this.coverImageUrl = coverImageUrl;
    this.videoUrl = videoUrl;
    this.duration = duration;
    this.height = height;
    this.width = width;
  }

    
  @JsonProperty("images")
  public PinMediaWithImageAllOfImages getImages() {
    return images;
  }
  public void setImages(PinMediaWithImageAllOfImages images) {
    this.images = images;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
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
    return super.equals(o) && Objects.equals(images, pinMediaWithVideo.images) &&
        Objects.equals(coverImageUrl, pinMediaWithVideo.coverImageUrl) &&
        Objects.equals(videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(duration, pinMediaWithVideo.duration) &&
        Objects.equals(height, pinMediaWithVideo.height) &&
        Objects.equals(width, pinMediaWithVideo.width);
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
