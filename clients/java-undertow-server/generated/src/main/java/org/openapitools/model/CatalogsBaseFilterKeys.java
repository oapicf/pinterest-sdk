/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Base filter keys shared across catalog filtering
 */

@ApiModel(description = "Base filter keys shared across catalog filtering")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
   */
  public CatalogsBaseFilterKeys MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MIN_PRICE")
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }
  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  /**
   */
  public CatalogsBaseFilterKeys MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MAX_PRICE")
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }
  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  /**
   */
  public CatalogsBaseFilterKeys CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CURRENCY")
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }
  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  /**
   */
  public CatalogsBaseFilterKeys ITEM_ID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ITEM_ID")
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }
  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  /**
   */
  public CatalogsBaseFilterKeys AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("AVAILABILITY")
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }
  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  /**
   */
  public CatalogsBaseFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("BRAND")
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }
  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

  /**
   */
  public CatalogsBaseFilterKeys CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CONDITION")
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }
  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_0")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }
  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_2")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }
  public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_3")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_4")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  /**
   */
  public CatalogsBaseFilterKeys ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ITEM_GROUP_ID")
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }
  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  /**
   */
  public CatalogsBaseFilterKeys GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }
  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  /**
   */
  public CatalogsBaseFilterKeys MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MEDIA_TYPE")
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }
  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  /**
   */
  public CatalogsBaseFilterKeys PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_4")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }
  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  /**
   */
  public CatalogsBaseFilterKeys PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_3")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }
  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  /**
   */
  public CatalogsBaseFilterKeys PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_2")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }
  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  /**
   */
  public CatalogsBaseFilterKeys PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_1")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }
  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  /**
   */
  public CatalogsBaseFilterKeys PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_0")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }
  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }
  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }
  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }
  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }
  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }
  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   */
  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }
  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_NUMBER_0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_0")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }
  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_NUMBER_1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_1")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }
  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_2")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }
  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_NUMBER_3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_3")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }
  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  /**
   */
  public CatalogsBaseFilterKeys CUSTOM_NUMBER_4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_4")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }
  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  /**
   */
  public CatalogsBaseFilterKeys TITLE_KEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("TITLE_KEYWORDS")
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }
  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }

  /**
   */
  public CatalogsBaseFilterKeys PINTEREST_PRODUCT_CATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
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
    return Objects.equals(MIN_PRICE, catalogsBaseFilterKeys.MIN_PRICE) &&
        Objects.equals(MAX_PRICE, catalogsBaseFilterKeys.MAX_PRICE) &&
        Objects.equals(CURRENCY, catalogsBaseFilterKeys.CURRENCY) &&
        Objects.equals(ITEM_ID, catalogsBaseFilterKeys.ITEM_ID) &&
        Objects.equals(AVAILABILITY, catalogsBaseFilterKeys.AVAILABILITY) &&
        Objects.equals(BRAND, catalogsBaseFilterKeys.BRAND) &&
        Objects.equals(CONDITION, catalogsBaseFilterKeys.CONDITION) &&
        Objects.equals(CUSTOM_LABEL_0, catalogsBaseFilterKeys.CUSTOM_LABEL_0) &&
        Objects.equals(CUSTOM_LABEL_1, catalogsBaseFilterKeys.CUSTOM_LABEL_1) &&
        Objects.equals(CUSTOM_LABEL_2, catalogsBaseFilterKeys.CUSTOM_LABEL_2) &&
        Objects.equals(CUSTOM_LABEL_3, catalogsBaseFilterKeys.CUSTOM_LABEL_3) &&
        Objects.equals(CUSTOM_LABEL_4, catalogsBaseFilterKeys.CUSTOM_LABEL_4) &&
        Objects.equals(ITEM_GROUP_ID, catalogsBaseFilterKeys.ITEM_GROUP_ID) &&
        Objects.equals(GENDER, catalogsBaseFilterKeys.GENDER) &&
        Objects.equals(MEDIA_TYPE, catalogsBaseFilterKeys.MEDIA_TYPE) &&
        Objects.equals(PRODUCT_TYPE_4, catalogsBaseFilterKeys.PRODUCT_TYPE_4) &&
        Objects.equals(PRODUCT_TYPE_3, catalogsBaseFilterKeys.PRODUCT_TYPE_3) &&
        Objects.equals(PRODUCT_TYPE_2, catalogsBaseFilterKeys.PRODUCT_TYPE_2) &&
        Objects.equals(PRODUCT_TYPE_1, catalogsBaseFilterKeys.PRODUCT_TYPE_1) &&
        Objects.equals(PRODUCT_TYPE_0, catalogsBaseFilterKeys.PRODUCT_TYPE_0) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_6, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_6) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_5, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_5) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_4, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_4) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_3, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_3) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_2, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_2) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_1, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_1) &&
        Objects.equals(GOOGLE_PRODUCT_CATEGORY_0, catalogsBaseFilterKeys.GOOGLE_PRODUCT_CATEGORY_0) &&
        Objects.equals(CUSTOM_NUMBER_0, catalogsBaseFilterKeys.CUSTOM_NUMBER_0) &&
        Objects.equals(CUSTOM_NUMBER_1, catalogsBaseFilterKeys.CUSTOM_NUMBER_1) &&
        Objects.equals(CUSTOM_NUMBER_2, catalogsBaseFilterKeys.CUSTOM_NUMBER_2) &&
        Objects.equals(CUSTOM_NUMBER_3, catalogsBaseFilterKeys.CUSTOM_NUMBER_3) &&
        Objects.equals(CUSTOM_NUMBER_4, catalogsBaseFilterKeys.CUSTOM_NUMBER_4) &&
        Objects.equals(TITLE_KEYWORDS, catalogsBaseFilterKeys.TITLE_KEYWORDS) &&
        Objects.equals(PINTEREST_PRODUCT_CATEGORIES, catalogsBaseFilterKeys.PINTEREST_PRODUCT_CATEGORIES);
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

