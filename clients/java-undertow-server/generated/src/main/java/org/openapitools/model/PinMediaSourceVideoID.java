/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Video ID-based media source
 */

@ApiModel(description = "Video ID-based media source")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceVideoID   {
  


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
  private String coverImageUrl;


  public enum CoverImageContentTypeEnum {
    JPEG("image/jpeg"),
    PNG("image/png");

    private String value;

    CoverImageContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CoverImageContentTypeEnum coverImageContentType;
  private String coverImageData;
  private String mediaId;
  private Boolean isStandard = true;

  /**
   */
  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Cover image url.
   */
  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image url.")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Content type for cover image Base64.
   */
  public PinMediaSourceVideoID coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

  
  @ApiModelProperty(value = "Content type for cover image Base64.")
  @JsonProperty("cover_image_content_type")
  public CoverImageContentTypeEnum getCoverImageContentType() {
    return coverImageContentType;
  }
  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Cover image Base64.
   */
  public PinMediaSourceVideoID coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image Base64.")
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   */
  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  public PinMediaSourceVideoID isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
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
    return Objects.equals(sourceType, pinMediaSourceVideoID.sourceType) &&
        Objects.equals(coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(coverImageContentType, pinMediaSourceVideoID.coverImageContentType) &&
        Objects.equals(coverImageData, pinMediaSourceVideoID.coverImageData) &&
        Objects.equals(mediaId, pinMediaSourceVideoID.mediaId) &&
        Objects.equals(isStandard, pinMediaSourceVideoID.isStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, coverImageUrl, coverImageContentType, coverImageData, mediaId, isStandard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceVideoID {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
    sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
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

