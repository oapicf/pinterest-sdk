package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocalInventoryOperation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LocalInventoryItemsBatchCreate  {
  
 /**
  * Array of inventory operations. Up to 1000 items per request.
  */
  @ApiModelProperty(required = true, value = "Array of inventory operations. Up to 1000 items per request.")

  @Valid

  private List<@Valid LocalInventoryOperation> operations = new ArrayList<>();
 /**
   * Array of inventory operations. Up to 1000 items per request.
   * @return operations
  **/
  @JsonProperty("operations")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid LocalInventoryOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
  }

  public LocalInventoryItemsBatchCreate operations(List<@Valid LocalInventoryOperation> operations) {
    this.operations = operations;
    return this;
  }

  public LocalInventoryItemsBatchCreate addOperationsItem(LocalInventoryOperation operationsItem) {
    this.operations.add(operationsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

