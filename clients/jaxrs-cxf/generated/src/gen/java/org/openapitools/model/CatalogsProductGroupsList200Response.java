package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupsList200ResponseAllOfItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupsList200Response  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<CatalogsProductGroupsList200ResponseAllOfItemsInner> getItems() {
    return items;
  }

  public void setItems(List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items) {
    this.items = items;
  }

  public CatalogsProductGroupsList200Response items(List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items) {
    this.items = items;
    return this;
  }

  public CatalogsProductGroupsList200Response addItemsItem(CatalogsProductGroupsList200ResponseAllOfItemsInner itemsItem) {
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

  public CatalogsProductGroupsList200Response bookmark(String bookmark) {
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
    CatalogsProductGroupsList200Response catalogsProductGroupsList200Response = (CatalogsProductGroupsList200Response) o;
    return Objects.equals(this.items, catalogsProductGroupsList200Response.items) &&
        Objects.equals(this.bookmark, catalogsProductGroupsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsList200Response {\n");
    
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

