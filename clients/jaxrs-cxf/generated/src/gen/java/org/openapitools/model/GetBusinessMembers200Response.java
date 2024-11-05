package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserBusinessRoleBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetBusinessMembers200Response  {
  
  @ApiModelProperty(required = true, value = "List of business members.")
  @Valid
 /**
   * List of business members.
  **/
  private List<@Valid UserBusinessRoleBinding> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * List of business members.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid UserBusinessRoleBinding> getItems() {
    return items;
  }

  public void setItems(List<@Valid UserBusinessRoleBinding> items) {
    this.items = items;
  }

  public GetBusinessMembers200Response items(List<@Valid UserBusinessRoleBinding> items) {
    this.items = items;
    return this;
  }

  public GetBusinessMembers200Response addItemsItem(UserBusinessRoleBinding itemsItem) {
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

  public GetBusinessMembers200Response bookmark(String bookmark) {
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
    GetBusinessMembers200Response getBusinessMembers200Response = (GetBusinessMembers200Response) o;
    return Objects.equals(this.items, getBusinessMembers200Response.items) &&
        Objects.equals(this.bookmark, getBusinessMembers200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessMembers200Response {\n");
    
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

