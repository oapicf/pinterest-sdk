package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.ItemAttributes;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An item to be upserted
 */
@ApiModel(description="An item to be upserted")

public class CatalogsUpsertRetailItem  {
  
 /**
  * The catalog item id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", required = true, value = "The catalog item id in the merchant namespace")
  private String itemId;

public enum OperationEnum {

    @JsonProperty("CREATE") CREATE(String.valueOf("CREATE")),
    @JsonProperty("UPDATE") UPDATE(String.valueOf("UPDATE")),
    @JsonProperty("UPSERT") UPSERT(String.valueOf("UPSERT")),
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ItemAttributes attributes;
 /**
  * The catalog item id in the merchant namespace
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
  public CatalogsUpsertRetailItem itemId(String itemId) {
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
  public CatalogsUpsertRetailItem operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get attributes
  * @return attributes
  */
  @JsonProperty("attributes")
  @NotNull
  public ItemAttributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
 public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
  public CatalogsUpsertRetailItem attributes(ItemAttributes attributes) {
    this.attributes = attributes;
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
    CatalogsUpsertRetailItem catalogsUpsertRetailItem = (CatalogsUpsertRetailItem) o;
    return Objects.equals(this.itemId, catalogsUpsertRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsUpsertRetailItem.operation) &&
        Objects.equals(this.attributes, catalogsUpsertRetailItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertRetailItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

