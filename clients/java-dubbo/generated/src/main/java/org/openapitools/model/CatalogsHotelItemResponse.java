package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.Pin;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing a hotel record
 */
public class CatalogsHotelItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private CatalogsHotelAttributes attributes;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * The catalog hotel id in the merchant namespace
   */
  @JsonProperty("hotel_id")
  private String hotelId;

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   */
  @JsonProperty("item_response_kind")
  private String itemResponseKind;

  /**
   * The pins mapped to the item
   */
  @JsonProperty("pins")
  private List<Pin> pins;

  /**
   * 
   * @return attributes
   */
  public CatalogsHotelAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsHotelAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog hotel id in the merchant namespace
   * @return hotelId
   */
  public String getHotelId() {
    return hotelId;
  }

  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   * @return itemResponseKind
   */
  public String getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(String itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * The pins mapped to the item
   * @return pins
   */
  public List<Pin> getPins() {
    return pins;
  }

  public void setPins(List<Pin> pins) {
    this.pins = pins;
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
    return Objects.equals(this.attributes, catalogsHotelItemResponse.attributes) &&
        Objects.equals(this.catalogType, catalogsHotelItemResponse.catalogType) &&
        Objects.equals(this.hotelId, catalogsHotelItemResponse.hotelId) &&
        Objects.equals(this.itemResponseKind, catalogsHotelItemResponse.itemResponseKind) &&
        Objects.equals(this.pins, catalogsHotelItemResponse.pins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, hotelId, itemResponseKind, pins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
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
