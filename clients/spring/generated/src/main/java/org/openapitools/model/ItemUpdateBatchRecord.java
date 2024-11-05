package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UpdatableItemAttributes;
import org.openapitools.model.UpdateMaskFieldType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing an item batch record to update items
 */

@Schema(name = "ItemUpdateBatchRecord", description = "Object describing an item batch record to update items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ItemUpdateBatchRecord implements ItemBatchRecord {

  private String itemId;

  private UpdatableItemAttributes attributes;

  @Valid
  private JsonNullable<List<UpdateMaskFieldType>> updateMask = JsonNullable.<List<UpdateMaskFieldType>>undefined();

  public ItemUpdateBatchRecord itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_id")
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
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  public ItemUpdateBatchRecord updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = JsonNullable.of(updateMask);
    return this;
  }

  public ItemUpdateBatchRecord addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
    if (this.updateMask == null || !this.updateMask.isPresent()) {
      this.updateMask = JsonNullable.of(new ArrayList<>());
    }
    this.updateMask.get().add(updateMaskItem);
    return this;
  }

  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
   */
  @Valid 
  @Schema(name = "update_mask", example = "[\"ad_link\",\"adult\",\"age_group\",\"availability\",\"average_review_rating\",\"brand\",\"checkout_enabled\",\"color\",\"condition\",\"custom_label_0\",\"custom_label_1\",\"custom_label_2\",\"custom_label_3\",\"custom_label_4\",\"description\",\"free_shipping_label\",\"free_shipping_limit\",\"gender\",\"google_product_category\",\"gtin\",\"item_group_id\",\"last_updated_time\",\"link\",\"material\",\"min_ad_price\",\"mpn\",\"number_of_ratings\",\"number_of_reviews\",\"pattern\",\"price\",\"product_type\",\"sale_price\",\"shipping\",\"shipping_height\",\"shipping_weight\",\"shipping_width\",\"size\",\"size_system\",\"size_type\",\"tax\",\"title\",\"variant_names\",\"variant_values\"]", description = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("update_mask")
  public JsonNullable<List<UpdateMaskFieldType>> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(JsonNullable<List<UpdateMaskFieldType>> updateMask) {
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
    return Objects.equals(this.itemId, itemUpdateBatchRecord.itemId) &&
        Objects.equals(this.attributes, itemUpdateBatchRecord.attributes) &&
        equalsNullable(this.updateMask, itemUpdateBatchRecord.updateMask);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, attributes, hashCodeNullable(updateMask));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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

