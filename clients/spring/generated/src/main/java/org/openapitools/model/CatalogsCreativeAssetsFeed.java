package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Catalogs Creative Asset Feed object
 */

@Schema(name = "CatalogsCreativeAssetsFeed", description = "Catalogs Creative Asset Feed object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreativeAssetsFeed implements CatalogsFeed {

  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CatalogsFeedCredentials> credentials = JsonNullable.<CatalogsFeedCredentials>undefined();

  private Country defaultCountry;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<NullableCurrency> defaultCurrency = JsonNullable.<NullableCurrency>undefined();

  private String defaultLocale;

  private CatalogsFormat format;

  private String id;

  private String location;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule = JsonNullable.<CatalogsFeedProcessingSchedule>undefined();

  private CatalogsStatus status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public CatalogsCreativeAssetsFeed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsFeed(String catalogId, CatalogTypeEnum catalogType, OffsetDateTime createdAt, Country defaultCountry, String defaultLocale, CatalogsFormat format, String id, String location, String name, CatalogsStatus status, OffsetDateTime updatedAt) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.createdAt = createdAt;
    this.defaultCountry = defaultCountry;
    this.defaultLocale = defaultLocale;
    this.format = format;
    this.id = id;
    this.location = location;
    this.name = JsonNullable.of(name);
    this.status = status;
    this.updatedAt = updatedAt;
  }

  public CatalogsCreativeAssetsFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsFeed catalogType(CatalogTypeEnum catalogType) {
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

  @JsonProperty("catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsFeed createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsCreativeAssetsFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = JsonNullable.of(credentials);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @Valid 
  @Schema(name = "credentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentials")
  public JsonNullable<CatalogsFeedCredentials> getCredentials() {
    return credentials;
  }

  public void setCredentials(JsonNullable<CatalogsFeedCredentials> credentials) {
    this.credentials = credentials;
  }

  public CatalogsCreativeAssetsFeed defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   */
  @NotNull @Valid 
  @Schema(name = "default_country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  @JsonProperty("default_country")
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsCreativeAssetsFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = JsonNullable.of(defaultCurrency);
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
   */
  @Valid 
  @Schema(name = "default_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_currency")
  public JsonNullable<NullableCurrency> getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(JsonNullable<NullableCurrency> defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsCreativeAssetsFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
   */
  @NotNull 
  @Schema(name = "default_locale", description = "The locale used within a feed for product descriptions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }

  @JsonProperty("default_locale")
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsCreativeAssetsFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @NotNull @Valid 
  @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsCreativeAssetsFeed id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the feed entity.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "864344156814050986", description = "ID of the feed entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public CatalogsCreativeAssetsFeed location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  @NotNull @Pattern(regexp = "^(http|https|ftp|sftp)://") 
  @Schema(name = "location", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsCreativeAssetsFeed name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CatalogsCreativeAssetsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = JsonNullable.of(preferredProcessingSchedule);
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
   */
  @Valid 
  @Schema(name = "preferred_processing_schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_processing_schedule")
  public JsonNullable<CatalogsFeedProcessingSchedule> getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsCreativeAssetsFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsCreativeAssetsFeed updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    CatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed = (CatalogsCreativeAssetsFeed) o;
    return Objects.equals(this.catalogId, catalogsCreativeAssetsFeed.catalogId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsFeed.catalogType) &&
        Objects.equals(this.createdAt, catalogsCreativeAssetsFeed.createdAt) &&
        equalsNullable(this.credentials, catalogsCreativeAssetsFeed.credentials) &&
        Objects.equals(this.defaultCountry, catalogsCreativeAssetsFeed.defaultCountry) &&
        equalsNullable(this.defaultCurrency, catalogsCreativeAssetsFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsCreativeAssetsFeed.defaultLocale) &&
        Objects.equals(this.format, catalogsCreativeAssetsFeed.format) &&
        Objects.equals(this.id, catalogsCreativeAssetsFeed.id) &&
        Objects.equals(this.location, catalogsCreativeAssetsFeed.location) &&
        Objects.equals(this.name, catalogsCreativeAssetsFeed.name) &&
        equalsNullable(this.preferredProcessingSchedule, catalogsCreativeAssetsFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsCreativeAssetsFeed.status) &&
        Objects.equals(this.updatedAt, catalogsCreativeAssetsFeed.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, hashCodeNullable(credentials), defaultCountry, hashCodeNullable(defaultCurrency), defaultLocale, format, id, location, name, hashCodeNullable(preferredProcessingSchedule), status, updatedAt);
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
    sb.append("class CatalogsCreativeAssetsFeed {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

