package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.ItemAttributes;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object describing an item batch record
 **/
@ApiModel(description="Object describing an item batch record")
public class ItemBatchRecord  {
  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
 /**
   * The catalog item id in the merchant namespace
  **/
  private String itemId;

  @ApiModelProperty(value = "")
  private ItemAttributes attributes;
 /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemBatchRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  public ItemBatchRecord attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBatchRecord {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

