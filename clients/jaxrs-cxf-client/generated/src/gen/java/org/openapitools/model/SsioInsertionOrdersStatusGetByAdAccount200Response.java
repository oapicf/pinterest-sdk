package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOInsertionOrderStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SsioInsertionOrdersStatusGetByAdAccount200Response  {
  
  @ApiModelProperty(required = true, value = "Insertion orders status by ad acount id")
 /**
   * Insertion orders status by ad acount id
  **/
  private List<SSIOInsertionOrderStatus> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * Insertion orders status by ad acount id
   * @return items
  **/
  @JsonProperty("items")
  public List<SSIOInsertionOrderStatus> getItems() {
    return items;
  }

  public void setItems(List<SSIOInsertionOrderStatus> items) {
    this.items = items;
  }

  public SsioInsertionOrdersStatusGetByAdAccount200Response items(List<SSIOInsertionOrderStatus> items) {
    this.items = items;
    return this;
  }

  public SsioInsertionOrdersStatusGetByAdAccount200Response addItemsItem(SSIOInsertionOrderStatus itemsItem) {
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

  public SsioInsertionOrdersStatusGetByAdAccount200Response bookmark(String bookmark) {
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
    SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount200Response = (SsioInsertionOrdersStatusGetByAdAccount200Response) o;
    return Objects.equals(this.items, ssioInsertionOrdersStatusGetByAdAccount200Response.items) &&
        Objects.equals(this.bookmark, ssioInsertionOrdersStatusGetByAdAccount200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioInsertionOrdersStatusGetByAdAccount200Response {\n");
    
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

