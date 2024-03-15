package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Video ID-based media source
 */
@ApiModel(description="Video ID-based media source")

public class PinMediaSourceVideoID  {
  
public enum SourceTypeEnum {

    @JsonProperty("video_id") VIDEO_ID(String.valueOf("video_id"));

    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * Cover image url.
  */
  @ApiModelProperty(value = "Cover image url.")
  private String coverImageUrl;

public enum CoverImageContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")),
    @JsonProperty("image/png") PNG(String.valueOf("image/png"));

    private String value;

    CoverImageContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CoverImageContentTypeEnum fromValue(String value) {
        for (CoverImageContentTypeEnum b : CoverImageContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Content type for cover image Base64.
  */
  @ApiModelProperty(value = "Content type for cover image Base64.")
  private CoverImageContentTypeEnum coverImageContentType;

 /**
  * Cover image Base64.
  */
  @ApiModelProperty(value = "Cover image Base64.")
  private String coverImageData;

  @ApiModelProperty(required = true, value = "")
  private String mediaId;

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  private Boolean isStandard = true;
 /**
  * Get sourceType
  * @return sourceType
  */
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType == null ? null : sourceType.value();
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Cover image url.
  * @return coverImageUrl
  */
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
 public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
  * Content type for cover image Base64.
  * @return coverImageContentType
  */
  @JsonProperty("cover_image_content_type")
  public String getCoverImageContentType() {
    return coverImageContentType == null ? null : coverImageContentType.value();
  }

  /**
   * Sets the <code>coverImageContentType</code> property.
   */
 public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Sets the <code>coverImageContentType</code> property.
   */
  public PinMediaSourceVideoID coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

 /**
  * Cover image Base64.
  * @return coverImageData
  */
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }

  /**
   * Sets the <code>coverImageData</code> property.
   */
 public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   * Sets the <code>coverImageData</code> property.
   */
  public PinMediaSourceVideoID coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

 /**
  * Get mediaId
  * @return mediaId
  */
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   */
 public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   */
  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @return isStandard
  */
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
 public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
  public PinMediaSourceVideoID isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
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
    return Objects.equals(this.sourceType, pinMediaSourceVideoID.sourceType) &&
        Objects.equals(this.coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(this.coverImageContentType, pinMediaSourceVideoID.coverImageContentType) &&
        Objects.equals(this.coverImageData, pinMediaSourceVideoID.coverImageData) &&
        Objects.equals(this.mediaId, pinMediaSourceVideoID.mediaId) &&
        Objects.equals(this.isStandard, pinMediaSourceVideoID.isStandard);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

