package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroup;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFilters;
import org.openapitools.server.model.CatalogsHotelProductGroup;
import org.openapitools.server.model.CatalogsHotelProductGroupType;
import org.openapitools.server.model.CatalogsProductGroupStatus;
import org.openapitools.server.model.CatalogsRetailProductGroup;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsVerticalProductGroup   {

    private String catalogId;

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
    private String country;
    private Integer createdAt;
    private String description;
    private String feedId;
    private CatalogsCreativeAssetsProductGroupFilters filters;
    private String id;
    private Boolean isFeatured;
    private String locale;
    private String name;
    private CatalogsProductGroupStatus status;
    private CatalogsHotelProductGroupType type;
    private Integer updatedAt;

    /**
     * Default constructor.
     */
    public CatalogsVerticalProductGroup() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsVerticalProductGroup.
     *
     * @param catalogId Catalog ID pertaining to the product group.
     * @param catalogType catalogType
     * @param country country
     * @param createdAt Unix timestamp in seconds of when catalog product group was created.
     * @param description description
     * @param feedId id of the catalogs feed belonging to this catalog product group
     * @param filters filters
     * @param id ID of the catalog product group.
     * @param isFeatured boolean indicator of whether the product group is being featured or not
     * @param locale locale
     * @param name Name of catalog product group
     * @param status status
     * @param type type
     * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
     */
    public CatalogsVerticalProductGroup(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        String country, 
        Integer createdAt, 
        String description, 
        String feedId, 
        CatalogsCreativeAssetsProductGroupFilters filters, 
        String id, 
        Boolean isFeatured, 
        String locale, 
        String name, 
        CatalogsProductGroupStatus status, 
        CatalogsHotelProductGroupType type, 
        Integer updatedAt
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.country = country;
        this.createdAt = createdAt;
        this.description = description;
        this.feedId = feedId;
        this.filters = filters;
        this.id = id;
        this.isFeatured = isFeatured;
        this.locale = locale;
        this.name = name;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
    }



    /**
     * Catalog ID pertaining to the product group.
     * @return catalogId
     */
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
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
     * Get country
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * id of the catalogs feed belonging to this catalog product group
     * @return feedId
     */
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    /**
     * Get filters
     * @return filters
     */
    public CatalogsCreativeAssetsProductGroupFilters getFilters() {
        return filters;
    }

    public void setFilters(CatalogsCreativeAssetsProductGroupFilters filters) {
        this.filters = filters;
    }

    /**
     * ID of the catalog product group.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * boolean indicator of whether the product group is being featured or not
     * @return isFeatured
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * Get locale
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Name of catalog product group
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get status
     * @return status
     */
    public CatalogsProductGroupStatus getStatus() {
        return status;
    }

    public void setStatus(CatalogsProductGroupStatus status) {
        this.status = status;
    }

    /**
     * Get type
     * @return type
     */
    public CatalogsHotelProductGroupType getType() {
        return type;
    }

    public void setType(CatalogsHotelProductGroupType type) {
        this.type = type;
    }

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @return updatedAt
     */
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsVerticalProductGroup {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

