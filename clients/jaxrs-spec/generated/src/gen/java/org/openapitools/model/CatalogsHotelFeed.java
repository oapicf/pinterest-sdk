package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Catalogs Hotel Feed object
 **/
@ApiModel(description = "Catalogs Hotel Feed object")
@JsonTypeName("CatalogsHotelFeed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelFeed   {
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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CatalogTypeEnum fromString(String s) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  private Date createdAt;
  private CatalogsFeedCredentials credentials;
  private NullableCurrency defaultCurrency;
  private String defaultLocale;
  private CatalogsFormat format;
  private String id;
  private String location;
  private String name;
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
  private CatalogsStatus status;
  private Date updatedAt;

  public CatalogsHotelFeed() {
  }

  @JsonCreator
  public CatalogsHotelFeed(
    @JsonProperty(required = true, value = "catalog_id") String catalogId,
    @JsonProperty(required = true, value = "catalog_type") CatalogTypeEnum catalogType,
    @JsonProperty(required = true, value = "created_at") Date createdAt,
    @JsonProperty(required = true, value = "default_locale") String defaultLocale,
    @JsonProperty(required = true, value = "format") CatalogsFormat format,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "location") String location,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "status") CatalogsStatus status,
    @JsonProperty(required = true, value = "updated_at") Date updatedAt
  ) {
    this.catalogId = catalogId;
    this.catalogType = catalogType;
    this.createdAt = createdAt;
    this.defaultLocale = defaultLocale;
    this.format = format;
    this.id = id;
    this.location = location;
    this.name = name;
    this.status = status;
    this.updatedAt = updatedAt;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   **/
  public CatalogsHotelFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.")
  @JsonProperty(required = true, value = "catalog_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty(required = true, value = "catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   **/
  public CatalogsHotelFeed catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "catalog_type")
  @NotNull public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  @JsonProperty(required = true, value = "catalog_type")
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsHotelFeed createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public CatalogsHotelFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  @Valid public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }

  /**
   **/
  public CatalogsHotelFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default_currency")
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  @JsonProperty("default_currency")
  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  /**
   * The locale used within a feed for product descriptions.
   **/
  public CatalogsHotelFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The locale used within a feed for product descriptions.")
  @JsonProperty(required = true, value = "default_locale")
  @NotNull public String getDefaultLocale() {
    return defaultLocale;
  }

  @JsonProperty(required = true, value = "default_locale")
  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   **/
  public CatalogsHotelFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "format")
  @NotNull public CatalogsFormat getFormat() {
    return format;
  }

  @JsonProperty(required = true, value = "format")
  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }

  /**
   * ID of the feed entity.
   **/
  public CatalogsHotelFeed id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "864344156814050986", required = true, value = "ID of the feed entity.")
  @JsonProperty(required = true, value = "id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   **/
  public CatalogsHotelFeed location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.")
  @JsonProperty(required = true, value = "location")
  @NotNull  @Pattern(regexp="^(http|https|ftp|sftp)://")public String getLocation() {
    return location;
  }

  @JsonProperty(required = true, value = "location")
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   **/
  public CatalogsHotelFeed name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CatalogsHotelFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preferred_processing_schedule")
  @Valid public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  @JsonProperty("preferred_processing_schedule")
  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }

  /**
   **/
  public CatalogsHotelFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "status")
  @NotNull public CatalogsStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }

  /**
   **/
  public CatalogsHotelFeed updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "updated_at")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty(required = true, value = "updated_at")
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
    CatalogsHotelFeed catalogsHotelFeed = (CatalogsHotelFeed) o;
    return Objects.equals(this.catalogId, catalogsHotelFeed.catalogId) &&
        Objects.equals(this.catalogType, catalogsHotelFeed.catalogType) &&
        Objects.equals(this.createdAt, catalogsHotelFeed.createdAt) &&
        Objects.equals(this.credentials, catalogsHotelFeed.credentials) &&
        Objects.equals(this.defaultCurrency, catalogsHotelFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsHotelFeed.defaultLocale) &&
        Objects.equals(this.format, catalogsHotelFeed.format) &&
        Objects.equals(this.id, catalogsHotelFeed.id) &&
        Objects.equals(this.location, catalogsHotelFeed.location) &&
        Objects.equals(this.name, catalogsHotelFeed.name) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsHotelFeed.status) &&
        Objects.equals(this.updatedAt, catalogsHotelFeed.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, catalogType, createdAt, credentials, defaultCurrency, defaultLocale, format, id, location, name, preferredProcessingSchedule, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeed {\n");
    
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
