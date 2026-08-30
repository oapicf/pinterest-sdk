package org.openapitools.model;

import org.openapitools.model.MediaUploadParameters;
import org.openapitools.model.MediaUploadType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
@ApiModel(description="Media upload that has been registered but not uploaded/processed yet.")

public class MediaUpload  {
  
 /**
  * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  */
  @ApiModelProperty(example = "12345", required = true, value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")

  private String mediaId;

  @ApiModelProperty(example = "video", required = true, value = "")

  private MediaUploadType mediaType;

 /**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  */
  @ApiModelProperty(value = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")

  private MediaUploadParameters uploadParameters;

 /**
  * The URL where you will POST your media file.
  */
  @ApiModelProperty(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", value = "The URL where you will POST your media file.")

  private String uploadUrl;
 /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   * @return mediaId
  **/
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }


 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   * @return uploadParameters
  **/
  @JsonProperty("upload_parameters")
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }


 /**
   * The URL where you will POST your media file.
   * @return uploadUrl
  **/
  @JsonProperty("upload_url")
  public String getUploadUrl() {
    return uploadUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUpload mediaUpload = (MediaUpload) o;
    return Objects.equals(this.mediaId, mediaUpload.mediaId) &&
        Objects.equals(this.mediaType, mediaUpload.mediaType) &&
        Objects.equals(this.uploadParameters, mediaUpload.uploadParameters) &&
        Objects.equals(this.uploadUrl, mediaUpload.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, uploadParameters, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUpload {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    uploadParameters: ").append(toIndentedString(uploadParameters)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

