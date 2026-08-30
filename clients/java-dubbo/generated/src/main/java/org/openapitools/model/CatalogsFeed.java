package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeed;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsHotelFeed;
import org.openapitools.model.CatalogsRetailFeed;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Catalogs Feed object
 */
public class CatalogsFeed implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("credentials")
  private CatalogsFeedCredentials credentials;

  @JsonProperty("default_availability")
  private ProductAvailabilityType defaultAvailability;

  @JsonProperty("default_country")
  private Country defaultCountry;

  @JsonProperty("default_currency")
  private NullableCurrency defaultCurrency;

  /**
   * The locale used within a feed for product descriptions.
   */
  @JsonProperty("default_locale")
  private String defaultLocale;

  @JsonProperty("format")
  private CatalogsFormat format;

  /**
   * ID of the feed entity.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   */
  @JsonProperty("location")
  private String location;

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   */
  @JsonProperty("name")
  private String name;

  @JsonProperty("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("status")
  private CatalogsStatus status;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt;

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

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
   * 
   * @return createdAt
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   * @return credentials
   */
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * 
   * @return defaultAvailability
   */
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  /**
   * 
   * @return defaultCountry
   */
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   * 
   * @return defaultCurrency
   */
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
   */
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * 
   * @return format
   */
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * ID of the feed entity.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return preferredProcessingSchedule
   */
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   * 
   * @return status
   */
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   * 
   * @return updatedAt
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
   */
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
    CatalogsFeed catalogsFeed = (CatalogsFeed) o;
    return Objects.equals(this.catalogType, catalogsFeed.catalogType) &&
        Objects.equals(this.createdAt, catalogsFeed.createdAt) &&
        Objects.equals(this.credentials, catalogsFeed.credentials) &&
        Objects.equals(this.defaultAvailability, catalogsFeed.defaultAvailability) &&
        Objects.equals(this.defaultCountry, catalogsFeed.defaultCountry) &&
        Objects.equals(this.defaultCurrency, catalogsFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsFeed.defaultLocale) &&
        Objects.equals(this.format, catalogsFeed.format) &&
        Objects.equals(this.id, catalogsFeed.id) &&
        Objects.equals(this.location, catalogsFeed.location) &&
        Objects.equals(this.name, catalogsFeed.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsFeed.status) &&
        Objects.equals(this.updatedAt, catalogsFeed.updatedAt) &&
        Objects.equals(this.catalogId, catalogsFeed.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, createdAt, credentials, defaultAvailability, defaultCountry, defaultCurrency, defaultLocale, format, id, location, name, preferredProcessingSchedule, status, updatedAt, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeed {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
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
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
