package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */
@ApiModel(description = "A pair of item_id and store_code that uniquely identifies a local inventory item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemIdStoreCodePair   {
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("store_code")
  private String storeCode;

  public ItemIdStoreCodePair itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Catalog item id in the merchant namespace
   * @return itemId
  **/
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemIdStoreCodePair storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

   /**
   * Store code for the local inventory item
   * @return storeCode
  **/
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemIdStoreCodePair itemIdStoreCodePair = (ItemIdStoreCodePair) o;
    return Objects.equals(this.itemId, itemIdStoreCodePair.itemId) &&
        Objects.equals(this.storeCode, itemIdStoreCodePair.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemIdStoreCodePair {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
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

