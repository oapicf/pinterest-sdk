package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An item to be deleted
 */

@Schema(name = "CatalogsDeleteRetailItem", description = "An item to be deleted")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsDeleteRetailItem implements CatalogsRetailBatchRequestItemsItems {

  private String itemId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Long lastUpdatedTime;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    DELETE("DELETE");

    private final String value;

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

  public CatalogsDeleteRetailItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsDeleteRetailItem(String itemId, OperationEnum operation) {
    this.itemId = itemId;
    this.operation = operation;
  }

  public CatalogsDeleteRetailItem itemId(String itemId) {
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

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsDeleteRetailItem lastUpdatedTime(@Nullable Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
   */
  
  @Schema(name = "last_updated_time", example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_time")
  public @Nullable Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  @JsonProperty("last_updated_time")
  public void setLastUpdatedTime(@Nullable Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public CatalogsDeleteRetailItem operation(OperationEnum operation) {
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

  @JsonProperty("operation")
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsDeleteRetailItem catalogsDeleteRetailItem = (CatalogsDeleteRetailItem) o;
    return Objects.equals(this.itemId, catalogsDeleteRetailItem.itemId) &&
        Objects.equals(this.lastUpdatedTime, catalogsDeleteRetailItem.lastUpdatedTime) &&
        Objects.equals(this.operation, catalogsDeleteRetailItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, lastUpdatedTime, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsDeleteRetailItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

