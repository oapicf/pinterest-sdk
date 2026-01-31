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
import org.openapitools.vertxweb.server.model.ProductAvailabilityType;

/**
 * Request object for updating a feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailFeedsUpdateRequest   {
  
  private CatalogsType catalogType;
  private CatalogsFeedCredentials credentials;
  private ProductAvailabilityType defaultAvailability;
  private NullableCurrency defaultCurrency;
  private CatalogsFormat format;
  private String location;
  private String name;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;

  public CatalogsRetailFeedsUpdateRequest () {

  }

  public CatalogsRetailFeedsUpdateRequest (CatalogsType catalogType, CatalogsFeedCredentials credentials, ProductAvailabilityType defaultAvailability, NullableCurrency defaultCurrency, CatalogsFormat format, String location, String name, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status) {
    this.catalogType = catalogType;
    this.credentials = credentials;
    this.defaultAvailability = defaultAvailability;
    this.defaultCurrency = defaultCurrency;
    this.format = format;
    this.location = location;
    this.name = name;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
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

    
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

    
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest = (CatalogsRetailFeedsUpdateRequest) o;
    return Objects.equals(catalogType, catalogsRetailFeedsUpdateRequest.catalogType) &&
        Objects.equals(credentials, catalogsRetailFeedsUpdateRequest.credentials) &&
        Objects.equals(defaultAvailability, catalogsRetailFeedsUpdateRequest.defaultAvailability) &&
        Objects.equals(defaultCurrency, catalogsRetailFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(format, catalogsRetailFeedsUpdateRequest.format) &&
        Objects.equals(location, catalogsRetailFeedsUpdateRequest.location) &&
        Objects.equals(name, catalogsRetailFeedsUpdateRequest.name) &&
        Objects.equals(preferredProcessingSchedule, catalogsRetailFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsRetailFeedsUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, credentials, defaultAvailability, defaultCurrency, format, location, name, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeedsUpdateRequest {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
