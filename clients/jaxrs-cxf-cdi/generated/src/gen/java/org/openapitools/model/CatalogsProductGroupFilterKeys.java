package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AvailabilityFilter;
import org.openapitools.model.BrandFilter;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import org.openapitools.model.CatalogsProductGroupMultipleGenderCriteria;
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


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsProductGroupFilterKeys   {
  
  private CatalogsProductGroupPricingCriteria MIN_PRICE;

  private CatalogsProductGroupPricingCriteria MAX_PRICE;

  private CatalogsProductGroupCurrencyCriteria CURRENCY;

  private CatalogsProductGroupMultipleStringCriteria ITEM_ID;

  private CatalogsProductGroupMultipleStringCriteria AVAILABILITY;

  private CatalogsProductGroupMultipleStringCriteria BRAND;

  private CatalogsProductGroupMultipleStringCriteria CONDITION;

  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0;

  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  private CatalogsProductGroupMultipleGenderCriteria GENDER;

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

  /**
   **/
  public CatalogsProductGroupFilterKeys MIN_PRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MIN_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMINPRICE() {
    return MIN_PRICE;
  }
  public void setMINPRICE(CatalogsProductGroupPricingCriteria MIN_PRICE) {
    this.MIN_PRICE = MIN_PRICE;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys MAX_PRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MAX_PRICE")
  @NotNull
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }
  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CURRENCY")
  @NotNull
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }
  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys ITEM_ID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ITEM_ID")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }
  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys AVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("AVAILABILITY")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getAVAILABILITY() {
    return AVAILABILITY;
  }
  public void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria AVAILABILITY) {
    this.AVAILABILITY = AVAILABILITY;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("BRAND")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }
  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CONDITION")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCONDITION() {
    return CONDITION;
  }
  public void setCONDITION(CatalogsProductGroupMultipleStringCriteria CONDITION) {
    this.CONDITION = CONDITION;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_0")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }
  public void setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_1")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_2")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }
  public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_3")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys CUSTOM_LABEL_4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_4")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ITEM_GROUP_ID")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }
  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GENDER")
  @NotNull
  public CatalogsProductGroupMultipleGenderCriteria getGENDER() {
    return GENDER;
  }
  public void setGENDER(CatalogsProductGroupMultipleGenderCriteria GENDER) {
    this.GENDER = GENDER;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }
  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3() {
    return PRODUCT_TYPE_3;
  }
  public void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_3) {
    this.PRODUCT_TYPE_3 = PRODUCT_TYPE_3;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }
  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }
  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys PRODUCT_TYPE_0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_TYPE_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0() {
    return PRODUCT_TYPE_0;
  }
  public void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_0) {
    this.PRODUCT_TYPE_0 = PRODUCT_TYPE_0;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_6")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6() {
    return GOOGLE_PRODUCT_CATEGORY_6;
  }
  public void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_6) {
    this.GOOGLE_PRODUCT_CATEGORY_6 = GOOGLE_PRODUCT_CATEGORY_6;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }
  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }
  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }
  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }
  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }


  /**
   **/
  public CatalogsProductGroupFilterKeys GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }
  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
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
        Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_0, catalogsProductGroupFilterKeys.GOOGLE_PRODUCT_CATEGORY_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MIN_PRICE, MAX_PRICE, CURRENCY, ITEM_ID, AVAILABILITY, BRAND, CONDITION, CUSTOM_LABEL_0, CUSTOM_LABEL_1, CUSTOM_LABEL_2, CUSTOM_LABEL_3, CUSTOM_LABEL_4, ITEM_GROUP_ID, GENDER, PRODUCT_TYPE_4, PRODUCT_TYPE_3, PRODUCT_TYPE_2, PRODUCT_TYPE_1, PRODUCT_TYPE_0, GOOGLE_PRODUCT_CATEGORY_6, GOOGLE_PRODUCT_CATEGORY_5, GOOGLE_PRODUCT_CATEGORY_4, GOOGLE_PRODUCT_CATEGORY_3, GOOGLE_PRODUCT_CATEGORY_2, GOOGLE_PRODUCT_CATEGORY_1, GOOGLE_PRODUCT_CATEGORY_0);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

