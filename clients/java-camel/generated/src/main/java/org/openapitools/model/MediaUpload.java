package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MediaUploadParameters;
import org.openapitools.model.MediaUploadType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Media upload that has been registered but not uploaded/processed yet.
 */

@Schema(name = "MediaUpload", description = "Media upload that has been registered but not uploaded/processed yet.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUpload {

  private String mediaId;

  private MediaUploadType mediaType;

  private MediaUploadParameters uploadParameters;

  private String uploadUrl;

  public MediaUpload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MediaUpload(String mediaId, MediaUploadType mediaType) {
    this.mediaId = mediaId;
    this.mediaType = mediaType;
  }

  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   * @return mediaId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "media_id", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public MediaUpload mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @NotNull @Valid 
  @Schema(name = "media_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUpload uploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
    return this;
  }

  /**
   * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
   * @return uploadParameters
   */
  @Valid 
  @Schema(name = "upload_parameters", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("upload_parameters")
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }

  public void setUploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }

  public MediaUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  /**
   * The URL where you will POST your media file.
   * @return uploadUrl
   */
  
  @Schema(name = "upload_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", description = "The URL where you will POST your media file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

