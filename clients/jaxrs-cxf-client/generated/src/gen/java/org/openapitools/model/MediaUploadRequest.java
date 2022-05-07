package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MediaUploadType;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Media upload request
 **/
@ApiModel(description="Media upload request")
public class MediaUploadRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private MediaUploadType mediaType;
 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUploadRequest mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadRequest {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

