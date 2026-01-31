package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupFilters;
import org.openapitools.model.CatalogsProductGroupStatus;
import org.openapitools.model.CatalogsProductGroupType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsRetailProductGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsRetailProductGroup implements CatalogsVerticalProductGroup {

  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private JsonNullable<String> country = JsonNullable.<String>undefined();

  private @Nullable Integer createdAt;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> feedId = JsonNullable.<String>undefined();

  private CatalogsProductGroupFilters filters;

  private String id;

  @Deprecated
  private @Nullable Boolean isFeatured;

  private JsonNullable<String> locale = JsonNullable.<String>undefined();

  private @Nullable String name;

  private @Nullable CatalogsProductGroupStatus status;

  private CatalogsProductGroupType type;

  private @Nullable Integer updatedAt;

  public CatalogsRetailProductGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailProductGroup(String catalogId, CatalogTypeEnum catalogType, String feedId, CatalogsProductGroupFilters filters, String id, CatalogsProductGroupType type) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.feedId = JsonNullable.of(feedId);
    this.filters = filters;
    this.id = id;
    this.type = type;
  }

  public CatalogsRetailProductGroup catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail product group.
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "Catalog id pertaining to the retail product group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
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
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailProductGroup country(String country) {
    this.country = JsonNullable.of(country);
    return this;
  }

  /**
   * Get country
   * @return country
   */
  
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public JsonNullable<String> getCountry() {
    return country;
  }

  public void setCountry(JsonNullable<String> country) {
    this.country = country;
  }

  public CatalogsRetailProductGroup createdAt(@Nullable Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
   */
  
  @Schema(name = "created_at", example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsRetailProductGroup description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public CatalogsRetailProductGroup feedId(String feedId) {
    this.feedId = JsonNullable.of(feedId);
    return this;
  }

  /**
   * id of the catalogs feed belonging to this catalog product group
   * @return feedId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "feed_id", example = "2680059592705", description = "id of the catalogs feed belonging to this catalog product group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feed_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getFeedId() {
    return feedId;
  }

  public void setFeedId(JsonNullable<String> feedId) {
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
  @NotNull @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("filters")
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
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "443727193917", description = "ID of the catalog product group.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsRetailProductGroup isFeatured(@Nullable Boolean isFeatured) {
    this.isFeatured = isFeatured;
    return this;
  }

  /**
   * boolean indicator of whether the product group is being featured or not
   * @return isFeatured
   * @deprecated
   */
  
  @Schema(name = "is_featured", description = "boolean indicator of whether the product group is being featured or not", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_featured")
  @Deprecated
  public @Nullable Boolean getIsFeatured() {
    return isFeatured;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setIsFeatured(@Nullable Boolean isFeatured) {
    this.isFeatured = isFeatured;
  }

  public CatalogsRetailProductGroup locale(String locale) {
    this.locale = JsonNullable.of(locale);
    return this;
  }

  /**
   * Get locale
   * @return locale
   */
  
  @Schema(name = "locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public JsonNullable<String> getLocale() {
    return locale;
  }

  public void setLocale(JsonNullable<String> locale) {
    this.locale = locale;
  }

  public CatalogsRetailProductGroup name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of catalog product group
   * @return name
   */
  
  @Schema(name = "name", example = "Most Popular", description = "Name of catalog product group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CatalogsRetailProductGroup status(@Nullable CatalogsProductGroupStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable CatalogsProductGroupStatus getStatus() {
    return status;
  }

  public void setStatus(@Nullable CatalogsProductGroupStatus status) {
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
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public CatalogsProductGroupType getType() {
    return type;
  }

  public void setType(CatalogsProductGroupType type) {
    this.type = type;
  }

  public CatalogsRetailProductGroup updatedAt(@Nullable Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return updatedAt
   */
  
  @Schema(name = "updated_at", example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public @Nullable Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@Nullable Integer updatedAt) {
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
        equalsNullable(this.country, catalogsRetailProductGroup.country) &&
        Objects.equals(this.createdAt, catalogsRetailProductGroup.createdAt) &&
        equalsNullable(this.description, catalogsRetailProductGroup.description) &&
        Objects.equals(this.feedId, catalogsRetailProductGroup.feedId) &&
        Objects.equals(this.filters, catalogsRetailProductGroup.filters) &&
        Objects.equals(this.id, catalogsRetailProductGroup.id) &&
        Objects.equals(this.isFeatured, catalogsRetailProductGroup.isFeatured) &&
        equalsNullable(this.locale, catalogsRetailProductGroup.locale) &&
        Objects.equals(this.name, catalogsRetailProductGroup.name) &&
        Objects.equals(this.status, catalogsRetailProductGroup.status) &&
        Objects.equals(this.type, catalogsRetailProductGroup.type) &&
        Objects.equals(this.updatedAt, catalogsRetailProductGroup.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, hashCodeNullable(country), createdAt, hashCodeNullable(description), feedId, filters, id, isFeatured, hashCodeNullable(locale), name, status, type, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

