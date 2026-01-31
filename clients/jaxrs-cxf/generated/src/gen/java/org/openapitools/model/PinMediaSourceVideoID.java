package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ContentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Video ID-based media source.
 */
@ApiModel(description="Video ID-based media source.")

public class PinMediaSourceVideoID  {
  
 /**
  * Content type for cover image Base64.
  */
  @ApiModelProperty(value = "Content type for cover image Base64.")

  @Valid

  private ContentType coverImageContentType;

 /**
  * Cover image Base64.
  */
  @ApiModelProperty(value = "Cover image Base64.")

  private String coverImageData;

 /**
  * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  */
  @ApiModelProperty(value = "Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.")

  private Integer coverImageKeyFrameTime;

 /**
  * Cover image URL.
  */
  @ApiModelProperty(value = "Cover image URL.")

  private String coverImageUrl;

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")

  private Boolean isStandard = true;

  @ApiModelProperty(required = true, value = "")

  private String mediaId;

public enum SourceTypeEnum {

VIDEO_ID(String.valueOf("video_id"));


    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(required = true, value = "")

  private SourceTypeEnum sourceType;
 /**
   * Content type for cover image Base64.
   * @return coverImageContentType
  **/
  @JsonProperty("cover_image_content_type")
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  public PinMediaSourceVideoID coverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

 /**
   * Cover image Base64.
   * @return coverImageData
  **/
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  public PinMediaSourceVideoID coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

 /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * minimum: 0
   * @return coverImageKeyFrameTime
  **/
  @JsonProperty("cover_image_key_frame_time")
 @Min(0)  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  public PinMediaSourceVideoID coverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    return this;
  }

 /**
   * Cover image URL.
   * @return coverImageUrl
  **/
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
  **/
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSourceVideoID isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

 /**
   * Get mediaId
   * @return mediaId
  **/
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

