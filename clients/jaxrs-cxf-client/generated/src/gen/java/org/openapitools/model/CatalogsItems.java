package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Response object of catalogs items
 **/
@ApiModel(description="Response object of catalogs items")

public class CatalogsItems  {
  
  @ApiModelProperty(value = "Array with catalogs items")
 /**
   * Array with catalogs items
  **/
  private List<ItemResponse> items = new ArrayList<>();
 /**
   * Array with catalogs items
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemResponse> getItems() {
    return items;
  }

  public void setItems(List<ItemResponse> items) {
    this.items = items;
  }

  public CatalogsItems items(List<ItemResponse> items) {
    this.items = items;
    return this;
  }

  public CatalogsItems addItemsItem(ItemResponse itemsItem) {
    this.items.add(itemsItem);
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
    CatalogsItems catalogsItems = (CatalogsItems) o;
    return Objects.equals(this.items, catalogsItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItems {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

