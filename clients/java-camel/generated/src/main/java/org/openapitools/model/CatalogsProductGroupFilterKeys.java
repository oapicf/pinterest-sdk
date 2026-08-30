package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsBaseFilterKeys;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleMediaTypesCriteria;
import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import org.openapitools.model.ProductGroupReferenceFilter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsProductGroupFilterKeys
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupFilterKeys {

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

  private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

  public CatalogsProductGroupFilterKeys() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsProductGroupFilterKeys(CatalogsProductGroupPricingCriteria MIN_PRICE, CatalogsProductGroupPricingCriteria MAX_PRICE, CatalogsProductGroupCurrencyCriteria CURRENCY, CatalogsProductGroupMultipleStringCriteria ITEM_ID, CatalogsProductGroupMultipleStringCriteria AVAILABILITY, CatalogsProductGroupMultipleStringCriteria BRAND, CatalogsProductGroupMultipleStringCriteria CONDITION, CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0, CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1, CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2, CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3, CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4, CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID, CatalogsProductGroupMultipleGenderCriteria GENDER, CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE, CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4, CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3, CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2, CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1, CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1, CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0, CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0, CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1, CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2, CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3, CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4, CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS, CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES, CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
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
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }

  public CatalogsProductGroupFilterKeys MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }

  /**
   * Get MIN_PRICE
   * @return MIN_PRICE
   */
  @NotNull @Valid 
  @Schema(name = "MIN_PRICE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MIN_PRICE")
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }

  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  public CatalogsProductGroupFilterKeys MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
    return this;
  }

  /**
   * Get MAX_PRICE
   * @return MAX_PRICE
   */
  @NotNull @Valid 
  @Schema(name = "MAX_PRICE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MAX_PRICE")
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }

  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  public CatalogsProductGroupFilterKeys CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  /**
   * Get CURRENCY
   * @return CURRENCY
   */
  @NotNull @Valid 
  @Schema(name = "CURRENCY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CURRENCY")
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  public CatalogsProductGroupFilterKeys ITEM_ID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

  /**
   * Get ITEM_ID
   * @return ITEM_ID
   */
  @NotNull @Valid 
  @Schema(name = "ITEM_ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ITEM_ID")
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  public CatalogsProductGroupFilterKeys AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  /**
   * Get AVAILABILITY
   * @return AVAILABILITY
   */
  @NotNull @Valid 
  @Schema(name = "AVAILABILITY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AVAILABILITY")
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  public CatalogsProductGroupFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  /**
   * Get BRAND
   * @return BRAND
   */
  @NotNull @Valid 
  @Schema(name = "BRAND", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("BRAND")
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }

  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

  public CatalogsProductGroupFilterKeys CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  /**
   * Get CONDITION
   * @return CONDITION
   */
  @NotNull @Valid 
  @Schema(name = "CONDITION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CONDITION")
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_0
   * @return CUSTOM_LABEL_0
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_0")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }

  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_1
   * @return CUSTOM_LABEL_1
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_2
   * @return CUSTOM_LABEL_2
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_2")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }

  public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_3
   * @return CUSTOM_LABEL_3
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_3")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_4
   * @return CUSTOM_LABEL_4
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_4")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }

  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  public CatalogsProductGroupFilterKeys ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

  /**
   * Get ITEM_GROUP_ID
   * @return ITEM_GROUP_ID
   */
  @NotNull @Valid 
  @Schema(name = "ITEM_GROUP_ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ITEM_GROUP_ID")
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }

  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  public CatalogsProductGroupFilterKeys GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  /**
   * Get GENDER
   * @return GENDER
   */
  @NotNull @Valid 
  @Schema(name = "GENDER", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GENDER")
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }

  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }

  public CatalogsProductGroupFilterKeys MEDIA_TYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
    return this;
  }

  /**
   * Get MEDIA_TYPE
   * @return MEDIA_TYPE
   */
  @NotNull @Valid 
  @Schema(name = "MEDIA_TYPE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MEDIA_TYPE")
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }

  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_4
   * @return PRODUCT_TYPE_4
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_TYPE_4")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_3
   * @return PRODUCT_TYPE_3
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_TYPE_3")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }

  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_2
   * @return PRODUCT_TYPE_2
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_TYPE_2")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_1
   * @return PRODUCT_TYPE_1
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_TYPE_1")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }

  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_0
   * @return PRODUCT_TYPE_0
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_TYPE_0")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_6
   * @return GOOGLE_PRODUCT_CATEGORY_6
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_6", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }

  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_5
   * @return GOOGLE_PRODUCT_CATEGORY_5
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_4
   * @return GOOGLE_PRODUCT_CATEGORY_4
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_3
   * @return GOOGLE_PRODUCT_CATEGORY_3
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }

  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_2
   * @return GOOGLE_PRODUCT_CATEGORY_2
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }

  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_1
   * @return GOOGLE_PRODUCT_CATEGORY_1
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_0
   * @return GOOGLE_PRODUCT_CATEGORY_0
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_NUMBER_0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_0
   * @return CUSTOM_NUMBER_0
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_0")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_NUMBER_1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_1
   * @return CUSTOM_NUMBER_1
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_1")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }

  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_2
   * @return CUSTOM_NUMBER_2
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_2")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }

  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_NUMBER_3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_3
   * @return CUSTOM_NUMBER_3
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_3", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_3")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }

  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  public CatalogsProductGroupFilterKeys CUSTOM_NUMBER_4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_4
   * @return CUSTOM_NUMBER_4
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_4")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }

  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  public CatalogsProductGroupFilterKeys TITLE_KEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    return this;
  }

  /**
   * Get TITLE_KEYWORDS
   * @return TITLE_KEYWORDS
   */
  @NotNull @Valid 
  @Schema(name = "TITLE_KEYWORDS", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TITLE_KEYWORDS")
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }

  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }

  public CatalogsProductGroupFilterKeys PINTEREST_PRODUCT_CATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
    return this;
  }

  /**
   * Get PINTEREST_PRODUCT_CATEGORIES
   * @return PINTEREST_PRODUCT_CATEGORIES
   */
  @NotNull @Valid 
  @Schema(name = "PINTEREST_PRODUCT_CATEGORIES", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
    return PINTEREST_PRODUCT_CATEGORIES;
  }

  public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
  }

  public CatalogsProductGroupFilterKeys PRODUCT_GROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
    return this;
  }

  /**
   * Get PRODUCT_GROUP
   * @return PRODUCT_GROUP
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_GROUP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PRODUCT_GROUP")
  public CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() {
    return PRODUCT_GROUP;
  }

  public void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys = (CatalogsProductGroupFilterKeys) o;
    return Objects.equals(this.MIN_PRICE, catalogsProductGroupFilterKeys.MIN_PRICE) &&
        Objects.equals(this.MAX_PRICE, catalogsProductGroupFilterKeys.MAX_PRICE) &&
        Objects.equals(this.CURRENCY, catalogsProductGroupFilterKeys.CURRENCY) &&
        Objects.equals(this.ITEM_ID, catalogsProductGroupFilterKeys.ITEM_ID) &&
        Objects.equals(this.AVAILABILITY, catalogsProductGroupFilterKeys.AVAILABILITY) &&
        Objects.equals(this.BRAND, catalogsProductGroupFilterKeys.BRAND) &&
        Objects.equals(this.CONDITION, catalogsProductGroupFilterKeys.CONDITION) &&
        Objects.equals(this.CUSTOM_LABEL_0, catalogsProductGroupFilterKeys.CUSTOM_LABEL_0) &&
        Objects.equals(this.CUSTOM_LABEL_1, catalogsProductGroupFilterKeys.CUSTOM_LABEL_1) &&
        Objects.equals(this.CUSTOM_LABEL_2, catalogsProductGroupFilterKeys.CUSTOM_LABEL_2) &&
        Objects.equals(this.CUSTOM_LABEL_3, catalogsProductGroupFilterKeys.CUSTOM_LABEL_3) &&
        Objects.equals(this.CUSTOM_LABEL_4, catalogsProductGroupFilterKeys.CUSTOM_LABEL_4) &&
        Objects.equals(this.ITEM_GROUP_ID, catalogsProductGroupFilterKeys.ITEM_GROUP_ID) &&
        Objects.equals(this.GENDER, catalogsProductGroupFilterKeys.GENDER) &&
        Objects.equals(this.MEDIA_TYPE, catalogsProductGroupFilterKeys.MEDIA_TYPE) &&
        Objects.equals(this.PRODUCT_TYPE_4, catalogsProductGroupFilterKeys.PRODUCT_TYPE_4) &&
        Objects.equals(this.PRODUCT_TYPE_3, catalogsProductGroupFilterKeys.PRODUCT_TYPE_3) &&
        Objects.equals(this.PRODUCT_TYPE_2, catalogsProductGroupFilterKeys.PRODUCT_TYPE_2) &&
        Objects.equals(this.PRODUCT_TYPE_1, catalogsProductGroupFilterKeys.PRODUCT_TYPE_1) &&
        Objects.equals(this.PRODUCT_TYPE_0, catalogsProductGroupFilterKeys.PRODUCT_TYPE_0) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_6, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_6) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_5, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_5) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_4, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_4) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_3, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_3) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_2, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_2) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_1, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_1) &&
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_0, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_0) &&
        Objects.equals(this.CUSTOM_NUMBER_0, catalogsProductGroupFilterKeys.CUSTOM_NUMBER_0) &&
        Objects.equals(this.CUSTOM_NUMBER_1, catalogsProductGroupFilterKeys.CUSTOM_NUMBER_1) &&
        Objects.equals(this.CUSTOM_NUMBER_2, catalogsProductGroupFilterKeys.CUSTOM_NUMBER_2) &&
        Objects.equals(this.CUSTOM_NUMBER_3, catalogsProductGroupFilterKeys.CUSTOM_NUMBER_3) &&
        Objects.equals(this.CUSTOM_NUMBER_4, catalogsProductGroupFilterKeys.CUSTOM_NUMBER_4) &&
        Objects.equals(this.TITLE_KEYWORDS, catalogsProductGroupFilterKeys.TITLE_KEYWORDS) &&
        Objects.equals(this.PINTEREST_PRODUCT_CATEGORIES, catalogsProductGroupFilterKeys.PINTEREST_PRODUCT_CATEGORIES) &&
        Objects.equals(this.PRODUCT_GROUP, catalogsProductGroupFilterKeys.PRODUCT_GROUP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MIN_PRICE, MAX_PRICE, CURRENCY, ITEM_ID, AVAILABILITY, BRAND, CONDITION, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, ITEM_GROUP_ID, GENDER, MEDIA_TYPE, PRODUCT_TYPE_4, PRODUCT_TYPE_3, PRODUCT_TYPE_2, PRODUCT_TYPE_1, PRODUCT_TYPE_0, GOOGLE_PRODUCT_CATEGORY_6, GOOGLE_PRODUCT_CATEGORY_5, GOOGLE_PRODUCT_CATEGORY_4, GOOGLE_PRODUCT_CATEGORY_3, GOOGLE_PRODUCT_CATEGORY_2, GOOGLE_PRODUCT_CATEGORY_1, GOOGLE_PRODUCT_CATEGORY_0, CUSTOM_NUMBER_0, CUSTOM_NUMBER_1, CUSTOM_NUMBER_2, CUSTOM_NUMBER_3, CUSTOM_NUMBER_4, TITLE_KEYWORDS, PINTEREST_PRODUCT_CATEGORIES, PRODUCT_GROUP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupFilterKeys {\n");
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
    sb.append("    PRODUCT_GROUP: ").append(toIndentedString(PRODUCT_GROUP)).append("\n");
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

