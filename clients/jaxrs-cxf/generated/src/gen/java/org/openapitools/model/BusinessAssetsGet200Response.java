package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetBusinessAssetsResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessAssetsGet200Response  {
  
  @ApiModelProperty(required = true, value = "List of assets the requesting business has access to.")
  @Valid
 /**
   * List of assets the requesting business has access to.
  **/
  private List<@Valid GetBusinessAssetsResponse> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * List of assets the requesting business has access to.
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid GetBusinessAssetsResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GetBusinessAssetsResponse> items) {
    this.items = items;
  }

  public BusinessAssetsGet200Response items(List<@Valid GetBusinessAssetsResponse> items) {
    this.items = items;
    return this;
  }

  public BusinessAssetsGet200Response addItemsItem(GetBusinessAssetsResponse itemsItem) {
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

  public BusinessAssetsGet200Response bookmark(String bookmark) {
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
    BusinessAssetsGet200Response businessAssetsGet200Response = (BusinessAssetsGet200Response) o;
    return Objects.equals(this.items, businessAssetsGet200Response.items) &&
        Objects.equals(this.bookmark, businessAssetsGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssetsGet200Response {\n");
    
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

