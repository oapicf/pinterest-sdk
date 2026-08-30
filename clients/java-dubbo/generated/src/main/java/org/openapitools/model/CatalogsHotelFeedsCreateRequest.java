package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
public class CatalogsHotelFeedsCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("catalog_type")
  private String catalogType;

  @JsonProperty("credentials")
  private CatalogsFeedCredentials credentials;

  @JsonProperty("default_currency")
  private NullableCurrency defaultCurrency;

  @JsonProperty("default_locale")
  private CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  @JsonProperty("format")
  private CatalogsFormat format;

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   */
  @JsonProperty("location")
  private String location;

  /**
   * A human-friendly name associated to a given feed.
   */
  @JsonProperty("name")
  private String name;

  @JsonProperty("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("status")
  private CatalogsStatus status;

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * 
   * @return credentials
   */
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * 
   * @return defaultCurrency
   */
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * 
   * @return defaultLocale
   */
  public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * 
   * @return format
   */
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * A human-friendly name associated to a given feed.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return preferredProcessingSchedule
   */
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   * 
   * @return status
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
