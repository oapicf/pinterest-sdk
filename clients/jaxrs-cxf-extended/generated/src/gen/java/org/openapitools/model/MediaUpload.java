package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.MediaUploadAllOfUploadParameters;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
@ApiModel(description="Media upload that has been registered but not uploaded/processed yet.")

public class MediaUpload  {
  
 /**
  * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  */
  @ApiModelProperty(value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  private String mediaId;

  @ApiModelProperty(value = "")
  @Valid
  private MediaUploadType mediaType;

 /**
  * The URL where you will POST your media file.
  */
  @ApiModelProperty(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", value = "The URL where you will POST your media file.")
  private String uploadUrl;

  @ApiModelProperty(value = "")
  @Valid
  private MediaUploadAllOfUploadParameters uploadParameters;
 /**
  * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  * @return mediaId
  */
  @JsonProperty("media_id")
  public String getMediaId() {
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
  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
  * Get mediaType
  * @return mediaType
  */
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
 public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   */
  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
  * The URL where you will POST your media file.
  * @return uploadUrl
  */
  @JsonProperty("upload_url")
  public String getUploadUrl() {
    return uploadUrl;
  }

  /**
   * Sets the <code>uploadUrl</code> property.
   */
 public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  /**
   * Sets the <code>uploadUrl</code> property.
   */
  public MediaUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

 /**
  * Get uploadParameters
  * @return uploadParameters
  */
  @JsonProperty("upload_parameters")
  public MediaUploadAllOfUploadParameters getUploadParameters() {
    return uploadParameters;
  }

  /**
   * Sets the <code>uploadParameters</code> property.
   */
 public void setUploadParameters(MediaUploadAllOfUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }

  /**
   * Sets the <code>uploadParameters</code> property.
   */
  public MediaUpload uploadParameters(MediaUploadAllOfUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
    return this;
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
        Objects.equals(this.uploadUrl, mediaUpload.uploadUrl) &&
        Objects.equals(this.uploadParameters, mediaUpload.uploadParameters);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

