package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsFeedCredentials;
import org.openapitools.server.model.CatalogsFeedProcessingSchedule;
import org.openapitools.server.model.CatalogsFormat;
import org.openapitools.server.model.CatalogsStatus;
import org.openapitools.server.model.NullableCurrency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object for updating a feed.
 */
public class CatalogsCreativeAssetsFeedsUpdateRequest   {


    /**
    * Gets or Sets catalogType
    */
    public enum CatalogTypeEnum {
        CREATIVE_ASSETS("CREATIVE_ASSETS");

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
    private CatalogsFeedCredentials credentials;
    private NullableCurrency defaultCurrency;
    private CatalogsFormat format;
    private String location;
    private String name;
    private CatalogsFeedProcessingSchedule preferredProcessingSchedule;
    private CatalogsStatus status;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsFeedsUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsFeedsUpdateRequest.
     *
     * @param catalogType catalogType
     * @param credentials credentials
     * @param defaultCurrency defaultCurrency
     * @param format format
     * @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @param name A human-friendly name associated to a given feed.
     * @param preferredProcessingSchedule preferredProcessingSchedule
     * @param status status
     */
    public CatalogsCreativeAssetsFeedsUpdateRequest(
        CatalogTypeEnum catalogType, 
        CatalogsFeedCredentials credentials, 
        NullableCurrency defaultCurrency, 
        CatalogsFormat format, 
        String location, 
        String name, 
        CatalogsFeedProcessingSchedule preferredProcessingSchedule, 
        CatalogsStatus status
    ) {
        this.catalogType = catalogType;
        this.credentials = credentials;
        this.defaultCurrency = defaultCurrency;
        this.format = format;
        this.location = location;
        this.name = name;
        this.preferredProcessingSchedule = preferredProcessingSchedule;
        this.status = status;
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
     * A human-friendly name associated to a given feed.
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsFeedsUpdateRequest {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

