package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreateRetailItem;
import org.openapitools.model.CatalogsDeleteRetailItem;
import org.openapitools.model.CatalogsUpdateRetailItem;
import org.openapitools.model.CatalogsUpsertRetailItem;
import org.openapitools.model.ItemAttributesRequest;
import org.openapitools.model.UpdateMaskFieldType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsRetailBatchRequestItemsInner  {
  
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
 /**
   * The catalog item id in the merchant namespace
  **/
  private String itemId;

public enum OperationEnum {

DELETE(String.valueOf("DELETE"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
        for (OperationEnum b : OperationEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperationEnum operation;

  @ApiModelProperty(required = true, value = "")
  private ItemAttributesRequest attributes;

  @ApiModelProperty(example = "[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]", value = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
 /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  **/
  private List<UpdateMaskFieldType> updateMask;
 /**
   * The catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsRetailBatchRequestItemsInner itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsRetailBatchRequestItemsInner operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public ItemAttributesRequest getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

  public CatalogsRetailBatchRequestItemsInner attributes(ItemAttributesRequest attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
  **/
  @JsonProperty("update_mask")
  public List<UpdateMaskFieldType> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
  }

  public CatalogsRetailBatchRequestItemsInner updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public CatalogsRetailBatchRequestItemsInner addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
    this.updateMask.add(updateMaskItem);
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
    CatalogsRetailBatchRequestItemsInner catalogsRetailBatchRequestItemsInner = (CatalogsRetailBatchRequestItemsInner) o;
    return Objects.equals(this.itemId, catalogsRetailBatchRequestItemsInner.itemId) &&
        Objects.equals(this.operation, catalogsRetailBatchRequestItemsInner.operation) &&
        Objects.equals(this.attributes, catalogsRetailBatchRequestItemsInner.attributes) &&
        Objects.equals(this.updateMask, catalogsRetailBatchRequestItemsInner.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequestItemsInner {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

