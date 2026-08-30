package org.openapitools.model;

import org.openapitools.model.LocalInventoryOperation;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class LocalInventoryItemsBatchCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array of inventory operations. Up to 1000 items per request.
   */
  @JsonProperty("operations")
  private List<LocalInventoryOperation> operations = new ArrayList<>();

  /**
   * Array of inventory operations. Up to 1000 items per request.
   * @return operations
   */
  public List<LocalInventoryOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<LocalInventoryOperation> operations) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
