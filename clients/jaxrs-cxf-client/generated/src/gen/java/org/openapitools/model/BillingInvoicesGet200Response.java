package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoice;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingInvoicesGet200Response  {
  
  @ApiModelProperty(value = "")

  private String bookmark;

  @ApiModelProperty(required = true, value = "")

  private List<BillingInvoice> items = new ArrayList<>();
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

  public BillingInvoicesGet200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<BillingInvoice> getItems() {
    return items;
  }

  public void setItems(List<BillingInvoice> items) {
    this.items = items;
  }

  public BillingInvoicesGet200Response items(List<BillingInvoice> items) {
    this.items = items;
    return this;
  }

  public BillingInvoicesGet200Response addItemsItem(BillingInvoice itemsItem) {
    this.items.add(itemsItem);
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
    BillingInvoicesGet200Response billingInvoicesGet200Response = (BillingInvoicesGet200Response) o;
    return Objects.equals(this.bookmark, billingInvoicesGet200Response.bookmark) &&
        Objects.equals(this.items, billingInvoicesGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoicesGet200Response {\n");
    
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

