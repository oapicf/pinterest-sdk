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

  @ApiModelProperty(required = true, value = "")
  private String coverImageUrl;

  @ApiModelProperty(required = true, value = "")
  private String mediaId;
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
  * Get coverImageUrl
  * @return coverImageUrl
  */
  @JsonProperty("cover_image_url")
  @NotNull
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


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceVideoID {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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

