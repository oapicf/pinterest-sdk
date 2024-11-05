package apimodels;

import apimodels.CatalogsFeedCredentials;
import apimodels.CatalogsFeedProcessingSchedule;
import apimodels.CatalogsFormat;
import apimodels.CatalogsStatus;
import apimodels.CatalogsType;
import apimodels.Country;
import apimodels.NullableCurrency;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Catalogs Creative Asset Feed object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsCreativeAssetsFeed   {
  @JsonProperty("created_at")
  @NotNull
@Valid

  private OffsetDateTime createdAt;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("updated_at")
  @NotNull
@Valid

  private OffsetDateTime updatedAt;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("format")
  @NotNull
@Valid

  private CatalogsFormat format;

  @JsonProperty("catalog_type")
  @NotNull
@Valid

  private CatalogsType catalogType;

  @JsonProperty("credentials")
  @NotNull
@Valid

  private CatalogsFeedCredentials credentials;

  @JsonProperty("location")
  @NotNull

  private String location;

  @JsonProperty("preferred_processing_schedule")
  @NotNull
@Valid

  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @JsonProperty("status")
  @NotNull
@Valid

  private CatalogsStatus status;

  @JsonProperty("default_currency")
  @NotNull
@Valid

  private NullableCurrency defaultCurrency;

  @JsonProperty("default_locale")
  @NotNull

  private String defaultLocale;

  @JsonProperty("default_country")
  @NotNull
@Valid

  private Country defaultCountry;

  @JsonProperty("catalog_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogId;

  public CatalogsCreativeAssetsFeed createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsCreativeAssetsFeed id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsCreativeAssetsFeed updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CatalogsCreativeAssetsFeed name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsCreativeAssetsFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsCreativeAssetsFeed catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  public CatalogsCreativeAssetsFeed location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
  **/
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsCreativeAssetsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

   /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
  **/
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsCreativeAssetsFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsCreativeAssetsFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsCreativeAssetsFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

   /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
  **/
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsCreativeAssetsFeed defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * Get defaultCountry
   * @return defaultCountry
  **/
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsCreativeAssetsFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

