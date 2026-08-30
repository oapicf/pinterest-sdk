package org.openapitools.model;

import org.openapitools.model.MediaUploadParameters;
import org.openapitools.model.MediaUploadType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
public class MediaUpload implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   */
  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("media_type")
  private MediaUploadType mediaType;

  /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   */
  @JsonProperty("upload_parameters")
  private MediaUploadParameters uploadParameters;

  /**
   * The URL where you will POST your media file.
   */
  @JsonProperty("upload_url")
  private String uploadUrl;

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   * @return mediaId
   */
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * 
   * @return mediaType
   */
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   * @return uploadParameters
   */
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }

  public void setUploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }

  /**
   * The URL where you will POST your media file.
   * @return uploadUrl
   */
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
