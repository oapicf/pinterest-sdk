package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.server.model.CreativeAssetsIdFilter;
import org.openapitools.server.model.CustomLabel0Filter;
import org.openapitools.server.model.CustomLabel1Filter;
import org.openapitools.server.model.CustomLabel2Filter;
import org.openapitools.server.model.CustomLabel3Filter;
import org.openapitools.server.model.CustomLabel4Filter;
import org.openapitools.server.model.GoogleProductCategory0Filter;
import org.openapitools.server.model.GoogleProductCategory1Filter;
import org.openapitools.server.model.GoogleProductCategory2Filter;
import org.openapitools.server.model.GoogleProductCategory3Filter;
import org.openapitools.server.model.GoogleProductCategory4Filter;
import org.openapitools.server.model.GoogleProductCategory5Filter;
import org.openapitools.server.model.GoogleProductCategory6Filter;
import org.openapitools.server.model.LinkFilter;
import org.openapitools.server.model.MediaTypeFilter;
import org.openapitools.server.model.TitleKeywordsFilter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsCreativeAssetsProductGroupFilterKeys   {

    private CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;
    private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;
    private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;
    private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

    /**
     * Default constructor.
     */
    public CatalogsCreativeAssetsProductGroupFilterKeys() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsCreativeAssetsProductGroupFilterKeys.
     *
     * @param CREATIVE_ASSETS_ID CREATIVE_ASSETS_ID
     * @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
     * @param CUSTOM_LABEL_1 CUSTOM_LABEL_1
     * @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
     * @param CUSTOM_LABEL_3 CUSTOM_LABEL_3
     * @param CUSTOM_LABEL_4 CUSTOM_LABEL_4
     * @param GOOGLE_PRODUCT_CATEGORY_6 GOOGLE_PRODUCT_CATEGORY_6
     * @param GOOGLE_PRODUCT_CATEGORY_5 GOOGLE_PRODUCT_CATEGORY_5
     * @param GOOGLE_PRODUCT_CATEGORY_4 GOOGLE_PRODUCT_CATEGORY_4
     * @param GOOGLE_PRODUCT_CATEGORY_3 GOOGLE_PRODUCT_CATEGORY_3
     * @param GOOGLE_PRODUCT_CATEGORY_2 GOOGLE_PRODUCT_CATEGORY_2
     * @param GOOGLE_PRODUCT_CATEGORY_1 GOOGLE_PRODUCT_CATEGORY_1
     * @param GOOGLE_PRODUCT_CATEGORY_0 GOOGLE_PRODUCT_CATEGORY_0
     * @param MEDIA_TYPE MEDIA_TYPE
     * @param TITLE_KEYWORDS TITLE_KEYWORDS
     * @param LINK LINK
     */
    public CatalogsCreativeAssetsProductGroupFilterKeys(
        CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0, 
        CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE, 
        CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS, 
        CatalogsProductGroupFilterOperatorTypeCriteria LINK
    ) {
        this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
        this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
        this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
        this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
        this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
        this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
        this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
        this.MEDIA_TYPE = MEDIA_TYPE;
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
        this.LINK = LINK;
    }



    /**
     * Get CREATIVE_ASSETS_ID
     * @return CREATIVE_ASSETS_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID() {
        return CREATIVE_ASSETS_ID;
    }

    public void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria CREATIVE_ASSETS_ID) {
        this.CREATIVE_ASSETS_ID = CREATIVE_ASSETS_ID;
    }

    /**
     * Get CUSTOM_LABEL_0
     * @return CUSTOM_LABEL_0
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
        return CUSTOM_LABEL_0;
    }

    public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    }

    /**
     * Get CUSTOM_LABEL_1
     * @return CUSTOM_LABEL_1
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
        return CUSTOM_LABEL_1;
    }

    public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    }

    /**
     * Get CUSTOM_LABEL_2
     * @return CUSTOM_LABEL_2
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
        return CUSTOM_LABEL_2;
    }

    public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    }

    /**
     * Get CUSTOM_LABEL_3
     * @return CUSTOM_LABEL_3
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
        return CUSTOM_LABEL_3;
    }

    public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    }

    /**
     * Get CUSTOM_LABEL_4
     * @return CUSTOM_LABEL_4
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
        return CUSTOM_LABEL_4;
    }

    public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_6
     * @return GOOGLE_PRODUCT_CATEGORY_6
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
        return GOOGLE_PRODUCT_CATEGORY_6;
    }

    public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
        this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_5
     * @return GOOGLE_PRODUCT_CATEGORY_5
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
        return GOOGLE_PRODUCT_CATEGORY_5;
    }

    public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_4
     * @return GOOGLE_PRODUCT_CATEGORY_4
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
        return GOOGLE_PRODUCT_CATEGORY_4;
    }

    public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
        this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_3
     * @return GOOGLE_PRODUCT_CATEGORY_3
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
        return GOOGLE_PRODUCT_CATEGORY_3;
    }

    public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
        this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_2
     * @return GOOGLE_PRODUCT_CATEGORY_2
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
        return GOOGLE_PRODUCT_CATEGORY_2;
    }

    public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
        this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_1
     * @return GOOGLE_PRODUCT_CATEGORY_1
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
        return GOOGLE_PRODUCT_CATEGORY_1;
    }

    public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
        this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    }

    /**
     * Get GOOGLE_PRODUCT_CATEGORY_0
     * @return GOOGLE_PRODUCT_CATEGORY_0
     */
    public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
        return GOOGLE_PRODUCT_CATEGORY_0;
    }

    public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
        this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    }

    /**
     * Get MEDIA_TYPE
     * @return MEDIA_TYPE
     */
    public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
        return MEDIA_TYPE;
    }

    public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
        this.MEDIA_TYPE = MEDIA_TYPE;
    }

    /**
     * Get TITLE_KEYWORDS
     * @return TITLE_KEYWORDS
     */
    public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
        return TITLE_KEYWORDS;
    }

    public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    }

    /**
     * Get LINK
     * @return LINK
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getLINK() {
        return LINK;
    }

    public void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
        this.LINK = LINK;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsCreativeAssetsProductGroupFilterKeys {\n");
        
        sb.append("    CREATIVE_ASSETS_ID: ").append(toIndentedString(CREATIVE_ASSETS_ID)).append("\n");
        sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
        sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
        sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_6: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_6)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_4: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_4)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_2: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_2)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
        sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
        sb.append("    TITLE_KEYWORDS: ").append(toIndentedString(TITLE_KEYWORDS)).append("\n");
        sb.append("    LINK: ").append(toIndentedString(LINK)).append("\n");
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

