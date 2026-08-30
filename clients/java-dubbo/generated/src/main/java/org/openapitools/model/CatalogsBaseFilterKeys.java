package org.openapitools.model;

import org.openapitools.model.AvailabilityFilter;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import org.openapitools.model.ConditionFilter;
import org.openapitools.model.CurrencyFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
import org.openapitools.model.CustomNumber0Filter;
import org.openapitools.model.CustomNumber1Filter;
import org.openapitools.model.CustomNumber2Filter;
import org.openapitools.model.CustomNumber3Filter;
import org.openapitools.model.CustomNumber4Filter;
import org.openapitools.model.GenderFilter;
import org.openapitools.model.GoogleProductCategory0Filter;
import org.openapitools.model.GoogleProductCategory1Filter;
import org.openapitools.model.GoogleProductCategory2Filter;
import org.openapitools.model.GoogleProductCategory3Filter;
import org.openapitools.model.GoogleProductCategory4Filter;
import org.openapitools.model.GoogleProductCategory5Filter;
import org.openapitools.model.GoogleProductCategory6Filter;
import org.openapitools.model.ItemGroupIdFilter;
import org.openapitools.model.ItemIdFilter;
import org.openapitools.model.MaxPriceFilter;
import org.openapitools.model.MediaTypeFilter;
import org.openapitools.model.MinPriceFilter;
import org.openapitools.model.PinterestProductCategoriesFilter;
import org.openapitools.model.ProductType0Filter;
import org.openapitools.model.ProductType1Filter;
import org.openapitools.model.ProductType2Filter;
import org.openapitools.model.ProductType3Filter;
import org.openapitools.model.ProductType4Filter;
import org.openapitools.model.TitleKeywordsFilter;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Base filter keys shared across catalog filtering
 */
