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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Request object for updating a feed.
 */
@JsonPropertyOrder({
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_DEFAULT_AVAILABILITY,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_DEFAULT_CURRENCY,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_NAME,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_FORMAT,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_CREDENTIALS,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_LOCATION,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE,
  CatalogsFeedsUpdateRequest.JSON_PROPERTY_STATUS
})
@JsonTypeName("CatalogsFeedsUpdateRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CatalogsFeedsUpdateRequest {
    public static final String JSON_PROPERTY_DEFAULT_AVAILABILITY = "default_availability";
    private ProductAvailabilityType defaultAvailability;

    public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
    private NullableCurrency defaultCurrency;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_FORMAT = "format";
    private CatalogsFormat _format;

    public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
    private CatalogsFeedCredentials credentials;

    public static final String JSON_PROPERTY_LOCATION = "location";
    private String location;

    public static final String JSON_PROPERTY_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
    private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

    public static final String JSON_PROPERTY_STATUS = "status";
    private CatalogsStatus status;

    public CatalogsFeedsUpdateRequest() {
    }

    public CatalogsFeedsUpdateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
        this.defaultAvailability = defaultAvailability;
        return this;
    }

    /**
     * Get defaultAvailability
     * @return defaultAvailability
     */
    @Nullable
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

    public CatalogsFeedsUpdateRequest defaultCurrency(NullableCurrency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Get defaultCurrency
     * @return defaultCurrency
     */
    @Nullable
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

    public CatalogsFeedsUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A human-friendly name associated to a given feed.
     * @return name
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CatalogsFeedsUpdateRequest _format(CatalogsFormat _format) {
        this._format = _format;
        return this;
    }

    /**
     * Get _format
     * @return _format
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CatalogsFormat getFormat() {
        return _format;
    }

    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormat(CatalogsFormat _format) {
        this._format = _format;
    }

    public CatalogsFeedsUpdateRequest credentials(CatalogsFeedCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get credentials
     * @return credentials
     */
    @Valid
    @Nullable
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

    public CatalogsFeedsUpdateRequest location(String location) {
        this.location = location;
        return this;
    }

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @return location
     */
    @Nullable
    @Pattern(regexp="^(http|https|ftp|sftp)://")
    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocation() {
        return location;
    }

    @JsonProperty(JSON_PROPERTY_LOCATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocation(String location) {
        this.location = location;
    }

    public CatalogsFeedsUpdateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
        this.preferredProcessingSchedule = preferredProcessingSchedule;
        return this;
    }

    /**
     * Get preferredProcessingSchedule
     * @return preferredProcessingSchedule
     */
    @Valid
    @Nullable
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

    public CatalogsFeedsUpdateRequest status(CatalogsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Nullable
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = (CatalogsFeedsUpdateRequest) o;
        return Objects.equals(this.defaultAvailability, catalogsFeedsUpdateRequest.defaultAvailability) &&
            Objects.equals(this.defaultCurrency, catalogsFeedsUpdateRequest.defaultCurrency) &&
            Objects.equals(this.name, catalogsFeedsUpdateRequest.name) &&
            Objects.equals(this._format, catalogsFeedsUpdateRequest._format) &&
            Objects.equals(this.credentials, catalogsFeedsUpdateRequest.credentials) &&
            Objects.equals(this.location, catalogsFeedsUpdateRequest.location) &&
            Objects.equals(this.preferredProcessingSchedule, catalogsFeedsUpdateRequest.preferredProcessingSchedule) &&
            Objects.equals(this.status, catalogsFeedsUpdateRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultAvailability, defaultCurrency, name, _format, credentials, location, preferredProcessingSchedule, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedsUpdateRequest {\n");
        sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
        sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _format: ").append(toIndentedString(_format)).append("\n");
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

