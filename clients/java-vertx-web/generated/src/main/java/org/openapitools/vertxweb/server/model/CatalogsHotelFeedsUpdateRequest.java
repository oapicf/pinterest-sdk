package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsFeedCredentials;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.vertxweb.server.model.CatalogsFormat;
import org.openapitools.vertxweb.server.model.CatalogsStatus;
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.NullableCurrency;

/**
 * Request object for updating a feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsHotelFeedsUpdateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private CatalogsType catalogType;

  public CatalogsHotelFeedsUpdateRequest () {

  }

  public CatalogsHotelFeedsUpdateRequest (NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status, CatalogsType catalogType) {
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
    this.catalogType = catalogType;
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

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest = (CatalogsHotelFeedsUpdateRequest) o;
    return Objects.equals(defaultCurrency, catalogsHotelFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsHotelFeedsUpdateRequest.name) &&
        Objects.equals(format, catalogsHotelFeedsUpdateRequest.format) &&
        Objects.equals(credentials, catalogsHotelFeedsUpdateRequest.credentials) &&
        Objects.equals(location, catalogsHotelFeedsUpdateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsHotelFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsHotelFeedsUpdateRequest.status) &&
        Objects.equals(catalogType, catalogsHotelFeedsUpdateRequest.catalogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, credentials, location, preferredProcessingSchedule, status, catalogType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeedsUpdateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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
