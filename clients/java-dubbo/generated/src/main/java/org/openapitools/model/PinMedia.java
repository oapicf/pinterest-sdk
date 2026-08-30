package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;
import org.openapitools.model.PinMediaMetadata;
import org.openapitools.model.PinMediaWithImage;
import org.openapitools.model.PinMediaWithImageAndVideo;
import org.openapitools.model.PinMediaWithImages;
import org.openapitools.model.PinMediaWithVideo;
import org.openapitools.model.PinMediaWithVideos;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Pin media that can be an image, video, or a mix of both.
 */
public class PinMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("images")
  private ImageSize images;

  @JsonProperty("media_type")
  private String mediaType;

  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   */
  @JsonProperty("duration")
  private BigDecimal duration;

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   */
  @JsonProperty("height")
  private Integer height;

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   */
  @JsonProperty("video_url")
  private String videoUrl;

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   */
  @JsonProperty("video_url_hls")
  private String videoUrlHls;

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   */
  @JsonProperty("width")
  private Integer width;

  @JsonProperty("items")
  private List<PinMediaMetadata> items = new ArrayList<>();

  /**
   * 
   * @return images
   */
  public ImageSize getImages() {
    return images;
  }

  public void setImages(ImageSize images) {
    this.images = images;
  }

  /**
   * 
   * @return mediaType
   */
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * 
   * @return coverImageUrl
   */
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
   */
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
   */
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
   */
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * 
   * @return items
   */
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
    return Objects.equals(this.images, pinMedia.images) &&
        Objects.equals(this.mediaType, pinMedia.mediaType) &&
        Objects.equals(this.coverImageUrl, pinMedia.coverImageUrl) &&
        Objects.equals(this.duration, pinMedia.duration) &&
        Objects.equals(this.height, pinMedia.height) &&
        Objects.equals(this.videoUrl, pinMedia.videoUrl) &&
        Objects.equals(this.videoUrlHls, pinMedia.videoUrlHls) &&
        Objects.equals(this.width, pinMedia.width) &&
        Objects.equals(this.items, pinMedia.items);
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
