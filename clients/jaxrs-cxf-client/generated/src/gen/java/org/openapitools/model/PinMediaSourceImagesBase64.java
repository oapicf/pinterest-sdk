package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesBase64ItemsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Multiple Base64-encoded images media source
 **/
@ApiModel(description="Multiple Base64-encoded images media source")

public class PinMediaSourceImagesBase64  {
  
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
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private SourceTypeEnum sourceType;

  @ApiModelProperty(required = true, value = "Array with image objects.")
 /**
   * Array with image objects.
  **/
  private List<PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Integer index;
 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
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

 /**
   * Array with image objects.
   * @return items
  **/
  @JsonProperty("items")
  public List<PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

  public PinMediaSourceImagesBase64 items(List<PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
    return this;
  }

  public PinMediaSourceImagesBase64 addItemsItem(PinMediaSourceImagesBase64ItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get index
   * minimum: 0
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSourceImagesBase64 index(Integer index) {
    this.index = index;
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
    return Objects.equals(this.sourceType, pinMediaSourceImagesBase64.sourceType) &&
        Objects.equals(this.items, pinMediaSourceImagesBase64.items) &&
        Objects.equals(this.index, pinMediaSourceImagesBase64.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, items, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64 {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

