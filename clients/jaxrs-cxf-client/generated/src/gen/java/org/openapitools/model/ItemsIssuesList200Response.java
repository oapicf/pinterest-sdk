package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsItemValidationIssues;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemsIssuesList200Response  {
  
  @ApiModelProperty(required = true, value = "")
  private List<CatalogsItemValidationIssues> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<CatalogsItemValidationIssues> getItems() {
    return items;
  }

  public void setItems(List<CatalogsItemValidationIssues> items) {
    this.items = items;
  }

  public ItemsIssuesList200Response items(List<CatalogsItemValidationIssues> items) {
    this.items = items;
    return this;
  }

  public ItemsIssuesList200Response addItemsItem(CatalogsItemValidationIssues itemsItem) {
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

  public ItemsIssuesList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
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
    ItemsIssuesList200Response itemsIssuesList200Response = (ItemsIssuesList200Response) o;
    return Objects.equals(this.items, itemsIssuesList200Response.items) &&
        Objects.equals(this.bookmark, itemsIssuesList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsIssuesList200Response {\n");
    
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

