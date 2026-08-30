package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsProductGroupFilterKeys   {
  
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

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_0")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }
  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_1")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_2")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }
  public void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_3")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_4")
  @NotNull
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("MEDIA_TYPE")
  @NotNull
  public CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE() {
    return MEDIA_TYPE;
  }
  public void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria MEDIA_TYPE) {
    this.MEDIA_TYPE = MEDIA_TYPE;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_0")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }
  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_0")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }
  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_1")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }
  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_2")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }
  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_3")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }
  public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_4")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }
  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("TITLE_KEYWORDS")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
    return TITLE_KEYWORDS;
  }
  public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
    this.TITLE_KEYWORDS = TITLE_KEYWORDS;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  @NotNull
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
    return PINTEREST_PRODUCT_CATEGORIES;
  }
  public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PRODUCT_GROUP")
  @NotNull
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

