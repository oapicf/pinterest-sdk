package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
@ApiModel(description="Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.")

public class CatalogsHotelFeedsCreateRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private NullableCurrency defaultCurrency;

 /**
  * A human-friendly name associated to a given feed.
  */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFormat format;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedCredentials credentials;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  private String location;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

 /**
  * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  */
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.")
  private String catalogId;
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
  public CatalogsHotelFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
  * A human-friendly name associated to a given feed.
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
  public CatalogsHotelFeedsCreateRequest name(String name) {
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
  public CatalogsHotelFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
  * Get defaultLocale
  * @return defaultLocale
  */
  @JsonProperty("default_locale")
  @NotNull
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
 public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
  public CatalogsHotelFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
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
  public CatalogsHotelFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @return location
  */
  @JsonProperty("location")
  @NotNull
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
  public CatalogsHotelFeedsCreateRequest location(String location) {
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
  public CatalogsHotelFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsHotelFeedsCreateRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsHotelFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
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
    CatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest = (CatalogsHotelFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsHotelFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsHotelFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsHotelFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsHotelFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.credentials, catalogsHotelFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsHotelFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.catalogType, catalogsHotelFeedsCreateRequest.catalogType) &&
        Objects.equals(this.catalogId, catalogsHotelFeedsCreateRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeedsCreateRequest {\n");
    
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

