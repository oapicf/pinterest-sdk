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
import org.openapitools.model.UserSingleAssetBinding;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAssetMembersGet200Response   {
  @JsonProperty("bookmark")
  private String bookmark;

  @JsonProperty("items")
  private List<UserSingleAssetBinding> items = new ArrayList<>();

  /**
   **/
  public BusinessAssetMembersGet200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * List of members with permissions to the asset.
   **/
  public BusinessAssetMembersGet200Response items(List<UserSingleAssetBinding> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of members with permissions to the asset.")
  @JsonProperty("items")
  public List<UserSingleAssetBinding> getItems() {
    return items;
  }
  public void setItems(List<UserSingleAssetBinding> items) {
    this.items = items;
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
    return Objects.equals(bookmark, businessAssetMembersGet200Response.bookmark) &&
        Objects.equals(items, businessAssetMembersGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssetMembersGet200Response {\n");
    
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

