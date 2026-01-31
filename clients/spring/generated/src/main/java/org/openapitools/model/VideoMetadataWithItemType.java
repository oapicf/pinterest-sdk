package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VideoMetadataWithItemType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VideoMetadataWithItemType {

  private @Nullable String coverImageUrl;

  private JsonNullable<BigDecimal> duration = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private @Nullable String itemType;

  private JsonNullable<String> videoUrl = JsonNullable.<String>undefined();

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public VideoMetadataWithItemType coverImageUrl(@Nullable String coverImageUrl) {
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

  public void setCoverImageUrl(@Nullable String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public VideoMetadataWithItemType duration(BigDecimal duration) {
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

  public VideoMetadataWithItemType height(Integer height) {
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

  public VideoMetadataWithItemType itemType(@Nullable String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   * @return itemType
   */
  
  @Schema(name = "item_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_type")
  public @Nullable String getItemType() {
    return itemType;
  }

  public void setItemType(@Nullable String itemType) {
    this.itemType = itemType;
  }

  public VideoMetadataWithItemType videoUrl(String videoUrl) {
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

  public VideoMetadataWithItemType width(Integer width) {
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
    VideoMetadataWithItemType videoMetadataWithItemType = (VideoMetadataWithItemType) o;
    return Objects.equals(this.coverImageUrl, videoMetadataWithItemType.coverImageUrl) &&
        equalsNullable(this.duration, videoMetadataWithItemType.duration) &&
        equalsNullable(this.height, videoMetadataWithItemType.height) &&
        Objects.equals(this.itemType, videoMetadataWithItemType.itemType) &&
        equalsNullable(this.videoUrl, videoMetadataWithItemType.videoUrl) &&
        equalsNullable(this.width, videoMetadataWithItemType.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImageUrl, hashCodeNullable(duration), hashCodeNullable(height), itemType, hashCodeNullable(videoUrl), hashCodeNullable(width));
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
    sb.append("class VideoMetadataWithItemType {\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

