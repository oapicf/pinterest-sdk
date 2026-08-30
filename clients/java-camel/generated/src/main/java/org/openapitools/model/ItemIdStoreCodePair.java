package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */

@Schema(name = "ItemIdStoreCodePair", description = "A pair of item_id and store_code that uniquely identifies a local inventory item")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemIdStoreCodePair {

  private String itemId;

  private String storeCode;

  public ItemIdStoreCodePair() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemIdStoreCodePair(String itemId, String storeCode) {
    this.itemId = itemId;
    this.storeCode = storeCode;
  }

  public ItemIdStoreCodePair itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", example = "item_id_1", description = "Catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
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
   */
  @NotNull 
  @Schema(name = "store_code", example = "store_1", description = "Store code for the local inventory item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("store_code")
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

