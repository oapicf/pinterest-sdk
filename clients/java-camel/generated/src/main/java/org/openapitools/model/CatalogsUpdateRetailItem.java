package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * An item to be updated
 */

@Schema(name = "CatalogsUpdateRetailItem", description = "An item to be updated")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsUpdateRetailItem {

  private String itemId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    CREATE("CREATE"),
    
    UPDATE("UPDATE"),
    
    UPSERT("UPSERT"),
    
    DELETE("DELETE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  private UpdatableItemAttributes attributes;

  @Valid
  private JsonNullable<List<UpdateMaskFieldType>> updateMask = JsonNullable.<List<UpdateMaskFieldType>>undefined();

  public CatalogsUpdateRetailItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsUpdateRetailItem(String itemId, OperationEnum operation, UpdatableItemAttributes attributes) {
    this.itemId = itemId;
    this.operation = operation;
    this.attributes = attributes;
  }

  public CatalogsUpdateRetailItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
  */
  @NotNull 
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
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
  @NotNull 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
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
  @NotNull @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attributes")
  public UpdatableItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(UpdatableItemAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogsUpdateRetailItem updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = JsonNullable.of(updateMask);
    return this;
  }

  public CatalogsUpdateRetailItem addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
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
    CatalogsUpdateRetailItem catalogsUpdateRetailItem = (CatalogsUpdateRetailItem) o;
    return Objects.equals(this.itemId, catalogsUpdateRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsUpdateRetailItem.operation) &&
        Objects.equals(this.attributes, catalogsUpdateRetailItem.attributes) &&
        equalsNullable(this.updateMask, catalogsUpdateRetailItem.updateMask);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes, hashCodeNullable(updateMask));
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

