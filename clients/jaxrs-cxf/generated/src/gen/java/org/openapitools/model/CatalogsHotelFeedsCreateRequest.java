package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
@ApiModel(description="Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.")

public class CatalogsHotelFeedsCreateRequest  {
  
 /**
  * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  */
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")

  private String catalogId;

public enum CatalogTypeEnum {

HOTEL(String.valueOf("HOTEL"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private CatalogTypeEnum catalogType;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsFeedCredentials credentials;

  @ApiModelProperty(value = "")

  @Valid

  private NullableCurrency defaultCurrency;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsFormat format;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")

  private String location;

 /**
  * A human-friendly name associated to a given feed.
  */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(value = "")

  @Valid

  private CatalogsStatus status;
 /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsHotelFeedsCreateRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsHotelFeedsCreateRequest catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
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

  public CatalogsHotelFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

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

  public CatalogsHotelFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
   * Get defaultLocale
   * @return defaultLocale
  **/
  @JsonProperty("default_locale")
  @NotNull
  public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsHotelFeedsCreateRequest defaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
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

  public CatalogsHotelFeedsCreateRequest format(CatalogsFormat format) {
    this.format = format;
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

  public CatalogsHotelFeedsCreateRequest location(String location) {
    this.location = location;
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

  public CatalogsHotelFeedsCreateRequest name(String name) {
    this.name = name;
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

  public CatalogsHotelFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
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

  public CatalogsHotelFeedsCreateRequest status(CatalogsStatus status) {
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
    CatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest = (CatalogsHotelFeedsCreateRequest) o;
    return Objects.equals(this.catalogId, catalogsHotelFeedsCreateRequest.catalogId) &&
        Objects.equals(this.catalogType, catalogsHotelFeedsCreateRequest.catalogType) &&
        Objects.equals(this.credentials, catalogsHotelFeedsCreateRequest.credentials) &&
        Objects.equals(this.defaultCurrency, catalogsHotelFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsHotelFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.format, catalogsHotelFeedsCreateRequest.format) &&
        Objects.equals(this.location, catalogsHotelFeedsCreateRequest.location) &&
        Objects.equals(this.name, catalogsHotelFeedsCreateRequest.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsHotelFeedsCreateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, credentials, defaultCurrency, defaultLocale, format, location, name, preferredProcessingSchedule, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeedsCreateRequest {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

