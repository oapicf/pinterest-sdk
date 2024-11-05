package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsFeedCredentials;
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule;
import org.openapitools.server.api.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.server.api.model.CatalogsFormat;
import org.openapitools.server.api.model.CatalogsStatus;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.Country;
import org.openapitools.server.api.model.NullableCurrency;
import org.openapitools.server.api.model.ProductAvailabilityType;

/**
 * Request object for creating a retail feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailFeedsCreateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsType catalogType;
  private Country defaultCountry;
  private ProductAvailabilityType defaultAvailability;
  private CatalogsStatus status;

  public CatalogsRetailFeedsCreateRequest () {

  }

  public CatalogsRetailFeedsCreateRequest (NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedsCreateRequestDefaultLocale defaultLocale, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsType catalogType, Country defaultCountry, ProductAvailabilityType defaultAvailability, CatalogsStatus status) {
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.defaultLocale = defaultLocale;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.catalogType = catalogType;
    this.defaultCountry = defaultCountry;
    this.defaultAvailability = defaultAvailability;
    this.status = status;
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
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
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

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
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
    CatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest = (CatalogsRetailFeedsCreateRequest) o;
    return Objects.equals(defaultCurrency, catalogsRetailFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsRetailFeedsCreateRequest.name) &&
        Objects.equals(format, catalogsRetailFeedsCreateRequest.format) &&
        Objects.equals(defaultLocale, catalogsRetailFeedsCreateRequest.defaultLocale) &&
        Objects.equals(credentials, catalogsRetailFeedsCreateRequest.credentials) &&
        Objects.equals(location, catalogsRetailFeedsCreateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsRetailFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(catalogType, catalogsRetailFeedsCreateRequest.catalogType) &&
        Objects.equals(defaultCountry, catalogsRetailFeedsCreateRequest.defaultCountry) &&
        Objects.equals(defaultAvailability, catalogsRetailFeedsCreateRequest.defaultAvailability) &&
        Objects.equals(status, catalogsRetailFeedsCreateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, defaultCountry, defaultAvailability, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
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
