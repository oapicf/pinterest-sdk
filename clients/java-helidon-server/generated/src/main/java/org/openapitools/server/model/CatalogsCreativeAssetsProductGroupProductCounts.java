package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Product counts for a Creative Assets CatalogsProductGroup
 */
public class CatalogsCreativeAssetsProductGroupProductCounts   {

    private BigDecimal appLinks;

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
    private BigDecimal images;
    private BigDecimal total;
    private BigDecimal videos;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsProductGroupProductCounts() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsProductGroupProductCounts.
     *
     * @param appLinks appLinks
     * @param catalogType catalogType
     * @param images images
     * @param total total
     * @param videos videos
     */
    public CatalogsCreativeAssetsProductGroupProductCounts(
        BigDecimal appLinks, 
        CatalogTypeEnum catalogType, 
        BigDecimal images, 
        BigDecimal total, 
        BigDecimal videos
    ) {
        this.appLinks = appLinks;
        this.catalogType = catalogType;
        this.images = images;
        this.total = total;
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
        sb.append("class CatalogsCreativeAssetsProductGroupProductCounts {\n");
        
        sb.append("    appLinks: ").append(toIndentedString(appLinks)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

