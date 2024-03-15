package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroup;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupFilters;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupStatus;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupType;
import org.openapitools.vertxweb.server.model.CatalogsRetailProductGroup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalProductGroup   {
  


  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

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
  private CatalogsProductGroupFilters filters;
  private Integer createdAt;
  private Integer updatedAt;
  private String catalogId;
  private Boolean isFeatured;
  private CatalogsProductGroupType type;
  private CatalogsProductGroupStatus status;


  public enum FeedIdEnum {
    NULL("null");

    private String value;

    FeedIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FeedIdEnum feedId;

  public CatalogsVerticalProductGroup () {

  }

  public CatalogsVerticalProductGroup (CatalogTypeEnum catalogType, String id, String name, String description, CatalogsProductGroupFilters filters, Integer createdAt, Integer updatedAt, String catalogId, Boolean isFeatured, CatalogsProductGroupType type, CatalogsProductGroupStatus status, FeedIdEnum feedId) {
    this.catalogType = catalogType;
    this.id = id;
    this.name = name;
    this.description = description;
    this.filters = filters;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.catalogId = catalogId;
    this.isFeatured = isFeatured;
    this.type = type;
    this.status = status;
    this.feedId = feedId;
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
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsProductGroupFilters filters) {
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

    
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

    
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }
  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

    
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

    
  @JsonProperty("feed_id")
  public FeedIdEnum getFeedId() {
    return feedId;
  }
  public void setFeedId(FeedIdEnum feedId) {
    this.feedId = feedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsVerticalProductGroup catalogsVerticalProductGroup = (CatalogsVerticalProductGroup) o;
    return Objects.equals(catalogType, catalogsVerticalProductGroup.catalogType) &&
        Objects.equals(id, catalogsVerticalProductGroup.id) &&
        Objects.equals(name, catalogsVerticalProductGroup.name) &&
        Objects.equals(description, catalogsVerticalProductGroup.description) &&
        Objects.equals(filters, catalogsVerticalProductGroup.filters) &&
        Objects.equals(createdAt, catalogsVerticalProductGroup.createdAt) &&
        Objects.equals(updatedAt, catalogsVerticalProductGroup.updatedAt) &&
        Objects.equals(catalogId, catalogsVerticalProductGroup.catalogId) &&
        Objects.equals(isFeatured, catalogsVerticalProductGroup.isFeatured) &&
        Objects.equals(type, catalogsVerticalProductGroup.type) &&
        Objects.equals(status, catalogsVerticalProductGroup.status) &&
        Objects.equals(feedId, catalogsVerticalProductGroup.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, createdAt, updatedAt, catalogId, isFeatured, type, status, feedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroup {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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
