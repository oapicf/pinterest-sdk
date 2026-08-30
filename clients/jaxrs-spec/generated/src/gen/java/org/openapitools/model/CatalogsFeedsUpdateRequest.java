package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request object for updating a feed.
 **/
@ApiModel(description = "Request object for updating a feed.")
@JsonTypeName("CatalogsFeedsUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedsUpdateRequest   {
  private CatalogsFeedCredentials credentials;
  private ProductAvailabilityType defaultAvailability;
  private NullableCurrency defaultCurrency;
  private CatalogsFormat format;
  private String location;
  private String name;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;

  public CatalogsFeedsUpdateRequest() {
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  @Valid public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_availability")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  @JsonProperty("default_availability")
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  @JsonProperty("default_currency")
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public CatalogsFeedsUpdateRequest location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
   @Pattern(regexp="^(http|https|ftp|sftp)://")public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * A human-friendly name associated to a given feed.
   **/
  public CatalogsFeedsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "A human-friendly name associated to a given feed.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferred_processing_schedule")
  @Valid public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  @JsonProperty("preferred_processing_schedule")
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  public CatalogsFeedsUpdateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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
    return Objects.equals(this.credentials, catalogsFeedsUpdateRequest.credentials) &&
        Objects.equals(this.defaultAvailability, catalogsFeedsUpdateRequest.defaultAvailability) &&
        Objects.equals(this.defaultCurrency, catalogsFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(this.format, catalogsFeedsUpdateRequest.format) &&
        Objects.equals(this.location, catalogsFeedsUpdateRequest.location) &&
        Objects.equals(this.name, catalogsFeedsUpdateRequest.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsFeedsUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, defaultAvailability, defaultCurrency, format, location, name, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedsUpdateRequest {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
