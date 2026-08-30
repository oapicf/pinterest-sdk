package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsProductGroupFilters;
import com.prokarma.pkmst.model.CatalogsProductGroupStatus;
import com.prokarma.pkmst.model.CatalogsProductGroupType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsRetailProductGroup
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailProductGroup   {
  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("country")
  private String country;

  @JsonProperty("created_at")
  private Integer createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("filters")
  private CatalogsProductGroupFilters filters;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_featured")
  private Boolean isFeatured;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private CatalogsProductGroupStatus status;

  @JsonProperty("type")
  private CatalogsProductGroupType type;

  @JsonProperty("updated_at")
  private Integer updatedAt;

  public CatalogsRetailProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog ID pertaining to the product group.
   * @return catalogId
   */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog ID pertaining to the product group.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsRetailProductGroup catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailProductGroup country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CatalogsRetailProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
   */
  @ApiModelProperty(example = "1621350033000", value = "Unix timestamp in seconds of when catalog product group was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsRetailProductGroup description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsRetailProductGroup feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * id of the catalogs feed belonging to this catalog product group
   * @return feedId
   */
  @ApiModelProperty(example = "2680059592705", required = true, value = "id of the catalogs feed belonging to this catalog product group")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsRetailProductGroup filters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilters getFilters() {
    return filters;
  }

  public void setFilters(CatalogsProductGroupFilters filters) {
    this.filters = filters;
  }

  public CatalogsRetailProductGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the catalog product group.
   * @return id
   */
  @ApiModelProperty(example = "443727193917", required = true, value = "ID of the catalog product group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsRetailProductGroup isFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   */
  @ApiModelProperty(value = "boolean indicator of whether the product group is being featured or not")
  public Boolean getIsFeatured() {
    return isFeatured;
  }

  public void setIsFeatured(Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsRetailProductGroup locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  @ApiModelProperty(value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public CatalogsRetailProductGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of catalog product group
   * @return name
   */
  @ApiModelProperty(example = "Most Popular", value = "Name of catalog product group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsRetailProductGroup status(CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public CatalogsProductGroupStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsProductGroupStatus status) {
    this.status = status;
  }

  public CatalogsRetailProductGroup type(CatalogsProductGroupType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  public CatalogsRetailProductGroup updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
   */
  @ApiModelProperty(example = "1622742155000", value = "Unix timestamp in seconds of last time catalog product group was updated.")
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
    CatalogsRetailProductGroup catalogsRetailProductGroup = (CatalogsRetailProductGroup) o;
    return Objects.equals(this.catalogId, catalogsRetailProductGroup.catalogId) &&
        Objects.equals(this.catalogType, catalogsRetailProductGroup.catalogType) &&
        Objects.equals(this.country, catalogsRetailProductGroup.country) &&
        Objects.equals(this.createdAt, catalogsRetailProductGroup.createdAt) &&
        Objects.equals(this.description, catalogsRetailProductGroup.description) &&
        Objects.equals(this.feedId, catalogsRetailProductGroup.feedId) &&
        Objects.equals(this.filters, catalogsRetailProductGroup.filters) &&
        Objects.equals(this.id, catalogsRetailProductGroup.id) &&
        Objects.equals(this.isFeatured, catalogsRetailProductGroup.isFeatured) &&
        Objects.equals(this.locale, catalogsRetailProductGroup.locale) &&
        Objects.equals(this.name, catalogsRetailProductGroup.name) &&
        Objects.equals(this.status, catalogsRetailProductGroup.status) &&
        Objects.equals(this.type, catalogsRetailProductGroup.type) &&
        Objects.equals(this.updatedAt, catalogsRetailProductGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, country, createdAt, description, feedId, filters, id, isFeatured, locale, name, status, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroup {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

