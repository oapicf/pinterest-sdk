/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CatalogsHotelAttributes;
import org.openapitools.client.model.CatalogsType;
import org.openapitools.client.model.Pin;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object describing a hotel record
 **/
@ApiModel(description = "Object describing a hotel record")
public class CatalogsHotelItemResponse {
  
  @SerializedName("catalog_type")
  private CatalogsType catalogType = null;
  @SerializedName("hotel_id")
  private String hotelId = null;
  @SerializedName("pins")
  private List<Pin> pins = null;
  @SerializedName("attributes")
  private CatalogsHotelAttributes attributes = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog hotel id in the merchant namespace
   **/
  @ApiModelProperty(value = "The catalog hotel id in the merchant namespace")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * The pins mapped to the item
   **/
  @ApiModelProperty(value = "The pins mapped to the item")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

  /**
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
    return (this.catalogType == null ? catalogsHotelItemResponse.catalogType == null : this.catalogType.equals(catalogsHotelItemResponse.catalogType)) &&
        (this.hotelId == null ? catalogsHotelItemResponse.hotelId == null : this.hotelId.equals(catalogsHotelItemResponse.hotelId)) &&
        (this.pins == null ? catalogsHotelItemResponse.pins == null : this.pins.equals(catalogsHotelItemResponse.pins)) &&
        (this.attributes == null ? catalogsHotelItemResponse.attributes == null : this.attributes.equals(catalogsHotelItemResponse.attributes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.hotelId == null ? 0: this.hotelId.hashCode());
    result = 31 * result + (this.pins == null ? 0: this.pins.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelItemResponse {\n");
    
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  hotelId: ").append(hotelId).append("\n");
    sb.append("  pins: ").append(pins).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}