package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Catalogs Creative Asset Feed object
 */
@ApiModel(description="Catalogs Creative Asset Feed object")

public class CatalogsCreativeAssetsFeed  {
  
 /**
  * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  */
  @ApiModelProperty(required = true, value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
  private String catalogId;

public enum CatalogTypeEnum {

    @JsonProperty("CREATIVE_ASSETS") CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));

    private String value;

    CatalogTypeEnum (String v) {
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

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedCredentials credentials;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country defaultCountry;

  @ApiModelProperty(value = "")
  @Valid
  private NullableCurrency defaultCurrency;

 /**
  * The locale used within a feed for product descriptions.
  */
  @ApiModelProperty(required = true, value = "The locale used within a feed for product descriptions.")
  private String defaultLocale;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsFormat format;

 /**
  * ID of the feed entity.
  */
  @ApiModelProperty(example = "864344156814050986", required = true, value = "ID of the feed entity.")
  private String id;

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  */
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  private String location;

 /**
  * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  */
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsStatus status;

  @ApiModelProperty(required = true, value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updatedAt;
 /**
  * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  * @return catalogId
  */
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
 public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Sets the <code>catalogId</code> property.
   */
  public CatalogsCreativeAssetsFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public String getCatalogType() {
    return catalogType == null ? null : catalogType.value();
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsCreativeAssetsFeed catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsCreativeAssetsFeed createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get credentials
  * @return credentials
  */
  @JsonProperty("credentials")
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  /**
   * Sets the <code>credentials</code> property.
   */
 public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   * Sets the <code>credentials</code> property.
   */
  public CatalogsCreativeAssetsFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

 /**
  * Get defaultCountry
  * @return defaultCountry
  */
  @JsonProperty("default_country")
  @NotNull
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  /**
   * Sets the <code>defaultCountry</code> property.
   */
 public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }

  /**
   * Sets the <code>defaultCountry</code> property.
   */
  public CatalogsCreativeAssetsFeed defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

 /**
  * Get defaultCurrency
  * @return defaultCurrency
  */
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  /**
   * Sets the <code>defaultCurrency</code> property.
   */
 public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * Sets the <code>defaultCurrency</code> property.
   */
  public CatalogsCreativeAssetsFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

 /**
  * The locale used within a feed for product descriptions.
  * @return defaultLocale
  */
  @JsonProperty("default_locale")
  @NotNull
  public String getDefaultLocale() {
    return defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
 public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * Sets the <code>defaultLocale</code> property.
   */
  public CatalogsCreativeAssetsFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

 /**
  * Get format
  * @return format
  */
  @JsonProperty("format")
  @NotNull
  public CatalogsFormat getFormat() {
    return format;
  }

  /**
   * Sets the <code>format</code> property.
   */
 public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * Sets the <code>format</code> property.
   */
  public CatalogsCreativeAssetsFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

 /**
  * ID of the feed entity.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsCreativeAssetsFeed id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  * @return location
  */
  @JsonProperty("location")
  @NotNull
 @Pattern(regexp="^(http|https|ftp|sftp)://")  public String getLocation() {
    return location;
  }

  /**
   * Sets the <code>location</code> property.
   */
 public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Sets the <code>location</code> property.
   */
  public CatalogsCreativeAssetsFeed location(String location) {
    this.location = location;
    return this;
  }

 /**
  * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CatalogsCreativeAssetsFeed name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get preferredProcessingSchedule
  * @return preferredProcessingSchedule
  */
  @JsonProperty("preferred_processing_schedule")
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  /**
   * Sets the <code>preferredProcessingSchedule</code> property.
   */
 public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   * Sets the <code>preferredProcessingSchedule</code> property.
   */
  public CatalogsCreativeAssetsFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public CatalogsStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogsCreativeAssetsFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Get updatedAt
  * @return updatedAt
  */
  @JsonProperty("updated_at")
  @NotNull
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   * <br><em>N.B. <code>updatedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Sets the <code>updatedAt</code> property.
   * <br><em>N.B. <code>updatedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CatalogsCreativeAssetsFeed updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
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
    CatalogsCreativeAssetsFeed catalogsCreativeAssetsFeed = (CatalogsCreativeAssetsFeed) o;
    return Objects.equals(this.catalogId, catalogsCreativeAssetsFeed.catalogId) &&
        Objects.equals(this.catalogType, catalogsCreativeAssetsFeed.catalogType) &&
        Objects.equals(this.createdAt, catalogsCreativeAssetsFeed.createdAt) &&
        Objects.equals(this.credentials, catalogsCreativeAssetsFeed.credentials) &&
        Objects.equals(this.defaultCountry, catalogsCreativeAssetsFeed.defaultCountry) &&
        Objects.equals(this.defaultCurrency, catalogsCreativeAssetsFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsCreativeAssetsFeed.defaultLocale) &&
        Objects.equals(this.format, catalogsCreativeAssetsFeed.format) &&
        Objects.equals(this.id, catalogsCreativeAssetsFeed.id) &&
        Objects.equals(this.location, catalogsCreativeAssetsFeed.location) &&
        Objects.equals(this.name, catalogsCreativeAssetsFeed.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsCreativeAssetsFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsCreativeAssetsFeed.status) &&
        Objects.equals(this.updatedAt, catalogsCreativeAssetsFeed.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, credentials, defaultCountry, defaultCurrency, defaultLocale, format, id, location, name, preferredProcessingSchedule, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeed {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

