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

public class CatalogsCreativeAssetsProductGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog ID pertaining to the product group.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("filters")
  private CatalogsCreativeAssetsProductGroupFilters filters;

  /**
   * ID of the catalog product group.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Name of catalog product group
   */
  @JsonProperty("name")
  private String name;

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   */
  @JsonProperty("updated_at")
  private Integer updatedAt;

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
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
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
   * ID of the catalog product group.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of catalog product group
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
   */
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsProductGroup catalogsCreativeAssetsProductGroup = (CatalogsCreativeAssetsProductGroup) o;
    return Objects.equals(this.catalogId, catalogsCreativeAssetsProductGroup.catalogId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsProductGroup.catalogType) &&
        Objects.equals(this.createdAt, catalogsCreativeAssetsProductGroup.createdAt) &&
        Objects.equals(this.description, catalogsCreativeAssetsProductGroup.description) &&
        Objects.equals(this.filters, catalogsCreativeAssetsProductGroup.filters) &&
        Objects.equals(this.id, catalogsCreativeAssetsProductGroup.id) &&
        Objects.equals(this.name, catalogsCreativeAssetsProductGroup.name) &&
        Objects.equals(this.updatedAt, catalogsCreativeAssetsProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, description, filters, id, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroup {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
