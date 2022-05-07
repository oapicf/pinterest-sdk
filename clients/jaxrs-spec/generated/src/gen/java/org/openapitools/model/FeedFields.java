package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
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



@JsonTypeName("feed_fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class FeedFields   {
  
  private @Valid Country defaultCountry;
  private @Valid ProductAvailabilityType defaultAvailability;
  private @Valid NullableCurrency defaultCurrency;
  private @Valid String name;
  private @Valid CatalogsFormat format;
  private @Valid String defaultLocale;
  private @Valid CatalogsFeedCredentials credentials;
  private @Valid String location;
  private @Valid CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private @Valid CatalogsStatus status;

  /**
   **/
  public FeedFields defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_country")
  @NotNull
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  @JsonProperty("default_country")
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

/**
   **/
  public FeedFields defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_availability")
  @NotNull
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  @JsonProperty("default_availability")
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

/**
   **/
  public FeedFields defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_currency")
  @NotNull
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  @JsonProperty("default_currency")
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

/**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   **/
  public FeedFields name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public FeedFields format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format")
  @NotNull
  public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty("format")
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

/**
   * The locale used within a feed for product descriptions.
   **/
  public FeedFields defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  

  
  @ApiModelProperty(example = "en_US", required = true, value = "The locale used within a feed for product descriptions.")
  @JsonProperty("default_locale")
  @NotNull
  public String getDefaultLocale() {
    return defaultLocale;
  }

  @JsonProperty("default_locale")
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

/**
   **/
  public FeedFields credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("credentials")
  @NotNull
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

/**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public FeedFields location(String location) {
    this.location = location;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
  @NotNull
  public String getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(String location) {
    this.location = location;
  }

/**
   **/
  public FeedFields preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("preferred_processing_schedule")
  @NotNull
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  @JsonProperty("preferred_processing_schedule")
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

/**
   **/
  public FeedFields status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull
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
    FeedFields feedFields = (FeedFields) o;
    return Objects.equals(this.defaultCountry, feedFields.defaultCountry) &&
        Objects.equals(this.defaultAvailability, feedFields.defaultAvailability) &&
        Objects.equals(this.defaultCurrency, feedFields.defaultCurrency) &&
        Objects.equals(this.name, feedFields.name) &&
        Objects.equals(this.format, feedFields.format) &&
        Objects.equals(this.defaultLocale, feedFields.defaultLocale) &&
        Objects.equals(this.credentials, feedFields.credentials) &&
        Objects.equals(this.location, feedFields.location) &&
        Objects.equals(this.preferredProcessingSchedule, feedFields.preferredProcessingSchedule) &&
        Objects.equals(this.status, feedFields.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCountry, defaultAvailability, defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

