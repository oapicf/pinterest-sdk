package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupFilters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsCreativeAssetsProductGroup   {

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
    private Integer createdAt;
    private String description;
    private CatalogsCreativeAssetsProductGroupFilters filters;
    private String id;
    private String name;
    private Integer updatedAt;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsProductGroup() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsProductGroup.
     *
     * @param catalogId Catalog ID pertaining to the product group.
     * @param catalogType catalogType
     * @param createdAt Unix timestamp in seconds of when catalog product group was created.
     * @param description description
     * @param filters filters
     * @param id ID of the catalog product group.
     * @param name Name of catalog product group
     * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
     */
    public CatalogsCreativeAssetsProductGroup(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        Integer createdAt, 
        String description, 
        CatalogsCreativeAssetsProductGroupFilters filters, 
        String id, 
        String name, 
        Integer updatedAt
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.createdAt = createdAt;
        this.description = description;
        this.filters = filters;
        this.id = id;
        this.name = name;
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
        sb.append("class CatalogsCreativeAssetsProductGroup {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

