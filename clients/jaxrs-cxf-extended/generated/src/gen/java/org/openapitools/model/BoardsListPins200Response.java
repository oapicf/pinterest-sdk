package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BoardsListPins200Response  {
  
 /**
  * Pins
  */
  @ApiModelProperty(required = true, value = "Pins")
  @Valid
  private List<@Valid Pin> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
  * Pins
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid Pin> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid Pin> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public BoardsListPins200Response items(List<@Valid Pin> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public BoardsListPins200Response addItemsItem(Pin itemsItem) {
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
  public BoardsListPins200Response bookmark(String bookmark) {
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
    BoardsListPins200Response boardsListPins200Response = (BoardsListPins200Response) o;
    return Objects.equals(this.items, boardsListPins200Response.items) &&
        Objects.equals(this.bookmark, boardsListPins200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsListPins200Response {\n");
    
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

