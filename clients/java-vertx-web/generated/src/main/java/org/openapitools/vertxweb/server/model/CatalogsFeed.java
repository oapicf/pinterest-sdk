package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.CatalogsDbItem;
import org.openapitools.vertxweb.server.model.CatalogsFeedCredentials;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.vertxweb.server.model.CatalogsFormat;
import org.openapitools.vertxweb.server.model.CatalogsStatus;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.FeedFields;
import org.openapitools.vertxweb.server.model.NullableCurrency;
import org.openapitools.vertxweb.server.model.ProductAvailabilityType;

/**
 * Catalogs Catalogs Feed object
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeed   {
  
  private OffsetDateTime createdAt;
  private String id;
  private OffsetDateTime updatedAt;
  private Country defaultCountry;
  private ProductAvailabilityType defaultAvailability;
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private String defaultLocale;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;

  public CatalogsFeed () {

  }

  public CatalogsFeed (OffsetDateTime createdAt, String id, OffsetDateTime updatedAt, Country defaultCountry, ProductAvailabilityType defaultAvailability, NullableCurrency defaultCurrency, String name, CatalogsFormat format, String defaultLocale, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status) {
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
    this.defaultCountry = defaultCountry;
    this.defaultAvailability = defaultAvailability;
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.defaultLocale = defaultLocale;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

    
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

    
  @JsonProperty("default_availability")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

    
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

    
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

    
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

    
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeed catalogsFeed = (CatalogsFeed) o;
    return Objects.equals(createdAt, catalogsFeed.createdAt) &&
        Objects.equals(id, catalogsFeed.id) &&
        Objects.equals(updatedAt, catalogsFeed.updatedAt) &&
        Objects.equals(defaultCountry, catalogsFeed.defaultCountry) &&
        Objects.equals(defaultAvailability, catalogsFeed.defaultAvailability) &&
        Objects.equals(defaultCurrency, catalogsFeed.defaultCurrency) &&
        Objects.equals(name, catalogsFeed.name) &&
        Objects.equals(format, catalogsFeed.format) &&
        Objects.equals(defaultLocale, catalogsFeed.defaultLocale) &&
        Objects.equals(credentials, catalogsFeed.credentials) &&
        Objects.equals(location, catalogsFeed.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsFeed.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsFeed.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, defaultCountry, defaultAvailability, defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeed {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
