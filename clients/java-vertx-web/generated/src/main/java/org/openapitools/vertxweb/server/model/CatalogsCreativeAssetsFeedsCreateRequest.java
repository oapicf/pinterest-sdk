package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsFeedCredentials;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.vertxweb.server.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.vertxweb.server.model.CatalogsFormat;
import org.openapitools.vertxweb.server.model.CatalogsStatus;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.NullableCurrency;

/**
 * Request object for creating a feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsFeedsCreateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;
  private Country defaultCountry;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsType catalogType;
  private String catalogId;
  private CatalogsStatus status;

  public CatalogsCreativeAssetsFeedsCreateRequest () {

  }

  public CatalogsCreativeAssetsFeedsCreateRequest (NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedsCreateRequestDefaultLocale defaultLocale, Country defaultCountry, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsType catalogType, String catalogId, CatalogsStatus status) {
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.defaultLocale = defaultLocale;
    this.defaultCountry = defaultCountry;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.catalogType = catalogType;
    this.catalogId = catalogId;
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

    
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
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

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
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
    CatalogsCreativeAssetsFeedsCreateRequest catalogsCreativeAssetsFeedsCreateRequest = (CatalogsCreativeAssetsFeedsCreateRequest) o;
    return Objects.equals(defaultCurrency, catalogsCreativeAssetsFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsCreativeAssetsFeedsCreateRequest.name) &&
        Objects.equals(format, catalogsCreativeAssetsFeedsCreateRequest.format) &&
        Objects.equals(defaultLocale, catalogsCreativeAssetsFeedsCreateRequest.defaultLocale) &&
        Objects.equals(defaultCountry, catalogsCreativeAssetsFeedsCreateRequest.defaultCountry) &&
        Objects.equals(credentials, catalogsCreativeAssetsFeedsCreateRequest.credentials) &&
        Objects.equals(location, catalogsCreativeAssetsFeedsCreateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsCreativeAssetsFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(catalogType, catalogsCreativeAssetsFeedsCreateRequest.catalogType) &&
        Objects.equals(catalogId, catalogsCreativeAssetsFeedsCreateRequest.catalogId) &&
        Objects.equals(status, catalogsCreativeAssetsFeedsCreateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, defaultCountry, credentials, location, preferredProcessingSchedule, catalogType, catalogId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
