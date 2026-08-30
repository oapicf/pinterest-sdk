package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ItemResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsPost200Response   {
  
  private List<ItemResponse> items = new ArrayList<>();

  public ItemsPost200Response () {

  }

  public ItemsPost200Response (List<ItemResponse> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<ItemResponse> getItems() {
    return items;
  }
  public void setItems(List<ItemResponse> items) {
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
    ItemsPost200Response itemsPost200Response = (ItemsPost200Response) o;
    return Objects.equals(items, itemsPost200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsPost200Response {\n");
    
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
