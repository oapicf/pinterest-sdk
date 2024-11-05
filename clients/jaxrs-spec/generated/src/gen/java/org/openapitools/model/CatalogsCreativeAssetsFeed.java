package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Catalogs Creative Asset Feed object
 **/
@ApiModel(description = "Catalogs Creative Asset Feed object")
@JsonTypeName("CatalogsCreativeAssetsFeed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsFeed   {
  private Date createdAt;
  private String id;
  private Date updatedAt;
  private String name;
  private CatalogsFormat format;
  private CatalogsType catalogType;
  private CatalogsFeedCredentials credentials;
  private String location;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private NullableCurrency defaultCurrency;
  private String defaultLocale;
  private Country defaultCountry;
  private String catalogId;

  /**
   **/
  public CatalogsCreativeAssetsFeed createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "")
  @JsonProperty("created_at")
  @NotNull public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
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
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("updated_at")
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
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
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
  @NotNull public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty("format")
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
  @NotNull public CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty("catalog_type")
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
  @NotNull @Valid public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
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
  @NotNull public String getLocation() {
    return location;
  }

  @JsonProperty("location")
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
  @NotNull @Valid public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  @JsonProperty("preferred_processing_schedule")
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
  @NotNull public CatalogsStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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
  @NotNull public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  @JsonProperty("default_currency")
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
  @NotNull public String getDefaultLocale() {
    return defaultLocale;
  }

  @JsonProperty("default_locale")
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
  @NotNull public Country getDefaultCountry() {
    return defaultCountry;
  }

  @JsonProperty("default_country")
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
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
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
    return Objects.equals(this.createdAt, catalogsCreativeAssetsFeed.createdAt) &&
        Objects.equals(this.id, catalogsCreativeAssetsFeed.id) &&
        Objects.equals(this.updatedAt, catalogsCreativeAssetsFeed.updatedAt) &&
        Objects.equals(this.name, catalogsCreativeAssetsFeed.name) &&
        Objects.equals(this.format, catalogsCreativeAssetsFeed.format) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsFeed.catalogType) &&
        Objects.equals(this.credentials, catalogsCreativeAssetsFeed.credentials) &&
        Objects.equals(this.location, catalogsCreativeAssetsFeed.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsCreativeAssetsFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsCreativeAssetsFeed.status) &&
        Objects.equals(this.defaultCurrency, catalogsCreativeAssetsFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsCreativeAssetsFeed.defaultLocale) &&
        Objects.equals(this.defaultCountry, catalogsCreativeAssetsFeed.defaultCountry) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsFeed.catalogId);
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

