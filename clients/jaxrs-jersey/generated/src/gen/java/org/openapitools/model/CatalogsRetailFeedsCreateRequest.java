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
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object for creating a retail feed.
 */
@ApiModel(description = "Request object for creating a retail feed.")
@JsonPropertyOrder({
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_DEFAULT_CURRENCY,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_NAME,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_FORMAT,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_DEFAULT_LOCALE,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_CREDENTIALS,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_LOCATION,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_DEFAULT_COUNTRY,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_DEFAULT_AVAILABILITY,
  CatalogsRetailFeedsCreateRequest.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailFeedsCreateRequest   {
  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  private NullableCurrency defaultCurrency;

  public static final String JSON_PROPERTY_NAME = "name";
  @JsonProperty(JSON_PROPERTY_NAME)
  private String name;

  public static final String JSON_PROPERTY_FORMAT = "format";
  @JsonProperty(JSON_PROPERTY_FORMAT)
  private CatalogsFormat format;

  public static final String JSON_PROPERTY_DEFAULT_LOCALE = "default_locale";
  @JsonProperty(JSON_PROPERTY_DEFAULT_LOCALE)
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  private CatalogsFeedCredentials credentials;

  public static final String JSON_PROPERTY_LOCATION = "location";
  @JsonProperty(JSON_PROPERTY_LOCATION)
  private String location;

  public static final String JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
  @JsonProperty(JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE)
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
  @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
  private CatalogsType catalogType;

  public static final String JSON_PROPERTY_DEFAULT_COUNTRY = "default_country";
  @JsonProperty(JSON_PROPERTY_DEFAULT_COUNTRY)
  private Country defaultCountry;

  public static final String JSON_PROPERTY_DEFAULT_AVAILABILITY = "default_availability";
  @JsonProperty(JSON_PROPERTY_DEFAULT_AVAILABILITY)
  private ProductAvailabilityType defaultAvailability;

  public static final String JSON_PROPERTY_STATUS = "status";
  @JsonProperty(JSON_PROPERTY_STATUS)
  private CatalogsStatus status;

  public CatalogsRetailFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
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

  public CatalogsRetailFeedsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a given feed.
   * @return name
   **/
  @JsonProperty(value = "name")
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  @NotNull 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsRetailFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   **/
  @JsonProperty(value = "format")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsRetailFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Get defaultLocale
   * @return defaultLocale
   **/
  @JsonProperty(value = "default_locale")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsRetailFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
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

  public CatalogsRetailFeedsCreateRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   **/
  @JsonProperty(value = "location")
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @NotNull  @Pattern(regexp="^(http|https|ftp|sftp)://")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsRetailFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
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

  public CatalogsRetailFeedsCreateRequest catalogType(CatalogsType catalogType) {
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

  public CatalogsRetailFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   **/
  @JsonProperty(value = "default_country")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsRetailFeedsCreateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

  /**
   * Get defaultAvailability
   * @return defaultAvailability
   **/
  @JsonProperty(value = "default_availability")
  @ApiModelProperty(value = "")
  
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  public CatalogsRetailFeedsCreateRequest status(CatalogsStatus status) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest = (CatalogsRetailFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsRetailFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsRetailFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsRetailFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsRetailFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.credentials, catalogsRetailFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsRetailFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsRetailFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.catalogType, catalogsRetailFeedsCreateRequest.catalogType) &&
        Objects.equals(this.defaultCountry, catalogsRetailFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsRetailFeedsCreateRequest.defaultAvailability) &&
        Objects.equals(this.status, catalogsRetailFeedsCreateRequest.status);
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

