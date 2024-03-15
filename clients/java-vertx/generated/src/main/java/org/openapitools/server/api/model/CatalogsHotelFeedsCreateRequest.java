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
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.NullableCurrency;

/**
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelFeedsCreateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsType catalogType;
  private String catalogId;

  public CatalogsHotelFeedsCreateRequest () {

  }

  public CatalogsHotelFeedsCreateRequest (NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedsCreateRequestDefaultLocale defaultLocale, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsType catalogType, String catalogId) {
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.defaultLocale = defaultLocale;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.catalogType = catalogType;
    this.catalogId = catalogId;
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
    CatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest = (CatalogsHotelFeedsCreateRequest) o;
    return Objects.equals(defaultCurrency, catalogsHotelFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsHotelFeedsCreateRequest.name) &&
        Objects.equals(format, catalogsHotelFeedsCreateRequest.format) &&
        Objects.equals(defaultLocale, catalogsHotelFeedsCreateRequest.defaultLocale) &&
        Objects.equals(credentials, catalogsHotelFeedsCreateRequest.credentials) &&
        Objects.equals(location, catalogsHotelFeedsCreateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsHotelFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(catalogType, catalogsHotelFeedsCreateRequest.catalogType) &&
        Objects.equals(catalogId, catalogsHotelFeedsCreateRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
