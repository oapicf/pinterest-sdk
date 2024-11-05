/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UpdatableItemAttributes;
import org.openapitools.model.UpdateMaskFieldType;



/**
 * Object describing an item batch record to update items
 */

@ApiModel(description = "Object describing an item batch record to update items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ItemUpdateBatchRecord   {
  
  private String itemId;
  private UpdatableItemAttributes attributes;
  private List<UpdateMaskFieldType> updateMask;

  /**
   * The catalog item id in the merchant namespace
   */
  public ItemUpdateBatchRecord itemId(String itemId) {
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

  /**
   */
  public ItemUpdateBatchRecord attributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   */
  public ItemUpdateBatchRecord updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ad_link\",\"adult\",\"age_group\",\"availability\",\"average_review_rating\",\"brand\",\"checkout_enabled\",\"color\",\"condition\",\"custom_label_0\",\"custom_label_1\",\"custom_label_2\",\"custom_label_3\",\"custom_label_4\",\"description\",\"free_shipping_label\",\"free_shipping_limit\",\"gender\",\"google_product_category\",\"gtin\",\"item_group_id\",\"last_updated_time\",\"link\",\"material\",\"min_ad_price\",\"mpn\",\"number_of_ratings\",\"number_of_reviews\",\"pattern\",\"price\",\"product_type\",\"sale_price\",\"shipping\",\"shipping_height\",\"shipping_weight\",\"shipping_width\",\"size\",\"size_system\",\"size_type\",\"tax\",\"title\",\"variant_names\",\"variant_values\"]", value = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
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
    return Objects.equals(itemId, itemUpdateBatchRecord.itemId) &&
        Objects.equals(attributes, itemUpdateBatchRecord.attributes) &&
        Objects.equals(updateMask, itemUpdateBatchRecord.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, attributes, updateMask);
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

