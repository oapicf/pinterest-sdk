package org.openapitools.model;

import org.openapitools.model.LocalInventoryItemResponse;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Model for getting local inventory items
 */
public class LocalInventoryItemsGet implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array of local inventory items
   */
  @JsonProperty("items")
  private List<LocalInventoryItemResponse> items = new ArrayList<>();

  /**
   * Array of local inventory items
   * @return items
   */
  public List<LocalInventoryItemResponse> getItems() {
    return items;
  }

  public void setItems(List<LocalInventoryItemResponse> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalInventoryItemsGet localInventoryItemsGet = (LocalInventoryItemsGet) o;
    return Objects.equals(this.items, localInventoryItemsGet.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsGet {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
