package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupFilters;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsProductGroup   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private String id;
  private String name;
  private String description;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private Integer createdAt;
  private Integer updatedAt;
  private String catalogId;

  public CatalogsCreativeAssetsProductGroup () {

  }

  public CatalogsCreativeAssetsProductGroup (CatalogTypeEnum catalogType, String id, String name, String description, CatalogsCreativeAssetsProductGroupFilters filters, Integer createdAt, Integer updatedAt, String catalogId) {
    this.catalogType = catalogType;
    this.id = id;
    this.name = name;
    this.description = description;
    this.filters = filters;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("updated_at")
  public Integer getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
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
    return Objects.equals(catalogType, catalogsCreativeAssetsProductGroup.catalogType) &&
        Objects.equals(id, catalogsCreativeAssetsProductGroup.id) &&
        Objects.equals(name, catalogsCreativeAssetsProductGroup.name) &&
        Objects.equals(description, catalogsCreativeAssetsProductGroup.description) &&
        Objects.equals(filters, catalogsCreativeAssetsProductGroup.filters) &&
        Objects.equals(createdAt, catalogsCreativeAssetsProductGroup.createdAt) &&
        Objects.equals(updatedAt, catalogsCreativeAssetsProductGroup.updatedAt) &&
        Objects.equals(catalogId, catalogsCreativeAssetsProductGroup.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, createdAt, updatedAt, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsProductGroup {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
