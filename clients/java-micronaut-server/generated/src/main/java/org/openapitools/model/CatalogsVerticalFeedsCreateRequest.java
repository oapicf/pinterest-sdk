/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeedsCreateRequest;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsHotelFeedsCreateRequest;
import org.openapitools.model.CatalogsRetailFeedsCreateRequest;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Request object for creating a feed.
 */
@Schema(name = "CatalogsVerticalFeedsCreateRequest", description = "Request object for creating a feed.")
@JsonPropertyOrder({
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_DEFAULT_CURRENCY,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_NAME,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_FORMAT,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_DEFAULT_LOCALE,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_CREDENTIALS,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_LOCATION,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_CATALOG_TYPE,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_DEFAULT_COUNTRY,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_DEFAULT_AVAILABILITY,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_STATUS,
  CatalogsVerticalFeedsCreateRequest.JSON_PROPERTY_CATALOG_ID
})
@JsonTypeName("CatalogsVerticalFeedsCreateRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@JsonIgnoreProperties(
  value = "catalog_type", // ignore manually set catalog_type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the catalog_type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsFeedsCreateRequest.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelFeedsCreateRequest.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailFeedsCreateRequest.class, name = "RETAIL"),
})

@Introspected
public class CatalogsVerticalFeedsCreateRequest {
    public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
    private NullableCurrency defaultCurrency;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_FORMAT = "format";
    private CatalogsFormat _format;

    public static final String JSON_PROPERTY_DEFAULT_LOCALE = "default_locale";
    private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

    public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
    private CatalogsFeedCredentials credentials;

    public static final String JSON_PROPERTY_LOCATION = "location";
    private String location;

    public static final String JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
    private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

    public static final String JSON_PROPERTY_CATALOG_TYPE = "catalog_type";
    protected CatalogsType catalogType;

    public static final String JSON_PROPERTY_DEFAULT_COUNTRY = "default_country";
    private Country defaultCountry;

    public static final String JSON_PROPERTY_DEFAULT_AVAILABILITY = "default_availability";
    private ProductAvailabilityType defaultAvailability;

    public static final String JSON_PROPERTY_STATUS = "status";
    private CatalogsStatus status;

    public static final String JSON_PROPERTY_CATALOG_ID = "catalog_id";
    private String catalogId;

    public CatalogsVerticalFeedsCreateRequest(String name, CatalogsFormat _format, CatalogsFeedsCreateRequestDefaultLocale defaultLocale, String location, CatalogsType catalogType, Country defaultCountry) {
        this.name = name;
        this._format = _format;
        this.defaultLocale = defaultLocale;
        this.location = location;
        this.catalogType = catalogType;
        this.defaultCountry = defaultCountry;
    }

    public CatalogsVerticalFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Get defaultCurrency
     * @return defaultCurrency
     */
    @Nullable
    @Schema(name = "default_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public NullableCurrency getDefaultCurrency() {
        return defaultCurrency;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultCurrency(NullableCurrency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public CatalogsVerticalFeedsCreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A human-friendly name associated to a given feed.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "A human-friendly name associated to a given feed.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public CatalogsVerticalFeedsCreateRequest _format(CatalogsFormat _format) {
        this._format = _format;
        return this;
    }

    /**
     * Get _format
     * @return _format
     */
    @NotNull
    @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsFormat getFormat() {
        return _format;
    }

    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFormat(CatalogsFormat _format) {
        this._format = _format;
    }

    public CatalogsVerticalFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
        this.defaultLocale = defaultLocale;
        return this;
    }

