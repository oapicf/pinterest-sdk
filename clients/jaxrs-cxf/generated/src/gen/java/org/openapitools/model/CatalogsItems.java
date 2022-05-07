package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ItemBatchRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Response object of catalogs items
 **/
@ApiModel(description="Response object of catalogs items")
public class CatalogsItems  {
  
  @ApiModelProperty(value = "Array with catalogs items")
  @Valid
 /**
   * Array with catalogs items
  **/
  private List<ItemBatchRecord> items = null;
 /**
   * Array with catalogs items
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemBatchRecord> getItems() {
    return items;
  }

  public void setItems(List<ItemBatchRecord> items) {
    this.items = items;
  }

  public CatalogsItems items(List<ItemBatchRecord> items) {
    this.items = items;
    return this;
  }

  public CatalogsItems addItemsItem(ItemBatchRecord itemsItem) {
    this.items.add(itemsItem);
    return this;
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

