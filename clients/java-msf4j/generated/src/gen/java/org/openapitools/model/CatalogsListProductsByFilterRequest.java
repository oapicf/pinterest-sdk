package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsListProductsByFeedBasedFilter;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest;
import org.openapitools.model.Country;

/**
 * Request object to list products for a given product group filter.
 */
@ApiModel(description = "Request object to list products for a given product group filter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsListProductsByFilterRequest   {
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  public CatalogsListProductsByFilterRequest feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Catalog Feed id pertaining to the catalog product group filter.
   * @return feedId
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the catalog product group filter.")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsListProductsByFilterRequest filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.feedId, catalogsListProductsByFilterRequest.feedId) &&
        Objects.equals(this.filters, catalogsListProductsByFilterRequest.filters);
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

