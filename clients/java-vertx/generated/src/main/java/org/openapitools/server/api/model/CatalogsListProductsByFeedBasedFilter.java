package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupFilters;

/**
 * Request object to list products for a given feed_id and product group filter.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsListProductsByFeedBasedFilter   {
  
  private String feedId;
  private CatalogsProductGroupFilters filters;

  public CatalogsListProductsByFeedBasedFilter () {

  }

  public CatalogsListProductsByFeedBasedFilter (String feedId, CatalogsProductGroupFilters filters) {
    this.feedId = feedId;
    this.filters = filters;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("filters")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsListProductsByFeedBasedFilter catalogsListProductsByFeedBasedFilter = (CatalogsListProductsByFeedBasedFilter) o;
    return Objects.equals(feedId, catalogsListProductsByFeedBasedFilter.feedId) &&
        Objects.equals(filters, catalogsListProductsByFeedBasedFilter.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsListProductsByFeedBasedFilter {\n");
    
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
