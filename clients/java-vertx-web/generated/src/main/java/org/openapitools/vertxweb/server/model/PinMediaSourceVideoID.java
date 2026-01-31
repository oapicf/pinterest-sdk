package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ContentType;

/**
 * Video ID-based media source.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSourceVideoID   {
  
  private ContentType coverImageContentType;
  private String coverImageData;
  private Integer coverImageKeyFrameTime;
  private String coverImageUrl;
  private Boolean isStandard = true;
  private String mediaId;


  public enum SourceTypeEnum {
    VIDEO_ID("video_id");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceTypeEnum sourceType;

  public PinMediaSourceVideoID () {

  }

  public PinMediaSourceVideoID (ContentType coverImageContentType, String coverImageData, Integer coverImageKeyFrameTime, String coverImageUrl, Boolean isStandard, String mediaId, SourceTypeEnum sourceType) {
    this.coverImageContentType = coverImageContentType;
    this.coverImageData = coverImageData;
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    this.coverImageUrl = coverImageUrl;
    this.isStandard = isStandard;
    this.mediaId = mediaId;
    this.sourceType = sourceType;
  }

    
  @JsonProperty("cover_image_content_type")
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }
  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

    
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

    
  @JsonProperty("cover_image_key_frame_time")
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }
  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

    
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

    
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
    return Objects.equals(coverImageContentType, pinMediaSourceVideoID.coverImageContentType) &&
        Objects.equals(coverImageData, pinMediaSourceVideoID.coverImageData) &&
        Objects.equals(coverImageKeyFrameTime, pinMediaSourceVideoID.coverImageKeyFrameTime) &&
        Objects.equals(coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(isStandard, pinMediaSourceVideoID.isStandard) &&
        Objects.equals(mediaId, pinMediaSourceVideoID.mediaId) &&
        Objects.equals(sourceType, pinMediaSourceVideoID.sourceType);
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
