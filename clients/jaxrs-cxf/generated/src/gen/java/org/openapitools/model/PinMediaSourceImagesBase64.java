package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesBase64Item;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Multiple Base64-based images media source
 */
@ApiModel(description="Multiple Base64-based images media source")

public class PinMediaSourceImagesBase64  {
  
  @ApiModelProperty(value = "")

  private Integer index;

 /**
  * Array with image objects.
  */
  @ApiModelProperty(required = true, value = "Array with image objects.")

  @Valid

  private List<@Valid PinMediaSourceImagesBase64Item> items = new ArrayList<>();

public enum SourceTypeEnum {

MULTIPLE_IMAGE_BASE64(String.valueOf("multiple_image_base64"));


    private String value;

    SourceTypeEnum (String v) {
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
    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The source type of the media.
  */
  @ApiModelProperty(required = true, value = "The source type of the media.")

  private SourceTypeEnum sourceType;
 /**
   * Get index
   * minimum: 0
   * @return index
  **/
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSourceImagesBase64 index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Array with image objects.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesBase64Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaSourceImagesBase64Item> items) {
    this.items = items;
  }

  public PinMediaSourceImagesBase64 items(List<@Valid PinMediaSourceImagesBase64Item> items) {
    this.items = items;
    return this;
  }

  public PinMediaSourceImagesBase64 addItemsItem(PinMediaSourceImagesBase64Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * The source type of the media.
   * @return sourceType
  **/
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceImagesBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
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
    PinMediaSourceImagesBase64 pinMediaSourceImagesBase64 = (PinMediaSourceImagesBase64) o;
    return Objects.equals(this.index, pinMediaSourceImagesBase64.index) &&
        Objects.equals(this.items, pinMediaSourceImagesBase64.items) &&
        Objects.equals(this.sourceType, pinMediaSourceImagesBase64.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, items, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64 {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

