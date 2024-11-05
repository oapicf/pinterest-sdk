package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.CatalogsFeedProcessingResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * FeedProcessingResultsList200Response
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FeedProcessingResultsList200Response   {
  @JsonProperty("items")
  
  private List<CatalogsFeedProcessingResult> items = new ArrayList<>();

  @JsonProperty("bookmark")
  private String bookmark;

  public FeedProcessingResultsList200Response items(List<CatalogsFeedProcessingResult> items) {
    this.items = items;
    return this;
  }

  public FeedProcessingResultsList200Response addItemsItem(CatalogsFeedProcessingResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @ApiModelProperty(required = true, value = "")
  public List<CatalogsFeedProcessingResult> getItems() {
    return items;
  }

  public void setItems(List<CatalogsFeedProcessingResult> items) {
    this.items = items;
  }

  public FeedProcessingResultsList200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

  /**
   * Get bookmark
   * @return bookmark
   */
  @ApiModelProperty(value = "")
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
    FeedProcessingResultsList200Response feedProcessingResultsList200Response = (FeedProcessingResultsList200Response) o;
    return Objects.equals(this.items, feedProcessingResultsList200Response.items) &&
        Objects.equals(this.bookmark, feedProcessingResultsList200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedProcessingResultsList200Response {\n");
    
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

