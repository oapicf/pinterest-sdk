/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.Board;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BoardsUserFollowsList200Response {
  
  @SerializedName("items")
  private List<Board> items = null;
  @SerializedName("bookmark")
  private String bookmark = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Board> getItems() {
    return items;
  }
  public void setItems(List<Board> items) {
    this.items = items;
  }

  /**
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
    BoardsUserFollowsList200Response boardsUserFollowsList200Response = (BoardsUserFollowsList200Response) o;
    return (this.items == null ? boardsUserFollowsList200Response.items == null : this.items.equals(boardsUserFollowsList200Response.items)) &&
        (this.bookmark == null ? boardsUserFollowsList200Response.bookmark == null : this.bookmark.equals(boardsUserFollowsList200Response.bookmark));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    result = 31 * result + (this.bookmark == null ? 0: this.bookmark.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsUserFollowsList200Response {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("  bookmark: ").append(bookmark).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
