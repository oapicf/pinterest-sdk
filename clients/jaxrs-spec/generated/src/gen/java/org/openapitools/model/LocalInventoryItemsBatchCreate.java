package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocalInventoryOperation;
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
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("LocalInventoryItemsBatchCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsBatchCreate   {
  private @Valid List<@Valid LocalInventoryOperation> operations = new ArrayList<>();

  public LocalInventoryItemsBatchCreate() {
  }

  @JsonCreator
  public LocalInventoryItemsBatchCreate(
    @JsonProperty(required = true, value = "operations") List<@Valid LocalInventoryOperation> operations
  ) {
    this.operations = operations;
  }

  /**
   * Array of inventory operations. Up to 1000 items per request.
   **/
  public LocalInventoryItemsBatchCreate operations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of inventory operations. Up to 1000 items per request.")
  @JsonProperty(required = true, value = "operations")
  @NotNull @Valid  @Size(min=1,max=1000)public List<@Valid LocalInventoryOperation> getOperations() {
    return operations;
  }

  @JsonProperty(required = true, value = "operations")
  public void setOperations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
  }

  public LocalInventoryItemsBatchCreate addOperationsItem(LocalInventoryOperation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }

    this.operations.add(operationsItem);
    return this;
  }

  public LocalInventoryItemsBatchCreate removeOperationsItem(LocalInventoryOperation operationsItem) {
    if (operationsItem != null && this.operations != null) {
      this.operations.remove(operationsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
