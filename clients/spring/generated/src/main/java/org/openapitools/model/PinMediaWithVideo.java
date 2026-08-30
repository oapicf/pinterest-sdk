package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pin with video.
 */

@Schema(name = "PinMediaWithVideo", description = "Pin with video.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaWithVideo implements PinMedia {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String coverImageUrl;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BigDecimal> duration = JsonNullable.<BigDecimal>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ImageSize images;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    VIDEO("video");

    private final String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MediaTypeEnum mediaType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> videoUrl = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> videoUrlHls = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public PinMediaWithVideo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaWithVideo(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithVideo coverImageUrl(@Nullable String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Get coverImageUrl
   * @return coverImageUrl
   */
  
  @Schema(name = "cover_image_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_url")
  public @Nullable String getCoverImageUrl() {
    return coverImageUrl;
  }

  @JsonProperty("cover_image_url")
  public void setCoverImageUrl(@Nullable String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaWithVideo duration(BigDecimal duration) {
    this.duration = JsonNullable.of(duration);
    return this;
  }

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
   */
  @Valid 
  @Schema(name = "duration", description = "Duration (in miliseconds). Field maybe null after creation due to video processing time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public JsonNullable<BigDecimal> getDuration() {
    return duration;
  }

  public void setDuration(JsonNullable<BigDecimal> duration) {
    this.duration = duration;
  }

  public PinMediaWithVideo height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
   */
  
  @Schema(name = "height", description = "Height (in pixels). Field maybe null after creation due to video processing time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public PinMediaWithVideo images(@Nullable ImageSize images) {
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
  public @Nullable ImageSize getImages() {
    return images;
  }

  @JsonProperty("images")
  public void setImages(@Nullable ImageSize images) {
    this.images = images;
  }

  public PinMediaWithVideo mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @NotNull 
  @Schema(name = "media_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_type")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  @JsonProperty("media_type")
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithVideo videoUrl(String videoUrl) {
    this.videoUrl = JsonNullable.of(videoUrl);
    return this;
  }

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
   */
  
  @Schema(name = "video_url", description = "Video url (720p).  **Note:** This field is limited and not available to all apps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_url")
  public JsonNullable<String> getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(JsonNullable<String> videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMediaWithVideo videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = JsonNullable.of(videoUrlHls);
    return this;
  }

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
   */
  
  @Schema(name = "video_url_hls", description = "Video url (HLS).  **Note:** This field is limited and not available to all apps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_url_hls")
  public JsonNullable<String> getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(JsonNullable<String> videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public PinMediaWithVideo width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
   */
  
  @Schema(name = "width", description = "Width (in pixels). Field maybe null after creation due to video processing time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Integer> width) {
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
        equalsNullable(this.duration, pinMediaWithVideo.duration) &&
        equalsNullable(this.height, pinMediaWithVideo.height) &&
        Objects.equals(this.images, pinMediaWithVideo.images) &&
        Objects.equals(this.mediaType, pinMediaWithVideo.mediaType) &&
        equalsNullable(this.videoUrl, pinMediaWithVideo.videoUrl) &&
        equalsNullable(this.videoUrlHls, pinMediaWithVideo.videoUrlHls) &&
        equalsNullable(this.width, pinMediaWithVideo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImageUrl, hashCodeNullable(duration), hashCodeNullable(height), images, mediaType, hashCodeNullable(videoUrl), hashCodeNullable(videoUrlHls), hashCodeNullable(width));
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

