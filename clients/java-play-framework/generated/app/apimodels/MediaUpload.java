package apimodels;

import apimodels.MediaUploadParameters;
import apimodels.MediaUploadType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MediaUpload   {
  @JsonProperty("media_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String mediaId;

  @JsonProperty("media_type")
  @NotNull
@Valid

  private MediaUploadType mediaType;

  @JsonProperty("upload_parameters")
  @Valid

  private MediaUploadParameters uploadParameters;

  @JsonProperty("upload_url")
  
  private String uploadUrl;

  public MediaUpload mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
   * @return mediaId
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

