package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsFeedCredentials;
import com.prokarma.pkmst.model.CatalogsFeedProcessingSchedule;
import com.prokarma.pkmst.model.CatalogsFeedsCreateRequestDefaultLocale;
import com.prokarma.pkmst.model.CatalogsFormat;
import com.prokarma.pkmst.model.CatalogsHotelFeedsCreateRequest;
import com.prokarma.pkmst.model.CatalogsRetailFeedsCreateRequest;
import com.prokarma.pkmst.model.CatalogsType;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.NullableCurrency;
import com.prokarma.pkmst.model.ProductAvailabilityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object for creating a feed.
 */
@ApiModel(description = "Request object for creating a feed.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsHotelFeedsCreateRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailFeedsCreateRequest.class, name = "RETAIL"),
})

public class CatalogsVerticalFeedsCreateRequest   {
  @JsonProperty("default_currency")
  private NullableCurrency defaultCurrency;

  @JsonProperty("name")
  private String name;

  @JsonProperty("format")
  private CatalogsFormat format;

  @JsonProperty("default_locale")
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  @JsonProperty("credentials")
  private CatalogsFeedCredentials credentials;

  @JsonProperty("location")
  private String location;

  @JsonProperty("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("default_country")
  private Country defaultCountry;

  @JsonProperty("default_availability")
  private ProductAvailabilityType defaultAvailability;

  @JsonProperty("catalog_id")
  private String catalogId;

  public CatalogsVerticalFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsVerticalFeedsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name associated to a given feed.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsVerticalFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsVerticalFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

   /**
   * Get defaultLocale
   * @return defaultLocale
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsVerticalFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  public CatalogsVerticalFeedsCreateRequest location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
  **/
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsVerticalFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

   /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
  **/
  @ApiModelProperty(value = "")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsVerticalFeedsCreateRequest catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsVerticalFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  @ApiModelProperty(required = true, value = "")
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsVerticalFeedsCreateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

   /**
   * Get defaultAvailability
   * @return defaultAvailability
  **/
  @ApiModelProperty(value = "")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  public CatalogsVerticalFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
   * @return catalogId
  **/
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsVerticalFeedsCreateRequest catalogsVerticalFeedsCreateRequest = (CatalogsVerticalFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsVerticalFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsVerticalFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsVerticalFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsVerticalFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.credentials, catalogsVerticalFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsVerticalFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsVerticalFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.catalogType, catalogsVerticalFeedsCreateRequest.catalogType) &&
        Objects.equals(this.defaultCountry, catalogsVerticalFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsVerticalFeedsCreateRequest.defaultAvailability) &&
        Objects.equals(this.catalogId, catalogsVerticalFeedsCreateRequest.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, defaultCountry, defaultAvailability, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsVerticalFeedsCreateRequest {\n");
    
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
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
