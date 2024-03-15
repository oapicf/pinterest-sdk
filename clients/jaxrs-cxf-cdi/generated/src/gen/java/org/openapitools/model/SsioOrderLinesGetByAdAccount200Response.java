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
import org.openapitools.model.SSIOOrderLine;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class SsioOrderLinesGetByAdAccount200Response   {
  
  private List<@Valid SSIOOrderLine> items = new ArrayList<>();

  private String bookmark;

  /**
   * SSIO order lines by ad acount id
   **/
  public SsioOrderLinesGetByAdAccount200Response items(List<@Valid SSIOOrderLine> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "SSIO order lines by ad acount id")
  @JsonProperty("items")
  @NotNull
  public List<@Valid SSIOOrderLine> getItems() {
    return items;
  }
  public void setItems(List<@Valid SSIOOrderLine> items) {
    this.items = items;
  }

  public SsioOrderLinesGetByAdAccount200Response addItemsItem(SSIOOrderLine itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   **/
  public SsioOrderLinesGetByAdAccount200Response bookmark(String bookmark) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

