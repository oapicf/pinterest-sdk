package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessMemberAssetsGet200Response  {
  
  @ApiModelProperty(required = true, value = "List asset permissions the given member was granted.")
 /**
   * List asset permissions the given member was granted.
  **/
  private List<AssetIdPermissions> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * List asset permissions the given member was granted.
   * @return items
  **/
  @JsonProperty("items")
  public List<AssetIdPermissions> getItems() {
    return items;
  }

  public void setItems(List<AssetIdPermissions> items) {
    this.items = items;
  }

  public BusinessMemberAssetsGet200Response items(List<AssetIdPermissions> items) {
    this.items = items;
    return this;
  }

  public BusinessMemberAssetsGet200Response addItemsItem(AssetIdPermissions itemsItem) {
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

  public BusinessMemberAssetsGet200Response bookmark(String bookmark) {
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
    BusinessMemberAssetsGet200Response businessMemberAssetsGet200Response = (BusinessMemberAssetsGet200Response) o;
    return Objects.equals(this.items, businessMemberAssetsGet200Response.items) &&
        Objects.equals(this.bookmark, businessMemberAssetsGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsGet200Response {\n");
    
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

