package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;



/**
 * Catalogs Creative Asset Feed object
 **/

@ApiModel(description = "Catalogs Creative Asset Feed object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsFeed   {
  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("updated_at")
  private Date updatedAt;

  @JsonProperty("name")
  private String name;

  @JsonProperty("format")
  private CatalogsFormat format;

  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("credentials")
  private CatalogsFeedCredentials credentials;

  @JsonProperty("location")
  private String location;

  @JsonProperty("preferred_processing_schedule")
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("status")
  private CatalogsStatus status;

  @JsonProperty("default_currency")
  private NullableCurrency defaultCurrency;

  @JsonProperty("default_locale")
  private String defaultLocale;

  @JsonProperty("default_country")
  private Country defaultCountry;

  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   **/
  public CatalogsCreativeAssetsFeed createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "")
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   **/
  public CatalogsCreativeAssetsFeed name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public CatalogsCreativeAssetsFeed location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("preferred_processing_schedule")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * The locale used within a feed for product descriptions.
   **/
  public CatalogsCreativeAssetsFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  
  @ApiModelProperty(example = "en-US", required = true, value = "The locale used within a feed for product descriptions.")
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   **/
  public CatalogsCreativeAssetsFeed defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }
  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   **/
  public CatalogsCreativeAssetsFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
  @JsonProperty("catalog_id")
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
    CatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed = (CatalogsCreativeAssetsFeed) o;
    return Objects.equals(createdAt, catalogsCreativeAssetsFeed.createdAt) &&
        Objects.equals(id, catalogsCreativeAssetsFeed.id) &&
        Objects.equals(updatedAt, catalogsCreativeAssetsFeed.updatedAt) &&
        Objects.equals(name, catalogsCreativeAssetsFeed.name) &&
        Objects.equals(format, catalogsCreativeAssetsFeed.format) &&
        Objects.equals(catalogType, catalogsCreativeAssetsFeed.catalogType) &&
        Objects.equals(credentials, catalogsCreativeAssetsFeed.credentials) &&
        Objects.equals(location, catalogsCreativeAssetsFeed.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsCreativeAssetsFeed.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsCreativeAssetsFeed.status) &&
        Objects.equals(defaultCurrency, catalogsCreativeAssetsFeed.defaultCurrency) &&
        Objects.equals(defaultLocale, catalogsCreativeAssetsFeed.defaultLocale) &&
        Objects.equals(defaultCountry, catalogsCreativeAssetsFeed.defaultCountry) &&
        Objects.equals(catalogId, catalogsCreativeAssetsFeed.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeed {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
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

