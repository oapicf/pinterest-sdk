package org.openapitools.model;

import org.openapitools.model.RetailLocalInventoryItemAttributesOptional;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Update operation for local inventory item
 */
public class LocalInventoryUpdateOperation implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private RetailLocalInventoryItemAttributesOptional attributes;

  /**
   * Catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("operation")
  private String operation;

  /**
   * Store code for the local inventory item
   */
  @JsonProperty("store_code")
  private String storeCode;

  /**
   * 
   * @return attributes
   */
  public RetailLocalInventoryItemAttributesOptional getAttributes() {
    return attributes;
  }

  public void setAttributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
  }

  /**
   * Catalog item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * Store code for the local inventory item
   * @return storeCode
   */
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
