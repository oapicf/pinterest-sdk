package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsUpdateRequest;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.CatalogsVerticalFeedsUpdateRequest;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FeedsUpdateRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ProductAvailabilityType defaultAvailability;

  @ApiModelProperty(value = "")
  @Valid
  private NullableCurrency defaultCurrency;

 /**
  * A human-friendly name associated to a given feed.
  */
  @ApiModelProperty(value = "A human-friendly name associated to a given feed.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFormat format;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedCredentials credentials;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  private String location;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsStatus status;
 /**
  * Get defaultAvailability
  * @return defaultAvailability
  */
  @JsonProperty("default_availability")
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
  public FeedsUpdateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

 /**
  * Get defaultCurrency
  * @return defaultCurrency
  */
  @JsonProperty("default_currency")
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
  public FeedsUpdateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
  * A human-friendly name associated to a given feed.
  * @return name
  */
  @JsonProperty("name")
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
  public FeedsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get format
  * @return format
  */
  @JsonProperty("format")
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
  public FeedsUpdateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
  * Get credentials
  * @return credentials
  */
  @JsonProperty("credentials")
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
  public FeedsUpdateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @return location
  */
  @JsonProperty("location")
 @Pattern(regexp="^(http|https|ftp|sftp)://")  public String getLocation() {
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
  public FeedsUpdateRequest location(String location) {
    this.location = location;
    return this;
  }

 /**
  * Get preferredProcessingSchedule
  * @return preferredProcessingSchedule
  */
  @JsonProperty("preferred_processing_schedule")
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
  public FeedsUpdateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
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
  public FeedsUpdateRequest status(CatalogsStatus status) {
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
    FeedsUpdateRequest feedsUpdateRequest = (FeedsUpdateRequest) o;
    return Objects.equals(this.defaultAvailability, feedsUpdateRequest.defaultAvailability) &&
        Objects.equals(this.defaultCurrency, feedsUpdateRequest.defaultCurrency) &&
        Objects.equals(this.name, feedsUpdateRequest.name) &&
        Objects.equals(this.format, feedsUpdateRequest.format) &&
        Objects.equals(this.credentials, feedsUpdateRequest.credentials) &&
        Objects.equals(this.location, feedsUpdateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, feedsUpdateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, feedsUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAvailability, defaultCurrency, name, format, credentials, location, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedsUpdateRequest {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

