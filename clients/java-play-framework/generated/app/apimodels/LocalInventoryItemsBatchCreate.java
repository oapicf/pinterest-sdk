package apimodels;

import apimodels.LocalInventoryOperation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalInventoryItemsBatchCreate   {
  @JsonProperty("operations")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid LocalInventoryOperation> operations = new ArrayList<>();

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
  **/
  public List<@Valid LocalInventoryOperation> getOperations() {
    return operations;
  }

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
    return Objects.equals(operations, localInventoryItemsBatchCreate.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

