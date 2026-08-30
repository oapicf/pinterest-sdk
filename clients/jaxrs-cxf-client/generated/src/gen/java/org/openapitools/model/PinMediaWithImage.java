package org.openapitools.model;

import org.openapitools.model.ImageSize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin with image.
 */
@ApiModel(description="Pin with image.")

public class PinMediaWithImage  {
  
  @ApiModelProperty(value = "")

  private ImageSize images;

public enum MediaTypeEnum {

IMAGE(String.valueOf("image"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MediaTypeEnum fromValue(String value) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private MediaTypeEnum mediaType;
 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }

  public void setImages(ImageSize images) {
    this.images = images;
  }

  public PinMediaWithImage images(ImageSize images) {
    this.images = images;
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  public String getMediaType() {
    if (mediaType == null) {
      return null;
    }
    return mediaType.value();
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithImage mediaType(MediaTypeEnum mediaType) {
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
    PinMediaWithImage pinMediaWithImage = (PinMediaWithImage) o;
    return Objects.equals(this.images, pinMediaWithImage.images) &&
        Objects.equals(this.mediaType, pinMediaWithImage.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImage {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

