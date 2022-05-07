package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MediaUploadStatus;
import com.prokarma.pkmst.model.MediaUploadType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Media upload details
 */
@ApiModel(description = "Media upload details")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
public class MediaUploadDetails   {
  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("media_type")
  private MediaUploadType mediaType;

  @JsonProperty("status")
  private MediaUploadStatus status;

  public MediaUploadDetails mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @ApiModelProperty(readOnly = true, value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public MediaUploadDetails mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(readOnly = true, value = "")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUploadDetails status(MediaUploadStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(readOnly = true, value = "")
  public MediaUploadStatus getStatus() {
    return status;
  }

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

