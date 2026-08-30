package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("MediaUploadCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MediaUploadCreate   {
  private MediaUploadType mediaType;

  public MediaUploadCreate() {
  }

  @JsonCreator
  public MediaUploadCreate(
    @JsonProperty(required = true, value = "media_type") MediaUploadType mediaType
  ) {
    this.mediaType = mediaType;
  }

  /**
   **/
  public MediaUploadCreate mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(example = "video", required = true, value = "")
  @JsonProperty(required = true, value = "media_type")
  @NotNull public MediaUploadType getMediaType() {
    return mediaType;
  }

  @JsonProperty(required = true, value = "media_type")
  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadCreate mediaUploadCreate = (MediaUploadCreate) o;
    return Objects.equals(this.mediaType, mediaUploadCreate.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadCreate {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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
