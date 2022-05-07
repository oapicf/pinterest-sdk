package org.openapitools.model;

import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FeedFields  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country defaultCountry;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductAvailabilityType defaultAvailability;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NullableCurrency defaultCurrency;

 /**
  * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFormat format;

 /**
  * The locale used within a feed for product descriptions.
  */
  @ApiModelProperty(example = "en_US", required = true, value = "The locale used within a feed for product descriptions.")
  private String defaultLocale;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedCredentials credentials;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  private String location;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsStatus status;
 /**
  * Get defaultCountry
  * @return defaultCountry
  */
  @JsonProperty("default_country")
  @NotNull
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  /**
   * Sets the <code>defaultCountry</code> property.
   */
 public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   * Sets the <code>defaultCountry</code> property.
   */
  public FeedFields defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

 /**
  * Get defaultAvailability
  * @return defaultAvailability
  */
  @JsonProperty("default_availability")
  @NotNull
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  /**
   * Sets the <code>defaultAvailability</code> property.
   */
 public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  /**
   * Sets the <code>defaultAvailability</code> property.
   */
  public FeedFields defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

 /**
  * Get defaultCurrency
  * @return defaultCurrency
  */
  @JsonProperty("default_currency")
  @NotNull
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  /**
   * Sets the <code>defaultCurrency</code> property.
   */
 public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * Sets the <code>defaultCurrency</code> property.
   */
  public FeedFields defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
  * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public FeedFields name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get format
  * @return format
  */
  @JsonProperty("format")
  @NotNull
  public CatalogsFormat getFormat() {
    return format;
  }

  /**
   * Sets the <code>format</code> property.
   */
 public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * Sets the <code>format</code> property.
   */
  public FeedFields format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
  * The locale used within a feed for product descriptions.
  * @return defaultLocale
  */
  @JsonProperty("default_locale")
  @NotNull
  public String getDefaultLocale() {
    return defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
 public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
  public FeedFields defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

 /**
  * Get credentials
  * @return credentials
  */
  @JsonProperty("credentials")
  @NotNull
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  /**
   * Sets the <code>credentials</code> property.
   */
 public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * Sets the <code>credentials</code> property.
   */
  public FeedFields credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @return location
  */
  @JsonProperty("location")
  @NotNull
  public String getLocation() {
    return location;
  }

  /**
   * Sets the <code>location</code> property.
   */
 public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Sets the <code>location</code> property.
   */
  public FeedFields location(String location) {
    this.location = location;
    return this;
  }

 /**
  * Get preferredProcessingSchedule
  * @return preferredProcessingSchedule
  */
  @JsonProperty("preferred_processing_schedule")
  @NotNull
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  /**
   * Sets the <code>preferredProcessingSchedule</code> property.
   */
 public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   * Sets the <code>preferredProcessingSchedule</code> property.
   */
  public FeedFields preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public CatalogsStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public FeedFields status(CatalogsStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedFields {\n");
    
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

