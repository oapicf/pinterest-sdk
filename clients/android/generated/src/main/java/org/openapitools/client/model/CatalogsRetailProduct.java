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

import org.openapitools.client.model.CatalogsRetailProductMetadata;
import org.openapitools.client.model.Pin;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsRetailProduct {
  
  public enum CatalogTypeEnum {
     RETAIL, 
  };
  @SerializedName("catalog_type")
  private CatalogTypeEnum catalogType = null;
  @SerializedName("metadata")
  private CatalogsRetailProductMetadata metadata = null;
  @SerializedName("pin")
  private Pin pin = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsRetailProductMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(CatalogsRetailProductMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Pin getPin() {
    return pin;
  }
  public void setPin(Pin pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProduct catalogsRetailProduct = (CatalogsRetailProduct) o;
    return (this.catalogType == null ? catalogsRetailProduct.catalogType == null : this.catalogType.equals(catalogsRetailProduct.catalogType)) &&
        (this.metadata == null ? catalogsRetailProduct.metadata == null : this.metadata.equals(catalogsRetailProduct.metadata)) &&
        (this.pin == null ? catalogsRetailProduct.pin == null : this.pin.equals(catalogsRetailProduct.pin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.pin == null ? 0: this.pin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProduct {\n");
    
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
