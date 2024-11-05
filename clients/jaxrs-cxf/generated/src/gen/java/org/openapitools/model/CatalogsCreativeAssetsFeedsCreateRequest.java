package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request object for creating a feed.
 **/
@ApiModel(description="Request object for creating a feed.")

public class CatalogsCreativeAssetsFeedsCreateRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private NullableCurrency defaultCurrency;

  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
 /**
   * A human-friendly name associated to a given feed.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFormat format;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country defaultCountry;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedCredentials credentials;

  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
 /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  **/
  private String location;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.")
 /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
  **/
  private String catalogId;

  @ApiModelProperty(value = "")
  private CatalogsStatus status;
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

  public CatalogsCreativeAssetsFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
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

  public CatalogsCreativeAssetsFeedsCreateRequest name(String name) {
    this.name = name;
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

  public CatalogsCreativeAssetsFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
   * Get defaultLocale
   * @return defaultLocale
  **/
  @JsonProperty("default_locale")
  @NotNull
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

 /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @JsonProperty("default_country")
  @NotNull
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

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

  public CatalogsCreativeAssetsFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
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

  public CatalogsCreativeAssetsFeedsCreateRequest location(String location) {
    this.location = location;
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

  public CatalogsCreativeAssetsFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
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

  public CatalogsCreativeAssetsFeedsCreateRequest status(CatalogsStatus status) {
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
    CatalogsCreativeAssetsFeedsCreateRequest catalogsCreativeAssetsFeedsCreateRequest = (CatalogsCreativeAssetsFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsCreativeAssetsFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsCreativeAssetsFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsCreativeAssetsFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsCreativeAssetsFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.defaultCountry, catalogsCreativeAssetsFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.credentials, catalogsCreativeAssetsFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsCreativeAssetsFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsCreativeAssetsFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsFeedsCreateRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsFeedsCreateRequest.catalogId) &&
        Objects.equals(this.status, catalogsCreativeAssetsFeedsCreateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, defaultCountry, credentials, location, preferredProcessingSchedule, catalogType, catalogId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

