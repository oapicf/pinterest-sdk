package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Paginated  {
  
  @ApiModelProperty(required = true, value = "")
  private List<Object> items = new ArrayList<Object>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<Object> getItems() {
    return items;
  }

  public void setItems(List<Object> items) {
    this.items = items;
  }

  public Paginated items(List<Object> items) {
    this.items = items;
    return this;
  }

  public Paginated addItemsItem(Object itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get bookmark
   * @return bookmark
  **/
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  public Paginated bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paginated {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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

