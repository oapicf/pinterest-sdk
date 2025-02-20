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

import org.openapitools.client.model.ItemAttributesRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An item to be upserted
 **/
@ApiModel(description = "An item to be upserted")
public class CatalogsUpsertRetailItem {
  
  @SerializedName("item_id")
  private String itemId = null;
  public enum OperationEnum {
     UPSERT, 
  };
  @SerializedName("operation")
  private OperationEnum operation = null;
  @SerializedName("attributes")
  private ItemAttributesRequest attributes = null;

  /**
   * The catalog item id in the merchant namespace
   **/
  @ApiModelProperty(required = true, value = "The catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
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
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributesRequest attributes) {
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
    CatalogsUpsertRetailItem catalogsUpsertRetailItem = (CatalogsUpsertRetailItem) o;
    return (this.itemId == null ? catalogsUpsertRetailItem.itemId == null : this.itemId.equals(catalogsUpsertRetailItem.itemId)) &&
        (this.operation == null ? catalogsUpsertRetailItem.operation == null : this.operation.equals(catalogsUpsertRetailItem.operation)) &&
        (this.attributes == null ? catalogsUpsertRetailItem.attributes == null : this.attributes.equals(catalogsUpsertRetailItem.attributes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    result = 31 * result + (this.operation == null ? 0: this.operation.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertRetailItem {\n");
    
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("  operation: ").append(operation).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
