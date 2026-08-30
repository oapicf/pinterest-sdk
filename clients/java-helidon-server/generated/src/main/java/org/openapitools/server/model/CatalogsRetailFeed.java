package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsFeedCredentials;
import org.openapitools.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.server.model.CatalogsFormat;
import org.openapitools.server.model.CatalogsStatus;
import org.openapitools.server.model.Country;
import org.openapitools.server.model.NullableCurrency;
import org.openapitools.server.model.ProductAvailabilityType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Catalogs Retail Feed object
 */
public class CatalogsRetailFeed   {


    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        RETAIL("RETAIL");

        private String value;

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
        public static CatalogTypeEnum fromValue(String text) {
            for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CatalogTypeEnum catalogType;
    private OffsetDateTime createdAt;
    private CatalogsFeedCredentials credentials;
    private ProductAvailabilityType defaultAvailability;
    private Country defaultCountry;
    private NullableCurrency defaultCurrency;
    private String defaultLocale;
    private CatalogsFormat format;
    private String id;
    private String location;
    private String name;
    private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
    private CatalogsStatus status;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public CatalogsRetailFeed() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailFeed.
     *
     * @param catalogType catalogType
     * @param createdAt createdAt
     * @param credentials credentials
     * @param defaultAvailability defaultAvailability
     * @param defaultCountry defaultCountry
     * @param defaultCurrency defaultCurrency
     * @param defaultLocale The locale used within a feed for product descriptions.
     * @param format format
     * @param id ID of the feed entity.
     * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     * @param preferredProcessingSchedule preferredProcessingSchedule
     * @param status status
     * @param updatedAt updatedAt
     */
    public CatalogsRetailFeed(
        CatalogTypeEnum catalogType, 
        OffsetDateTime createdAt, 
        CatalogsFeedCredentials credentials, 
        ProductAvailabilityType defaultAvailability, 
        Country defaultCountry, 
        NullableCurrency defaultCurrency, 
        String defaultLocale, 
        CatalogsFormat format, 
        String id, 
        String location, 
        String name, 
        CatalogsFeedProcessingSchedule preferredProcessingSchedule, 
        CatalogsStatus status, 
        OffsetDateTime updatedAt
    ) {
        this.catalogType = catalogType;
        this.createdAt = createdAt;
        this.credentials = credentials;
        this.defaultAvailability = defaultAvailability;
        this.defaultCountry = defaultCountry;
        this.defaultCurrency = defaultCurrency;
        this.defaultLocale = defaultLocale;
        this.format = format;
        this.id = id;
        this.location = location;
        this.name = name;
        this.preferredProcessingSchedule = preferredProcessingSchedule;
        this.status = status;
        this.updatedAt = updatedAt;
    }



    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogTypeEnum catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get credentials
     * @return credentials
     */
    public CatalogsFeedCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(CatalogsFeedCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * Get defaultAvailability
     * @return defaultAvailability
     */
    public ProductAvailabilityType getDefaultAvailability() {
        return defaultAvailability;
    }

    public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
        this.defaultAvailability = defaultAvailability;
    }

    /**
     * Get defaultCountry
     * @return defaultCountry
     */
    public Country getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(Country defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    /**
     * Get defaultCurrency
     * @return defaultCurrency
     */
    public NullableCurrency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(NullableCurrency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    /**
     * The locale used within a feed for product descriptions.
     * @return defaultLocale
     */
    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    /**
     * Get format
     * @return format
     */
    public CatalogsFormat getFormat() {
        return format;
    }

    public void setFormat(CatalogsFormat format) {
        this.format = format;
    }

    /**
     * ID of the feed entity.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get preferredProcessingSchedule
     * @return preferredProcessingSchedule
     */
    public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
        return preferredProcessingSchedule;
    }

    public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
        this.preferredProcessingSchedule = preferredProcessingSchedule;
    }

    /**
     * Get status
     * @return status
     */
    public CatalogsStatus getStatus() {
        return status;
    }

    public void setStatus(CatalogsStatus status) {
        this.status = status;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

