package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesBase64ItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Multiple Base64-encoded images media source
 */
@ApiModel(description="Multiple Base64-encoded images media source")

public class PinMediaSourceImagesBase64  {
  
public enum SourceTypeEnum {

    @JsonProperty("multiple_image_base64") MULTIPLE_IMAGE_BASE64(String.valueOf("multiple_image_base64"));

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

 /**
  * Array with image objects.
  */
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @Valid
  private List<@Valid PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Integer index;
 /**
  * Get sourceType
  * @return sourceType
  */
  @JsonProperty("source_type")
  public String getSourceType() {
    return sourceType == null ? null : sourceType.value();
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public PinMediaSourceImagesBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Array with image objects.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public PinMediaSourceImagesBase64 items(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public PinMediaSourceImagesBase64 addItemsItem(PinMediaSourceImagesBase64ItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get index
  * minimum: 0
  * @return index
  */
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
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

