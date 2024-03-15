package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsFeedProcessingResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedProcessingResultsList200Response   {
  
  private List<CatalogsFeedProcessingResult> items = new ArrayList<>();
  private String bookmark;

  public FeedProcessingResultsList200Response () {

  }

  public FeedProcessingResultsList200Response (List<CatalogsFeedProcessingResult> items, String bookmark) {
    this.items = items;
    this.bookmark = bookmark;
  }

    
  @JsonProperty("items")
  public List<CatalogsFeedProcessingResult> getItems() {
    return items;
  }
  public void setItems(List<CatalogsFeedProcessingResult> items) {
    this.items = items;
  }

    
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
    FeedProcessingResultsList200Response feedProcessingResultsList200Response = (FeedProcessingResultsList200Response) o;
    return Objects.equals(items, feedProcessingResultsList200Response.items) &&
        Objects.equals(bookmark, feedProcessingResultsList200Response.bookmark);
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
