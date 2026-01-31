package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProduct;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("catalogs_product_group_pins_list_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsProductGroupPinsList200Response   {
  private String bookmark;
  private @Valid List<@Valid CatalogsProduct> items = new ArrayList<>();

  public CatalogsProductGroupPinsList200Response() {
  }

  @JsonCreator
  public CatalogsProductGroupPinsList200Response(
    @JsonProperty(required = true, value = "items") List<@Valid CatalogsProduct> items
  ) {
    this.items = items;
  }

  /**
   **/
  public CatalogsProductGroupPinsList200Response bookmark(String bookmark) {
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
   * Pins
   **/
  public CatalogsProductGroupPinsList200Response items(List<@Valid CatalogsProduct> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pins")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid CatalogsProduct> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid CatalogsProduct> items) {
    this.items = items;
  }

  public CatalogsProductGroupPinsList200Response addItemsItem(CatalogsProduct itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public CatalogsProductGroupPinsList200Response removeItemsItem(CatalogsProduct itemsItem) {
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
    CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList200Response = (CatalogsProductGroupPinsList200Response) o;
    return Objects.equals(this.bookmark, catalogsProductGroupPinsList200Response.bookmark) &&
        Objects.equals(this.items, catalogsProductGroupPinsList200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPinsList200Response {\n");
    
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

