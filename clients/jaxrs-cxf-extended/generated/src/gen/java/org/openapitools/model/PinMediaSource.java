package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceVideoID;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

/**
 * Pin media source.
 */
@ApiModel(description="Pin media source.")

public class PinMediaSource  {
  
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

public enum ContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")),
    @JsonProperty("image/png") PNG(String.valueOf("image/png"));

    private String value;

    ContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
        for (ContentTypeEnum b : ContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ContentTypeEnum contentType;

  @ApiModelProperty(required = true, value = "")
  private String data;

  @ApiModelProperty(required = true, value = "")
  private String url;

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
  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Get contentType
  * @return contentType
  */
  @JsonProperty("content_type")
  @NotNull
  public String getContentType() {
    return contentType == null ? null : contentType.value();
  }

  /**
   * Sets the <code>contentType</code> property.
   */
 public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(String data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public PinMediaSource url(String url) {
    this.url = url;
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
  public PinMediaSource coverImageUrl(String coverImageUrl) {
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
  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSource {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

