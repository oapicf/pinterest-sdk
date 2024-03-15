package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemAttributes;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object describing a retail item record
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object describing a retail item record")
public class CatalogsRetailItemResponse   {
  
  private CatalogsType catalogType;

  private String itemId;

  private List<@Valid Pin> pins;

  private ItemAttributes attributes;

  /**
   **/
  public CatalogsRetailItemResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  /**
   * The catalog retail item id in the merchant namespace
   **/
  public CatalogsRetailItemResponse itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog retail item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  /**
   * The pins mapped to the item
   **/
  public CatalogsRetailItemResponse pins(List<@Valid Pin> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "The pins mapped to the item")
  @JsonProperty("pins")
 @Size(max=11)  public List<@Valid Pin> getPins() {
    return pins;
  }
  public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  public CatalogsRetailItemResponse addPinsItem(Pin pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }


  /**
   **/
  public CatalogsRetailItemResponse attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public ItemAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailItemResponse catalogsRetailItemResponse = (CatalogsRetailItemResponse) o;
    return Objects.equals(this.catalogType, catalogsRetailItemResponse.catalogType) &&
        Objects.equals(this.itemId, catalogsRetailItemResponse.itemId) &&
        Objects.equals(this.pins, catalogsRetailItemResponse.pins) &&
        Objects.equals(this.attributes, catalogsRetailItemResponse.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

