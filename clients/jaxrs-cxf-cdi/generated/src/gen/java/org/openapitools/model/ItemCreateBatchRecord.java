package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAttributesRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Object describing an item batch record to create items
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Object describing an item batch record to create items")
public class ItemCreateBatchRecord   {
  
  private ItemAttributesRequest attributes;

  private String itemId;

  /**
   **/
  public ItemCreateBatchRecord attributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }


  /**
   * The catalog item id in the merchant namespace
   **/
  public ItemCreateBatchRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog item id in the merchant namespace")
  @JsonProperty("item_id")
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
    ItemCreateBatchRecord itemCreateBatchRecord = (ItemCreateBatchRecord) o;
    return Objects.equals(this.attributes, itemCreateBatchRecord.attributes) &&
        Objects.equals(this.itemId, itemCreateBatchRecord.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCreateBatchRecord {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

