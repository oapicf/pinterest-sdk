package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsItemValidationIssues;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemsIssuesList200Response  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid CatalogsItemValidationIssues> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid CatalogsItemValidationIssues> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid CatalogsItemValidationIssues> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ItemsIssuesList200Response items(List<@Valid CatalogsItemValidationIssues> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ItemsIssuesList200Response addItemsItem(CatalogsItemValidationIssues itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get bookmark
  * @return bookmark
  */
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }

  /**
   * Sets the <code>bookmark</code> property.
   */
 public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * Sets the <code>bookmark</code> property.
   */
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

