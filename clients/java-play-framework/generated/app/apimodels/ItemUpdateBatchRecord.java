package apimodels;

import apimodels.UpdatableItemAttributes;
import apimodels.UpdateMaskFieldType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an item batch record to update items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemUpdateBatchRecord   {
  @JsonProperty("item_id")
  
  private String itemId;

  @JsonProperty("attributes")
  @Valid

  private UpdatableItemAttributes attributes;

  @JsonProperty("update_mask")
  @Valid

  private List<UpdateMaskFieldType> updateMask = null;

  public ItemUpdateBatchRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemUpdateBatchRecord attributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  public ItemUpdateBatchRecord updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public ItemUpdateBatchRecord addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }
    this.updateMask.add(updateMaskItem);
    return this;
  }

   /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
  **/
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
    return Objects.equals(itemId, itemUpdateBatchRecord.itemId) &&
        Objects.equals(attributes, itemUpdateBatchRecord.attributes) &&
        Objects.equals(updateMask, itemUpdateBatchRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, attributes, updateMask);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemUpdateBatchRecord {\n");
    
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

