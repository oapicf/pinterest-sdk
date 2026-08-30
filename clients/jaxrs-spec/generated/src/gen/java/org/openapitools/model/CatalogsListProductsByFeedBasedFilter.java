package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request object to list products for a given feed_id and product group filter.
 **/
@ApiModel(description = "Request object to list products for a given feed_id and product group filter.")
@JsonTypeName("CatalogsListProductsByFeedBasedFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsListProductsByFeedBasedFilter   {
  private String feedId;
  private CatalogsProductGroupFilters filters;

  public CatalogsListProductsByFeedBasedFilter() {
  }

  @JsonCreator
  public CatalogsListProductsByFeedBasedFilter(
    @JsonProperty(required = true, value = "feed_id") String feedId,
    @JsonProperty(required = true, value = "filters") CatalogsProductGroupFilters filters
  ) {
    this.feedId = feedId;
    this.filters = filters;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   **/
  public CatalogsListProductsByFeedBasedFilter feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group filter.")
  @JsonProperty(required = true, value = "feed_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getFeedId() {
    return feedId;
  }

  @JsonProperty(required = true, value = "feed_id")
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  public CatalogsListProductsByFeedBasedFilter filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "filters")
  @NotNull @Valid public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  @JsonProperty(required = true, value = "filters")
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
