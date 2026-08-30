package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ImageSize;
import org.openapitools.vertxweb.server.model.PinMediaMetadata;
import org.openapitools.vertxweb.server.model.PinMediaWithImage;
import org.openapitools.vertxweb.server.model.PinMediaWithImageAndVideo;
import org.openapitools.vertxweb.server.model.PinMediaWithImages;
import org.openapitools.vertxweb.server.model.PinMediaWithVideo;
import org.openapitools.vertxweb.server.model.PinMediaWithVideos;

/**
 * Pin media that can be an image, video, or a mix of both.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMedia   {
  
  private ImageSize images;


  public enum MediaTypeEnum {
    MULTIPLE_MIXED("multiple_mixed");

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
  private String coverImageUrl;
  private BigDecimal duration;
  private Integer height;
  private String videoUrl;
  private String videoUrlHls;
  private Integer width;
  private List<PinMediaMetadata> items = new ArrayList<>();

  public PinMedia () {

  }

  public PinMedia (ImageSize images, MediaTypeEnum mediaType, String coverImageUrl, BigDecimal duration, Integer height, String videoUrl, String videoUrlHls, Integer width, List<PinMediaMetadata> items) {
    this.images = images;
    this.mediaType = mediaType;
    this.coverImageUrl = coverImageUrl;
    this.duration = duration;
    this.height = height;
    this.videoUrl = videoUrl;
    this.videoUrlHls = videoUrlHls;
    this.width = width;
    this.items = items;
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

    
  @JsonProperty("items")
  public List<PinMediaMetadata> getItems() {
    return items;
  }
  public void setItems(List<PinMediaMetadata> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMedia pinMedia = (PinMedia) o;
    return Objects.equals(images, pinMedia.images) &&
        Objects.equals(mediaType, pinMedia.mediaType) &&
        Objects.equals(coverImageUrl, pinMedia.coverImageUrl) &&
        Objects.equals(duration, pinMedia.duration) &&
        Objects.equals(height, pinMedia.height) &&
        Objects.equals(videoUrl, pinMedia.videoUrl) &&
        Objects.equals(videoUrlHls, pinMedia.videoUrlHls) &&
        Objects.equals(width, pinMedia.width) &&
        Objects.equals(items, pinMedia.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, mediaType, coverImageUrl, duration, height, videoUrl, videoUrlHls, width, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMedia {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoUrlHls: ").append(toIndentedString(videoUrlHls)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
