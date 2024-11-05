package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ItemAttributesRequest;
import org.openapitools.server.api.model.ItemCreateBatchRecord;
import org.openapitools.server.api.model.ItemDeleteBatchRecord;
import org.openapitools.server.api.model.ItemDeleteDiscontinuedBatchRecord;
import org.openapitools.server.api.model.ItemUpdateBatchRecord;
import org.openapitools.server.api.model.ItemUpsertBatchRecord;
import org.openapitools.server.api.model.UpdateMaskFieldType;

/**
 * Object describing an item batch record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemBatchRecord   {
  
  private String itemId;
  private ItemAttributesRequest attributes;
  private List<UpdateMaskFieldType> updateMask;

  public ItemBatchRecord () {

  }

  public ItemBatchRecord (String itemId, ItemAttributesRequest attributes, List<UpdateMaskFieldType> updateMask) {
    this.itemId = itemId;
    this.attributes = attributes;
    this.updateMask = updateMask;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("attributes")
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("update_mask")
  public List<UpdateMaskFieldType> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBatchRecord itemBatchRecord = (ItemBatchRecord) o;
    return Objects.equals(itemId, itemBatchRecord.itemId) &&
        Objects.equals(attributes, itemBatchRecord.attributes) &&
        Objects.equals(updateMask, itemBatchRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, attributes, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBatchRecord {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
