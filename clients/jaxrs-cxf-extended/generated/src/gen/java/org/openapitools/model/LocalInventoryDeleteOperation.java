package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete operation for local inventory item
 */
@ApiModel(description="Delete operation for local inventory item")

public class LocalInventoryDeleteOperation  {
  
 /**
  * Catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  private String itemId;

public enum OperationEnum {

    @JsonProperty("DELETE") DELETE(String.valueOf("DELETE"));

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

 /**
  * Store code for the local inventory item
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  private String storeCode;
 /**
  * Catalog item id in the merchant namespace
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public LocalInventoryDeleteOperation itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation == null ? null : operation.value();
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public LocalInventoryDeleteOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Store code for the local inventory item
  * @return storeCode
  */
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
 public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  /**
   * Sets the <code>storeCode</code> property.
   */
  public LocalInventoryDeleteOperation storeCode(String storeCode) {
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
    LocalInventoryDeleteOperation localInventoryDeleteOperation = (LocalInventoryDeleteOperation) o;
    return Objects.equals(this.itemId, localInventoryDeleteOperation.itemId) &&
        Objects.equals(this.operation, localInventoryDeleteOperation.operation) &&
        Objects.equals(this.storeCode, localInventoryDeleteOperation.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryDeleteOperation {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

