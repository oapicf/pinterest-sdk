package org.openapitools.server.model;

import org.openapitools.server.model.AvailabilityFilter;
import org.openapitools.server.model.BrandFilter;
import org.openapitools.server.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleGenderCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.server.model.CatalogsProductGroupPricingCriteria;
import org.openapitools.server.model.CatalogsProductGroupUint32Criteria;
import org.openapitools.server.model.ConditionFilter;
import org.openapitools.server.model.CurrencyFilter;
import org.openapitools.server.model.CustomLabel0Filter;
import org.openapitools.server.model.CustomLabel1Filter;
import org.openapitools.server.model.CustomLabel2Filter;
import org.openapitools.server.model.CustomLabel3Filter;
import org.openapitools.server.model.CustomLabel4Filter;
import org.openapitools.server.model.CustomNumber0Filter;
import org.openapitools.server.model.CustomNumber1Filter;
import org.openapitools.server.model.CustomNumber2Filter;
import org.openapitools.server.model.CustomNumber3Filter;
import org.openapitools.server.model.CustomNumber4Filter;
import org.openapitools.server.model.GenderFilter;
import org.openapitools.server.model.GoogleProductCategory0Filter;
import org.openapitools.server.model.GoogleProductCategory1Filter;
import org.openapitools.server.model.GoogleProductCategory2Filter;
import org.openapitools.server.model.GoogleProductCategory3Filter;
import org.openapitools.server.model.GoogleProductCategory4Filter;
import org.openapitools.server.model.GoogleProductCategory5Filter;
import org.openapitools.server.model.GoogleProductCategory6Filter;
import org.openapitools.server.model.ItemGroupIdFilter;
import org.openapitools.server.model.ItemIdFilter;
import org.openapitools.server.model.MaxPriceFilter;
import org.openapitools.server.model.MediaTypeFilter;
import org.openapitools.server.model.MinPriceFilter;
import org.openapitools.server.model.PinterestProductCategoriesFilter;
import org.openapitools.server.model.ProductType0Filter;
import org.openapitools.server.model.ProductType1Filter;
import org.openapitools.server.model.ProductType2Filter;
import org.openapitools.server.model.ProductType3Filter;
import org.openapitools.server.model.ProductType4Filter;
import org.openapitools.server.model.TitleKeywordsFilter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Base filter keys shared across catalog filtering
 */
public class CatalogsBaseFilterKeys   {

    private CatalogsProductGroupPricingCriteria MIN_PRICE;
    private CatalogsProductGroupPricingCriteria MAX_PRICE;
    private CatalogsProductGroupCurrencyCriteria CURRENCY;
    private CatalogsProductGroupMultipleStringCriteria ITEM_ID;
    private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;
    private CatalogsProductGroupMultipleStringCriteria BRAND;
    private CatalogsProductGroupMultipleStringCriteria CONDITION;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;
    private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;
    private CatalogsProductGroupMultipleGenderCriteria GENDER;
    private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;
    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;
    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;
    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;
    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;
    private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;
    private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;
    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;
    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;
    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;
    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;
    private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;
    private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;
    private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

