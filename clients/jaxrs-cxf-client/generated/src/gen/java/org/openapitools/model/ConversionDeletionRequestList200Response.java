package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionDeletionRequest;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionDeletionRequestList200Response  {
  
  @ApiModelProperty(value = "")

  private String bookmark;

  @ApiModelProperty(required = true, value = "")

  private List<ConversionDeletionRequest> items = new ArrayList<>();
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

  public ConversionDeletionRequestList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<ConversionDeletionRequest> getItems() {
    return items;
  }

  public void setItems(List<ConversionDeletionRequest> items) {
    this.items = items;
  }

  public ConversionDeletionRequestList200Response items(List<ConversionDeletionRequest> items) {
    this.items = items;
    return this;
  }

  public ConversionDeletionRequestList200Response addItemsItem(ConversionDeletionRequest itemsItem) {
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
    ConversionDeletionRequestList200Response conversionDeletionRequestList200Response = (ConversionDeletionRequestList200Response) o;
    return Objects.equals(this.bookmark, conversionDeletionRequestList200Response.bookmark) &&
        Objects.equals(this.items, conversionDeletionRequestList200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestList200Response {\n");
    
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

