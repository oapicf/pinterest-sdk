package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Media  {
  
 /**
  * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  */
  @ApiModelProperty(example = "12345", required = true, value = "Unique identifier for this media upload. Used to track status and for attaching during Pin creation.")
  private String mediaId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MediaUploadType mediaType;

  @ApiModelProperty(value = "")
  @Valid
  private MediaUploadStatus status;
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
  public Media mediaId(String mediaId) {
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
  public Media mediaType(MediaUploadType mediaType) {
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
  public Media status(MediaUploadStatus status) {
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
    Media media = (Media) o;
    return Objects.equals(this.mediaId, media.mediaId) &&
        Objects.equals(this.mediaType, media.mediaType) &&
        Objects.equals(this.status, media.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
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

