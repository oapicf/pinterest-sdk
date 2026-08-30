package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object for creating a creative assets product group.
 */
public class CatalogsCreativeAssetsProductGroupCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog ID pertaining to the product group.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsCreativeAssetsProductGroupFilters filters;

  @JsonProperty("name")
  private String name;

  /**
   * Catalog ID pertaining to the product group.
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

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
   * 
   * @return filters
   */
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
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
    CatalogsCreativeAssetsProductGroupCreateRequest catalogsCreativeAssetsProductGroupCreateRequest = (CatalogsCreativeAssetsProductGroupCreateRequest) o;
    return Objects.equals(this.catalogId, catalogsCreativeAssetsProductGroupCreateRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsProductGroupCreateRequest.catalogType) &&
        Objects.equals(this.description, catalogsCreativeAssetsProductGroupCreateRequest.description) &&
        Objects.equals(this.filters, catalogsCreativeAssetsProductGroupCreateRequest.filters) &&
        Objects.equals(this.name, catalogsCreativeAssetsProductGroupCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, description, filters, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroupCreateRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
