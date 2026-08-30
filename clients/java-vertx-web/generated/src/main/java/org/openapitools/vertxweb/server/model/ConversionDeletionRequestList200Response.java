package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionDeletionRequest;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionDeletionRequestList200Response   {
  
  private String bookmark;
  private List<ConversionDeletionRequest> items = new ArrayList<>();

  public ConversionDeletionRequestList200Response () {

  }

  public ConversionDeletionRequestList200Response (String bookmark, List<ConversionDeletionRequest> items) {
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
  public List<ConversionDeletionRequest> getItems() {
    return items;
  }
  public void setItems(List<ConversionDeletionRequest> items) {
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
    ConversionDeletionRequestList200Response conversionDeletionRequestList200Response = (ConversionDeletionRequestList200Response) o;
    return Objects.equals(bookmark, conversionDeletionRequestList200Response.bookmark) &&
        Objects.equals(items, conversionDeletionRequestList200Response.items);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
