package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ContentType;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Video ID-based media source.
 */

@Schema(name = "PinMediaSourceVideoID", description = "Video ID-based media source.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PinMediaSourceVideoID implements PinMediaSource {

  private @Nullable ContentType coverImageContentType;

  private @Nullable String coverImageData;

  private @Nullable Integer coverImageKeyFrameTime;

  private @Nullable String coverImageUrl;

  private Boolean isStandard = true;

  private String mediaId;

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    VIDEO_ID("video_id");

    private final String value;

    SourceTypeEnum(String value) {
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
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SourceTypeEnum sourceType;

  public PinMediaSourceVideoID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaSourceVideoID(String mediaId, SourceTypeEnum sourceType) {
    this.mediaId = mediaId;
    this.sourceType = sourceType;
  }

  public PinMediaSourceVideoID coverImageContentType(@Nullable ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

  /**
   * Content type for cover image Base64.
   * @return coverImageContentType
   */
  @Valid 
  @Schema(name = "cover_image_content_type", description = "Content type for cover image Base64.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_content_type")
  public @Nullable ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(@Nullable ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  public PinMediaSourceVideoID coverImageData(@Nullable String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

  /**
   * Cover image Base64.
   * @return coverImageData
   */
  
  @Schema(name = "cover_image_data", description = "Cover image Base64.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_data")
  public @Nullable String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(@Nullable String coverImageData) {
    this.coverImageData = coverImageData;
  }

  public PinMediaSourceVideoID coverImageKeyFrameTime(@Nullable Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    return this;
  }

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * minimum: 0
   * @return coverImageKeyFrameTime
   */
  @Min(value = 0) 
  @Schema(name = "cover_image_key_frame_time", description = "Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_key_frame_time")
  public @Nullable Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(@Nullable Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  public PinMediaSourceVideoID coverImageUrl(@Nullable String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Cover image URL.
   * @return coverImageUrl
   */
  
  @Schema(name = "cover_image_url", description = "Cover image URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cover_image_url")
  public @Nullable String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(@Nullable String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSourceVideoID isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  
  @Schema(name = "is_standard", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   * @return mediaId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "media_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @NotNull 
  @Schema(name = "source_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceVideoID pinMediaSourceVideoID = (PinMediaSourceVideoID) o;
    return Objects.equals(this.coverImageContentType, pinMediaSourceVideoID.coverImageContentType) &&
        Objects.equals(this.coverImageData, pinMediaSourceVideoID.coverImageData) &&
        Objects.equals(this.coverImageKeyFrameTime, pinMediaSourceVideoID.coverImageKeyFrameTime) &&
        Objects.equals(this.coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(this.isStandard, pinMediaSourceVideoID.isStandard) &&
        Objects.equals(this.mediaId, pinMediaSourceVideoID.mediaId) &&
        Objects.equals(this.sourceType, pinMediaSourceVideoID.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImageContentType, coverImageData, coverImageKeyFrameTime, coverImageUrl, isStandard, mediaId, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceVideoID {\n");
    sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
    sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
    sb.append("    coverImageKeyFrameTime: ").append(toIndentedString(coverImageKeyFrameTime)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

