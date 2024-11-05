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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessAssetPartnersGet200Response  {
  
 /**
  * List of partners with permissions to the asset.
  */
  @ApiModelProperty(required = true, value = "List of partners with permissions to the asset.")
  @Valid
  private List<@Valid UserSingleAssetBinding> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
  * List of partners with permissions to the asset.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid UserSingleAssetBinding> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public BusinessAssetPartnersGet200Response items(List<@Valid UserSingleAssetBinding> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public BusinessAssetPartnersGet200Response addItemsItem(UserSingleAssetBinding itemsItem) {
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
  public BusinessAssetPartnersGet200Response bookmark(String bookmark) {
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
    BusinessAssetPartnersGet200Response businessAssetPartnersGet200Response = (BusinessAssetPartnersGet200Response) o;
    return Objects.equals(this.items, businessAssetPartnersGet200Response.items) &&
        Objects.equals(this.bookmark, businessAssetPartnersGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssetPartnersGet200Response {\n");
    
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