    /**
     * Default constructor.
     */
    public CatalogsBaseFilterKeys() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsBaseFilterKeys.
     *
     * @param MIN_PRICE MIN_PRICE
     * @param MAX_PRICE MAX_PRICE
     * @param CURRENCY CURRENCY
     * @param ITEM_ID ITEM_ID
     * @param AVAILABILITY AVAILABILITY
     * @param BRAND BRAND
     * @param CONDITION CONDITION
     * @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
     * @param CUSTOM_LABEL_1 CUSTOM_LABEL_1
     * @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
     * @param CUSTOM_LABEL_3 CUSTOM_LABEL_3
     * @param CUSTOM_LABEL_4 CUSTOM_LABEL_4
     * @param ITEM_GROUP_ID ITEM_GROUP_ID
     * @param GENDER GENDER
     * @param MEDIA_TYPE MEDIA_TYPE
     * @param PRODUCT_TYPE_4 PRODUCT_TYPE_4
     * @param PRODUCT_TYPE_3 PRODUCT_TYPE_3
     * @param PRODUCT_TYPE_2 PRODUCT_TYPE_2
     * @param PRODUCT_TYPE_1 PRODUCT_TYPE_1
     * @param PRODUCT_TYPE_0 PRODUCT_TYPE_0
     * @param GOOGLE_PRODUCT_CATEGORY_6 GOOGLE_PRODUCT_CATEGORY_6
     * @param GOOGLE_PRODUCT_CATEGORY_5 GOOGLE_PRODUCT_CATEGORY_5
     * @param GOOGLE_PRODUCT_CATEGORY_4 GOOGLE_PRODUCT_CATEGORY_4
     * @param GOOGLE_PRODUCT_CATEGORY_3 GOOGLE_PRODUCT_CATEGORY_3
     * @param GOOGLE_PRODUCT_CATEGORY_2 GOOGLE_PRODUCT_CATEGORY_2
     * @param GOOGLE_PRODUCT_CATEGORY_1 GOOGLE_PRODUCT_CATEGORY_1
     * @param GOOGLE_PRODUCT_CATEGORY_0 GOOGLE_PRODUCT_CATEGORY_0
     * @param CUSTOM_NUMBER_0 CUSTOM_NUMBER_0
     * @param CUSTOM_NUMBER_1 CUSTOM_NUMBER_1
     * @param CUSTOM_NUMBER_2 CUSTOM_NUMBER_2
     * @param CUSTOM_NUMBER_3 CUSTOM_NUMBER_3
     * @param CUSTOM_NUMBER_4 CUSTOM_NUMBER_4
     * @param TITLE_KEYWORDS TITLE_KEYWORDS
     * @param PINTEREST_PRODUCT_CATEGORIES PINTEREST_PRODUCT_CATEGORIES
     */
    public CatalogsBaseFilterKeys(
        CatalogsProductGroupPricingCriteria MIN_PRICE, 
        CatalogsProductGroupPricingCriteria MAX_PRICE, 
        CatalogsProductGroupCurrencyCriteria CURRENCY, 
        CatalogsProductGroupMultipleStringCriteria ITEM_ID, 
        CatalogsProductGroupMultipleStringCriteria AVAILABILITY, 
        CatalogsProductGroupMultipleStringCriteria BRAND, 
        CatalogsProductGroupMultipleStringCriteria CONDITION, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4, 
        CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID, 
        CatalogsProductGroupMultipleGenderCriteria GENDER, 
        CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE, 
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4, 
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3, 
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2, 
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1, 
        CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1, 
        CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0, 
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0, 
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1, 
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2, 
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3, 
        CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4, 
        CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS, 
        CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES
    ) {
        this.MIN_PRICE = MIN_PRICE;
        this.MAX_PRICE = MAX_PRICE;
        this.CURRENCY = CURRENCY;
        this.ITEM_ID = ITEM_ID;
        this.AVAILABILITY = AVAILABILITY;
        this.BRAND = BRAND;
        this.CONDITION = CONDITION;
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
        this.ITEM_GROUP_ID = ITEM_GROUP_ID;
        this.GENDER = GENDER;
        this.MEDIA_TYPE = MEDIA_TYPE;
        this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
        this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
        this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
        this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
        this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
        this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
        this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
        this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
        this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
        this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
        this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
        this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
        this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
        this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
        this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
        this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
        this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
        this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    }



    /**
     * Get MIN_PRICE
     * @return MIN_PRICE
     */
    public CatalogsProductGroupPricingCriteria getMINPRICE() {
        return MIN_PRICE;
    }

