package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.UpdatableItemAttributes;
import com.prokarma.pkmst.model.UpdateMaskFieldType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An item to be updated
 */
@ApiModel(description = "An item to be updated")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsUpdateRetailItem   {
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    UPDATE("UPDATE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operation")
  private OperationEnum operation;

  @JsonProperty("attributes")
  private UpdatableItemAttributes attributes;

  @JsonProperty("update_mask")
  
  private List<UpdateMaskFieldType> updateMask = null;

  public CatalogsUpdateRetailItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsUpdateRetailItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @ApiModelProperty(required = true, value = "")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsUpdateRetailItem attributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @ApiModelProperty(required = true, value = "")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsUpdateRetailItem updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public CatalogsUpdateRetailItem addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }
    this.updateMask.add(updateMaskItem);
    return this;
  }

  /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
   */
  @ApiModelProperty(example = "[\"ad_link\",\"adult\",\"age_group\",\"availability\",\"average_review_rating\",\"brand\",\"checkout_enabled\",\"color\",\"condition\",\"custom_label_0\",\"custom_label_1\",\"custom_label_2\",\"custom_label_3\",\"custom_label_4\",\"description\",\"free_shipping_label\",\"free_shipping_limit\",\"gender\",\"google_product_category\",\"gtin\",\"item_group_id\",\"last_updated_time\",\"link\",\"material\",\"min_ad_price\",\"mpn\",\"number_of_ratings\",\"number_of_reviews\",\"pattern\",\"price\",\"product_type\",\"sale_price\",\"shipping\",\"shipping_height\",\"shipping_weight\",\"shipping_width\",\"size\",\"size_system\",\"size_type\",\"tax\",\"title\",\"variant_names\",\"variant_values\"]", value = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
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
    CatalogsUpdateRetailItem catalogsUpdateRetailItem = (CatalogsUpdateRetailItem) o;
    return Objects.equals(this.itemId, catalogsUpdateRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsUpdateRetailItem.operation) &&
        Objects.equals(this.attributes, catalogsUpdateRetailItem.attributes) &&
        Objects.equals(this.updateMask, catalogsUpdateRetailItem.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdateRetailItem {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

