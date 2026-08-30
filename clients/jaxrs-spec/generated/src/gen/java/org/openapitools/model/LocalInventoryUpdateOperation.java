package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RetailLocalInventoryItemAttributesOptional;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Update operation for local inventory item
 **/
@ApiModel(description = "Update operation for local inventory item")
@JsonTypeName("LocalInventoryUpdateOperation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryUpdateOperation   {
  private RetailLocalInventoryItemAttributesOptional attributes;
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OperationEnum fromString(String s) {
        for (OperationEnum b : OperationEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private String storeCode;

  public LocalInventoryUpdateOperation() {
  }

  @JsonCreator
  public LocalInventoryUpdateOperation(
    @JsonProperty(required = true, value = "attributes") RetailLocalInventoryItemAttributesOptional attributes,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "operation") OperationEnum operation,
    @JsonProperty(required = true, value = "store_code") String storeCode
  ) {
    this.attributes = attributes;
    this.itemId = itemId;
    this.operation = operation;
    this.storeCode = storeCode;
  }

  /**
   **/
  public LocalInventoryUpdateOperation attributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "attributes")
  @NotNull @Valid public RetailLocalInventoryItemAttributesOptional getAttributes() {
    return attributes;
  }

  @JsonProperty(required = true, value = "attributes")
  public void setAttributes(RetailLocalInventoryItemAttributesOptional attributes) {
    this.attributes = attributes;
  }

  /**
   * Catalog item id in the merchant namespace
   **/
  public LocalInventoryUpdateOperation itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "item_id_1", required = true, value = "Catalog item id in the merchant namespace")
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   **/
  public LocalInventoryUpdateOperation operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public OperationEnum getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  /**
   * Store code for the local inventory item
   **/
  public LocalInventoryUpdateOperation storeCode(String storeCode) {
    this.storeCode = storeCode;
    return this;
  }

  
  @ApiModelProperty(example = "store_1", required = true, value = "Store code for the local inventory item")
  @JsonProperty(required = true, value = "store_code")
  @NotNull public String getStoreCode() {
    return storeCode;
  }

  @JsonProperty(required = true, value = "store_code")
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
