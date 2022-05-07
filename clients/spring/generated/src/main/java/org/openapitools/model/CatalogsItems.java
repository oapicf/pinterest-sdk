package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemBatchRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response object of catalogs items
 */

@Schema(name = "CatalogsItems", description = "Response object of catalogs items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class CatalogsItems   {

  @JsonProperty("items")
  @Valid
  private List<ItemBatchRecord> items = null;

  public CatalogsItems items(List<ItemBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItems addItemsItem(ItemBatchRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with catalogs items
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Array with catalogs items", required = false)
  public List<ItemBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemBatchRecord> items) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

