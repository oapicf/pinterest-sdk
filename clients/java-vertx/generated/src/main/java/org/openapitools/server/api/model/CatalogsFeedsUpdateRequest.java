package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.CatalogsFeedCredentials;
import org.openapitools.server.api.model.CatalogsFeedProcessingSchedule;
import org.openapitools.server.api.model.CatalogsFormat;
import org.openapitools.server.api.model.CatalogsStatus;
import org.openapitools.server.api.model.NullableCurrency;
import org.openapitools.server.api.model.ProductAvailabilityType;

/**
 * Request object for updating a feed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedsUpdateRequest   {
  
  private ProductAvailabilityType defaultAvailability;
  private NullableCurrency defaultCurrency;
  private String name;
  private CatalogsFormat format;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;

  public CatalogsFeedsUpdateRequest () {

  }

  public CatalogsFeedsUpdateRequest (ProductAvailabilityType defaultAvailability, NullableCurrency defaultCurrency, String name, CatalogsFormat format, CatalogsFeedCredentials credentials, String location, CatalogsFeedProcessingSchedule preferredProcessingSchedule, CatalogsStatus status) {
    this.defaultAvailability = defaultAvailability;
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.format = format;
    this.credentials = credentials;
    this.location = location;
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    this.status = status;
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
    CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = (CatalogsFeedsUpdateRequest) o;
    return Objects.equals(defaultAvailability, catalogsFeedsUpdateRequest.defaultAvailability) &&
        Objects.equals(defaultCurrency, catalogsFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(name, catalogsFeedsUpdateRequest.name) &&
        Objects.equals(format, catalogsFeedsUpdateRequest.format) &&
        Objects.equals(credentials, catalogsFeedsUpdateRequest.credentials) &&
        Objects.equals(location, catalogsFeedsUpdateRequest.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsFeedsUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAvailability, defaultCurrency, name, format, credentials, location, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedsUpdateRequest {\n");
    
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
