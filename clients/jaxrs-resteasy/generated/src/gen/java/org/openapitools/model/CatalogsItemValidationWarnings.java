package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemValidationDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemValidationWarnings   {
  
  private CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING;
  private CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK;
  private CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  private CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING;
  private CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING;
  private CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK;
  private CatalogsItemValidationDetails AGE_GROUP_INVALID;
  private CatalogsItemValidationDetails SIZE_SYSTEM_INVALID;
  private CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID;
  private CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID;
  private CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  private CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG;
  private CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG;
  private CatalogsItemValidationDetails EXPIRATION_DATE_INVALID;
  private CatalogsItemValidationDetails GENDER_INVALID;
  private CatalogsItemValidationDetails GTIN_INVALID;
  private CatalogsItemValidationDetails IMAGE_LINK_WARNING;
  private CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID;
  private CatalogsItemValidationDetails IS_BUNDLE_INVALID;
  private CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  private CatalogsItemValidationDetails LINK_FORMAT_WARNING;
  private CatalogsItemValidationDetails MIN_AD_PRICE_INVALID;
  private CatalogsItemValidationDetails MPN_INVALID;
  private CatalogsItemValidationDetails MULTIPACK_INVALID;
  private CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID;
  private CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING;
  private CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID;
  private CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING;
  private CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING;
  private CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG;
  private CatalogsItemValidationDetails SALES_PRICE_INVALID;
  private CatalogsItemValidationDetails SALES_PRICE_TOO_LOW;
  private CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH;
  private CatalogsItemValidationDetails SALE_DATE_INVALID;
  private CatalogsItemValidationDetails SHIPPING_INVALID;
  private CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID;
  private CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID;
  private CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID;
  private CatalogsItemValidationDetails SIZE_TYPE_INVALID;
  private CatalogsItemValidationDetails TAX_INVALID;
  private CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG;
  private CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  private CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED;
  private CatalogsItemValidationDetails WEIGHT_UNIT_INVALID;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("AD_LINK_FORMAT_WARNING")
  @Valid
  public CatalogsItemValidationDetails getADLINKFORMATWARNING() {
    return AD_LINK_FORMAT_WARNING;
  }
  public void setADLINKFORMATWARNING(CatalogsItemValidationDetails AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("AD_LINK_SAME_AS_LINK")
  @Valid
  public CatalogsItemValidationDetails getADLINKSAMEASLINK() {
    return AD_LINK_SAME_AS_LINK;
  }
  public void setADLINKSAMEASLINK(CatalogsItemValidationDetails AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
  @Valid
  public CatalogsItemValidationDetails getADDITIONALIMAGELINKLENGTHTOOLONG() {
    return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }
  public void setADDITIONALIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
  @Valid
  public CatalogsItemValidationDetails getADDITIONALIMAGELINKWARNING() {
    return ADDITIONAL_IMAGE_LINK_WARNING;
  }
  public void setADDITIONALIMAGELINKWARNING(CatalogsItemValidationDetails ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ADWORDS_FORMAT_WARNING")
  @Valid
  public CatalogsItemValidationDetails getADWORDSFORMATWARNING() {
    return ADWORDS_FORMAT_WARNING;
  }
  public void setADWORDSFORMATWARNING(CatalogsItemValidationDetails ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ADWORDS_SAME_AS_LINK")
  @Valid
  public CatalogsItemValidationDetails getADWORDSSAMEASLINK() {
    return ADWORDS_SAME_AS_LINK;
  }
  public void setADWORDSSAMEASLINK(CatalogsItemValidationDetails ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("AGE_GROUP_INVALID")
  @Valid
  public CatalogsItemValidationDetails getAGEGROUPINVALID() {
    return AGE_GROUP_INVALID;
  }
  public void setAGEGROUPINVALID(CatalogsItemValidationDetails AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SIZE_SYSTEM_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSIZESYSTEMINVALID() {
    return SIZE_SYSTEM_INVALID;
  }
  public void setSIZESYSTEMINVALID(CatalogsItemValidationDetails SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ANDROID_DEEP_LINK_INVALID")
  @Valid
  public CatalogsItemValidationDetails getANDROIDDEEPLINKINVALID() {
    return ANDROID_DEEP_LINK_INVALID;
  }
  public void setANDROIDDEEPLINKINVALID(CatalogsItemValidationDetails ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("AVAILABILITY_DATE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getAVAILABILITYDATEINVALID() {
    return AVAILABILITY_DATE_INVALID;
  }
  public void setAVAILABILITYDATEINVALID(CatalogsItemValidationDetails AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
  @Valid
  public CatalogsItemValidationDetails getCOUNTRYDOESNOTMAPTOCURRENCY() {
    return COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }
  public void setCOUNTRYDOESNOTMAPTOCURRENCY(CatalogsItemValidationDetails COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
  @Valid
  public CatalogsItemValidationDetails getCUSTOMLABELLENGTHTOOLONG() {
    return CUSTOM_LABEL_LENGTH_TOO_LONG;
  }
  public void setCUSTOMLABELLENGTHTOOLONG(CatalogsItemValidationDetails CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
  @Valid
  public CatalogsItemValidationDetails getDESCRIPTIONLENGTHTOOLONG() {
    return DESCRIPTION_LENGTH_TOO_LONG;
  }
  public void setDESCRIPTIONLENGTHTOOLONG(CatalogsItemValidationDetails DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("EXPIRATION_DATE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getEXPIRATIONDATEINVALID() {
    return EXPIRATION_DATE_INVALID;
  }
  public void setEXPIRATIONDATEINVALID(CatalogsItemValidationDetails EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("GENDER_INVALID")
  @Valid
  public CatalogsItemValidationDetails getGENDERINVALID() {
    return GENDER_INVALID;
  }
  public void setGENDERINVALID(CatalogsItemValidationDetails GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("GTIN_INVALID")
  @Valid
  public CatalogsItemValidationDetails getGTININVALID() {
    return GTIN_INVALID;
  }
  public void setGTININVALID(CatalogsItemValidationDetails GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IMAGE_LINK_WARNING")
  @Valid
  public CatalogsItemValidationDetails getIMAGELINKWARNING() {
    return IMAGE_LINK_WARNING;
  }
  public void setIMAGELINKWARNING(CatalogsItemValidationDetails IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IOS_DEEP_LINK_INVALID")
  @Valid
  public CatalogsItemValidationDetails getIOSDEEPLINKINVALID() {
    return IOS_DEEP_LINK_INVALID;
  }
  public void setIOSDEEPLINKINVALID(CatalogsItemValidationDetails IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("IS_BUNDLE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getISBUNDLEINVALID() {
    return IS_BUNDLE_INVALID;
  }
  public void setISBUNDLEINVALID(CatalogsItemValidationDetails IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
  @Valid
  public CatalogsItemValidationDetails getITEMADDITIONALIMAGEDOWNLOADFAILURE() {
    return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }
  public void setITEMADDITIONALIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("LINK_FORMAT_WARNING")
  @Valid
  public CatalogsItemValidationDetails getLINKFORMATWARNING() {
    return LINK_FORMAT_WARNING;
  }
  public void setLINKFORMATWARNING(CatalogsItemValidationDetails LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("MIN_AD_PRICE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getMINADPRICEINVALID() {
    return MIN_AD_PRICE_INVALID;
  }
  public void setMINADPRICEINVALID(CatalogsItemValidationDetails MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("MPN_INVALID")
  @Valid
  public CatalogsItemValidationDetails getMPNINVALID() {
    return MPN_INVALID;
  }
  public void setMPNINVALID(CatalogsItemValidationDetails MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("MULTIPACK_INVALID")
  @Valid
  public CatalogsItemValidationDetails getMULTIPACKINVALID() {
    return MULTIPACK_INVALID;
  }
  public void setMULTIPACKINVALID(CatalogsItemValidationDetails MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OPTIONAL_CONDITION_INVALID")
  @Valid
  public CatalogsItemValidationDetails getOPTIONALCONDITIONINVALID() {
    return OPTIONAL_CONDITION_INVALID;
  }
  public void setOPTIONALCONDITIONINVALID(CatalogsItemValidationDetails OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OPTIONAL_CONDITION_MISSING")
  @Valid
  public CatalogsItemValidationDetails getOPTIONALCONDITIONMISSING() {
    return OPTIONAL_CONDITION_MISSING;
  }
  public void setOPTIONALCONDITIONMISSING(CatalogsItemValidationDetails OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
  @Valid
  public CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYINVALID() {
    return OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }
  public void setOPTIONALPRODUCTCATEGORYINVALID(CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
  @Valid
  public CatalogsItemValidationDetails getOPTIONALPRODUCTCATEGORYMISSING() {
    return OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }
  public void setOPTIONALPRODUCTCATEGORYMISSING(CatalogsItemValidationDetails OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
  @Valid
  public CatalogsItemValidationDetails getPRODUCTCATEGORYDEPTHWARNING() {
    return PRODUCT_CATEGORY_DEPTH_WARNING;
  }
  public void setPRODUCTCATEGORYDEPTHWARNING(CatalogsItemValidationDetails PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
  @Valid
  public CatalogsItemValidationDetails getPRODUCTTYPELENGTHTOOLONG() {
    return PRODUCT_TYPE_LENGTH_TOO_LONG;
  }
  public void setPRODUCTTYPELENGTHTOOLONG(CatalogsItemValidationDetails PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SALES_PRICE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSALESPRICEINVALID() {
    return SALES_PRICE_INVALID;
  }
  public void setSALESPRICEINVALID(CatalogsItemValidationDetails SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SALES_PRICE_TOO_LOW")
  @Valid
  public CatalogsItemValidationDetails getSALESPRICETOOLOW() {
    return SALES_PRICE_TOO_LOW;
  }
  public void setSALESPRICETOOLOW(CatalogsItemValidationDetails SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SALES_PRICE_TOO_HIGH")
  @Valid
  public CatalogsItemValidationDetails getSALESPRICETOOHIGH() {
    return SALES_PRICE_TOO_HIGH;
  }
  public void setSALESPRICETOOHIGH(CatalogsItemValidationDetails SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SALE_DATE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSALEDATEINVALID() {
    return SALE_DATE_INVALID;
  }
  public void setSALEDATEINVALID(CatalogsItemValidationDetails SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SHIPPING_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSHIPPINGINVALID() {
    return SHIPPING_INVALID;
  }
  public void setSHIPPINGINVALID(CatalogsItemValidationDetails SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SHIPPING_HEIGHT_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSHIPPINGHEIGHTINVALID() {
    return SHIPPING_HEIGHT_INVALID;
  }
  public void setSHIPPINGHEIGHTINVALID(CatalogsItemValidationDetails SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SHIPPING_WEIGHT_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSHIPPINGWEIGHTINVALID() {
    return SHIPPING_WEIGHT_INVALID;
  }
  public void setSHIPPINGWEIGHTINVALID(CatalogsItemValidationDetails SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SHIPPING_WIDTH_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSHIPPINGWIDTHINVALID() {
    return SHIPPING_WIDTH_INVALID;
  }
  public void setSHIPPINGWIDTHINVALID(CatalogsItemValidationDetails SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("SIZE_TYPE_INVALID")
  @Valid
  public CatalogsItemValidationDetails getSIZETYPEINVALID() {
    return SIZE_TYPE_INVALID;
  }
  public void setSIZETYPEINVALID(CatalogsItemValidationDetails SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("TAX_INVALID")
  @Valid
  public CatalogsItemValidationDetails getTAXINVALID() {
    return TAX_INVALID;
  }
  public void setTAXINVALID(CatalogsItemValidationDetails TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("TITLE_LENGTH_TOO_LONG")
  @Valid
  public CatalogsItemValidationDetails getTITLELENGTHTOOLONG() {
    return TITLE_LENGTH_TOO_LONG;
  }
  public void setTITLELENGTHTOOLONG(CatalogsItemValidationDetails TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
  @Valid
  public CatalogsItemValidationDetails getTOOMANYADDITIONALIMAGELINKS() {
    return TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }
  public void setTOOMANYADDITIONALIMAGELINKS(CatalogsItemValidationDetails TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
  @Valid
  public CatalogsItemValidationDetails getUTMSOURCEAUTOCORRECTED() {
    return UTM_SOURCE_AUTO_CORRECTED;
  }
  public void setUTMSOURCEAUTOCORRECTED(CatalogsItemValidationDetails UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("WEIGHT_UNIT_INVALID")
  @Valid
  public CatalogsItemValidationDetails getWEIGHTUNITINVALID() {
    return WEIGHT_UNIT_INVALID;
  }
  public void setWEIGHTUNITINVALID(CatalogsItemValidationDetails WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemValidationWarnings catalogsItemValidationWarnings = (CatalogsItemValidationWarnings) o;
    return Objects.equals(this.AD_LINK_FORMAT_WARNING, catalogsItemValidationWarnings.AD_LINK_FORMAT_WARNING) &&
        Objects.equals(this.AD_LINK_SAME_AS_LINK, catalogsItemValidationWarnings.AD_LINK_SAME_AS_LINK) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, catalogsItemValidationWarnings.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.ADDITIONAL_IMAGE_LINK_WARNING, catalogsItemValidationWarnings.ADDITIONAL_IMAGE_LINK_WARNING) &&
        Objects.equals(this.ADWORDS_FORMAT_WARNING, catalogsItemValidationWarnings.ADWORDS_FORMAT_WARNING) &&
        Objects.equals(this.ADWORDS_SAME_AS_LINK, catalogsItemValidationWarnings.ADWORDS_SAME_AS_LINK) &&
        Objects.equals(this.AGE_GROUP_INVALID, catalogsItemValidationWarnings.AGE_GROUP_INVALID) &&
        Objects.equals(this.SIZE_SYSTEM_INVALID, catalogsItemValidationWarnings.SIZE_SYSTEM_INVALID) &&
        Objects.equals(this.ANDROID_DEEP_LINK_INVALID, catalogsItemValidationWarnings.ANDROID_DEEP_LINK_INVALID) &&
        Objects.equals(this.AVAILABILITY_DATE_INVALID, catalogsItemValidationWarnings.AVAILABILITY_DATE_INVALID) &&
        Objects.equals(this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY, catalogsItemValidationWarnings.COUNTRY_DOES_NOT_MAP_TO_CURRENCY) &&
        Objects.equals(this.CUSTOM_LABEL_LENGTH_TOO_LONG, catalogsItemValidationWarnings.CUSTOM_LABEL_LENGTH_TOO_LONG) &&
        Objects.equals(this.DESCRIPTION_LENGTH_TOO_LONG, catalogsItemValidationWarnings.DESCRIPTION_LENGTH_TOO_LONG) &&
        Objects.equals(this.EXPIRATION_DATE_INVALID, catalogsItemValidationWarnings.EXPIRATION_DATE_INVALID) &&
        Objects.equals(this.GENDER_INVALID, catalogsItemValidationWarnings.GENDER_INVALID) &&
        Objects.equals(this.GTIN_INVALID, catalogsItemValidationWarnings.GTIN_INVALID) &&
        Objects.equals(this.IMAGE_LINK_WARNING, catalogsItemValidationWarnings.IMAGE_LINK_WARNING) &&
        Objects.equals(this.IOS_DEEP_LINK_INVALID, catalogsItemValidationWarnings.IOS_DEEP_LINK_INVALID) &&
        Objects.equals(this.IS_BUNDLE_INVALID, catalogsItemValidationWarnings.IS_BUNDLE_INVALID) &&
        Objects.equals(this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationWarnings.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.LINK_FORMAT_WARNING, catalogsItemValidationWarnings.LINK_FORMAT_WARNING) &&
        Objects.equals(this.MIN_AD_PRICE_INVALID, catalogsItemValidationWarnings.MIN_AD_PRICE_INVALID) &&
        Objects.equals(this.MPN_INVALID, catalogsItemValidationWarnings.MPN_INVALID) &&
        Objects.equals(this.MULTIPACK_INVALID, catalogsItemValidationWarnings.MULTIPACK_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_INVALID, catalogsItemValidationWarnings.OPTIONAL_CONDITION_INVALID) &&
        Objects.equals(this.OPTIONAL_CONDITION_MISSING, catalogsItemValidationWarnings.OPTIONAL_CONDITION_MISSING) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_INVALID, catalogsItemValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_INVALID) &&
        Objects.equals(this.OPTIONAL_PRODUCT_CATEGORY_MISSING, catalogsItemValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_MISSING) &&
        Objects.equals(this.PRODUCT_CATEGORY_DEPTH_WARNING, catalogsItemValidationWarnings.PRODUCT_CATEGORY_DEPTH_WARNING) &&
        Objects.equals(this.PRODUCT_TYPE_LENGTH_TOO_LONG, catalogsItemValidationWarnings.PRODUCT_TYPE_LENGTH_TOO_LONG) &&
        Objects.equals(this.SALES_PRICE_INVALID, catalogsItemValidationWarnings.SALES_PRICE_INVALID) &&
        Objects.equals(this.SALES_PRICE_TOO_LOW, catalogsItemValidationWarnings.SALES_PRICE_TOO_LOW) &&
        Objects.equals(this.SALES_PRICE_TOO_HIGH, catalogsItemValidationWarnings.SALES_PRICE_TOO_HIGH) &&
        Objects.equals(this.SALE_DATE_INVALID, catalogsItemValidationWarnings.SALE_DATE_INVALID) &&
        Objects.equals(this.SHIPPING_INVALID, catalogsItemValidationWarnings.SHIPPING_INVALID) &&
        Objects.equals(this.SHIPPING_HEIGHT_INVALID, catalogsItemValidationWarnings.SHIPPING_HEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_WEIGHT_INVALID, catalogsItemValidationWarnings.SHIPPING_WEIGHT_INVALID) &&
        Objects.equals(this.SHIPPING_WIDTH_INVALID, catalogsItemValidationWarnings.SHIPPING_WIDTH_INVALID) &&
        Objects.equals(this.SIZE_TYPE_INVALID, catalogsItemValidationWarnings.SIZE_TYPE_INVALID) &&
        Objects.equals(this.TAX_INVALID, catalogsItemValidationWarnings.TAX_INVALID) &&
        Objects.equals(this.TITLE_LENGTH_TOO_LONG, catalogsItemValidationWarnings.TITLE_LENGTH_TOO_LONG) &&
        Objects.equals(this.TOO_MANY_ADDITIONAL_IMAGE_LINKS, catalogsItemValidationWarnings.TOO_MANY_ADDITIONAL_IMAGE_LINKS) &&
        Objects.equals(this.UTM_SOURCE_AUTO_CORRECTED, catalogsItemValidationWarnings.UTM_SOURCE_AUTO_CORRECTED) &&
        Objects.equals(this.WEIGHT_UNIT_INVALID, catalogsItemValidationWarnings.WEIGHT_UNIT_INVALID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, SIZE_SYSTEM_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_WARNING, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_WARNING, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_TYPE_LENGTH_TOO_LONG, SALES_PRICE_INVALID, SALES_PRICE_TOO_LOW, SALES_PRICE_TOO_HIGH, SALE_DATE_INVALID, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationWarnings {\n");
    
    sb.append("    AD_LINK_FORMAT_WARNING: ").append(toIndentedString(AD_LINK_FORMAT_WARNING)).append("\n");
    sb.append("    AD_LINK_SAME_AS_LINK: ").append(toIndentedString(AD_LINK_SAME_AS_LINK)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_WARNING: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_WARNING)).append("\n");
    sb.append("    ADWORDS_FORMAT_WARNING: ").append(toIndentedString(ADWORDS_FORMAT_WARNING)).append("\n");
    sb.append("    ADWORDS_SAME_AS_LINK: ").append(toIndentedString(ADWORDS_SAME_AS_LINK)).append("\n");
    sb.append("    AGE_GROUP_INVALID: ").append(toIndentedString(AGE_GROUP_INVALID)).append("\n");
    sb.append("    SIZE_SYSTEM_INVALID: ").append(toIndentedString(SIZE_SYSTEM_INVALID)).append("\n");
    sb.append("    ANDROID_DEEP_LINK_INVALID: ").append(toIndentedString(ANDROID_DEEP_LINK_INVALID)).append("\n");
    sb.append("    AVAILABILITY_DATE_INVALID: ").append(toIndentedString(AVAILABILITY_DATE_INVALID)).append("\n");
    sb.append("    COUNTRY_DOES_NOT_MAP_TO_CURRENCY: ").append(toIndentedString(COUNTRY_DOES_NOT_MAP_TO_CURRENCY)).append("\n");
    sb.append("    CUSTOM_LABEL_LENGTH_TOO_LONG: ").append(toIndentedString(CUSTOM_LABEL_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DESCRIPTION_LENGTH_TOO_LONG: ").append(toIndentedString(DESCRIPTION_LENGTH_TOO_LONG)).append("\n");
    sb.append("    EXPIRATION_DATE_INVALID: ").append(toIndentedString(EXPIRATION_DATE_INVALID)).append("\n");
    sb.append("    GENDER_INVALID: ").append(toIndentedString(GENDER_INVALID)).append("\n");
    sb.append("    GTIN_INVALID: ").append(toIndentedString(GTIN_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_WARNING: ").append(toIndentedString(IMAGE_LINK_WARNING)).append("\n");
    sb.append("    IOS_DEEP_LINK_INVALID: ").append(toIndentedString(IOS_DEEP_LINK_INVALID)).append("\n");
    sb.append("    IS_BUNDLE_INVALID: ").append(toIndentedString(IS_BUNDLE_INVALID)).append("\n");
    sb.append("    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    LINK_FORMAT_WARNING: ").append(toIndentedString(LINK_FORMAT_WARNING)).append("\n");
    sb.append("    MIN_AD_PRICE_INVALID: ").append(toIndentedString(MIN_AD_PRICE_INVALID)).append("\n");
    sb.append("    MPN_INVALID: ").append(toIndentedString(MPN_INVALID)).append("\n");
    sb.append("    MULTIPACK_INVALID: ").append(toIndentedString(MULTIPACK_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_INVALID: ").append(toIndentedString(OPTIONAL_CONDITION_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_MISSING: ").append(toIndentedString(OPTIONAL_CONDITION_MISSING)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_INVALID: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_INVALID)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_MISSING: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_MISSING)).append("\n");
    sb.append("    PRODUCT_CATEGORY_DEPTH_WARNING: ").append(toIndentedString(PRODUCT_CATEGORY_DEPTH_WARNING)).append("\n");
    sb.append("    PRODUCT_TYPE_LENGTH_TOO_LONG: ").append(toIndentedString(PRODUCT_TYPE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    SALES_PRICE_INVALID: ").append(toIndentedString(SALES_PRICE_INVALID)).append("\n");
    sb.append("    SALES_PRICE_TOO_LOW: ").append(toIndentedString(SALES_PRICE_TOO_LOW)).append("\n");
    sb.append("    SALES_PRICE_TOO_HIGH: ").append(toIndentedString(SALES_PRICE_TOO_HIGH)).append("\n");
    sb.append("    SALE_DATE_INVALID: ").append(toIndentedString(SALE_DATE_INVALID)).append("\n");
    sb.append("    SHIPPING_INVALID: ").append(toIndentedString(SHIPPING_INVALID)).append("\n");
    sb.append("    SHIPPING_HEIGHT_INVALID: ").append(toIndentedString(SHIPPING_HEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_WEIGHT_INVALID: ").append(toIndentedString(SHIPPING_WEIGHT_INVALID)).append("\n");
    sb.append("    SHIPPING_WIDTH_INVALID: ").append(toIndentedString(SHIPPING_WIDTH_INVALID)).append("\n");
    sb.append("    SIZE_TYPE_INVALID: ").append(toIndentedString(SIZE_TYPE_INVALID)).append("\n");
    sb.append("    TAX_INVALID: ").append(toIndentedString(TAX_INVALID)).append("\n");
    sb.append("    TITLE_LENGTH_TOO_LONG: ").append(toIndentedString(TITLE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    TOO_MANY_ADDITIONAL_IMAGE_LINKS: ").append(toIndentedString(TOO_MANY_ADDITIONAL_IMAGE_LINKS)).append("\n");
    sb.append("    UTM_SOURCE_AUTO_CORRECTED: ").append(toIndentedString(UTM_SOURCE_AUTO_CORRECTED)).append("\n");
    sb.append("    WEIGHT_UNIT_INVALID: ").append(toIndentedString(WEIGHT_UNIT_INVALID)).append("\n");
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

