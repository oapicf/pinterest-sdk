/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.pinterestsdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.cliffano.pinterestsdk.model.CatalogsDbItem;
import com.cliffano.pinterestsdk.model.CatalogsFeedCredentials;
import com.cliffano.pinterestsdk.model.CatalogsFeedProcessingSchedule;
import com.cliffano.pinterestsdk.model.CatalogsFormat;
import com.cliffano.pinterestsdk.model.CatalogsStatus;
import com.cliffano.pinterestsdk.model.Country;
import com.cliffano.pinterestsdk.model.FeedFields;
import com.cliffano.pinterestsdk.model.NullableCurrency;
import com.cliffano.pinterestsdk.model.ProductAvailabilityType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Catalogs Catalogs Feed object
 */
@ApiModel(description = "Catalogs Catalogs Feed object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-07T06:37:33.786272Z[Etc/UTC]")
public class CatalogsFeed {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DEFAULT_COUNTRY = "default_country";
  @SerializedName(SERIALIZED_NAME_DEFAULT_COUNTRY)
  private Country defaultCountry;

  public static final String SERIALIZED_NAME_DEFAULT_AVAILABILITY = "default_availability";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AVAILABILITY)
  private ProductAvailabilityType defaultAvailability;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY = "default_currency";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY)
  private NullableCurrency defaultCurrency;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private CatalogsFormat format;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE = "default_locale";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE)
  private String defaultLocale;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private CatalogsFeedCredentials credentials;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
  @SerializedName(SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE)
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CatalogsStatus status;

  public CatalogsFeed() { 
  }

  public CatalogsFeed createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CatalogsFeed id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CatalogsFeed updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CatalogsFeed defaultCountry(Country defaultCountry) {
    
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Country getDefaultCountry() {
    return defaultCountry;
  }


  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }


  public CatalogsFeed defaultAvailability(ProductAvailabilityType defaultAvailability) {
    
    this.defaultAvailability = defaultAvailability;
    return this;
  }

   /**
   * Get defaultAvailability
   * @return defaultAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }


  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }


  public CatalogsFeed defaultCurrency(NullableCurrency defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }


  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  public CatalogsFeed name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CatalogsFeed format(CatalogsFormat format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CatalogsFormat getFormat() {
    return format;
  }


  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }


  public CatalogsFeed defaultLocale(String defaultLocale) {
    
    this.defaultLocale = defaultLocale;
    return this;
  }

   /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "en_US", required = true, value = "The locale used within a feed for product descriptions.")

  public String getDefaultLocale() {
    return defaultLocale;
  }


  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }


  public CatalogsFeed credentials(CatalogsFeedCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }


  public CatalogsFeed location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public CatalogsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

   /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }


  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }


  public CatalogsFeed status(CatalogsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    CatalogsFeed catalogsFeed = (CatalogsFeed) o;
    return Objects.equals(this.createdAt, catalogsFeed.createdAt) &&
        Objects.equals(this.id, catalogsFeed.id) &&
        Objects.equals(this.updatedAt, catalogsFeed.updatedAt) &&
        Objects.equals(this.defaultCountry, catalogsFeed.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsFeed.defaultAvailability) &&
        Objects.equals(this.defaultCurrency, catalogsFeed.defaultCurrency) &&
        Objects.equals(this.name, catalogsFeed.name) &&
        Objects.equals(this.format, catalogsFeed.format) &&
        Objects.equals(this.defaultLocale, catalogsFeed.defaultLocale) &&
        Objects.equals(this.credentials, catalogsFeed.credentials) &&
        Objects.equals(this.location, catalogsFeed.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsFeed.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, defaultCountry, defaultAvailability, defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeed {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
