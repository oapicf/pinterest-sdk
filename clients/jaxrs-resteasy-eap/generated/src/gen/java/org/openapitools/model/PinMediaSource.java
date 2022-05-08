package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceVideoID;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Pin media source.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

public class PinMediaSource   {
  

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
  }


  private SourceTypeEnum sourceType;

  /**
   * Gets or Sets contentType
   */
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
      return String.valueOf(value);
    }
  }


  private ContentTypeEnum contentType;

  private String data;

  private String url;

  private String coverImageUrl;

  private String mediaId;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content_type")
  @NotNull
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cover_image_url")
  @NotNull
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
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

