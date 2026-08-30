package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RetailLocalInventoryItemAttributesOptional;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update operation for local inventory item
 */
@ApiModel(description="Update operation for local inventory item")

public class LocalInventoryUpdateOperation  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private RetailLocalInventoryItemAttributesOptional attributes;

 /**
  * Catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")

  private String itemId;

public enum OperationEnum {

UPDATE(String.valueOf("UPDATE"));


    private String value;

    OperationEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(required = true, value = "")

  private OperationEnum operation;

 /**
  * Store code for the local inventory item
  */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")

  private String storeCode;
 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  @NotNull
  public RetailLocalInventoryItemAttributesOptional getAttributes() {
    return attributes;
  }

  public void setAttributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
  }

  public LocalInventoryUpdateOperation attributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
    return this;
  }

 /**
   * Catalog item id in the merchant namespace
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public LocalInventoryUpdateOperation itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    if (operation == null) {
      return null;
    }
    return operation.value();
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public LocalInventoryUpdateOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Store code for the local inventory item
   * @return storeCode
  **/
  @JsonProperty("store_code")
  @NotNull
  public String getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(String storeCode) {
    this.storeCode = storeCode;
  }

  public LocalInventoryUpdateOperation storeCode(String storeCode) {
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
    LocalInventoryUpdateOperation localInventoryUpdateOperation = (LocalInventoryUpdateOperation) o;
    return Objects.equals(this.attributes, localInventoryUpdateOperation.attributes) &&
        Objects.equals(this.itemId, localInventoryUpdateOperation.itemId) &&
        Objects.equals(this.operation, localInventoryUpdateOperation.operation) &&
        Objects.equals(this.storeCode, localInventoryUpdateOperation.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId, operation, storeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryUpdateOperation {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

