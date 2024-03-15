package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.CatalogsProductGroupFilters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object to list products for a given feed_id and product group filter.
 */
@ApiModel(description = "Request object to list products for a given feed_id and product group filter.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsListProductsByFilterRequestOneOf   {
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  public CatalogsListProductsByFilterRequestOneOf feedId(String feedId) {
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

  public CatalogsListProductsByFilterRequestOneOf filters(CatalogsProductGroupFilters filters) {
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
    CatalogsListProductsByFilterRequestOneOf catalogsListProductsByFilterRequestOneOf = (CatalogsListProductsByFilterRequestOneOf) o;
    return Objects.equals(this.feedId, catalogsListProductsByFilterRequestOneOf.feedId) &&
        Objects.equals(this.filters, catalogsListProductsByFilterRequestOneOf.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsListProductsByFilterRequestOneOf {\n");
    
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

