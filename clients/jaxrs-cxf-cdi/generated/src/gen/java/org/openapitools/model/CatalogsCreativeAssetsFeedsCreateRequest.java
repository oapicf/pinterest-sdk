package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Request object for creating a feed.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Request object for creating a feed.")
public class CatalogsCreativeAssetsFeedsCreateRequest   {
  
  private String catalogId;


public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private CatalogTypeEnum catalogType;

  private CatalogsFeedCredentials credentials;

  private Country defaultCountry;

  private NullableCurrency defaultCurrency;

  private CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  private CatalogsFormat format;

  private String location;

  private String name;

  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  private CatalogsStatus status;

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_country")
  @NotNull
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest defaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_locale")
  @NotNull
  public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format")
  @NotNull
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }


  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
  @NotNull
 @Pattern(regexp="^(http|https|ftp|sftp)://")  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * A human-friendly name associated to a given feed.
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferred_processing_schedule")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }


  /**
   **/
  public CatalogsCreativeAssetsFeedsCreateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
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

