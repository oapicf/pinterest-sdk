package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFiltersRequest;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object for creating a product group.
 */
public class CatalogsProductGroupCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description;

  /**
   * Catalog Feed id pertaining to the catalog product group.
   */
  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFiltersRequest filters;

  /**
   * boolean indicator of whether the product group is being featured or not
   */
  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("name")
  private String name;

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Catalog Feed id pertaining to the catalog product group.
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
  public CatalogsProductGroupFiltersRequest getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFiltersRequest filters) {
    this.filters = filters;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   */
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest = (CatalogsProductGroupCreateRequest) o;
    return Objects.equals(this.description, catalogsProductGroupCreateRequest.description) &&
        Objects.equals(this.feedId, catalogsProductGroupCreateRequest.feedId) &&
        Objects.equals(this.filters, catalogsProductGroupCreateRequest.filters) &&
        Objects.equals(this.isFeatured, catalogsProductGroupCreateRequest.isFeatured) &&
        Objects.equals(this.name, catalogsProductGroupCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, filters, isFeatured, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupCreateRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
