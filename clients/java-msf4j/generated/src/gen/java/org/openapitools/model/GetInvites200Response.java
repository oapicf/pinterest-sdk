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
import org.openapitools.model.InviteResponse;

/**
 * GetInvites200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetInvites200Response   {
  @JsonProperty("items")
  private List<@Valid InviteResponse> items = new ArrayList<>();

  @JsonProperty("bookmark")
  private String bookmark;

  public GetInvites200Response items(List<@Valid InviteResponse> items) {
    this.items = items;
    return this;
  }

  public GetInvites200Response addItemsItem(InviteResponse itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of invite and request data.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of invite and request data.")
  public List<@Valid InviteResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid InviteResponse> items) {
    this.items = items;
  }

  public GetInvites200Response bookmark(String bookmark) {
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
    GetInvites200Response getInvites200Response = (GetInvites200Response) o;
    return Objects.equals(this.items, getInvites200Response.items) &&
        Objects.equals(this.bookmark, getInvites200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvites200Response {\n");
    
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

