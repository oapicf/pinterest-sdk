package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Audience;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SharedAudiencesForBusinessList200Response  {
  
  @ApiModelProperty(value = "")
  private String bookmark;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid Audience> items = new ArrayList<>();
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
  public SharedAudiencesForBusinessList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid Audience> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid Audience> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public SharedAudiencesForBusinessList200Response items(List<@Valid Audience> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public SharedAudiencesForBusinessList200Response addItemsItem(Audience itemsItem) {
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
    SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList200Response = (SharedAudiencesForBusinessList200Response) o;
    return Objects.equals(this.bookmark, sharedAudiencesForBusinessList200Response.bookmark) &&
        Objects.equals(this.items, sharedAudiencesForBusinessList200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAudiencesForBusinessList200Response {\n");
    
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

