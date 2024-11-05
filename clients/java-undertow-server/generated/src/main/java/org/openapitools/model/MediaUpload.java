/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadAllOfUploadParameters;
import org.openapitools.model.MediaUploadType;



/**
 * Media upload that has been registered but not uploaded/processed yet.
 */

@ApiModel(description = "Media upload that has been registered but not uploaded/processed yet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaUpload   {
  
  private String mediaId;
  private MediaUploadType mediaType;
  private String uploadUrl;
  private MediaUploadAllOfUploadParameters uploadParameters;

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   */
  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   */
  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * The URL where you will POST your media file.
   */
  public MediaUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", value = "The URL where you will POST your media file.")
  @JsonProperty("upload_url")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  /**
   */
  public MediaUpload uploadParameters(MediaUploadAllOfUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("upload_parameters")
  public MediaUploadAllOfUploadParameters getUploadParameters() {
    return uploadParameters;
  }
  public void setUploadParameters(MediaUploadAllOfUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
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
        Objects.equals(uploadUrl, mediaUpload.uploadUrl) &&
        Objects.equals(uploadParameters, mediaUpload.uploadParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, uploadUrl, uploadParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUpload {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadParameters: ").append(toIndentedString(uploadParameters)).append("\n");
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

