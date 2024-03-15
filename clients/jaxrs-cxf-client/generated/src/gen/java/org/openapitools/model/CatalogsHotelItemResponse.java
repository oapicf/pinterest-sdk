package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing a hotel record
 **/
@ApiModel(description="Object describing a hotel record")

public class CatalogsHotelItemResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsType catalogType;

  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
 /**
   * The catalog hotel id in the merchant namespace
  **/
  private String hotelId;

  @ApiModelProperty(value = "The pins mapped to the item")
 /**
   * The pins mapped to the item
  **/
  private List<Pin> pins;

  @ApiModelProperty(value = "")
  private CatalogsHotelAttributes attributes;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  **/
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsHotelItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

 /**
   * The pins mapped to the item
   * @return pins
  **/
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }

  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

  public CatalogsHotelItemResponse pins(List<Pin> pins) {
    this.pins = pins;
    return this;
  }

  public CatalogsHotelItemResponse addPinsItem(Pin pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsHotelItemResponse attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
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
    CatalogsHotelItemResponse catalogsHotelItemResponse = (CatalogsHotelItemResponse) o;
    return Objects.equals(this.catalogType, catalogsHotelItemResponse.catalogType) &&
        Objects.equals(this.hotelId, catalogsHotelItemResponse.hotelId) &&
        Objects.equals(this.pins, catalogsHotelItemResponse.pins) &&
        Objects.equals(this.attributes, catalogsHotelItemResponse.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, hotelId, pins, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

