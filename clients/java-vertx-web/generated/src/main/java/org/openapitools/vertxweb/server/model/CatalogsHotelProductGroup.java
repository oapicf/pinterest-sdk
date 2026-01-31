package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroupFilters;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroupType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelProductGroup   {
  
  private String catalogId;


  public enum CatalogTypeEnum {
    HOTEL("HOTEL");

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
  private Integer createdAt;
  private String description;
  private CatalogsHotelProductGroupFilters filters;
  private String id;
  private String name;
  private CatalogsHotelProductGroupType type;
  private Integer updatedAt;

  public CatalogsHotelProductGroup () {

  }

  public CatalogsHotelProductGroup (String catalogId, CatalogTypeEnum catalogType, Integer createdAt, String description, CatalogsHotelProductGroupFilters filters, String id, String name, CatalogsHotelProductGroupType type, Integer updatedAt) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.createdAt = createdAt;
    this.description = description;
    this.filters = filters;
    this.id = id;
    this.name = name;
    this.type = type;
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("filters")
  public CatalogsHotelProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsHotelProductGroupFilters filters) {
    this.filters = filters;
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

    
  @JsonProperty("type")
  public CatalogsHotelProductGroupType getType() {
    return type;
  }
  public void setType(CatalogsHotelProductGroupType type) {
    this.type = type;
  }

    
  @JsonProperty("updated_at")
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
    CatalogsHotelProductGroup catalogsHotelProductGroup = (CatalogsHotelProductGroup) o;
    return Objects.equals(catalogId, catalogsHotelProductGroup.catalogId) &&
        Objects.equals(catalogType, catalogsHotelProductGroup.catalogType) &&
        Objects.equals(createdAt, catalogsHotelProductGroup.createdAt) &&
        Objects.equals(description, catalogsHotelProductGroup.description) &&
        Objects.equals(filters, catalogsHotelProductGroup.filters) &&
        Objects.equals(id, catalogsHotelProductGroup.id) &&
        Objects.equals(name, catalogsHotelProductGroup.name) &&
        Objects.equals(type, catalogsHotelProductGroup.type) &&
        Objects.equals(updatedAt, catalogsHotelProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, description, filters, id, name, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelProductGroup {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
