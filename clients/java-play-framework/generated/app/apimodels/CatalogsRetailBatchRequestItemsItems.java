package apimodels;

import apimodels.CatalogsCreateRetailItem;
import apimodels.CatalogsDeleteRetailItem;
import apimodels.CatalogsUpdateRetailItem;
import apimodels.CatalogsUpsertRetailItem;
import apimodels.ItemAttributesRequest;
import apimodels.UpdateMaskFieldType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsRetailBatchRequestItemsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsRetailBatchRequestItemsItems   {
  @JsonProperty("attributes")
  @NotNull
@Valid

  private ItemAttributesRequest attributes;

  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");

    private final String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("operation")
  @NotNull

  private OperationEnum operation;

  @JsonProperty("update_mask")
  @Valid

  private List<UpdateMaskFieldType> updateMask = null;

  @JsonProperty("last_updated_time")
  
  private Long lastUpdatedTime;

  public CatalogsRetailBatchRequestItemsItems attributes(ItemAttributesRequest attributes) {
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

  public CatalogsRetailBatchRequestItemsItems itemId(String itemId) {
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

  public CatalogsRetailBatchRequestItemsItems operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CatalogsRetailBatchRequestItemsItems updateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public CatalogsRetailBatchRequestItemsItems addUpdateMaskItem(UpdateMaskFieldType updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }
    this.updateMask.add(updateMaskItem);
    return this;
  }

   /**
   * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
   * @return updateMask
  **/
  public List<UpdateMaskFieldType> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(List<UpdateMaskFieldType> updateMask) {
    this.updateMask = updateMask;
  }

  public CatalogsRetailBatchRequestItemsItems lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
  **/
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailBatchRequestItemsItems catalogsRetailBatchRequestItemsItems = (CatalogsRetailBatchRequestItemsItems) o;
    return Objects.equals(attributes, catalogsRetailBatchRequestItemsItems.attributes) &&
        Objects.equals(itemId, catalogsRetailBatchRequestItemsItems.itemId) &&
        Objects.equals(operation, catalogsRetailBatchRequestItemsItems.operation) &&
        Objects.equals(updateMask, catalogsRetailBatchRequestItemsItems.updateMask) &&
        Objects.equals(lastUpdatedTime, catalogsRetailBatchRequestItemsItems.lastUpdatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, operation, updateMask, lastUpdatedTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailBatchRequestItemsItems {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
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

