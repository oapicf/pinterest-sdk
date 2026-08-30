package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AvailabilityFilter;
import com.prokarma.pkmst.model.BrandFilter;
import com.prokarma.pkmst.model.CatalogsProductGroupCurrencyCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleGenderCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleStringCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleStringListCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupPricingCriteria;
import com.prokarma.pkmst.model.CatalogsProductGroupUint32Criteria;
import com.prokarma.pkmst.model.ConditionFilter;
import com.prokarma.pkmst.model.CurrencyFilter;
import com.prokarma.pkmst.model.CustomLabel0Filter;
import com.prokarma.pkmst.model.CustomLabel1Filter;
import com.prokarma.pkmst.model.CustomLabel2Filter;
import com.prokarma.pkmst.model.CustomLabel3Filter;
import com.prokarma.pkmst.model.CustomLabel4Filter;
import com.prokarma.pkmst.model.CustomNumber0Filter;
import com.prokarma.pkmst.model.CustomNumber1Filter;
import com.prokarma.pkmst.model.CustomNumber2Filter;
import com.prokarma.pkmst.model.CustomNumber3Filter;
import com.prokarma.pkmst.model.CustomNumber4Filter;
import com.prokarma.pkmst.model.GenderFilter;
import com.prokarma.pkmst.model.GoogleProductCategory0Filter;
import com.prokarma.pkmst.model.GoogleProductCategory1Filter;
import com.prokarma.pkmst.model.GoogleProductCategory2Filter;
import com.prokarma.pkmst.model.GoogleProductCategory3Filter;
import com.prokarma.pkmst.model.GoogleProductCategory4Filter;
import com.prokarma.pkmst.model.GoogleProductCategory5Filter;
import com.prokarma.pkmst.model.GoogleProductCategory6Filter;
import com.prokarma.pkmst.model.ItemGroupIdFilter;
import com.prokarma.pkmst.model.ItemIdFilter;
import com.prokarma.pkmst.model.MaxPriceFilter;
import com.prokarma.pkmst.model.MediaTypeFilter;
import com.prokarma.pkmst.model.MinPriceFilter;
import com.prokarma.pkmst.model.PinterestProductCategoriesFilter;
import com.prokarma.pkmst.model.ProductType0Filter;
import com.prokarma.pkmst.model.ProductType1Filter;
import com.prokarma.pkmst.model.ProductType2Filter;
import com.prokarma.pkmst.model.ProductType3Filter;
import com.prokarma.pkmst.model.ProductType4Filter;
import com.prokarma.pkmst.model.TitleKeywordsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Base filter keys shared across catalog filtering
 */
@ApiModel(description = "Base filter keys shared across catalog filtering")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsBaseFilterKeys   {
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

  public CatalogsBaseFilterKeys MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }

  /**
   * Get MIN_PRICE
   * @return MIN_PRICE
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }

  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  public CatalogsBaseFilterKeys MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
    return this;
  }

  /**
   * Get MAX_PRICE
   * @return MAX_PRICE
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }

  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  public CatalogsBaseFilterKeys CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  /**
   * Get CURRENCY
   * @return CURRENCY
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  public CatalogsBaseFilterKeys ITEM_ID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

  /**
   * Get ITEM_ID
   * @return ITEM_ID
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  public CatalogsBaseFilterKeys AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  /**
   * Get AVAILABILITY
   * @return AVAILABILITY
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  public CatalogsBaseFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  /**
   * Get BRAND
   * @return BRAND
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }

  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

  public CatalogsBaseFilterKeys CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  /**
   * Get CONDITION
   * @return CONDITION
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  public CatalogsBaseFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_0
   * @return CUSTOM_LABEL_0
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }

  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  public CatalogsBaseFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_1
   * @return CUSTOM_LABEL_1
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  public CatalogsBaseFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_2
   * @return CUSTOM_LABEL_2
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }

  public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  public CatalogsBaseFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_3
   * @return CUSTOM_LABEL_3
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  public CatalogsBaseFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_4
   * @return CUSTOM_LABEL_4
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }

  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  public CatalogsBaseFilterKeys ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

  /**
   * Get ITEM_GROUP_ID
   * @return ITEM_GROUP_ID
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }

  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  public CatalogsBaseFilterKeys GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  /**
   * Get GENDER
   * @return GENDER
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  public CatalogsBaseFilterKeys MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  /**
   * Get MEDIA_TYPE
   * @return MEDIA_TYPE
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }

  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  public CatalogsBaseFilterKeys PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_4
   * @return PRODUCT_TYPE_4
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  public CatalogsBaseFilterKeys PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_3
   * @return PRODUCT_TYPE_3
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }

  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  public CatalogsBaseFilterKeys PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_2
   * @return PRODUCT_TYPE_2
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  public CatalogsBaseFilterKeys PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_1
   * @return PRODUCT_TYPE_1
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }

  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  public CatalogsBaseFilterKeys PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_0
   * @return PRODUCT_TYPE_0
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_6
   * @return GOOGLE_PRODUCT_CATEGORY_6
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }

  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_5
   * @return GOOGLE_PRODUCT_CATEGORY_5
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_4
   * @return GOOGLE_PRODUCT_CATEGORY_4
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_3
   * @return GOOGLE_PRODUCT_CATEGORY_3
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }

  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_2
   * @return GOOGLE_PRODUCT_CATEGORY_2
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }

  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_1
   * @return GOOGLE_PRODUCT_CATEGORY_1
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  public CatalogsBaseFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_0
   * @return GOOGLE_PRODUCT_CATEGORY_0
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  public CatalogsBaseFilterKeys CUSTOM_NUMBER_0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_0
   * @return CUSTOM_NUMBER_0
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  public CatalogsBaseFilterKeys CUSTOM_NUMBER_1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_1
   * @return CUSTOM_NUMBER_1
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }

  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  public CatalogsBaseFilterKeys CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_2
   * @return CUSTOM_NUMBER_2
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }

  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  public CatalogsBaseFilterKeys CUSTOM_NUMBER_3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_3
   * @return CUSTOM_NUMBER_3
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }

  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  public CatalogsBaseFilterKeys CUSTOM_NUMBER_4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_4
   * @return CUSTOM_NUMBER_4
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }

  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  public CatalogsBaseFilterKeys TITLE_KEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    return this;
  }

  /**
   * Get TITLE_KEYWORDS
   * @return TITLE_KEYWORDS
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }

  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }

  public CatalogsBaseFilterKeys PINTEREST_PRODUCT_CATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    return this;
  }

  /**
   * Get PINTEREST_PRODUCT_CATEGORIES
   * @return PINTEREST_PRODUCT_CATEGORIES
   */
  @ApiModelProperty(required = true, value = "")
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

