package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOOrderLine;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SsioOrderLinesGetByAdAccount200Response  {
  
  @ApiModelProperty(required = true, value = "SSIO order lines by ad acount id")
 /**
   * SSIO order lines by ad acount id
  **/
  private List<SSIOOrderLine> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private String bookmark;
 /**
   * SSIO order lines by ad acount id
   * @return items
  **/
  @JsonProperty("items")
  public List<SSIOOrderLine> getItems() {
    return items;
  }

  public void setItems(List<SSIOOrderLine> items) {
    this.items = items;
  }

  public SsioOrderLinesGetByAdAccount200Response items(List<SSIOOrderLine> items) {
    this.items = items;
    return this;
  }

  public SsioOrderLinesGetByAdAccount200Response addItemsItem(SSIOOrderLine itemsItem) {
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

  public SsioOrderLinesGetByAdAccount200Response bookmark(String bookmark) {
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
    SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount200Response = (SsioOrderLinesGetByAdAccount200Response) o;
    return Objects.equals(this.items, ssioOrderLinesGetByAdAccount200Response.items) &&
        Objects.equals(this.bookmark, ssioOrderLinesGetByAdAccount200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioOrderLinesGetByAdAccount200Response {\n");
    
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

