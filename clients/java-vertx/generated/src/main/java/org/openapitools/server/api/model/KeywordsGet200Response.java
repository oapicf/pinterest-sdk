package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.Keyword;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsGet200Response   {
  
  private List<Keyword> items = new ArrayList<>();
  private String bookmark;

  public KeywordsGet200Response () {

  }

  public KeywordsGet200Response (List<Keyword> items, String bookmark) {
    this.items = items;
    this.bookmark = bookmark;
  }

    
  @JsonProperty("items")
  public List<Keyword> getItems() {
    return items;
  }
  public void setItems(List<Keyword> items) {
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
    KeywordsGet200Response keywordsGet200Response = (KeywordsGet200Response) o;
    return Objects.equals(items, keywordsGet200Response.items) &&
        Objects.equals(bookmark, keywordsGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsGet200Response {\n");
    
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
