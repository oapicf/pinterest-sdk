package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsFeed;
import org.openapitools.vertxweb.server.model.CatalogsFeedCredentials;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.vertxweb.server.model.CatalogsFormat;
import org.openapitools.vertxweb.server.model.CatalogsHotelFeed;
import org.openapitools.vertxweb.server.model.CatalogsRetailFeed;
import org.openapitools.vertxweb.server.model.CatalogsStatus;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.NullableCurrency;
import org.openapitools.vertxweb.server.model.ProductAvailabilityType;

/**
 * Catalogs Feed object
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeed   {
  


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
  private OffsetDateTime createdAt;
  private CatalogsFeedCredentials credentials;
  private ProductAvailabilityType defaultAvailability;
  private Country defaultCountry;
  private NullableCurrency defaultCurrency;
  private String defaultLocale;
  private CatalogsFormat format;
  private String id;
  private String location;
  private String name;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private OffsetDateTime updatedAt;
  private String catalogId;

  public CatalogsFeed () {

  }

  public CatalogsFeed (CatalogTypeEnum catalogType, OffsetDateTime createdAt, CatalogsFeedCredentials credentials, ProductAvailabilityType defaultAvailability, Country defaultCountry, NullableCurrency defaultCurrency, String defaultLocale, CatalogsFormat format, String id, String location, String name, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status, OffsetDateTime updatedAt, String catalogId) {
    this.catalogType = catalogType;
    this.createdAt = createdAt;
    this.credentials = credentials;
    this.defaultAvailability = defaultAvailability;
    this.defaultCountry = defaultCountry;
    this.defaultCurrency = defaultCurrency;
    this.defaultLocale = defaultLocale;
    this.format = format;
    this.id = id;
    this.location = location;
    this.name = name;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
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

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

    
  @JsonProperty("default_availability")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

    
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

    
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

    
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

    
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("preferred_processing_schedule")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

    
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

    
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
    CatalogsFeed catalogsFeed = (CatalogsFeed) o;
    return Objects.equals(catalogType, catalogsFeed.catalogType) &&
        Objects.equals(createdAt, catalogsFeed.createdAt) &&
        Objects.equals(credentials, catalogsFeed.credentials) &&
        Objects.equals(defaultAvailability, catalogsFeed.defaultAvailability) &&
        Objects.equals(defaultCountry, catalogsFeed.defaultCountry) &&
        Objects.equals(defaultCurrency, catalogsFeed.defaultCurrency) &&
        Objects.equals(defaultLocale, catalogsFeed.defaultLocale) &&
        Objects.equals(format, catalogsFeed.format) &&
        Objects.equals(id, catalogsFeed.id) &&
        Objects.equals(location, catalogsFeed.location) &&
        Objects.equals(name, catalogsFeed.name) &&
        Objects.equals(preferredProcessingSchedule, catalogsFeed.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsFeed.status) &&
        Objects.equals(updatedAt, catalogsFeed.updatedAt) &&
        Objects.equals(catalogId, catalogsFeed.catalogId);
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
