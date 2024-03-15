package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;

/**
 * Object describing a hotel record
 */
@ApiModel(description = "Object describing a hotel record")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelItemResponse   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("hotel_id")
  private String hotelId;

  @JsonProperty("pins")
  private List<@Valid Pin> pins = null;

  @JsonProperty("attributes")
  private CatalogsHotelAttributes attributes;

  public CatalogsHotelItemResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelItemResponse hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

   /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
  **/
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  public CatalogsHotelItemResponse pins(List<@Valid Pin> pins) {
    this.pins = pins;
    return this;
  }

  public CatalogsHotelItemResponse addPinsItem(Pin pinsItem) {
    if (this.pins == null) {
      this.pins = ;
    }
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * The pins mapped to the item
   * @return pins
  **/
  @ApiModelProperty(value = "The pins mapped to the item")
  public List<@Valid Pin> getPins() {
    return pins;
  }

  public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  public CatalogsHotelItemResponse attributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsHotelAttributes attributes) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

