package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAttributes;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An item to be created
 */

@Schema(name = "CatalogsCreateRetailItem", description = "An item to be created")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsCreateRetailItem {

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

  private ItemAttributes attributes;

  public CatalogsCreateRetailItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreateRetailItem(String itemId, OperationEnum operation, ItemAttributes attributes) {
    this.itemId = itemId;
    this.operation = operation;
    this.attributes = attributes;
  }

  public CatalogsCreateRetailItem itemId(String itemId) {
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

  public CatalogsCreateRetailItem operation(OperationEnum operation) {
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

  public CatalogsCreateRetailItem attributes(ItemAttributes attributes) {
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
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreateRetailItem catalogsCreateRetailItem = (CatalogsCreateRetailItem) o;
    return Objects.equals(this.itemId, catalogsCreateRetailItem.itemId) &&
        Objects.equals(this.operation, catalogsCreateRetailItem.operation) &&
        Objects.equals(this.attributes, catalogsCreateRetailItem.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, operation, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreateRetailItem {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

