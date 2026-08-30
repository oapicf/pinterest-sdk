package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */
@ApiModel(description="A pair of item_id and store_code that uniquely identifies a local inventory item")

public class ItemIdStoreCodePair  {
  
 /**
  * Catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")

  private String itemId;

 /**
  * Store code for the local inventory item
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")

  private String storeCode;
 /**
   * Catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ItemIdStoreCodePair itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Store code for the local inventory item
   * @return storeCode
  **/
  @JsonProperty("store_code")
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public ItemIdStoreCodePair storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

