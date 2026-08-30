package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesURLItem;
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
 * Multiple URL-based images media source
 **/
@ApiModel(description = "Multiple URL-based images media source")
@JsonTypeName("PinMediaSourceImagesURL")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaSourceImagesURL   {
  private Integer index;
  private @Valid List<@Valid PinMediaSourceImagesURLItem> items = new ArrayList<>();
  public enum SourceTypeEnum {

    MULTIPLE_IMAGE_URLS(String.valueOf("multiple_image_urls"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SourceTypeEnum fromString(String s) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private SourceTypeEnum sourceType;

  public PinMediaSourceImagesURL() {
  }

  @JsonCreator
  public PinMediaSourceImagesURL(
    @JsonProperty(required = true, value = "items") List<@Valid PinMediaSourceImagesURLItem> items,
    @JsonProperty(required = true, value = "source_type") SourceTypeEnum sourceType
  ) {
    this.items = items;
    this.sourceType = sourceType;
  }

  /**
   * minimum: 0
   **/
  public PinMediaSourceImagesURL index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
   @Min(0)public Integer getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Array with image objects.
   **/
  public PinMediaSourceImagesURL items(List<@Valid PinMediaSourceImagesURLItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid  @Size(min=2,max=5)public List<@Valid PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  public PinMediaSourceImagesURL addItemsItem(PinMediaSourceImagesURLItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public PinMediaSourceImagesURL removeItemsItem(PinMediaSourceImagesURLItem itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
  /**
   * The source type of the media.
   **/
  public PinMediaSourceImagesURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The source type of the media.")
  @JsonProperty(required = true, value = "source_type")
  @NotNull public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  @JsonProperty(required = true, value = "source_type")
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
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
    return Objects.equals(this.index, pinMediaSourceImagesURL.index) &&
        Objects.equals(this.items, pinMediaSourceImagesURL.items) &&
        Objects.equals(this.sourceType, pinMediaSourceImagesURL.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, items, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURL {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
