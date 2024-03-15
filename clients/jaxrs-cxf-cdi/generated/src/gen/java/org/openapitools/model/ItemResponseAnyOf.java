package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.CatalogsHotelItemResponse;
import org.openapitools.model.CatalogsRetailItemResponse;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelItemResponse.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemResponse.class, name = "RETAIL"),
})

public class ItemResponseAnyOf   {
  
  private CatalogsType catalogType;

  private String itemId;

  private List<@Valid Pin> pins;

  private CatalogsHotelAttributes attributes;

  private String hotelId;

  /**
   **/
  public ItemResponseAnyOf catalogType(CatalogsType catalogType) {
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
  public ItemResponseAnyOf itemId(String itemId) {
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
  public ItemResponseAnyOf pins(List<@Valid Pin> pins) {
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

  public ItemResponseAnyOf addPinsItem(Pin pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }


  /**
   **/
  public ItemResponseAnyOf attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }


  /**
   * The catalog hotel id in the merchant namespace
   **/
  public ItemResponseAnyOf hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseAnyOf itemResponseAnyOf = (ItemResponseAnyOf) o;
    return Objects.equals(this.catalogType, itemResponseAnyOf.catalogType) &&
        Objects.equals(this.itemId, itemResponseAnyOf.itemId) &&
        Objects.equals(this.pins, itemResponseAnyOf.pins) &&
        Objects.equals(this.attributes, itemResponseAnyOf.attributes) &&
        Objects.equals(this.hotelId, itemResponseAnyOf.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseAnyOf {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