    public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
        this.MIN_PRICE = MIN_PRICE;
    }

    /**
     * Get MAX_PRICE
     * @return MAX_PRICE
     */
    public CatalogsProductGroupPricingCriteria getMAXPRICE() {
        return MAX_PRICE;
    }

    public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
        this.MAX_PRICE = MAX_PRICE;
    }

    /**
     * Get CURRENCY
     * @return CURRENCY
     */
    public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
        return CURRENCY;
    }

    public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
        this.CURRENCY = CURRENCY;
    }

    /**
     * Get ITEM_ID
     * @return ITEM_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getITEMID() {
        return ITEM_ID;
    }

    public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    /**
     * Get AVAILABILITY
     * @return AVAILABILITY
     */
    public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
        return AVAILABILITY;
    }

    public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
        this.AVAILABILITY = AVAILABILITY;
    }

    /**
     * Get BRAND
     * @return BRAND
     */
    public CatalogsProductGroupMultipleStringCriteria getBRAND() {
        return BRAND;
    }

    public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
        this.BRAND = BRAND;
    }

    /**
     * Get CONDITION
     * @return CONDITION
     */
    public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
        return CONDITION;
    }

    public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
        this.CONDITION = CONDITION;
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
     * Get ITEM_GROUP_ID
     * @return ITEM_GROUP_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
        return ITEM_GROUP_ID;
    }

    public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
        this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    }

    /**
     * Get GENDER
     * @return GENDER
     */
    public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
        return GENDER;
    }

    public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
        this.GENDER = GENDER;
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
     * Get PRODUCT_TYPE_4
     * @return PRODUCT_TYPE_4
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
        return PRODUCT_TYPE_4;
    }

    public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
        this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    }

    /**
     * Get PRODUCT_TYPE_3
     * @return PRODUCT_TYPE_3
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
        return PRODUCT_TYPE_3;
    }

    public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
        this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    }

    /**
     * Get PRODUCT_TYPE_2
     * @return PRODUCT_TYPE_2
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
        return PRODUCT_TYPE_2;
    }

    public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
        this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    }

    /**
     * Get PRODUCT_TYPE_1
     * @return PRODUCT_TYPE_1
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
        return PRODUCT_TYPE_1;
    }

    public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
        this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    }

    /**
     * Get PRODUCT_TYPE_0
     * @return PRODUCT_TYPE_0
     */
    public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
        return PRODUCT_TYPE_0;
    }

    public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
        this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
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
     * Get CUSTOM_NUMBER_0
     * @return CUSTOM_NUMBER_0
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
        return CUSTOM_NUMBER_0;
    }

    public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
        this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    }

    /**
     * Get CUSTOM_NUMBER_1
     * @return CUSTOM_NUMBER_1
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
        return CUSTOM_NUMBER_1;
    }

    public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
        this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    }

    /**
     * Get CUSTOM_NUMBER_2
     * @return CUSTOM_NUMBER_2
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
        return CUSTOM_NUMBER_2;
    }

    public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
        this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    }

    /**
     * Get CUSTOM_NUMBER_3
     * @return CUSTOM_NUMBER_3
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
        return CUSTOM_NUMBER_3;
    }

    public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
        this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    }

    /**
     * Get CUSTOM_NUMBER_4
     * @return CUSTOM_NUMBER_4
     */
    public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
        return CUSTOM_NUMBER_4;
    }

    public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
        this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
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
     * Get PINTEREST_PRODUCT_CATEGORIES
     * @return PINTEREST_PRODUCT_CATEGORIES
     */
    public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
        return PINTEREST_PRODUCT_CATEGORIES;
    }

    public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
        this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsBaseFilterKeys {\n");
        
        sb.append("    MIN_PRICE: ").append(toIndentedString(MIN_PRICE)).append("\n");
        sb.append("    MAX_PRICE: ").append(toIndentedString(MAX_PRICE)).append("\n");
        sb.append("    CURRENCY: ").append(toIndentedString(CURRENCY)).append("\n");
        sb.append("    ITEM_ID: ").append(toIndentedString(ITEM_ID)).append("\n");
        sb.append("    AVAILABILITY: ").append(toIndentedString(AVAILABILITY)).append("\n");
        sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
        sb.append("    CONDITION: ").append(toIndentedString(CONDITION)).append("\n");
        sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
        sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
        sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
        sb.append("    ITEM_GROUP_ID: ").append(toIndentedString(ITEM_GROUP_ID)).append("\n");
        sb.append("    GENDER: ").append(toIndentedString(GENDER)).append("\n");
        sb.append("    MEDIA_TYPE: ").append(toIndentedString(MEDIA_TYPE)).append("\n");
        sb.append("    PRODUCT_TYPE_4: ").append(toIndentedString(PRODUCT_TYPE_4)).append("\n");
        sb.append("    PRODUCT_TYPE_3: ").append(toIndentedString(PRODUCT_TYPE_3)).append("\n");
        sb.append("    PRODUCT_TYPE_2: ").append(toIndentedString(PRODUCT_TYPE_2)).append("\n");
        sb.append("    PRODUCT_TYPE_1: ").append(toIndentedString(PRODUCT_TYPE_1)).append("\n");
        sb.append("    PRODUCT_TYPE_0: ").append(toIndentedString(PRODUCT_TYPE_0)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_6: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_6)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_4: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_4)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_2: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_2)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
        sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
        sb.append("    CUSTOM_NUMBER_0: ").append(toIndentedString(CUSTOM_NUMBER_0)).append("\n");
        sb.append("    CUSTOM_NUMBER_1: ").append(toIndentedString(CUSTOM_NUMBER_1)).append("\n");
        sb.append("    CUSTOM_NUMBER_2: ").append(toIndentedString(CUSTOM_NUMBER_2)).append("\n");
        sb.append("    CUSTOM_NUMBER_3: ").append(toIndentedString(CUSTOM_NUMBER_3)).append("\n");
        sb.append("    CUSTOM_NUMBER_4: ").append(toIndentedString(CUSTOM_NUMBER_4)).append("\n");
        sb.append("    TITLE_KEYWORDS: ").append(toIndentedString(TITLE_KEYWORDS)).append("\n");
        sb.append("    PINTEREST_PRODUCT_CATEGORIES: ").append(toIndentedString(PINTEREST_PRODUCT_CATEGORIES)).append("\n");
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

