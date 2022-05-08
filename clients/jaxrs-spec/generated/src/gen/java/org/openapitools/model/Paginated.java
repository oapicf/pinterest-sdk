package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Paginated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class Paginated   {
  
  private @Valid List<Object> items = new ArrayList<Object>();
  private @Valid String bookmark;

  /**
   **/
  public Paginated items(List<Object> items) {
    this.items = items;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  public List<Object> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<Object> items) {
    this.items = items;
  }

  public Paginated addItemsItem(Object itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Object>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public Paginated removeItemsItem(Object itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

    return this;
  }
/**
   **/
  public Paginated bookmark(String bookmark) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paginated paginated = (Paginated) o;
    return Objects.equals(this.items, paginated.items) &&
        Objects.equals(this.bookmark, paginated.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paginated {\n");
    
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

