package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardSection;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BoardSectionsList200Response  {
  
  @ApiModelProperty(required = true, value = "Board sections")
 /**
   * Board sections
  **/
  private List<BoardSection> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Board sections
   * @return items
  **/
  @JsonProperty("items")
  public List<BoardSection> getItems() {
    return items;
  }

  public void setItems(List<BoardSection> items) {
    this.items = items;
  }

  public BoardSectionsList200Response items(List<BoardSection> items) {
    this.items = items;
    return this;
  }

  public BoardSectionsList200Response addItemsItem(BoardSection itemsItem) {
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

  public BoardSectionsList200Response bookmark(String bookmark) {
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
    BoardSectionsList200Response boardSectionsList200Response = (BoardSectionsList200Response) o;
    return Objects.equals(this.items, boardSectionsList200Response.items) &&
        Objects.equals(this.bookmark, boardSectionsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSectionsList200Response {\n");
    
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

