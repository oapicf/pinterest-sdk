/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import org.openapitools.client.model.CatalogsFeedCredentials;
import org.openapitools.client.model.CatalogsFeedProcessingSchedule;
import org.openapitools.client.model.CatalogsFormat;
import org.openapitools.client.model.CatalogsStatus;
import org.openapitools.client.model.CatalogsType;
import org.openapitools.client.model.Country;
import org.openapitools.client.model.NullableCurrency;
import org.openapitools.client.model.ProductAvailabilityType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Catalogs Retail Feed object
 **/
@ApiModel(description = "Catalogs Retail Feed object")
public class CatalogsRetailFeed {
  
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("updated_at")
  private Date updatedAt = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("format")
  private CatalogsFormat format = null;
  @SerializedName("catalog_type")
  private CatalogsType catalogType = null;
  @SerializedName("credentials")
  private CatalogsFeedCredentials credentials = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule = null;
  @SerializedName("status")
  private CatalogsStatus status = null;
  @SerializedName("default_currency")
  private NullableCurrency defaultCurrency = null;
  @SerializedName("default_locale")
  private String defaultLocale = null;
  @SerializedName("default_country")
  private Country defaultCountry = null;
  @SerializedName("default_availability")
  private ProductAvailabilityType defaultAvailability = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   **/
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
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
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * The locale used within a feed for product descriptions.
   **/
  @ApiModelProperty(required = true, value = "The locale used within a feed for product descriptions.")
  public String getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
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
  @ApiModelProperty(required = true, value = "")
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }
  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailFeed catalogsRetailFeed = (CatalogsRetailFeed) o;
    return (this.createdAt == null ? catalogsRetailFeed.createdAt == null : this.createdAt.equals(catalogsRetailFeed.createdAt)) &&
        (this.id == null ? catalogsRetailFeed.id == null : this.id.equals(catalogsRetailFeed.id)) &&
        (this.updatedAt == null ? catalogsRetailFeed.updatedAt == null : this.updatedAt.equals(catalogsRetailFeed.updatedAt)) &&
        (this.name == null ? catalogsRetailFeed.name == null : this.name.equals(catalogsRetailFeed.name)) &&
        (this.format == null ? catalogsRetailFeed.format == null : this.format.equals(catalogsRetailFeed.format)) &&
        (this.catalogType == null ? catalogsRetailFeed.catalogType == null : this.catalogType.equals(catalogsRetailFeed.catalogType)) &&
        (this.credentials == null ? catalogsRetailFeed.credentials == null : this.credentials.equals(catalogsRetailFeed.credentials)) &&
        (this.location == null ? catalogsRetailFeed.location == null : this.location.equals(catalogsRetailFeed.location)) &&
        (this.preferredProcessingSchedule == null ? catalogsRetailFeed.preferredProcessingSchedule == null : this.preferredProcessingSchedule.equals(catalogsRetailFeed.preferredProcessingSchedule)) &&
        (this.status == null ? catalogsRetailFeed.status == null : this.status.equals(catalogsRetailFeed.status)) &&
        (this.defaultCurrency == null ? catalogsRetailFeed.defaultCurrency == null : this.defaultCurrency.equals(catalogsRetailFeed.defaultCurrency)) &&
        (this.defaultLocale == null ? catalogsRetailFeed.defaultLocale == null : this.defaultLocale.equals(catalogsRetailFeed.defaultLocale)) &&
        (this.defaultCountry == null ? catalogsRetailFeed.defaultCountry == null : this.defaultCountry.equals(catalogsRetailFeed.defaultCountry)) &&
        (this.defaultAvailability == null ? catalogsRetailFeed.defaultAvailability == null : this.defaultAvailability.equals(catalogsRetailFeed.defaultAvailability));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.format == null ? 0: this.format.hashCode());
    result = 31 * result + (this.catalogType == null ? 0: this.catalogType.hashCode());
    result = 31 * result + (this.credentials == null ? 0: this.credentials.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.preferredProcessingSchedule == null ? 0: this.preferredProcessingSchedule.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.defaultCurrency == null ? 0: this.defaultCurrency.hashCode());
    result = 31 * result + (this.defaultLocale == null ? 0: this.defaultLocale.hashCode());
    result = 31 * result + (this.defaultCountry == null ? 0: this.defaultCountry.hashCode());
    result = 31 * result + (this.defaultAvailability == null ? 0: this.defaultAvailability.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeed {\n");
    
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  catalogType: ").append(catalogType).append("\n");
    sb.append("  credentials: ").append(credentials).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  preferredProcessingSchedule: ").append(preferredProcessingSchedule).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  defaultCurrency: ").append(defaultCurrency).append("\n");
    sb.append("  defaultLocale: ").append(defaultLocale).append("\n");
    sb.append("  defaultCountry: ").append(defaultCountry).append("\n");
    sb.append("  defaultAvailability: ").append(defaultAvailability).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}