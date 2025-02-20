/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CatalogsFeedCredentials;
import org.openapitools.client.model.CatalogsFeedProcessingSchedule;
import org.openapitools.client.model.CatalogsFeedsCreateRequest;
import org.openapitools.client.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.client.model.CatalogsFormat;
import org.openapitools.client.model.CatalogsStatus;
import org.openapitools.client.model.CatalogsType;
import org.openapitools.client.model.CatalogsVerticalFeedsCreateRequest;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.NullableCurrency;
import org.openapitools.client.model.ProductAvailabilityType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class FeedsCreateRequest {
  
  @SerializedName("default_currency")
  private NullableCurrency defaultCurrency = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("format")
  private CatalogsFormat format = null;
  @SerializedName("default_locale")
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale = null;
  @SerializedName("credentials")
  private CatalogsFeedCredentials credentials = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule = null;
  @SerializedName("catalog_type")
  private CatalogsType catalogType = null;
  @SerializedName("default_country")
  private Country defaultCountry = null;
  @SerializedName("default_availability")
  private ProductAvailabilityType defaultAvailability = null;
  @SerializedName("status")
  private CatalogsStatus status = null;
  @SerializedName("catalog_id")
  private String catalogId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * A human-friendly name associated to a given feed.
   **/
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
   **/
  @ApiModelProperty(value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.")
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
    FeedsCreateRequest feedsCreateRequest = (FeedsCreateRequest) o;
    return (this.defaultCurrency == null ? feedsCreateRequest.defaultCurrency == null : this.defaultCurrency.equals(feedsCreateRequest.defaultCurrency)) &&
        (this.name == null ? feedsCreateRequest.name == null : this.name.equals(feedsCreateRequest.name)) &&
        (this.format == null ? feedsCreateRequest.format == null : this.format.equals(feedsCreateRequest.format)) &&
        (this.defaultLocale == null ? feedsCreateRequest.defaultLocale == null : this.defaultLocale.equals(feedsCreateRequest.defaultLocale)) &&
        (this.credentials == null ? feedsCreateRequest.credentials == null : this.credentials.equals(feedsCreateRequest.credentials)) &&
        (this.location == null ? feedsCreateRequest.location == null : this.location.equals(feedsCreateRequest.location)) &&
        (this.preferredProcessingSchedule == null ? feedsCreateRequest.preferredProcessingSchedule == null : this.preferredProcessingSchedule.equals(feedsCreateRequest.preferredProcessingSchedule)) &&
        (this.catalogType == null ? feedsCreateRequest.catalogType == null : this.catalogType.equals(feedsCreateRequest.catalogType)) &&
        (this.defaultCountry == null ? feedsCreateRequest.defaultCountry == null : this.defaultCountry.equals(feedsCreateRequest.defaultCountry)) &&
        (this.defaultAvailability == null ? feedsCreateRequest.defaultAvailability == null : this.defaultAvailability.equals(feedsCreateRequest.defaultAvailability)) &&
        (this.status == null ? feedsCreateRequest.status == null : this.status.equals(feedsCreateRequest.status)) &&
        (this.catalogId == null ? feedsCreateRequest.catalogId == null : this.catalogId.equals(feedsCreateRequest.catalogId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.defaultCurrency == null ? 0: this.defaultCurrency.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.format == null ? 0: this.format.hashCode());
    result = 31 * result + (this.defaultLocale == null ? 0: this.defaultLocale.hashCode());
    result = 31 * result + (this.credentials == null ? 0: this.credentials.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.preferredProcessingSchedule == null ? 0: this.preferredProcessingSchedule.hashCode());
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.defaultCountry == null ? 0: this.defaultCountry.hashCode());
    result = 31 * result + (this.defaultAvailability == null ? 0: this.defaultAvailability.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.catalogId == null ? 0: this.catalogId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedsCreateRequest {\n");
    
    sb.append("  defaultCurrency: ").append(defaultCurrency).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  defaultLocale: ").append(defaultLocale).append("\n");
    sb.append("  credentials: ").append(credentials).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  preferredProcessingSchedule: ").append(preferredProcessingSchedule).append("\n");
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  defaultCountry: ").append(defaultCountry).append("\n");
    sb.append("  defaultAvailability: ").append(defaultAvailability).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  catalogId: ").append(catalogId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
