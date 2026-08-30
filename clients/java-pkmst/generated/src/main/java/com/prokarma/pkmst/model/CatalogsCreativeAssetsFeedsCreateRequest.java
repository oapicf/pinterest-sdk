package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
import com.prokarma.pkmst.model.CatalogsFeedCredentials;
import com.prokarma.pkmst.model.CatalogsFeedProcessingSchedule;
import com.prokarma.pkmst.model.CatalogsFormat;
import com.prokarma.pkmst.model.CatalogsStatus;
import com.prokarma.pkmst.model.Country;
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
 * Request object for creating a feed.
 */
@ApiModel(description = "Request object for creating a feed.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsCreativeAssetsFeedsCreateRequest   {
  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("credentials")
  private CatalogsFeedCredentials credentials;

  @JsonProperty("default_country")
  private Country defaultCountry;

  @JsonProperty("default_currency")
  private NullableCurrency defaultCurrency;

  @JsonProperty("default_locale")
  private CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  @JsonProperty("format")
  private CatalogsFormat format;

  @JsonProperty("location")
  private String location;

  @JsonProperty("name")
  private String name;

  @JsonProperty("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("status")
  private CatalogsStatus status;

  public CatalogsCreativeAssetsFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
   */
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @ApiModelProperty(value = "")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   */
  @ApiModelProperty(required = true, value = "")
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
   */
  @ApiModelProperty(value = "")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest defaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Get defaultLocale
   * @return defaultLocale
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a given feed.
   * @return name
   */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
   */
  @ApiModelProperty(value = "")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsCreativeAssetsFeedsCreateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
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
    CatalogsCreativeAssetsFeedsCreateRequest catalogsCreativeAssetsFeedsCreateRequest = (CatalogsCreativeAssetsFeedsCreateRequest) o;
    return Objects.equals(this.catalogId, catalogsCreativeAssetsFeedsCreateRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsFeedsCreateRequest.catalogType) &&
        Objects.equals(this.credentials, catalogsCreativeAssetsFeedsCreateRequest.credentials) &&
        Objects.equals(this.defaultCountry, catalogsCreativeAssetsFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.defaultCurrency, catalogsCreativeAssetsFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsCreativeAssetsFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.format, catalogsCreativeAssetsFeedsCreateRequest.format) &&
        Objects.equals(this.location, catalogsCreativeAssetsFeedsCreateRequest.location) &&
        Objects.equals(this.name, catalogsCreativeAssetsFeedsCreateRequest.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsCreativeAssetsFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsCreativeAssetsFeedsCreateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, credentials, defaultCountry, defaultCurrency, defaultLocale, format, location, name, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeedsCreateRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

