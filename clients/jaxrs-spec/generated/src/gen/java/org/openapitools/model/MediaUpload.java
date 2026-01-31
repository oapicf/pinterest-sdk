package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MediaUploadParameters;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 **/
@ApiModel(description = "Media upload that has been registered but not uploaded/processed yet.")
@JsonTypeName("MediaUpload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUpload   {
  private String mediaId;
  private MediaUploadType mediaType;
  private MediaUploadParameters uploadParameters;
  private String uploadUrl;

  public MediaUpload() {
  }

  @JsonCreator
  public MediaUpload(
    @JsonProperty(required = true, value = "media_id") String mediaId,
    @JsonProperty(required = true, value = "media_type") MediaUploadType mediaType
  ) {
    this.mediaId = mediaId;
    this.mediaType = mediaType;
  }

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   **/
  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(example = "12345", required = true, value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  @JsonProperty(required = true, value = "media_id")
   @Pattern(regexp="^\\d+$")public String getMediaId() {
    return mediaId;
  }

  @JsonProperty(required = true, value = "media_id")
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   **/
  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "media_type")
  @NotNull public MediaUploadType getMediaType() {
    return mediaType;
  }

  @JsonProperty(required = true, value = "media_type")
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
  @Valid public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }

  @JsonProperty("upload_parameters")
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

  @JsonProperty("upload_url")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

