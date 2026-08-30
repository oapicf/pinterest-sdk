package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.CatalogsCreativeAssetsProductGroupProductCounts;
import org.openapitools.server.model.CatalogsHotelProductGroupProductCounts;
import org.openapitools.server.model.CatalogsRetailProductGroupProductCounts;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Product counts for a CatalogsProductGroup
 */
public class CatalogsProductGroupProductCountsVertical   {


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
    private BigDecimal inStock;
    private BigDecimal outOfStock;
    private BigDecimal preorder;
    private BigDecimal total;
    private BigDecimal videos;
    private BigDecimal appLinks;
    private BigDecimal images;

    /**
     * Default constructor.
     */
    public CatalogsProductGroupProductCountsVertical() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupProductCountsVertical.
     *
     * @param catalogType catalogType
     * @param inStock inStock
     * @param outOfStock outOfStock
     * @param preorder preorder
     * @param total total
     * @param videos videos
     * @param appLinks appLinks
     * @param images images
     */
    public CatalogsProductGroupProductCountsVertical(
        CatalogTypeEnum catalogType, 
        BigDecimal inStock, 
        BigDecimal outOfStock, 
        BigDecimal preorder, 
        BigDecimal total, 
        BigDecimal videos, 
        BigDecimal appLinks, 
        BigDecimal images
    ) {
        this.catalogType = catalogType;
        this.inStock = inStock;
        this.outOfStock = outOfStock;
        this.preorder = preorder;
        this.total = total;
        this.videos = videos;
        this.appLinks = appLinks;
        this.images = images;
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
     * Get appLinks
     * minimum: 0
     * @return appLinks
     */
    public BigDecimal getAppLinks() {
        return appLinks;
    }

    public void setAppLinks(BigDecimal appLinks) {
        this.appLinks = appLinks;
    }

    /**
     * Get images
     * minimum: 0
     * @return images
     */
    public BigDecimal getImages() {
        return images;
    }

    public void setImages(BigDecimal images) {
        this.images = images;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupProductCountsVertical {\n");
        
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
        sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
        sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
        sb.append("    appLinks: ").append(toIndentedString(appLinks)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

