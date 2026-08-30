package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Catalogs Retail Feed object
 */

@Schema(name = "CatalogsRetailFeed", description = "Catalogs Retail Feed object")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailFeed implements CatalogsFeed {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private CatalogTypeEnum catalogType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private JsonNullable<CatalogsFeedCredentials> credentials = JsonNullable.<CatalogsFeedCredentials>undefined();

  private JsonNullable<ProductAvailabilityType> defaultAvailability = JsonNullable.<ProductAvailabilityType>undefined();

  private Country defaultCountry;

  private JsonNullable<NullableCurrency> defaultCurrency = JsonNullable.<NullableCurrency>undefined();

  private String defaultLocale;

  private CatalogsFormat format;

  private String id;

  private String location;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule = JsonNullable.<CatalogsFeedProcessingSchedule>undefined();

  private CatalogsStatus status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updatedAt;

  public CatalogsRetailFeed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailFeed(CatalogTypeEnum catalogType, Date createdAt, Country defaultCountry, String defaultLocale, CatalogsFormat format, String id, String location, String name, CatalogsStatus status, Date updatedAt) {
    this.catalogType = catalogType;
    this.createdAt = createdAt;
    this.defaultCountry = defaultCountry;
    this.defaultLocale = defaultLocale;
    this.format = format;
    this.id = id;
    this.location = location;
    this.name = JsonNullable.of(name);
    this.status = status;
    this.updatedAt = updatedAt;
  }

  public CatalogsRetailFeed catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailFeed createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsRetailFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = JsonNullable.of(credentials);
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @Valid 
  @Schema(name = "credentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credentials")
  public JsonNullable<CatalogsFeedCredentials> getCredentials() {
    return credentials;
  }

  public void setCredentials(JsonNullable<CatalogsFeedCredentials> credentials) {
    this.credentials = credentials;
  }

  public CatalogsRetailFeed defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = JsonNullable.of(defaultAvailability);
    return this;
  }

  /**
   * Get defaultAvailability
   * @return defaultAvailability
   */
  @Valid 
  @Schema(name = "default_availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_availability")
  public JsonNullable<ProductAvailabilityType> getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(JsonNullable<ProductAvailabilityType> defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }

  public CatalogsRetailFeed defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   */
  @NotNull @Valid 
  @Schema(name = "default_country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_country")
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  public CatalogsRetailFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = JsonNullable.of(defaultCurrency);
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
   */
  @Valid 
  @Schema(name = "default_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_currency")
  public JsonNullable<NullableCurrency> getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(JsonNullable<NullableCurrency> defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  public CatalogsRetailFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
   */
  @NotNull 
  @Schema(name = "default_locale", description = "The locale used within a feed for product descriptions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default_locale")
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public CatalogsRetailFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @NotNull @Valid 
  @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  public CatalogsRetailFeed id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the feed entity.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "864344156814050986", description = "ID of the feed entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsRetailFeed location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  @NotNull @Pattern(regexp = "^(http|https|ftp|sftp)://") 
  @Schema(name = "location", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CatalogsRetailFeed name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CatalogsRetailFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = JsonNullable.of(preferredProcessingSchedule);
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
   */
  @Valid 
  @Schema(name = "preferred_processing_schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_processing_schedule")
  public JsonNullable<CatalogsFeedProcessingSchedule> getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(JsonNullable<CatalogsFeedProcessingSchedule> preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  public CatalogsRetailFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  public CatalogsRetailFeed updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    return Objects.equals(this.catalogType, catalogsRetailFeed.catalogType) &&
        Objects.equals(this.createdAt, catalogsRetailFeed.createdAt) &&
        equalsNullable(this.credentials, catalogsRetailFeed.credentials) &&
        equalsNullable(this.defaultAvailability, catalogsRetailFeed.defaultAvailability) &&
        Objects.equals(this.defaultCountry, catalogsRetailFeed.defaultCountry) &&
        equalsNullable(this.defaultCurrency, catalogsRetailFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsRetailFeed.defaultLocale) &&
        Objects.equals(this.format, catalogsRetailFeed.format) &&
        Objects.equals(this.id, catalogsRetailFeed.id) &&
        Objects.equals(this.location, catalogsRetailFeed.location) &&
        Objects.equals(this.name, catalogsRetailFeed.name) &&
        equalsNullable(this.preferredProcessingSchedule, catalogsRetailFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsRetailFeed.status) &&
        Objects.equals(this.updatedAt, catalogsRetailFeed.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, createdAt, hashCodeNullable(credentials), hashCodeNullable(defaultAvailability), defaultCountry, hashCodeNullable(defaultCurrency), defaultLocale, format, id, location, name, hashCodeNullable(preferredProcessingSchedule), status, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailFeed {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

