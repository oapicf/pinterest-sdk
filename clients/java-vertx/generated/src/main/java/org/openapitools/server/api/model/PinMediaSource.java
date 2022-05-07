package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.PinMediaSourceImageBase64;
import org.openapitools.server.api.model.PinMediaSourceImageURL;
import org.openapitools.server.api.model.PinMediaSourceVideoID;

/**
 * Pin media source.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSource   {
  


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


  public enum ContentTypeEnum {
    JPEG("image/jpeg"),
    PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ContentTypeEnum contentType;
  private String data;
  private String url;
  private String coverImageUrl;
  private String mediaId;

  public PinMediaSource () {

  }

  public PinMediaSource (SourceTypeEnum sourceType, ContentTypeEnum contentType, String data, String url, String coverImageUrl, String mediaId) {
    this.sourceType = sourceType;
    this.contentType = contentType;
    this.data = data;
    this.url = url;
    this.coverImageUrl = coverImageUrl;
    this.mediaId = mediaId;
  }

    
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

    
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("media_id")
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
    PinMediaSource pinMediaSource = (PinMediaSource) o;
    return Objects.equals(sourceType, pinMediaSource.sourceType) &&
        Objects.equals(contentType, pinMediaSource.contentType) &&
        Objects.equals(data, pinMediaSource.data) &&
        Objects.equals(url, pinMediaSource.url) &&
        Objects.equals(coverImageUrl, pinMediaSource.coverImageUrl) &&
        Objects.equals(mediaId, pinMediaSource.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, contentType, data, url, coverImageUrl, mediaId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
