package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesURLItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Multiple images urls-based media source
 */
@ApiModel(description="Multiple images urls-based media source")

public class PinMediaSourceImagesURL  {
  
public enum SourceTypeEnum {

    @JsonProperty("multiple_image_urls") MULTIPLE_IMAGE_URLS(String.valueOf("multiple_image_urls"));

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
  private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

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
  public PinMediaSourceImagesURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Array with image objects.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public PinMediaSourceImagesURL items(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public PinMediaSourceImagesURL addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
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
  public PinMediaSourceImagesURL index(Integer index) {
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
    PinMediaSourceImagesURL pinMediaSourceImagesURL = (PinMediaSourceImagesURL) o;
    return Objects.equals(this.sourceType, pinMediaSourceImagesURL.sourceType) &&
        Objects.equals(this.items, pinMediaSourceImagesURL.items) &&
        Objects.equals(this.index, pinMediaSourceImagesURL.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, items, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURL {\n");
    
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

