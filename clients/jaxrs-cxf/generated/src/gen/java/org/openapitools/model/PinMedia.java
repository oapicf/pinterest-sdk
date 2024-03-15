package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin media objects.
 **/
@ApiModel(description="Pin media objects.")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "media_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaWithImage.class, name = "image"),
  @JsonSubTypes.Type(value = PinMediaWithImages.class, name = "multiple_images"),
  @JsonSubTypes.Type(value = PinMediaWithImageAndVideo.class, name = "multiple_mixed"),
  @JsonSubTypes.Type(value = PinMediaWithVideos.class, name = "multiple_videos"),
  @JsonSubTypes.Type(value = PinMediaWithVideo.class, name = "video"),
})

public class PinMedia  {
  
  @ApiModelProperty(value = "")
  private String mediaType;
 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public PinMedia mediaType(String mediaType) {
    this.mediaType = mediaType;
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
    PinMedia pinMedia = (PinMedia) o;
    return Objects.equals(this.mediaType, pinMedia.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMedia {\n");
    
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

