package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocalInventoryOperation;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "LocalInventoryItemsBatchCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsBatchCreate {

  private List<@Valid LocalInventoryOperation> operations = new ArrayList<>();

  public LocalInventoryItemsBatchCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalInventoryItemsBatchCreate(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
  }

  public LocalInventoryItemsBatchCreate operations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
    return this;
  }

  public LocalInventoryItemsBatchCreate addOperationsItem(LocalInventoryOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Array of inventory operations. Up to 1000 items per request.
   * @return operations
   */
  @NotNull @Valid @Size(min = 1, max = 1000) 
  @Schema(name = "operations", description = "Array of inventory operations. Up to 1000 items per request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operations")
  public List<@Valid LocalInventoryOperation> getOperations() {
    return operations;
  }

  @JsonProperty("operations")
  public void setOperations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate = (LocalInventoryItemsBatchCreate) o;
    return Objects.equals(this.operations, localInventoryItemsBatchCreate.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsBatchCreate {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

