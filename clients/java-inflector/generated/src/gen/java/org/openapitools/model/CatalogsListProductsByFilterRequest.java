package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsListProductsByFilterRequestOneOf;
import org.openapitools.model.CatalogsProductGroupFilters;



/**
 * Request object to list products for a given product group filter.
 **/

@ApiModel(description = "Request object to list products for a given product group filter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsListProductsByFilterRequest   {
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  /**
   * Catalog Feed id pertaining to the catalog product group filter.
   **/
  public CatalogsListProductsByFilterRequest feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group filter.")
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  public CatalogsListProductsByFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest = (CatalogsListProductsByFilterRequest) o;
    return Objects.equals(feedId, catalogsListProductsByFilterRequest.feedId) &&
        Objects.equals(filters, catalogsListProductsByFilterRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsListProductsByFilterRequest {\n");
    
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

