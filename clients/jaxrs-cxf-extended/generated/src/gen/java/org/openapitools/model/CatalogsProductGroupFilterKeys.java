package org.openapitools.model;

import org.openapitools.model.AvailabilityFilter;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.model.CatalogsProductGroupPricingCriteria;
import org.openapitools.model.ConditionFilter;
import org.openapitools.model.CurrencyFilter;
import org.openapitools.model.CustomLabel0Filter;
import org.openapitools.model.CustomLabel1Filter;
import org.openapitools.model.CustomLabel2Filter;
import org.openapitools.model.CustomLabel3Filter;
import org.openapitools.model.CustomLabel4Filter;
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
import org.openapitools.model.MinPriceFilter;
import org.openapitools.model.ProductType0Filter;
import org.openapitools.model.ProductType1Filter;
import org.openapitools.model.ProductType2Filter;
import org.openapitools.model.ProductType3Filter;
import org.openapitools.model.ProductType4Filter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupFilterKeys  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupPricingCriteria MIN_PRICE;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupPricingCriteria MAX_PRICE;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupCurrencyCriteria CURRENCY;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupCurrencyCriteria ITEM_ID;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria BRAND;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria GENDER;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;
 /**
  * Get MIN_PRICE
  * @return MIN_PRICE
  */
  @JsonProperty("MIN_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }

  /**
   * Sets the <code>MIN_PRICE</code> property.
   */
 public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }

  /**
   * Sets the <code>MIN_PRICE</code> property.
   */
  public CatalogsProductGroupFilterKeys MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }

 /**
  * Get MAX_PRICE
  * @return MAX_PRICE
  */
  @JsonProperty("MAX_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }

  /**
   * Sets the <code>MAX_PRICE</code> property.
   */
 public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

  /**
   * Sets the <code>MAX_PRICE</code> property.
   */
  public CatalogsProductGroupFilterKeys MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
    return this;
  }

 /**
  * Get CURRENCY
  * @return CURRENCY
  */
  @JsonProperty("CURRENCY")
  @NotNull
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  /**
   * Sets the <code>CURRENCY</code> property.
   */
 public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  /**
   * Sets the <code>CURRENCY</code> property.
   */
  public CatalogsProductGroupFilterKeys CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

 /**
  * Get ITEM_ID
  * @return ITEM_ID
  */
  @JsonProperty("ITEM_ID")
  @NotNull
  public CatalogsProductGroupCurrencyCriteria getITEMID() {
    return ITEM_ID;
  }

  /**
   * Sets the <code>ITEM_ID</code> property.
   */
 public void setITEMID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  /**
   * Sets the <code>ITEM_ID</code> property.
   */
  public CatalogsProductGroupFilterKeys ITEM_ID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

 /**
  * Get AVAILABILITY
  * @return AVAILABILITY
  */
  @JsonProperty("AVAILABILITY")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }

  /**
   * Sets the <code>AVAILABILITY</code> property.
   */
 public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }

  /**
   * Sets the <code>AVAILABILITY</code> property.
   */
  public CatalogsProductGroupFilterKeys AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

 /**
  * Get BRAND
  * @return BRAND
  */
  @JsonProperty("BRAND")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }

  /**
   * Sets the <code>BRAND</code> property.
   */
 public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }

  /**
   * Sets the <code>BRAND</code> property.
   */
  public CatalogsProductGroupFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

 /**
  * Get CONDITION
  * @return CONDITION
  */
  @JsonProperty("CONDITION")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }

  /**
   * Sets the <code>CONDITION</code> property.
   */
 public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }

  /**
   * Sets the <code>CONDITION</code> property.
   */
  public CatalogsProductGroupFilterKeys CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

 /**
  * Get CUSTOM_LABEL_0
  * @return CUSTOM_LABEL_0
  */
  @JsonProperty("CUSTOM_LABEL_0")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_0</code> property.
   */
 public void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_0</code> property.
   */
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

 /**
  * Get CUSTOM_LABEL_1
  * @return CUSTOM_LABEL_1
  */
  @JsonProperty("CUSTOM_LABEL_1")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_1</code> property.
   */
 public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_1</code> property.
   */
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

 /**
  * Get CUSTOM_LABEL_2
  * @return CUSTOM_LABEL_2
  */
  @JsonProperty("CUSTOM_LABEL_2")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_2</code> property.
   */
 public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_2</code> property.
   */
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

 /**
  * Get CUSTOM_LABEL_3
  * @return CUSTOM_LABEL_3
  */
  @JsonProperty("CUSTOM_LABEL_3")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_3</code> property.
   */
 public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_3</code> property.
   */
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

 /**
  * Get CUSTOM_LABEL_4
  * @return CUSTOM_LABEL_4
  */
  @JsonProperty("CUSTOM_LABEL_4")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_4</code> property.
   */
 public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  /**
   * Sets the <code>CUSTOM_LABEL_4</code> property.
   */
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

 /**
  * Get ITEM_GROUP_ID
  * @return ITEM_GROUP_ID
  */
  @JsonProperty("ITEM_GROUP_ID")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }

  /**
   * Sets the <code>ITEM_GROUP_ID</code> property.
   */
 public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  /**
   * Sets the <code>ITEM_GROUP_ID</code> property.
   */
  public CatalogsProductGroupFilterKeys ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

 /**
  * Get GENDER
  * @return GENDER
  */
  @JsonProperty("GENDER")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getGENDER() {
    return GENDER;
  }

  /**
   * Sets the <code>GENDER</code> property.
   */
 public void setGENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
    this.GENDER = GENDER;
  }

  /**
   * Sets the <code>GENDER</code> property.
   */
  public CatalogsProductGroupFilterKeys GENDER(CatalogsProductGroupMultipleStringCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

 /**
  * Get PRODUCT_TYPE_4
  * @return PRODUCT_TYPE_4
  */
  @JsonProperty("PRODUCT_TYPE_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_4</code> property.
   */
 public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_4</code> property.
   */
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

 /**
  * Get PRODUCT_TYPE_3
  * @return PRODUCT_TYPE_3
  */
  @JsonProperty("PRODUCT_TYPE_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_3</code> property.
   */
 public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_3</code> property.
   */
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }

 /**
  * Get PRODUCT_TYPE_2
  * @return PRODUCT_TYPE_2
  */
  @JsonProperty("PRODUCT_TYPE_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_2</code> property.
   */
 public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_2</code> property.
   */
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

 /**
  * Get PRODUCT_TYPE_1
  * @return PRODUCT_TYPE_1
  */
  @JsonProperty("PRODUCT_TYPE_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_1</code> property.
   */
 public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_1</code> property.
   */
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    return this;
  }

 /**
  * Get PRODUCT_TYPE_0
  * @return PRODUCT_TYPE_0
  */
  @JsonProperty("PRODUCT_TYPE_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_0</code> property.
   */
 public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }

  /**
   * Sets the <code>PRODUCT_TYPE_0</code> property.
   */
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_6
  * @return GOOGLE_PRODUCT_CATEGORY_6
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_6</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_6</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_5
  * @return GOOGLE_PRODUCT_CATEGORY_5
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_5</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_5</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_4
  * @return GOOGLE_PRODUCT_CATEGORY_4
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_4</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_4</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_3
  * @return GOOGLE_PRODUCT_CATEGORY_3
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_3</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_3</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_2
  * @return GOOGLE_PRODUCT_CATEGORY_2
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_2</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_2</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_1
  * @return GOOGLE_PRODUCT_CATEGORY_1
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_1</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_1</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

 /**
  * Get GOOGLE_PRODUCT_CATEGORY_0
  * @return GOOGLE_PRODUCT_CATEGORY_0
  */
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_0</code> property.
   */
 public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   * Sets the <code>GOOGLE_PRODUCT_CATEGORY_0</code> property.
   */
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

