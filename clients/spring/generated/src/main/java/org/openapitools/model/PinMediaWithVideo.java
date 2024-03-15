package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.PinMedia;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pin with video.
 */

@Schema(name = "PinMediaWithVideo", description = "Pin with video.")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaWithVideo extends PinMedia {

  private ImageMetadataImages images;

  private String coverImageUrl;

  private JsonNullable<String> videoUrl = JsonNullable.<String>undefined();

  private BigDecimal duration;

  private Integer height;

  private Integer width;

  public PinMediaWithVideo images(ImageMetadataImages images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public ImageMetadataImages getImages() {
    return images;
  }

  public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

  public PinMediaWithVideo coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Get coverImageUrl
   * @return coverImageUrl
  */
  
  @Schema(name = "cover_image_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaWithVideo videoUrl(String videoUrl) {
    this.videoUrl = JsonNullable.of(videoUrl);
    return this;
  }

  /**
   * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
   * @return videoUrl
  */
  
  @Schema(name = "video_url", description = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_url")
  public JsonNullable<String> getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(JsonNullable<String> videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMediaWithVideo duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration (in milliseconds)
   * @return duration
  */
  @Valid 
  @Schema(name = "duration", description = "Duration (in milliseconds)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PinMediaWithVideo height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height (in pixels)
   * @return height
  */
  
  @Schema(name = "height", description = "Height (in pixels)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PinMediaWithVideo width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width (in pixels)
   * @return width
  */
  
  @Schema(name = "width", description = "Width (in pixels)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  public PinMediaWithVideo mediaType(String mediaType) {
    super.mediaType(mediaType);
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
        equalsNullable(this.videoUrl, pinMediaWithVideo.videoUrl) &&
        Objects.equals(this.duration, pinMediaWithVideo.duration) &&
        Objects.equals(this.height, pinMediaWithVideo.height) &&
        Objects.equals(this.width, pinMediaWithVideo.width) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, coverImageUrl, hashCodeNullable(videoUrl), duration, height, width, super.hashCode());
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

