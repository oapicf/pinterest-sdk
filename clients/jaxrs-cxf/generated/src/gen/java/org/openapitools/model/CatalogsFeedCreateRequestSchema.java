package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequest;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsVerticalFeedsCreateRequest;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedCreateRequestSchema  {
  
  @ApiModelProperty(value = "")

  @Valid

  private CatalogsFeedCredentials credentials;

  @ApiModelProperty(value = "")

  @Valid

  private ProductAvailabilityType defaultAvailability;

  @ApiModelProperty(value = "")

  @Valid

  private Country defaultCountry;

  @ApiModelProperty(value = "")

  @Valid

  private NullableCurrency defaultCurrency;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFormat format;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")

  private String location;

 /**
  * A human-friendly name associated to a given feed.
  */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsStatus status;
 /**
   * Get credentials
   * @return credentials
  **/
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  public CatalogsFeedCreateRequestSchema credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
   * Get defaultAvailability
   * @return defaultAvailability
  **/
  @JsonProperty("default_availability")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  public CatalogsFeedCreateRequestSchema defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

 /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsFeedCreateRequestSchema defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

 /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsFeedCreateRequestSchema defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
   * Get defaultLocale
   * @return defaultLocale
  **/
  @JsonProperty("default_locale")
  public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsFeedCreateRequestSchema defaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

 /**
   * Get format
   * @return format
  **/
  @JsonProperty("format")
  @NotNull
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsFeedCreateRequestSchema format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
  **/
  @JsonProperty("location")
  @NotNull
 @Pattern(regexp="^(http|https|ftp|sftp)://")  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsFeedCreateRequestSchema location(String location) {
    this.location = location;
    return this;
  }

 /**
   * A human-friendly name associated to a given feed.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsFeedCreateRequestSchema name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
  **/
  @JsonProperty("preferred_processing_schedule")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsFeedCreateRequestSchema preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsFeedCreateRequestSchema status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema = (CatalogsFeedCreateRequestSchema) o;
    return Objects.equals(this.credentials, catalogsFeedCreateRequestSchema.credentials) &&
        Objects.equals(this.defaultAvailability, catalogsFeedCreateRequestSchema.defaultAvailability) &&
        Objects.equals(this.defaultCountry, catalogsFeedCreateRequestSchema.defaultCountry) &&
        Objects.equals(this.defaultCurrency, catalogsFeedCreateRequestSchema.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsFeedCreateRequestSchema.defaultLocale) &&
        Objects.equals(this.format, catalogsFeedCreateRequestSchema.format) &&
        Objects.equals(this.location, catalogsFeedCreateRequestSchema.location) &&
        Objects.equals(this.name, catalogsFeedCreateRequestSchema.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsFeedCreateRequestSchema.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsFeedCreateRequestSchema.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, defaultAvailability, defaultCountry, defaultCurrency, defaultLocale, format, location, name, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedCreateRequestSchema {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

