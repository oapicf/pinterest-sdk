package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Media upload details
 */
@ApiModel(description="Media upload details")

public class MediaUploadDetails  {
  
  @ApiModelProperty(value = "")
  private String mediaId;

  @ApiModelProperty(value = "")
  @Valid
  private MediaUploadType mediaType;

  @ApiModelProperty(value = "")
  @Valid
  private MediaUploadStatus status;
 /**
  * Get mediaId
  * @return mediaId
  */
  @JsonProperty("media_id")
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
  public MediaUploadDetails mediaId(String mediaId) {
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
   * <br><em>N.B. <code>mediaType</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  /**
   * Sets the <code>mediaType</code> property.
   * <br><em>N.B. <code>mediaType</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MediaUploadDetails mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public MediaUploadStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(MediaUploadStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MediaUploadDetails status(MediaUploadStatus status) {
    this.status = status;
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
    MediaUploadDetails mediaUploadDetails = (MediaUploadDetails) o;
    return Objects.equals(this.mediaId, mediaUploadDetails.mediaId) &&
        Objects.equals(this.mediaType, mediaUploadDetails.mediaType) &&
        Objects.equals(this.status, mediaUploadDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadDetails {\n");
    
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

