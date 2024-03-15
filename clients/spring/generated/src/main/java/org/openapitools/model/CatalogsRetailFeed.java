package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import org.springframework.format.annotation.DateTimeFormat;
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
 * Catalogs Retail Feed object
 */

@Schema(name = "CatalogsRetailFeed", description = "Catalogs Retail Feed object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsRetailFeed implements CatalogsFeed {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private CatalogsFormat format;

  private CatalogsType catalogType;

  private JsonNullable<CatalogsFeedCredentials> credentials = JsonNullable.<CatalogsFeedCredentials>undefined();

  private String location;

  private JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule = JsonNullable.<CatalogsFeedProcessingSchedule>undefined();

  private CatalogsStatus status;

  private JsonNullable<NullableCurrency> defaultCurrency = JsonNullable.<NullableCurrency>undefined();

  private String defaultLocale;

  private Country defaultCountry;

  private JsonNullable<ProductAvailabilityType> defaultAvailability = JsonNullable.<ProductAvailabilityType>undefined();

  public CatalogsRetailFeed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailFeed(String name, CatalogsFormat format, CatalogsType catalogType, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status, NullableCurrency defaultCurrency, String defaultLocale, Country defaultCountry, ProductAvailabilityType defaultAvailability) {
    this.name = JsonNullable.of(name);
    this.format = format;
    this.catalogType = catalogType;
    this.credentials = JsonNullable.of(credentials);
    this.location = location;
    this.preferredProcessingSchedule = JsonNullable.of(preferredProcessingSchedule);
    this.status = status;
    this.defaultCurrency = JsonNullable.of(defaultCurrency);
    this.defaultLocale = defaultLocale;
    this.defaultCountry = defaultCountry;
    this.defaultAvailability = JsonNullable.of(defaultAvailability);
  }

  public CatalogsRetailFeed createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", example = "2022-03-14T15:15:22Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsRetailFeed id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsRetailFeed updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", example = "2022-03-14T15:16:34Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsRetailFeed name(String name) {
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

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CatalogsRetailFeed format(CatalogsFormat format) {
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

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsRetailFeed catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
  */
  @NotNull @Valid 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = JsonNullable.of(credentials);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
  */
  @NotNull @Valid 
  @Schema(name = "credentials", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("credentials")
  public JsonNullable<CatalogsFeedCredentials> getCredentials() {
    return credentials;
  }

  public void setCredentials(JsonNullable<CatalogsFeedCredentials> credentials) {
    this.credentials = credentials;
  }

  public CatalogsRetailFeed location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
  */
  @NotNull 
  @Schema(name = "location", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsRetailFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = JsonNullable.of(preferredProcessingSchedule);
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
  */
  @NotNull @Valid 
  @Schema(name = "preferred_processing_schedule", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preferred_processing_schedule")
  public JsonNullable<CatalogsFeedProcessingSchedule> getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsRetailFeed status(CatalogsStatus status) {
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

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsRetailFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = JsonNullable.of(defaultCurrency);
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
  */
  @NotNull @Valid 
  @Schema(name = "default_currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_currency")
  public JsonNullable<NullableCurrency> getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(JsonNullable<NullableCurrency> defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsRetailFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
  */
  @NotNull 
  @Schema(name = "default_locale", example = "en-US", description = "The locale used within a feed for product descriptions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsRetailFeed defaultCountry(Country defaultCountry) {
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

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsRetailFeed defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = JsonNullable.of(defaultAvailability);
    return this;
  }

  /**
   * Get defaultAvailability
   * @return defaultAvailability
  */
  @NotNull @Valid 
  @Schema(name = "default_availability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_availability")
  public JsonNullable<ProductAvailabilityType> getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(JsonNullable<ProductAvailabilityType> defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFeed catalogsRetailFeed = (CatalogsRetailFeed) o;
    return Objects.equals(this.createdAt, catalogsRetailFeed.createdAt) &&
        Objects.equals(this.id, catalogsRetailFeed.id) &&
        Objects.equals(this.updatedAt, catalogsRetailFeed.updatedAt) &&
        Objects.equals(this.name, catalogsRetailFeed.name) &&
        Objects.equals(this.format, catalogsRetailFeed.format) &&
        Objects.equals(this.catalogType, catalogsRetailFeed.catalogType) &&
        Objects.equals(this.credentials, catalogsRetailFeed.credentials) &&
        Objects.equals(this.location, catalogsRetailFeed.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsRetailFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsRetailFeed.status) &&
        Objects.equals(this.defaultCurrency, catalogsRetailFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsRetailFeed.defaultLocale) &&
        Objects.equals(this.defaultCountry, catalogsRetailFeed.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsRetailFeed.defaultAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, defaultAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeed {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
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