    /**
     * Get defaultLocale
     * @return defaultLocale
     */
    @Valid
    @NotNull
    @Schema(name = "default_locale", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DEFAULT_LOCALE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
        return defaultLocale;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_LOCALE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public CatalogsVerticalFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get credentials
     * @return credentials
     */
    @Valid
    @Nullable
    @Schema(name = "credentials", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CREDENTIALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsFeedCredentials getCredentials() {
        return credentials;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIALS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentials(CatalogsFeedCredentials credentials) {
        this.credentials = credentials;
    }

    public CatalogsVerticalFeedsCreateRequest location(String location) {
        this.location = location;
        return this;
    }

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @return location
     */
    @NotNull
    @Pattern(regexp="^(http|https|ftp|sftp)://")
    @Schema(name = "location", description = "The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLocation() {
        return location;
    }

    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLocation(String location) {
        this.location = location;
    }

    public CatalogsVerticalFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
        this.preferredProcessingSchedule = preferredProcessingSchedule;
        return this;
    }

    /**
     * Get preferredProcessingSchedule
     * @return preferredProcessingSchedule
     */
    @Valid
    @Nullable
    @Schema(name = "preferred_processing_schedule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
        return preferredProcessingSchedule;
    }

    @JsonProperty(JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
        this.preferredProcessingSchedule = preferredProcessingSchedule;
    }

    public CatalogsVerticalFeedsCreateRequest catalogType(CatalogsType catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Get catalogType
     * @return catalogType
     */
    @NotNull
    @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CatalogsType getCatalogType() {
        return catalogType;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCatalogType(CatalogsType catalogType) {
        this.catalogType = catalogType;
    }

    public CatalogsVerticalFeedsCreateRequest defaultCountry(Country defaultCountry) {
        this.defaultCountry = defaultCountry;
        return this;
    }

    /**
     * Get defaultCountry
     * @return defaultCountry
     */
    @NotNull
    @Schema(name = "default_country", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DEFAULT_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Country getDefaultCountry() {
        return defaultCountry;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDefaultCountry(Country defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    public CatalogsVerticalFeedsCreateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
        this.defaultAvailability = defaultAvailability;
        return this;
    }

    /**
     * Get defaultAvailability
     * @return defaultAvailability
     */
    @Nullable
    @Schema(name = "default_availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DEFAULT_AVAILABILITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ProductAvailabilityType getDefaultAvailability() {
        return defaultAvailability;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_AVAILABILITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
        this.defaultAvailability = defaultAvailability;
    }

    public CatalogsVerticalFeedsCreateRequest status(CatalogsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Valid
    @Nullable
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(CatalogsStatus status) {
        this.status = status;
    }

    public CatalogsVerticalFeedsCreateRequest catalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
     * @return catalogId
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @Schema(name = "catalog_id", description = "Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCatalogId() {
        return catalogId;
    }

    @JsonProperty(JSON_PROPERTY_CATALOG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        CatalogsVerticalFeedsCreateRequest catalogsVerticalFeedsCreateRequest = (CatalogsVerticalFeedsCreateRequest) o;
        return Objects.equals(this.defaultCurrency, catalogsVerticalFeedsCreateRequest.defaultCurrency) &&
            Objects.equals(this.name, catalogsVerticalFeedsCreateRequest.name) &&
            Objects.equals(this._format, catalogsVerticalFeedsCreateRequest._format) &&
            Objects.equals(this.defaultLocale, catalogsVerticalFeedsCreateRequest.defaultLocale) &&
            Objects.equals(this.credentials, catalogsVerticalFeedsCreateRequest.credentials) &&
            Objects.equals(this.location, catalogsVerticalFeedsCreateRequest.location) &&
            Objects.equals(this.preferredProcessingSchedule, catalogsVerticalFeedsCreateRequest.preferredProcessingSchedule) &&
            Objects.equals(this.catalogType, catalogsVerticalFeedsCreateRequest.catalogType) &&
            Objects.equals(this.defaultCountry, catalogsVerticalFeedsCreateRequest.defaultCountry) &&
            Objects.equals(this.defaultAvailability, catalogsVerticalFeedsCreateRequest.defaultAvailability) &&
            Objects.equals(this.status, catalogsVerticalFeedsCreateRequest.status) &&
            Objects.equals(this.catalogId, catalogsVerticalFeedsCreateRequest.catalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultCurrency, name, _format, defaultLocale, credentials, location, preferredProcessingSchedule, catalogType, defaultCountry, defaultAvailability, status, catalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsVerticalFeedsCreateRequest {\n");
        sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _format: ").append(toIndentedString(_format)).append("\n");
        sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
        sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

