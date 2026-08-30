package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Product counts for a Retail CatalogsProductGroup
 */
public class CatalogsRetailProductGroupProductCounts   {


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
    private BigDecimal inStock;
    private BigDecimal outOfStock;
    private BigDecimal preorder;
    private BigDecimal total;
    private BigDecimal videos;

    /**
     * Default constructor.
     */
    public CatalogsRetailProductGroupProductCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsRetailProductGroupProductCounts.
     *
     * @param catalogType catalogType
     * @param inStock inStock
     * @param outOfStock outOfStock
     * @param preorder preorder
     * @param total total
     * @param videos videos
     */
    public CatalogsRetailProductGroupProductCounts(
        CatalogTypeEnum catalogType, 
        BigDecimal inStock, 
        BigDecimal outOfStock, 
        BigDecimal preorder, 
        BigDecimal total, 
        BigDecimal videos
    ) {
        this.catalogType = catalogType;
        this.inStock = inStock;
        this.outOfStock = outOfStock;
        this.preorder = preorder;
        this.total = total;
        this.videos = videos;
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
     * Get inStock
     * minimum: 0
     * @return inStock
     */
    public BigDecimal getInStock() {
        return inStock;
    }

    public void setInStock(BigDecimal inStock) {
        this.inStock = inStock;
    }

    /**
     * Get outOfStock
     * minimum: 0
     * @return outOfStock
     */
    public BigDecimal getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(BigDecimal outOfStock) {
        this.outOfStock = outOfStock;
    }

    /**
     * Get preorder
     * minimum: 0
     * @return preorder
     */
    public BigDecimal getPreorder() {
        return preorder;
    }

    public void setPreorder(BigDecimal preorder) {
        this.preorder = preorder;
    }

    /**
     * Get total
     * minimum: 0
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * Get videos
     * minimum: 0
     * @return videos
     */
    public BigDecimal getVideos() {
        return videos;
    }

    public void setVideos(BigDecimal videos) {
        this.videos = videos;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsRetailProductGroupProductCounts {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
        sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
        sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

