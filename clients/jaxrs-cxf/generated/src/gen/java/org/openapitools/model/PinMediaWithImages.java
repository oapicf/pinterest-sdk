package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImageMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin with multiple images.
 */
@ApiModel(description="Pin with multiple images.")

public class PinMediaWithImages  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid ImageMetadata> items = new ArrayList<>();

public enum MediaTypeEnum {

MULTIPLE_IMAGES(String.valueOf("multiple_images"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid ImageMetadata> getItems() {
    return items;
  }

  public void setItems(List<@Valid ImageMetadata> items) {
    this.items = items;
  }

  public PinMediaWithImages items(List<@Valid ImageMetadata> items) {
    this.items = items;
    return this;
  }

  public PinMediaWithImages addItemsItem(ImageMetadata itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  @NotNull
  public String getMediaType() {
    if (mediaType == null) {
      return null;
    }
    return mediaType.value();
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithImages mediaType(MediaTypeEnum mediaType) {
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
    PinMediaWithImages pinMediaWithImages = (PinMediaWithImages) o;
    return Objects.equals(this.items, pinMediaWithImages.items) &&
        Objects.equals(this.mediaType, pinMediaWithImages.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImages {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

