package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsVerticalProductGroup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupsList200Response   {
  
  private String bookmark;
  private List<CatalogsVerticalProductGroup> items = new ArrayList<>();

  public CatalogsProductGroupsList200Response () {

  }

  public CatalogsProductGroupsList200Response (String bookmark, List<CatalogsVerticalProductGroup> items) {
    this.bookmark = bookmark;
    this.items = items;
  }

    
  @JsonProperty("bookmark")
  public String getBookmark() {
    return bookmark;
  }
  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }

    
  @JsonProperty("items")
  public List<CatalogsVerticalProductGroup> getItems() {
    return items;
  }
  public void setItems(List<CatalogsVerticalProductGroup> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupsList200Response catalogsProductGroupsList200Response = (CatalogsProductGroupsList200Response) o;
    return Objects.equals(bookmark, catalogsProductGroupsList200Response.bookmark) &&
        Objects.equals(items, catalogsProductGroupsList200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmark, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupsList200Response {\n");
    
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
