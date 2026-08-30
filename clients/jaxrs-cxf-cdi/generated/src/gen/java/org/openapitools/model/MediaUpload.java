package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadParameters;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Media upload that has been registered but not uploaded/processed yet.")
public class MediaUpload   {
  
  private String mediaId;

  private MediaUploadType mediaType;

  private MediaUploadParameters uploadParameters;

  private String uploadUrl;

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   **/
  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(example = "12345", required = true, value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }


  /**
   **/
  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(example = "video", required = true, value = "")
  @JsonProperty("media_type")
  @NotNull
  public MediaUploadType getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   **/
  public MediaUpload uploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
    return this;
  }

  
  @ApiModelProperty(value = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")
  @JsonProperty("upload_parameters")
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }
  public void setUploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }


  /**
   * The URL where you will POST your media file.
   **/
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

