package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImageMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pin with multiple images.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Pin with multiple images.")
public class PinMediaWithImages   {
  
  private List<@Valid ImageMetadata> items = new ArrayList<>();


public enum MediaTypeEnum {

    @JsonProperty("multiple_images") MULTIPLE_IMAGES(String.valueOf("multiple_images"));


    private String value;

    MediaTypeEnum(String v) {
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

  private MediaTypeEnum mediaType;

  /**
   **/
  public PinMediaWithImages items(List<@Valid ImageMetadata> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public List<@Valid ImageMetadata> getItems() {
    return items;
  }
  public void setItems(List<@Valid ImageMetadata> items) {
    this.items = items;
  }

  public PinMediaWithImages addItemsItem(ImageMetadata itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   **/
  public PinMediaWithImages mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_type")
  @NotNull
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

