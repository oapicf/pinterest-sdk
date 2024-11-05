package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupFilters;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request object to list products for a given feed_id and product group filter.
 */

@Schema(name = "CatalogsListProductsByFeedBasedFilter", description = "Request object to list products for a given feed_id and product group filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsListProductsByFeedBasedFilter implements CatalogsListProductsByFilterRequest {

  private String feedId;

  private CatalogsProductGroupFilters filters;

  public CatalogsListProductsByFeedBasedFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsListProductsByFeedBasedFilter(String feedId, CatalogsProductGroupFilters filters) {
    this.feedId = feedId;
    this.filters = filters;
  }

  public CatalogsListProductsByFeedBasedFilter feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   * @return feedId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "feed_id", example = "2680059592705", description = "Catalog Feed id pertaining to the catalog product group filter.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsListProductsByFeedBasedFilter filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @NotNull @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.REQUIRED)
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

