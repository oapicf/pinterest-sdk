package apimodels;

import apimodels.ItemAttributesRequest;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an item batch record to create items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemCreateBatchRecord   {
  @JsonProperty("attributes")
  @Valid

  private ItemAttributesRequest attributes;

  @JsonProperty("item_id")
  
  private String itemId;

  public ItemCreateBatchRecord attributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

  public ItemCreateBatchRecord itemId(String itemId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCreateBatchRecord itemCreateBatchRecord = (ItemCreateBatchRecord) o;
    return Objects.equals(attributes, itemCreateBatchRecord.attributes) &&
        Objects.equals(itemId, itemCreateBatchRecord.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

