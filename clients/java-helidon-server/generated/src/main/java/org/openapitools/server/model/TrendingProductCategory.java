package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ProductCategoriesEngagementType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Trending shopping product category
 */
public class TrendingProductCategory   {

    private ProductCategoriesEngagementType engagementType;
    private Integer pctChangeMom;
    private Integer percentRelativeVolume;
    private Integer pinterestProductCategoryId;
    private String productCategory;
    private List<String> verticals = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TrendingProductCategory() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendingProductCategory.
     *
     * @param engagementType Engagement type
     * @param pctChangeMom Month-over-month change percentage
     * @param percentRelativeVolume Relative volume percentage
     * @param pinterestProductCategoryId Pinterest Product Category Id
     * @param productCategory Product Category Name
     * @param verticals Vertical name associated with the product category
     */
    public TrendingProductCategory(
        ProductCategoriesEngagementType engagementType, 
        Integer pctChangeMom, 
        Integer percentRelativeVolume, 
        Integer pinterestProductCategoryId, 
        String productCategory, 
        List<String> verticals
    ) {
        this.engagementType = engagementType;
        this.pctChangeMom = pctChangeMom;
        this.percentRelativeVolume = percentRelativeVolume;
        this.pinterestProductCategoryId = pinterestProductCategoryId;
        this.productCategory = productCategory;
        this.verticals = verticals;
    }



    /**
     * Engagement type
     * @return engagementType
     */
    public ProductCategoriesEngagementType getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(ProductCategoriesEngagementType engagementType) {
        this.engagementType = engagementType;
    }

    /**
     * Month-over-month change percentage
     * @return pctChangeMom
     */
    public Integer getPctChangeMom() {
        return pctChangeMom;
    }

    public void setPctChangeMom(Integer pctChangeMom) {
        this.pctChangeMom = pctChangeMom;
    }

    /**
     * Relative volume percentage
     * @return percentRelativeVolume
     */
    public Integer getPercentRelativeVolume() {
        return percentRelativeVolume;
    }

    public void setPercentRelativeVolume(Integer percentRelativeVolume) {
        this.percentRelativeVolume = percentRelativeVolume;
    }

    /**
     * Pinterest Product Category Id
     * @return pinterestProductCategoryId
     */
    public Integer getPinterestProductCategoryId() {
        return pinterestProductCategoryId;
    }

    public void setPinterestProductCategoryId(Integer pinterestProductCategoryId) {
        this.pinterestProductCategoryId = pinterestProductCategoryId;
    }

    /**
     * Product Category Name
     * @return productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Vertical name associated with the product category
     * @return verticals
     */
    public List<String> getVerticals() {
        return verticals;
    }

    public void setVerticals(List<String> verticals) {
        this.verticals = verticals;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendingProductCategory {\n");
        
        sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
        sb.append("    pctChangeMom: ").append(toIndentedString(pctChangeMom)).append("\n");
        sb.append("    percentRelativeVolume: ").append(toIndentedString(percentRelativeVolume)).append("\n");
        sb.append("    pinterestProductCategoryId: ").append(toIndentedString(pinterestProductCategoryId)).append("\n");
        sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
        sb.append("    verticals: ").append(toIndentedString(verticals)).append("\n");
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

