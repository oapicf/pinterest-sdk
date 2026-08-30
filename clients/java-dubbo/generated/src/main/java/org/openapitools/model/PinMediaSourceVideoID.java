package org.openapitools.model;

import org.openapitools.model.ContentType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Video ID-based media source.
 */
public class PinMediaSourceVideoID implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Content type for cover image Base64.
   */
  @JsonProperty("cover_image_content_type")
  private ContentType coverImageContentType;

  /**
   * Cover image Base64.
   */
  @JsonProperty("cover_image_data")
  private String coverImageData;

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   */
  @JsonProperty("cover_image_key_frame_time")
  private Integer coverImageKeyFrameTime;

  /**
   * Cover image URL.
   */
  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  @JsonProperty("is_standard")
  private Boolean isStandard = true;

  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("source_type")
  private String sourceType;

  /**
   * Content type for cover image Base64.
   * @return coverImageContentType
   */
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Cover image Base64.
   * @return coverImageData
   */
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * @return coverImageKeyFrameTime
   */
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  /**
   * Cover image URL.
   * @return coverImageUrl
   */
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * 
   * @return mediaId
   */
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * 
   * @return sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
