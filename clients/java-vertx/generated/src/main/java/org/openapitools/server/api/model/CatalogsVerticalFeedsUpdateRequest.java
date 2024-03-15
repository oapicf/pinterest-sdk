package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsFeedCredentials;
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule;
import org.openapitools.server.api.model.CatalogsFormat;
import org.openapitools.server.api.model.CatalogsHotelFeedsUpdateRequest;
import org.openapitools.server.api.model.CatalogsRetailFeedsUpdateRequest;
import org.openapitools.server.api.model.CatalogsStatus;
import org.openapitools.server.api.model.CatalogsType;
import org.openapitools.server.api.model.NullableCurrency;
import org.openapitools.server.api.model.ProductAvailabilityType;

/**
 * Request object for updating a feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsVerticalFeedsUpdateRequest   {
  
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private CatalogsType catalogType;
  private ProductAvailabilityType defaultAvailability;

  public CatalogsVerticalFeedsUpdateRequest () {

  }

  public CatalogsVerticalFeedsUpdateRequest (NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status, CatalogsType catalogType, ProductAvailabilityType defaultAvailability) {
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
    this.catalogType = catalogType;
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

    
  @JsonProperty("default_availability")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
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
    CatalogsVerticalFeedsUpdateRequest catalogsVerticalFeedsUpdateRequest = (CatalogsVerticalFeedsUpdateRequest) o;
    return Objects.equals(defaultCurrency, catalogsVerticalFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsVerticalFeedsUpdateRequest.name) &&
        Objects.equals(format, catalogsVerticalFeedsUpdateRequest.format) &&
        Objects.equals(credentials, catalogsVerticalFeedsUpdateRequest.credentials) &&
        Objects.equals(location, catalogsVerticalFeedsUpdateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsVerticalFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsVerticalFeedsUpdateRequest.status) &&
        Objects.equals(catalogType, catalogsVerticalFeedsUpdateRequest.catalogType) &&
        Objects.equals(defaultAvailability, catalogsVerticalFeedsUpdateRequest.defaultAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, credentials, location, preferredProcessingSchedule, status, catalogType, defaultAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalFeedsUpdateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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
