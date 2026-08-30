package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOInsertionOrderStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class SsioInsertionOrdersStatusGetByAdAccount200Response   {
  
  private String bookmark;

  private List<@Valid SSIOInsertionOrderStatus> items = new ArrayList<>();

  /**
   **/
  public SsioInsertionOrdersStatusGetByAdAccount200Response bookmark(String bookmark) {
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
   **/
  public SsioInsertionOrdersStatusGetByAdAccount200Response items(List<@Valid SSIOInsertionOrderStatus> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  public List<@Valid SSIOInsertionOrderStatus> getItems() {
    return items;
  }
  public void setItems(List<@Valid SSIOInsertionOrderStatus> items) {
    this.items = items;
  }

  public SsioInsertionOrdersStatusGetByAdAccount200Response addItemsItem(SSIOInsertionOrderStatus itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
    SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount200Response = (SsioInsertionOrdersStatusGetByAdAccount200Response) o;
    return Objects.equals(this.bookmark, ssioInsertionOrdersStatusGetByAdAccount200Response.bookmark) &&
        Objects.equals(this.items, ssioInsertionOrdersStatusGetByAdAccount200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsioInsertionOrdersStatusGetByAdAccount200Response {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

