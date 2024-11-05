package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserSingleAssetBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessAssetMembersGet200Response  {
  
  @ApiModelProperty(required = true, value = "List of members with permissions to the asset.")
  @Valid
 /**
   * List of members with permissions to the asset.
  **/
  private List<@Valid UserSingleAssetBinding> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * List of members with permissions to the asset.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid UserSingleAssetBinding> getItems() {
    return items;
  }

  public void setItems(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
  }

  public BusinessAssetMembersGet200Response items(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
    return this;
  }

  public BusinessAssetMembersGet200Response addItemsItem(UserSingleAssetBinding itemsItem) {
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

  public BusinessAssetMembersGet200Response bookmark(String bookmark) {
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
    BusinessAssetMembersGet200Response businessAssetMembersGet200Response = (BusinessAssetMembersGet200Response) o;
    return Objects.equals(this.items, businessAssetMembersGet200Response.items) &&
        Objects.equals(this.bookmark, businessAssetMembersGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssetMembersGet200Response {\n");
    
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

