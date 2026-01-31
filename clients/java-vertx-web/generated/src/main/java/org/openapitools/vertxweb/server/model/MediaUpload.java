package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.MediaUploadParameters;
import org.openapitools.vertxweb.server.model.MediaUploadType;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaUpload   {
  
  private String mediaId;
  private MediaUploadType mediaType;
  private MediaUploadParameters uploadParameters;
  private String uploadUrl;

  public MediaUpload () {

  }

  public MediaUpload (String mediaId, MediaUploadType mediaType, MediaUploadParameters uploadParameters, String uploadUrl) {
    this.mediaId = mediaId;
    this.mediaType = mediaType;
    this.uploadParameters = uploadParameters;
    this.uploadUrl = uploadUrl;
  }

    
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

    
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

    
  @JsonProperty("upload_parameters")
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }
  public void setUploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }

    
  @JsonProperty("upload_url")
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
    return Objects.equals(mediaId, mediaUpload.mediaId) &&
        Objects.equals(mediaType, mediaUpload.mediaType) &&
        Objects.equals(uploadParameters, mediaUpload.uploadParameters) &&
        Objects.equals(uploadUrl, mediaUpload.uploadUrl);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
