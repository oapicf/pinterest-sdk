package apimodels;

import apimodels.CatalogsDbItem;
import apimodels.CatalogsFeedCredentials;
import apimodels.CatalogsFeedProcessingSchedule;
import apimodels.CatalogsFormat;
import apimodels.CatalogsStatus;
import apimodels.Country;
import apimodels.FeedFields;
import apimodels.NullableCurrency;
import apimodels.ProductAvailabilityType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Catalogs Catalogs Feed object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeed   {
  @JsonProperty("created_at")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("id")
  
  private String id;

  @JsonProperty("updated_at")
  @Valid

  private OffsetDateTime updatedAt;

  @JsonProperty("default_country")
  @NotNull
@Valid

  private Country defaultCountry;

  @JsonProperty("default_availability")
  @NotNull
@Valid

  private ProductAvailabilityType defaultAvailability;

  @JsonProperty("default_currency")
  @NotNull
@Valid

  private NullableCurrency defaultCurrency;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("format")
  @NotNull
@Valid

  private CatalogsFormat format;

  @JsonProperty("default_locale")
  @NotNull

  private String defaultLocale;

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

  public CatalogsFeed createdAt(OffsetDateTime createdAt) {
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

  public CatalogsFeed id(String id) {
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

  public CatalogsFeed updatedAt(OffsetDateTime updatedAt) {
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

  public CatalogsFeed defaultCountry(Country defaultCountry) {
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

  public CatalogsFeed defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

   /**
   * Get defaultAvailability
   * @return defaultAvailability
  **/
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  public CatalogsFeed defaultCurrency(NullableCurrency defaultCurrency) {
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

  public CatalogsFeed name(String name) {
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

  public CatalogsFeed format(CatalogsFormat format) {
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

  public CatalogsFeed defaultLocale(String defaultLocale) {
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

  public CatalogsFeed credentials(CatalogsFeedCredentials credentials) {
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

  public CatalogsFeed location(String location) {
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

  public CatalogsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
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

  public CatalogsFeed status(CatalogsStatus status) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeed catalogsFeed = (CatalogsFeed) o;
    return Objects.equals(createdAt, catalogsFeed.createdAt) &&
        Objects.equals(id, catalogsFeed.id) &&
        Objects.equals(updatedAt, catalogsFeed.updatedAt) &&
        Objects.equals(defaultCountry, catalogsFeed.defaultCountry) &&
        Objects.equals(defaultAvailability, catalogsFeed.defaultAvailability) &&
        Objects.equals(defaultCurrency, catalogsFeed.defaultCurrency) &&
        Objects.equals(name, catalogsFeed.name) &&
        Objects.equals(format, catalogsFeed.format) &&
        Objects.equals(defaultLocale, catalogsFeed.defaultLocale) &&
        Objects.equals(credentials, catalogsFeed.credentials) &&
        Objects.equals(location, catalogsFeed.location) &&
        Objects.equals(preferredProcessingSchedule, catalogsFeed.preferredProcessingSchedule) &&
        Objects.equals(status, catalogsFeed.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, defaultCountry, defaultAvailability, defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeed {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

