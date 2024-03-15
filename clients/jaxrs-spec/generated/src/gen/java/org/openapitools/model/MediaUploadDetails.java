package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Media upload details
 **/
@ApiModel(description = "Media upload details")
@JsonTypeName("MediaUploadDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MediaUploadDetails   {
  private @Valid String mediaId;
  private @Valid MediaUploadType mediaType;
  private @Valid MediaUploadStatus status;

  /**
   **/
  public MediaUploadDetails mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_id")
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  @JsonProperty("media_id")
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   **/
  public MediaUploadDetails mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  @JsonProperty("media_type")
  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  public MediaUploadDetails status(MediaUploadStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public MediaUploadStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(MediaUploadStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadDetails mediaUploadDetails = (MediaUploadDetails) o;
    return Objects.equals(this.mediaId, mediaUploadDetails.mediaId) &&
        Objects.equals(this.mediaType, mediaUploadDetails.mediaType) &&
        Objects.equals(this.status, mediaUploadDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadDetails {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

