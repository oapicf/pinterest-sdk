package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsFeedCredentials;
import com.prokarma.pkmst.model.CatalogsFeedProcessingSchedule;
import com.prokarma.pkmst.model.CatalogsFeedsCreateRequestDefaultLocale;
import com.prokarma.pkmst.model.CatalogsFormat;
import com.prokarma.pkmst.model.CatalogsType;
import com.prokarma.pkmst.model.NullableCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
@ApiModel(description = "Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelFeedsCreateRequest   {
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

  @JsonProperty("catalog_id")
  private String catalogId;

  public CatalogsHotelFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
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

  public CatalogsHotelFeedsCreateRequest name(String name) {
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

  public CatalogsHotelFeedsCreateRequest format(CatalogsFormat format) {
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

  public CatalogsHotelFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
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

  public CatalogsHotelFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
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

  public CatalogsHotelFeedsCreateRequest location(String location) {
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

  public CatalogsHotelFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
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

  public CatalogsHotelFeedsCreateRequest catalogType(CatalogsType catalogType) {
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

  public CatalogsHotelFeedsCreateRequest catalogId(String catalogId) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

