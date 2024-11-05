package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsProductGroupFilters;
import org.openapitools.server.api.model.CatalogsProductGroupStatus;
import org.openapitools.server.api.model.CatalogsProductGroupType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailProductGroup   {
  


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
  private Boolean isFeatured;
  private CatalogsProductGroupType type;
  private CatalogsProductGroupStatus status;
  private Integer createdAt;
  private Integer updatedAt;
  private String catalogId;
  private String feedId;
  private String country;
  private String locale;

  public CatalogsRetailProductGroup () {

  }

  public CatalogsRetailProductGroup (CatalogTypeEnum catalogType, String id, String name, String description, CatalogsProductGroupFilters filters, Boolean isFeatured, CatalogsProductGroupType type, CatalogsProductGroupStatus status, Integer createdAt, Integer updatedAt, String catalogId, String feedId, String country, String locale) {
    this.catalogType = catalogType;
    this.id = id;
    this.name = name;
    this.description = description;
    this.filters = filters;
    this.isFeatured = isFeatured;
    this.type = type;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.catalogId = catalogId;
    this.feedId = feedId;
    this.country = country;
    this.locale = locale;
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

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

    
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductGroup catalogsRetailProductGroup = (CatalogsRetailProductGroup) o;
    return Objects.equals(catalogType, catalogsRetailProductGroup.catalogType) &&
        Objects.equals(id, catalogsRetailProductGroup.id) &&
        Objects.equals(name, catalogsRetailProductGroup.name) &&
        Objects.equals(description, catalogsRetailProductGroup.description) &&
        Objects.equals(filters, catalogsRetailProductGroup.filters) &&
        Objects.equals(isFeatured, catalogsRetailProductGroup.isFeatured) &&
        Objects.equals(type, catalogsRetailProductGroup.type) &&
        Objects.equals(status, catalogsRetailProductGroup.status) &&
        Objects.equals(createdAt, catalogsRetailProductGroup.createdAt) &&
        Objects.equals(updatedAt, catalogsRetailProductGroup.updatedAt) &&
        Objects.equals(catalogId, catalogsRetailProductGroup.catalogId) &&
        Objects.equals(feedId, catalogsRetailProductGroup.feedId) &&
        Objects.equals(country, catalogsRetailProductGroup.country) &&
        Objects.equals(locale, catalogsRetailProductGroup.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, id, name, description, filters, isFeatured, type, status, createdAt, updatedAt, catalogId, feedId, country, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroup {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
