package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Board;

/**
 * BoardsList200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BoardsList200Response   {
  @JsonProperty("items")
  private List<@Valid Board> items = new ArrayList<>();

  @JsonProperty("bookmark")
  private String bookmark;

  public BoardsList200Response items(List<@Valid Board> items) {
    this.items = items;
    return this;
  }

  public BoardsList200Response addItemsItem(Board itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Boards
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Boards")
  public List<@Valid Board> getItems() {
    return items;
  }

  public void setItems(List<@Valid Board> items) {
    this.items = items;
  }

  public BoardsList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

   /**
   * Get bookmark
   * @return bookmark
  **/
  @ApiModelProperty(value = "")
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardsList200Response boardsList200Response = (BoardsList200Response) o;
    return Objects.equals(this.items, boardsList200Response.items) &&
        Objects.equals(this.bookmark, boardsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsList200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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

