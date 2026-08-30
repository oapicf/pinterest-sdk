package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.RetailLocalInventoryItemAttributesOptional;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Update operation for local inventory item
 */
@ApiModel(description = "Update operation for local inventory item")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryUpdateOperation   {
  @JsonProperty("attributes")
  private RetailLocalInventoryItemAttributesOptional attributes;

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

  @JsonProperty("store_code")
  private String storeCode;

  public LocalInventoryUpdateOperation attributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @ApiModelProperty(required = true, value = "")
  public RetailLocalInventoryItemAttributesOptional getAttributes() {
    return attributes;
  }

  public void setAttributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
  }

  public LocalInventoryUpdateOperation itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public LocalInventoryUpdateOperation operation(OperationEnum operation) {
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

  public LocalInventoryUpdateOperation storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  /**
   * Store code for the local inventory item
   * @return storeCode
   */
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

