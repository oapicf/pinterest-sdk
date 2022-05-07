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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class PinMediaSourceVideoID   {
  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    VIDEO_ID("video_id");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("source_type")
  private SourceTypeEnum sourceType;

  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  @JsonProperty("media_id")
  private String mediaId;

  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(required = true, value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

   /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
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
        Objects.equals(this.mediaId, pinMediaSourceVideoID.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, coverImageUrl, mediaId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

