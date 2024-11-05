package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilters;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object to list products for a given feed_id and product group filter.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object to list products for a given feed_id and product group filter.")
public class CatalogsListProductsByFeedBasedFilter   {
  
  private String feedId;

  private CatalogsProductGroupFilters filters;

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   **/
  public CatalogsListProductsByFeedBasedFilter feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group filter.")
  @JsonProperty("feed_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getFeedId() {
    return feedId;
  }
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
  @JsonProperty("filters")
  @NotNull
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

