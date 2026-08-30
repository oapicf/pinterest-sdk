package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.UpdatableItemAttributes;
import org.openapitools.vertxweb.server.model.UpdateMaskFieldType;

/**
 * Object describing an item batch record to update items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemUpdateBatchRecord   {
  
  private UpdatableItemAttributes attributes;
  private String itemId;
  private List<UpdateMaskFieldType> updateMask;

  public ItemUpdateBatchRecord () {

  }

  public ItemUpdateBatchRecord (UpdatableItemAttributes attributes, String itemId, List<UpdateMaskFieldType> updateMask) {
    this.attributes = attributes;
    this.itemId = itemId;
    this.updateMask = updateMask;
  }

    
  @JsonProperty("attributes")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
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
    ItemUpdateBatchRecord itemUpdateBatchRecord = (ItemUpdateBatchRecord) o;
    return Objects.equals(attributes, itemUpdateBatchRecord.attributes) &&
        Objects.equals(itemId, itemUpdateBatchRecord.itemId) &&
        Objects.equals(updateMask, itemUpdateBatchRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemUpdateBatchRecord {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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
