package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroup;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroup;
import org.openapitools.vertxweb.server.model.CatalogsHotelProductGroupType;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupStatus;
import org.openapitools.vertxweb.server.model.CatalogsRetailProductGroup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalProductGroup   {
  
  private String catalogId;


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
  private String country;
  private Integer createdAt;
  private String description;
  private String feedId;
  private CatalogsCreativeAssetsProductGroupFilters filters;
  private String id;
  private Boolean isFeatured;
  private String locale;
  private String name;
  private CatalogsProductGroupStatus status;
  private CatalogsHotelProductGroupType type;
  private Integer updatedAt;

  public CatalogsVerticalProductGroup () {

  }

  public CatalogsVerticalProductGroup (String catalogId, CatalogTypeEnum catalogType, String country, Integer createdAt, String description, String feedId, CatalogsCreativeAssetsProductGroupFilters filters, String id, Boolean isFeatured, String locale, String name, CatalogsProductGroupStatus status, CatalogsHotelProductGroupType type, Integer updatedAt) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.country = country;
    this.createdAt = createdAt;
    this.description = description;
    this.feedId = feedId;
    this.filters = filters;
    this.id = id;
    this.isFeatured = isFeatured;
    this.locale = locale;
    this.name = name;
    this.status = status;
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

    
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
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

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("filters")
  public CatalogsCreativeAssetsProductGroupFilters getFilters() {
    return filters;
  }
  public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
    this.filters = filters;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("is_featured")
  public Boolean getIsFeatured() {
    return isFeatured;
  }
  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

    
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
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
    CatalogsVerticalProductGroup catalogsVerticalProductGroup = (CatalogsVerticalProductGroup) o;
    return Objects.equals(catalogId, catalogsVerticalProductGroup.catalogId) &&
        Objects.equals(catalogType, catalogsVerticalProductGroup.catalogType) &&
        Objects.equals(country, catalogsVerticalProductGroup.country) &&
        Objects.equals(createdAt, catalogsVerticalProductGroup.createdAt) &&
        Objects.equals(description, catalogsVerticalProductGroup.description) &&
        Objects.equals(feedId, catalogsVerticalProductGroup.feedId) &&
        Objects.equals(filters, catalogsVerticalProductGroup.filters) &&
        Objects.equals(id, catalogsVerticalProductGroup.id) &&
        Objects.equals(isFeatured, catalogsVerticalProductGroup.isFeatured) &&
        Objects.equals(locale, catalogsVerticalProductGroup.locale) &&
        Objects.equals(name, catalogsVerticalProductGroup.name) &&
        Objects.equals(status, catalogsVerticalProductGroup.status) &&
        Objects.equals(type, catalogsVerticalProductGroup.type) &&
        Objects.equals(updatedAt, catalogsVerticalProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, createdAt, description, feedId, filters, id, isFeatured, locale, name, status, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalProductGroup {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
