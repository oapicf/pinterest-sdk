package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MediaUploadParameters;
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
  @ApiModelProperty(example = "12345", required = true, value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  private String mediaId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MediaUploadType mediaType;

 /**
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  */
  @ApiModelProperty(value = "The list of parameter key/value pairs you will need to send with your POST request to upload your media file.")
  @Valid
  private MediaUploadParameters uploadParameters;

 /**
  * The URL where you will POST your media file.
  */
  @ApiModelProperty(example = "https://pinterest-media-upload.s3-accelerate.amazonaws.com/", value = "The URL where you will POST your media file.")
  private String uploadUrl;
 /**
  * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  * @return mediaId
  */
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   * <br><em>N.B. <code>mediaId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   * <br><em>N.B. <code>mediaId</code> is <b>read only</b>; client code should not call this method</em>.
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
  @NotNull
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
  * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  * @return uploadParameters
  */
  @JsonProperty("upload_parameters")
  public MediaUploadParameters getUploadParameters() {
    return uploadParameters;
  }

  /**
   * Sets the <code>uploadParameters</code> property.
   * <br><em>N.B. <code>uploadParameters</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
  }

  /**
   * Sets the <code>uploadParameters</code> property.
   * <br><em>N.B. <code>uploadParameters</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MediaUpload uploadParameters(MediaUploadParameters uploadParameters) {
    this.uploadParameters = uploadParameters;
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
   * <br><em>N.B. <code>uploadUrl</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  /**
   * Sets the <code>uploadUrl</code> property.
   * <br><em>N.B. <code>uploadUrl</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MediaUpload uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

