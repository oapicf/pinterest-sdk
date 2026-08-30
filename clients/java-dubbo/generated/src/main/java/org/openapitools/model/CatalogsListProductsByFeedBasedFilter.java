package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupFilters;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object to list products for a given feed_id and product group filter.
 */
public class CatalogsListProductsByFeedBasedFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   */
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   * @return feedId
   */
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * 
   * @return filters
   */
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
    return Objects.equals(this.feedId, catalogsListProductsByFeedBasedFilter.feedId) &&
        Objects.equals(this.filters, catalogsListProductsByFeedBasedFilter.filters);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
