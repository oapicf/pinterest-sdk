package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceVideoID;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin media source.
 **/
@ApiModel(description="Pin media source.")
public class PinMediaSource  {
  
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

JPEG(String.valueOf("image/jpeg")), PNG(String.valueOf("image/png"));


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
  **/
  @JsonProperty("source_type")
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  public String getContentType() {
    if (contentType == null) {
      return null;
    }
    return contentType.value();
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Get mediaId
   * @return mediaId
  **/
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

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

