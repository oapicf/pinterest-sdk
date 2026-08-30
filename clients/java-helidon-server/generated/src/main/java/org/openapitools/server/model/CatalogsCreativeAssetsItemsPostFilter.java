package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsCreativeAssetsItemsPostFilter   {

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
    private List<String> creativeAssetsIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsItemsPostFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsItemsPostFilter.
     *
     * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @param catalogType catalogType
     * @param creativeAssetsIds creativeAssetsIds
     */
    public CatalogsCreativeAssetsItemsPostFilter(
        String catalogId, 
        CatalogTypeEnum catalogType, 
        List<String> creativeAssetsIds
    ) {
        this.catalogId = catalogId;
        this.catalogType = catalogType;
        this.creativeAssetsIds = creativeAssetsIds;
    }



    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
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
     * Get creativeAssetsIds
     * @return creativeAssetsIds
     */
    public List<String> getCreativeAssetsIds() {
        return creativeAssetsIds;
    }

    public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
        this.creativeAssetsIds = creativeAssetsIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsItemsPostFilter {\n");
        
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    creativeAssetsIds: ").append(toIndentedString(creativeAssetsIds)).append("\n");
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

