/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.NullableCurrency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object for updating a feed.
 */
@ApiModel(description = "Request object for updating a feed.")
@JsonPropertyOrder({
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_DEFAULT_CURRENCY,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_NAME,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_FORMAT,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_CREDENTIALS,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_LOCATION,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_STATUS,
  CatalogsHotelFeedsUpdateRequest.JSON_PROPERTY_CATALOG_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelFeedsUpdateRequest   {
  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  private NullableCurrency defaultCurrency;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_FORMAT = "format";
  @JsonProperty(JSON_PROPERTY_FORMAT)
  private CatalogsFormat format;

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  private CatalogsFeedCredentials credentials;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @JsonProperty(JSON_PROPERTY_LOCATION)
  private String location;

  public static final String JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
  @JsonProperty(JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE)
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private CatalogsStatus status;

  public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
  @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
  private CatalogsType catalogType;

  public CatalogsHotelFeedsUpdateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
   **/
  @JsonProperty(value = "default_currency")
  @ApiModelProperty(value = "")
  
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsHotelFeedsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a given feed.
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(value = "A human-friendly name associated to a given feed.")
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsHotelFeedsUpdateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   **/
  @JsonProperty(value = "format")
  @ApiModelProperty(value = "")
  
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsHotelFeedsUpdateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   **/
  @JsonProperty(value = "credentials")
  @ApiModelProperty(value = "")
  @Valid 
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  public CatalogsHotelFeedsUpdateRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   **/
  @JsonProperty(value = "location")
  @ApiModelProperty(value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
   @Pattern(regexp="^(http|https|ftp|sftp)://")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsHotelFeedsUpdateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
   **/
  @JsonProperty(value = "preferred_processing_schedule")
  @ApiModelProperty(value = "")
  @Valid 
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsHotelFeedsUpdateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty(value = "status")
  @ApiModelProperty(value = "")
  
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsHotelFeedsUpdateRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   **/
  @JsonProperty(value = "catalog_type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
    return Objects.equals(this.defaultCurrency, catalogsHotelFeedsUpdateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsHotelFeedsUpdateRequest.name) &&
        Objects.equals(this.format, catalogsHotelFeedsUpdateRequest.format) &&
        Objects.equals(this.credentials, catalogsHotelFeedsUpdateRequest.credentials) &&
        Objects.equals(this.location, catalogsHotelFeedsUpdateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsHotelFeedsUpdateRequest.status) &&
        Objects.equals(this.catalogType, catalogsHotelFeedsUpdateRequest.catalogType);
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