public class CatalogsBaseFilterKeys implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("MIN_PRICE")
  private CatalogsProductGroupPricingCriteria MIN_PRICE;

  @JsonProperty("MAX_PRICE")
  private CatalogsProductGroupPricingCriteria MAX_PRICE;

  @JsonProperty("CURRENCY")
  private CatalogsProductGroupCurrencyCriteria CURRENCY;

  @JsonProperty("ITEM_ID")
  private CatalogsProductGroupMultipleStringCriteria ITEM_ID;

  @JsonProperty("AVAILABILITY")
  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  @JsonProperty("BRAND")
  private CatalogsProductGroupMultipleStringCriteria BRAND;

  @JsonProperty("CONDITION")
  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  @JsonProperty("CUSTOM_LABEL_0")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;

  @JsonProperty("CUSTOM_LABEL_1")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

  @JsonProperty("CUSTOM_LABEL_2")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2;

  @JsonProperty("CUSTOM_LABEL_3")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;

  @JsonProperty("CUSTOM_LABEL_4")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;

  @JsonProperty("ITEM_GROUP_ID")
  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  @JsonProperty("GENDER")
  private CatalogsProductGroupMultipleGenderCriteria GENDER;

  @JsonProperty("MEDIA_TYPE")
  private CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE;

  @JsonProperty("PRODUCT_TYPE_4")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

  @JsonProperty("PRODUCT_TYPE_3")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;

  @JsonProperty("PRODUCT_TYPE_2")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

  @JsonProperty("PRODUCT_TYPE_1")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;

  @JsonProperty("PRODUCT_TYPE_0")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;

  @JsonProperty("CUSTOM_NUMBER_0")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

  @JsonProperty("CUSTOM_NUMBER_1")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

  @JsonProperty("CUSTOM_NUMBER_2")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;

  @JsonProperty("CUSTOM_NUMBER_3")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;

  @JsonProperty("CUSTOM_NUMBER_4")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;

  @JsonProperty("TITLE_KEYWORDS")
  private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

  /**
   * 
   * @return MIN_PRICE
   */
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }

  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  /**
   * 
   * @return MAX_PRICE
   */
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }

  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  /**
   * 
   * @return CURRENCY
   */
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  /**
   * 
   * @return ITEM_ID
   */
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  /**
   * 
   * @return AVAILABILITY
   */
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  /**
   * 
   * @return BRAND
   */
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }

  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

  /**
   * 
   * @return CONDITION
   */
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  /**
   * 
   * @return CUSTOM_LABEL_0
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }

  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  /**
   * 
   * @return CUSTOM_LABEL_1
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  /**
   * 
   * @return CUSTOM_LABEL_2
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }

  public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  /**
   * 
   * @return CUSTOM_LABEL_3
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   * 
   * @return CUSTOM_LABEL_4
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }

  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  /**
   * 
   * @return ITEM_GROUP_ID
   */
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }

  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  /**
   * 
   * @return GENDER
   */
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  /**
   * 
   * @return MEDIA_TYPE
   */
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }

  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  /**
   * 
   * @return PRODUCT_TYPE_4
   */
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  /**
   * 
   * @return PRODUCT_TYPE_3
   */
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }

  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  /**
   * 
   * @return PRODUCT_TYPE_2
   */
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  /**
   * 
   * @return PRODUCT_TYPE_1
   */
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }

  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  /**
   * 
   * @return PRODUCT_TYPE_0
   */
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_6
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }

  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_5
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_4
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_3
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }

  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_2
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }

  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_1
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   * 
   * @return GOOGLE_PRODUCT_CATEGORY_0
   */
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   * 
   * @return CUSTOM_NUMBER_0
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  /**
   * 
   * @return CUSTOM_NUMBER_1
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }

  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  /**
   * 
   * @return CUSTOM_NUMBER_2
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }

  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  /**
   * 
   * @return CUSTOM_NUMBER_3
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }

  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  /**
   * 
   * @return CUSTOM_NUMBER_4
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }

  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  /**
   * 
   * @return TITLE_KEYWORDS
   */
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }

  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }

  /**
   * 
   * @return PINTEREST_PRODUCT_CATEGORIES
   */
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
    return PINTEREST_PRODUCT_CATEGORIES;
  }

  public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsBaseFilterKeys catalogsBaseFilterKeys = (CatalogsBaseFilterKeys) o;
    return Objects.equals(this.MIN_PRICE, catalogsBaseFilterKeys.MIN_PRICE) &&
        Objects.equals(this.MAX_PRICE, catalogsBaseFilterKeys.MAX_PRICE) &&
        Objects.equals(this.CURRENCY, catalogsBaseFilterKeys.CURRENCY) &&
        Objects.equals(this.ITEM_ID, catalogsBaseFilterKeys.ITEM_ID) &&
        Objects.equals(this.AVAILABILITY, catalogsBaseFilterKeys.AVAILABILITY) &&
        Objects.equals(this.BRAND, catalogsBaseFilterKeys.BRAND) &&
        Objects.equals(this.CONDITION, catalogsBaseFilterKeys.CONDITION) &&
        Objects.equals(this.CUSTOM_LABEL_0, catalogsBaseFilterKeys.CUSTOM_LABEL_0) &&
        Objects.equals(this.CUSTOM_LABEL_1, catalogsBaseFilterKeys.CUSTOM_LABEL_1) &&
        Objects.equals(this.CUSTOM_LABEL_2, catalogsBaseFilterKeys.CUSTOM_LABEL_2) &&
        Objects.equals(this.CUSTOM_LABEL_3, catalogsBaseFilterKeys.CUSTOM_LABEL_3) &&
        Objects.equals(this.CUSTOM_LABEL_4, catalogsBaseFilterKeys.CUSTOM_LABEL_4) &&
        Objects.equals(this.ITEM_GROUP_ID, catalogsBaseFilterKeys.ITEM_GROUP_ID) &&
        Objects.equals(this.GENDER, catalogsBaseFilterKeys.GENDER) &&
        Objects.equals(this.MEDIA_TYPE, catalogsBaseFilterKeys.MEDIA_TYPE) &&
        Objects.equals(this.PRODUCT_TYPE_4, catalogsBaseFilterKeys.PRODUCT_TYPE_4) &&
        Objects.equals(this.PRODUCT_TYPE_3, catalogsBaseFilterKeys.PRODUCT_TYPE_3) &&
        Objects.equals(this.PRODUCT_TYPE_2, catalogsBaseFilterKeys.PRODUCT_TYPE_2) &&
        Objects.equals(this.PRODUCT_TYPE_1, catalogsBaseFilterKeys.PRODUCT_TYPE_1) &&
        Objects.equals(this.PRODUCT_TYPE_0, catalogsBaseFilterKeys.PRODUCT_TYPE_0) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_6, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_6) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_5, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_5) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_4, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_4) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_3, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_3) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_2, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_2) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_1, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_1) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_0, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_0) &&
        Objects.equals(this.CUSTOM_NUMBER_0, catalogsBaseFilterKeys.CUSTOM_NUMBER_0) &&
        Objects.equals(this.CUSTOM_NUMBER_1, catalogsBaseFilterKeys.CUSTOM_NUMBER_1) &&
        Objects.equals(this.CUSTOM_NUMBER_2, catalogsBaseFilterKeys.CUSTOM_NUMBER_2) &&
        Objects.equals(this.CUSTOM_NUMBER_3, catalogsBaseFilterKeys.CUSTOM_NUMBER_3) &&
        Objects.equals(this.CUSTOM_NUMBER_4, catalogsBaseFilterKeys.CUSTOM_NUMBER_4) &&
        Objects.equals(this.TITLE_KEYWORDS, catalogsBaseFilterKeys.TITLE_KEYWORDS) &&
        Objects.equals(this.PINTEREST_PRODUCT_CATEGORIES, catalogsBaseFilterKeys.PINTEREST_PRODUCT_CATEGORIES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MIN_PRICE, MAX_PRICE, CURRENCY, ITEM_ID, AVAILABILITY, BRAND, CONDITION, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, ITEM_GROUP_ID, GENDER, MEDIA_TYPE, PRODUCT_TYPE_4, PRODUCT_TYPE_3, PRODUCT_TYPE_2, PRODUCT_TYPE_1, PRODUCT_TYPE_0, GOOGLE_PRODUCT_CATEGORY_6, GOOGLE_PRODUCT_CATEGORY_5, GOOGLE_PRODUCT_CATEGORY_4, GOOGLE_PRODUCT_CATEGORY_3, GOOGLE_PRODUCT_CATEGORY_2, GOOGLE_PRODUCT_CATEGORY_1, GOOGLE_PRODUCT_CATEGORY_0, CUSTOM_NUMBER_0, CUSTOM_NUMBER_1, CUSTOM_NUMBER_2, CUSTOM_NUMBER_3, CUSTOM_NUMBER_4, TITLE_KEYWORDS, PINTEREST_PRODUCT_CATEGORIES);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
