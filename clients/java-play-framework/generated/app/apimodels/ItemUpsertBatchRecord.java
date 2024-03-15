package apimodels;

import apimodels.ItemAttributes;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an item batch record to upsert items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemUpsertBatchRecord   {
  @JsonProperty("item_id")
  
  private String itemId;

  @JsonProperty("attributes")
  @Valid

  private ItemAttributes attributes;

  public ItemUpsertBatchRecord itemId(String itemId) {
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

  public ItemUpsertBatchRecord attributes(ItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
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
    ItemUpsertBatchRecord itemUpsertBatchRecord = (ItemUpsertBatchRecord) o;
    return Objects.equals(itemId, itemUpsertBatchRecord.itemId) &&
        Objects.equals(attributes, itemUpsertBatchRecord.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, attributes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemUpsertBatchRecord {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

