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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object describing an item batch record to delete items
 **/
@ApiModel(description = "Object describing an item batch record to delete items")
public class ItemDeleteBatchRecord {
  
  @SerializedName("item_id")
  private String itemId = null;

  /**
   * The catalog item id in the merchant namespace
   **/
  @ApiModelProperty(value = "The catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDeleteBatchRecord itemDeleteBatchRecord = (ItemDeleteBatchRecord) o;
    return (this.itemId == null ? itemDeleteBatchRecord.itemId == null : this.itemId.equals(itemDeleteBatchRecord.itemId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.itemId == null ? 0: this.itemId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDeleteBatchRecord {\n");
    
    sb.append("  itemId: ").append(itemId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
