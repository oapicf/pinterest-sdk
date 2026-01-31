package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserSingleAssetBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("business_asset_members_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAssetMembersGet200Response   {
  private String bookmark;
  private @Valid List<@Valid UserSingleAssetBinding> items = new ArrayList<>();

  public BusinessAssetMembersGet200Response() {
  }

  @JsonCreator
  public BusinessAssetMembersGet200Response(
    @JsonProperty(required = true, value = "items") List<@Valid UserSingleAssetBinding> items
  ) {
    this.items = items;
  }

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

  @JsonProperty("bookmark")
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

  /**
   * List of members with permissions to the asset.
   **/
  public BusinessAssetMembersGet200Response items(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of members with permissions to the asset.")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid UserSingleAssetBinding> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
  }

  public BusinessAssetMembersGet200Response addItemsItem(UserSingleAssetBinding itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public BusinessAssetMembersGet200Response removeItemsItem(UserSingleAssetBinding itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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
    return Objects.equals(this.bookmark, businessAssetMembersGet200Response.bookmark) &&
        Objects.equals(this.items, businessAssetMembersGet200Response.items);
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

