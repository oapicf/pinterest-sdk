/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CatalogsCreateHotelItem;
import org.openapitools.client.model.CatalogsDeleteHotelItem;
import org.openapitools.client.model.CatalogsUpdatableHotelAttributes;
import org.openapitools.client.model.CatalogsUpdateHotelItem;
import org.openapitools.client.model.CatalogsUpsertHotelItem;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Hotel batch item
 **/
@ApiModel(description = "Hotel batch item")
public class CatalogsHotelBatchItem {
  
  @SerializedName("hotel_id")
  private String hotelId = null;
  public enum OperationEnum {
     DELETE, 
  };
  @SerializedName("operation")
  private OperationEnum operation = null;
  @SerializedName("attributes")
  private CatalogsUpdatableHotelAttributes attributes = null;

  /**
   * The catalog hotel id in the merchant namespace
   **/
  @ApiModelProperty(required = true, value = "The catalog hotel id in the merchant namespace")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsUpdatableHotelAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsUpdatableHotelAttributes attributes) {
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
    CatalogsHotelBatchItem catalogsHotelBatchItem = (CatalogsHotelBatchItem) o;
    return (this.hotelId == null ? catalogsHotelBatchItem.hotelId == null : this.hotelId.equals(catalogsHotelBatchItem.hotelId)) &&
        (this.operation == null ? catalogsHotelBatchItem.operation == null : this.operation.equals(catalogsHotelBatchItem.operation)) &&
        (this.attributes == null ? catalogsHotelBatchItem.attributes == null : this.attributes.equals(catalogsHotelBatchItem.attributes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.hotelId == null ? 0: this.hotelId.hashCode());
    result = 31 * result + (this.operation == null ? 0: this.operation.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelBatchItem {\n");
    
    sb.append("  hotelId: ").append(hotelId).append("\n");
    sb.append("  operation: ").append(operation).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
