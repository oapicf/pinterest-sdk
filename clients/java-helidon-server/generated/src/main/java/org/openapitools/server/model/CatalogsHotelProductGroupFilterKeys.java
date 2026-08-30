package org.openapitools.server.model;

import org.openapitools.server.model.BrandFilter;
import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleCountriesCriteria;
import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.server.model.CountryFilter;
import org.openapitools.server.model.CustomLabel0Filter;
import org.openapitools.server.model.CustomLabel1Filter;
import org.openapitools.server.model.CustomLabel2Filter;
import org.openapitools.server.model.CustomLabel3Filter;
import org.openapitools.server.model.CustomLabel4Filter;
import org.openapitools.server.model.HotelIdFilter;
import org.openapitools.server.model.PriceFilter;
import org.openapitools.server.model.PriceFilterPrice;
import org.openapitools.server.model.TitleKeywordsFilter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelProductGroupFilterKeys   {

    private PriceFilterPrice PRICE;
    private CatalogsProductGroupMultipleStringCriteria HOTEL_ID;
    private CatalogsProductGroupMultipleStringCriteria BRAND;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;
    private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;
    private CatalogsProductGroupMultipleCountriesCriteria COUNTRY;
    private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

    /**
     * Default constructor.
     */
    public CatalogsHotelProductGroupFilterKeys() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelProductGroupFilterKeys.
     *
     * @param PRICE PRICE
     * @param HOTEL_ID HOTEL_ID
     * @param BRAND BRAND
     * @param CUSTOM_LABEL_0 CUSTOM_LABEL_0
     * @param CUSTOM_LABEL_1 CUSTOM_LABEL_1
     * @param CUSTOM_LABEL_2 CUSTOM_LABEL_2
     * @param CUSTOM_LABEL_3 CUSTOM_LABEL_3
     * @param CUSTOM_LABEL_4 CUSTOM_LABEL_4
     * @param COUNTRY COUNTRY
     * @param TITLE_KEYWORDS TITLE_KEYWORDS
     */
    public CatalogsHotelProductGroupFilterKeys(
        PriceFilterPrice PRICE, 
        CatalogsProductGroupMultipleStringCriteria HOTEL_ID, 
        CatalogsProductGroupMultipleStringCriteria BRAND, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3, 
        CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4, 
        CatalogsProductGroupMultipleCountriesCriteria COUNTRY, 
        CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS
    ) {
        this.PRICE = PRICE;
        this.HOTEL_ID = HOTEL_ID;
        this.BRAND = BRAND;
        this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
        this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
        this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
        this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
        this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
        this.COUNTRY = COUNTRY;
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    }



    /**
     * Get PRICE
     * @return PRICE
     */
    public PriceFilterPrice getPRICE() {
        return PRICE;
    }

    public void setPRICE(PriceFilterPrice PRICE) {
        this.PRICE = PRICE;
    }

    /**
     * Get HOTEL_ID
     * @return HOTEL_ID
     */
    public CatalogsProductGroupMultipleStringCriteria getHOTELID() {
        return HOTEL_ID;
    }

    public void setHOTELID(CatalogsProductGroupMultipleStringCriteria HOTEL_ID) {
        this.HOTEL_ID = HOTEL_ID;
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
     * Get COUNTRY
     * @return COUNTRY
     */
    public CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria COUNTRY) {
        this.COUNTRY = COUNTRY;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelProductGroupFilterKeys {\n");
        
        sb.append("    PRICE: ").append(toIndentedString(PRICE)).append("\n");
        sb.append("    HOTEL_ID: ").append(toIndentedString(HOTEL_ID)).append("\n");
        sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
        sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
        sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
        sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
        sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
        sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
        sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
        sb.append("    TITLE_KEYWORDS: ").append(toIndentedString(TITLE_KEYWORDS)).append("\n");
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

