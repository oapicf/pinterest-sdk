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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaUpload   {
  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("media_type")
  private MediaUploadType mediaType;

  @JsonProperty("upload_url")
  private String uploadUrl;

  @JsonProperty("upload_parameters")
  private MediaUploadAllOfUploadParameters uploadParameters;

  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   * @return mediaId
  **/
  @ApiModelProperty(value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
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
  **/
  @ApiModelProperty(value = "")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * The URL where you will POST your media file.
   * @return uploadUrl
  **/
  @ApiModelProperty(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", value = "The URL where you will POST your media file.")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  public MediaUpload uploadParameters(MediaUploadAllOfUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
    return this;
  }

   /**
   * Get uploadParameters
   * @return uploadParameters
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

