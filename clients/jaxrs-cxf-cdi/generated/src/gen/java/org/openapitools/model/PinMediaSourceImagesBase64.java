package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesBase64ItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Multiple Base64-encoded images media source
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Multiple Base64-encoded images media source")
public class PinMediaSourceImagesBase64   {
  

public enum SourceTypeEnum {

    @JsonProperty("multiple_image_base64") MULTIPLE_IMAGE_BASE64(String.valueOf("multiple_image_base64"));


    private String value;

    SourceTypeEnum(String v) {
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

  private SourceTypeEnum sourceType;

  private List<@Valid PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();

  private Integer index;

  /**
   **/
  public PinMediaSourceImagesBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   * Array with image objects.
   **/
  public PinMediaSourceImagesBase64 items(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }
  public void setItems(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

  public PinMediaSourceImagesBase64 addItemsItem(PinMediaSourceImagesBase64ItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * minimum: 0
   **/
  public PinMediaSourceImagesBase64 index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

