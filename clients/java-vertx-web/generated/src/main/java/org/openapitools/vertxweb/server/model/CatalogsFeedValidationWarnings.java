package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedValidationWarnings   {
  
  private Integer AD_LINK_FORMAT_WARNING;
  private Integer AD_LINK_SAME_AS_LINK;
  private Integer TITLE_LENGTH_TOO_LONG;
  private Integer DESCRIPTION_LENGTH_TOO_LONG;
  private Integer GENDER_INVALID;
  private Integer AGE_GROUP_INVALID;
  private Integer SIZE_TYPE_INVALID;
  private Integer SIZE_SYSTEM_INVALID;
  private Integer LINK_FORMAT_WARNING;
  private Integer SALES_PRICE_INVALID;
  private Integer PRODUCT_CATEGORY_DEPTH_WARNING;
  private Integer ADWORDS_FORMAT_WARNING;
  private Integer ADWORDS_SAME_AS_LINK;
  private Integer DUPLICATE_HEADERS;


  public enum FETCHSAMESIGNATUREEnum {
    NUMBER_1(1);

    private String value;

    FETCHSAMESIGNATUREEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE;
  private Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  private Integer ADDITIONAL_IMAGE_LINK_WARNING;
  private Integer IMAGE_LINK_WARNING;
  private Integer SHIPPING_INVALID;
  private Integer TAX_INVALID;
  private Integer SHIPPING_WEIGHT_INVALID;
  private Integer EXPIRATION_DATE_INVALID;
  private Integer AVAILABILITY_DATE_INVALID;
  private Integer SALE_DATE_INVALID;
  private Integer WEIGHT_UNIT_INVALID;
  private Integer IS_BUNDLE_INVALID;
  private Integer UPDATED_TIME_INVALID;
  private Integer CUSTOM_LABEL_LENGTH_TOO_LONG;
  private Integer PRODUCT_TYPE_LENGTH_TOO_LONG;
  private Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  private Integer MULTIPACK_INVALID;
  private Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  private Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  private Integer OPTIONAL_PRODUCT_CATEGORY_MISSING;
  private Integer OPTIONAL_PRODUCT_CATEGORY_INVALID;
  private Integer OPTIONAL_CONDITION_MISSING;
  private Integer OPTIONAL_CONDITION_INVALID;
  private Integer IOS_DEEP_LINK_INVALID;
  private Integer ANDROID_DEEP_LINK_INVALID;
  private Integer UTM_SOURCE_AUTO_CORRECTED;
  private Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  private Integer MIN_AD_PRICE_INVALID;
  private Integer GTIN_INVALID;
  private Integer INCONSISTENT_CURRENCY_VALUES;
  private Integer SALES_PRICE_TOO_LOW;
  private Integer SHIPPING_WIDTH_INVALID;
  private Integer SHIPPING_HEIGHT_INVALID;
  private Integer SALES_PRICE_TOO_HIGH;
  private Integer MPN_INVALID;

  public CatalogsFeedValidationWarnings () {

  }

  public CatalogsFeedValidationWarnings (Integer AD_LINK_FORMAT_WARNING, Integer AD_LINK_SAME_AS_LINK, Integer TITLE_LENGTH_TOO_LONG, Integer DESCRIPTION_LENGTH_TOO_LONG, Integer GENDER_INVALID, Integer AGE_GROUP_INVALID, Integer SIZE_TYPE_INVALID, Integer SIZE_SYSTEM_INVALID, Integer LINK_FORMAT_WARNING, Integer SALES_PRICE_INVALID, Integer PRODUCT_CATEGORY_DEPTH_WARNING, Integer ADWORDS_FORMAT_WARNING, Integer ADWORDS_SAME_AS_LINK, Integer DUPLICATE_HEADERS, FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE, Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, Integer ADDITIONAL_IMAGE_LINK_WARNING, Integer IMAGE_LINK_WARNING, Integer SHIPPING_INVALID, Integer TAX_INVALID, Integer SHIPPING_WEIGHT_INVALID, Integer EXPIRATION_DATE_INVALID, Integer AVAILABILITY_DATE_INVALID, Integer SALE_DATE_INVALID, Integer WEIGHT_UNIT_INVALID, Integer IS_BUNDLE_INVALID, Integer UPDATED_TIME_INVALID, Integer CUSTOM_LABEL_LENGTH_TOO_LONG, Integer PRODUCT_TYPE_LENGTH_TOO_LONG, Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS, Integer MULTIPACK_INVALID, Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA, Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, Integer OPTIONAL_PRODUCT_CATEGORY_MISSING, Integer OPTIONAL_PRODUCT_CATEGORY_INVALID, Integer OPTIONAL_CONDITION_MISSING, Integer OPTIONAL_CONDITION_INVALID, Integer IOS_DEEP_LINK_INVALID, Integer ANDROID_DEEP_LINK_INVALID, Integer UTM_SOURCE_AUTO_CORRECTED, Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY, Integer MIN_AD_PRICE_INVALID, Integer GTIN_INVALID, Integer INCONSISTENT_CURRENCY_VALUES, Integer SALES_PRICE_TOO_LOW, Integer SHIPPING_WIDTH_INVALID, Integer SHIPPING_HEIGHT_INVALID, Integer SALES_PRICE_TOO_HIGH, Integer MPN_INVALID) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
    this.GENDER_INVALID = GENDER_INVALID;
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
    this.SHIPPING_INVALID = SHIPPING_INVALID;
    this.TAX_INVALID = TAX_INVALID;
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
    this.GTIN_INVALID = GTIN_INVALID;
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
    this.MPN_INVALID = MPN_INVALID;
  }

    
  @JsonProperty("AD_LINK_FORMAT_WARNING")
  public Integer getADLINKFORMATWARNING() {
    return AD_LINK_FORMAT_WARNING;
  }
  public void setADLINKFORMATWARNING(Integer AD_LINK_FORMAT_WARNING) {
    this.AD_LINK_FORMAT_WARNING = AD_LINK_FORMAT_WARNING;
  }

    
  @JsonProperty("AD_LINK_SAME_AS_LINK")
  public Integer getADLINKSAMEASLINK() {
    return AD_LINK_SAME_AS_LINK;
  }
  public void setADLINKSAMEASLINK(Integer AD_LINK_SAME_AS_LINK) {
    this.AD_LINK_SAME_AS_LINK = AD_LINK_SAME_AS_LINK;
  }

    
  @JsonProperty("TITLE_LENGTH_TOO_LONG")
  public Integer getTITLELENGTHTOOLONG() {
    return TITLE_LENGTH_TOO_LONG;
  }
  public void setTITLELENGTHTOOLONG(Integer TITLE_LENGTH_TOO_LONG) {
    this.TITLE_LENGTH_TOO_LONG = TITLE_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
  public Integer getDESCRIPTIONLENGTHTOOLONG() {
    return DESCRIPTION_LENGTH_TOO_LONG;
  }
  public void setDESCRIPTIONLENGTHTOOLONG(Integer DESCRIPTION_LENGTH_TOO_LONG) {
    this.DESCRIPTION_LENGTH_TOO_LONG = DESCRIPTION_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("GENDER_INVALID")
  public Integer getGENDERINVALID() {
    return GENDER_INVALID;
  }
  public void setGENDERINVALID(Integer GENDER_INVALID) {
    this.GENDER_INVALID = GENDER_INVALID;
  }

    
  @JsonProperty("AGE_GROUP_INVALID")
  public Integer getAGEGROUPINVALID() {
    return AGE_GROUP_INVALID;
  }
  public void setAGEGROUPINVALID(Integer AGE_GROUP_INVALID) {
    this.AGE_GROUP_INVALID = AGE_GROUP_INVALID;
  }

    
  @JsonProperty("SIZE_TYPE_INVALID")
  public Integer getSIZETYPEINVALID() {
    return SIZE_TYPE_INVALID;
  }
  public void setSIZETYPEINVALID(Integer SIZE_TYPE_INVALID) {
    this.SIZE_TYPE_INVALID = SIZE_TYPE_INVALID;
  }

    
  @JsonProperty("SIZE_SYSTEM_INVALID")
  public Integer getSIZESYSTEMINVALID() {
    return SIZE_SYSTEM_INVALID;
  }
  public void setSIZESYSTEMINVALID(Integer SIZE_SYSTEM_INVALID) {
    this.SIZE_SYSTEM_INVALID = SIZE_SYSTEM_INVALID;
  }

    
  @JsonProperty("LINK_FORMAT_WARNING")
  public Integer getLINKFORMATWARNING() {
    return LINK_FORMAT_WARNING;
  }
  public void setLINKFORMATWARNING(Integer LINK_FORMAT_WARNING) {
    this.LINK_FORMAT_WARNING = LINK_FORMAT_WARNING;
  }

    
  @JsonProperty("SALES_PRICE_INVALID")
  public Integer getSALESPRICEINVALID() {
    return SALES_PRICE_INVALID;
  }
  public void setSALESPRICEINVALID(Integer SALES_PRICE_INVALID) {
    this.SALES_PRICE_INVALID = SALES_PRICE_INVALID;
  }

    
  @JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
  public Integer getPRODUCTCATEGORYDEPTHWARNING() {
    return PRODUCT_CATEGORY_DEPTH_WARNING;
  }
  public void setPRODUCTCATEGORYDEPTHWARNING(Integer PRODUCT_CATEGORY_DEPTH_WARNING) {
    this.PRODUCT_CATEGORY_DEPTH_WARNING = PRODUCT_CATEGORY_DEPTH_WARNING;
  }

    
  @JsonProperty("ADWORDS_FORMAT_WARNING")
  public Integer getADWORDSFORMATWARNING() {
    return ADWORDS_FORMAT_WARNING;
  }
  public void setADWORDSFORMATWARNING(Integer ADWORDS_FORMAT_WARNING) {
    this.ADWORDS_FORMAT_WARNING = ADWORDS_FORMAT_WARNING;
  }

    
  @JsonProperty("ADWORDS_SAME_AS_LINK")
  public Integer getADWORDSSAMEASLINK() {
    return ADWORDS_SAME_AS_LINK;
  }
  public void setADWORDSSAMEASLINK(Integer ADWORDS_SAME_AS_LINK) {
    this.ADWORDS_SAME_AS_LINK = ADWORDS_SAME_AS_LINK;
  }

    
  @JsonProperty("DUPLICATE_HEADERS")
  public Integer getDUPLICATEHEADERS() {
    return DUPLICATE_HEADERS;
  }
  public void setDUPLICATEHEADERS(Integer DUPLICATE_HEADERS) {
    this.DUPLICATE_HEADERS = DUPLICATE_HEADERS;
  }

    
  @JsonProperty("FETCH_SAME_SIGNATURE")
  public FETCHSAMESIGNATUREEnum getFETCHSAMESIGNATURE() {
    return FETCH_SAME_SIGNATURE;
  }
  public void setFETCHSAMESIGNATURE(FETCHSAMESIGNATUREEnum FETCH_SAME_SIGNATURE) {
    this.FETCH_SAME_SIGNATURE = FETCH_SAME_SIGNATURE;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
  public Integer getADDITIONALIMAGELINKLENGTHTOOLONG() {
    return ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }
  public void setADDITIONALIMAGELINKLENGTHTOOLONG(Integer ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) {
    this.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
  public Integer getADDITIONALIMAGELINKWARNING() {
    return ADDITIONAL_IMAGE_LINK_WARNING;
  }
  public void setADDITIONALIMAGELINKWARNING(Integer ADDITIONAL_IMAGE_LINK_WARNING) {
    this.ADDITIONAL_IMAGE_LINK_WARNING = ADDITIONAL_IMAGE_LINK_WARNING;
  }

    
  @JsonProperty("IMAGE_LINK_WARNING")
  public Integer getIMAGELINKWARNING() {
    return IMAGE_LINK_WARNING;
  }
  public void setIMAGELINKWARNING(Integer IMAGE_LINK_WARNING) {
    this.IMAGE_LINK_WARNING = IMAGE_LINK_WARNING;
  }

    
  @JsonProperty("SHIPPING_INVALID")
  public Integer getSHIPPINGINVALID() {
    return SHIPPING_INVALID;
  }
  public void setSHIPPINGINVALID(Integer SHIPPING_INVALID) {
    this.SHIPPING_INVALID = SHIPPING_INVALID;
  }

    
  @JsonProperty("TAX_INVALID")
  public Integer getTAXINVALID() {
    return TAX_INVALID;
  }
  public void setTAXINVALID(Integer TAX_INVALID) {
    this.TAX_INVALID = TAX_INVALID;
  }

    
  @JsonProperty("SHIPPING_WEIGHT_INVALID")
  public Integer getSHIPPINGWEIGHTINVALID() {
    return SHIPPING_WEIGHT_INVALID;
  }
  public void setSHIPPINGWEIGHTINVALID(Integer SHIPPING_WEIGHT_INVALID) {
    this.SHIPPING_WEIGHT_INVALID = SHIPPING_WEIGHT_INVALID;
  }

    
  @JsonProperty("EXPIRATION_DATE_INVALID")
  public Integer getEXPIRATIONDATEINVALID() {
    return EXPIRATION_DATE_INVALID;
  }
  public void setEXPIRATIONDATEINVALID(Integer EXPIRATION_DATE_INVALID) {
    this.EXPIRATION_DATE_INVALID = EXPIRATION_DATE_INVALID;
  }

    
  @JsonProperty("AVAILABILITY_DATE_INVALID")
  public Integer getAVAILABILITYDATEINVALID() {
    return AVAILABILITY_DATE_INVALID;
  }
  public void setAVAILABILITYDATEINVALID(Integer AVAILABILITY_DATE_INVALID) {
    this.AVAILABILITY_DATE_INVALID = AVAILABILITY_DATE_INVALID;
  }

    
  @JsonProperty("SALE_DATE_INVALID")
  public Integer getSALEDATEINVALID() {
    return SALE_DATE_INVALID;
  }
  public void setSALEDATEINVALID(Integer SALE_DATE_INVALID) {
    this.SALE_DATE_INVALID = SALE_DATE_INVALID;
  }

    
  @JsonProperty("WEIGHT_UNIT_INVALID")
  public Integer getWEIGHTUNITINVALID() {
    return WEIGHT_UNIT_INVALID;
  }
  public void setWEIGHTUNITINVALID(Integer WEIGHT_UNIT_INVALID) {
    this.WEIGHT_UNIT_INVALID = WEIGHT_UNIT_INVALID;
  }

    
  @JsonProperty("IS_BUNDLE_INVALID")
  public Integer getISBUNDLEINVALID() {
    return IS_BUNDLE_INVALID;
  }
  public void setISBUNDLEINVALID(Integer IS_BUNDLE_INVALID) {
    this.IS_BUNDLE_INVALID = IS_BUNDLE_INVALID;
  }

    
  @JsonProperty("UPDATED_TIME_INVALID")
  public Integer getUPDATEDTIMEINVALID() {
    return UPDATED_TIME_INVALID;
  }
  public void setUPDATEDTIMEINVALID(Integer UPDATED_TIME_INVALID) {
    this.UPDATED_TIME_INVALID = UPDATED_TIME_INVALID;
  }

    
  @JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
  public Integer getCUSTOMLABELLENGTHTOOLONG() {
    return CUSTOM_LABEL_LENGTH_TOO_LONG;
  }
  public void setCUSTOMLABELLENGTHTOOLONG(Integer CUSTOM_LABEL_LENGTH_TOO_LONG) {
    this.CUSTOM_LABEL_LENGTH_TOO_LONG = CUSTOM_LABEL_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
  public Integer getPRODUCTTYPELENGTHTOOLONG() {
    return PRODUCT_TYPE_LENGTH_TOO_LONG;
  }
  public void setPRODUCTTYPELENGTHTOOLONG(Integer PRODUCT_TYPE_LENGTH_TOO_LONG) {
    this.PRODUCT_TYPE_LENGTH_TOO_LONG = PRODUCT_TYPE_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
  public Integer getTOOMANYADDITIONALIMAGELINKS() {
    return TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }
  public void setTOOMANYADDITIONALIMAGELINKS(Integer TOO_MANY_ADDITIONAL_IMAGE_LINKS) {
    this.TOO_MANY_ADDITIONAL_IMAGE_LINKS = TOO_MANY_ADDITIONAL_IMAGE_LINKS;
  }

    
  @JsonProperty("MULTIPACK_INVALID")
  public Integer getMULTIPACKINVALID() {
    return MULTIPACK_INVALID;
  }
  public void setMULTIPACKINVALID(Integer MULTIPACK_INVALID) {
    this.MULTIPACK_INVALID = MULTIPACK_INVALID;
  }

    
  @JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA")
  public Integer getINDEXEDPRODUCTCOUNTLARGEDELTA() {
    return INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }
  public void setINDEXEDPRODUCTCOUNTLARGEDELTA(Integer INDEXED_PRODUCT_COUNT_LARGE_DELTA) {
    this.INDEXED_PRODUCT_COUNT_LARGE_DELTA = INDEXED_PRODUCT_COUNT_LARGE_DELTA;
  }

    
  @JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
  public Integer getITEMADDITIONALIMAGEDOWNLOADFAILURE() {
    return ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }
  public void setITEMADDITIONALIMAGEDOWNLOADFAILURE(Integer ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
  }

    
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
  public Integer getOPTIONALPRODUCTCATEGORYMISSING() {
    return OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }
  public void setOPTIONALPRODUCTCATEGORYMISSING(Integer OPTIONAL_PRODUCT_CATEGORY_MISSING) {
    this.OPTIONAL_PRODUCT_CATEGORY_MISSING = OPTIONAL_PRODUCT_CATEGORY_MISSING;
  }

    
  @JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
  public Integer getOPTIONALPRODUCTCATEGORYINVALID() {
    return OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }
  public void setOPTIONALPRODUCTCATEGORYINVALID(Integer OPTIONAL_PRODUCT_CATEGORY_INVALID) {
    this.OPTIONAL_PRODUCT_CATEGORY_INVALID = OPTIONAL_PRODUCT_CATEGORY_INVALID;
  }

    
  @JsonProperty("OPTIONAL_CONDITION_MISSING")
  public Integer getOPTIONALCONDITIONMISSING() {
    return OPTIONAL_CONDITION_MISSING;
  }
  public void setOPTIONALCONDITIONMISSING(Integer OPTIONAL_CONDITION_MISSING) {
    this.OPTIONAL_CONDITION_MISSING = OPTIONAL_CONDITION_MISSING;
  }

    
  @JsonProperty("OPTIONAL_CONDITION_INVALID")
  public Integer getOPTIONALCONDITIONINVALID() {
    return OPTIONAL_CONDITION_INVALID;
  }
  public void setOPTIONALCONDITIONINVALID(Integer OPTIONAL_CONDITION_INVALID) {
    this.OPTIONAL_CONDITION_INVALID = OPTIONAL_CONDITION_INVALID;
  }

    
  @JsonProperty("IOS_DEEP_LINK_INVALID")
  public Integer getIOSDEEPLINKINVALID() {
    return IOS_DEEP_LINK_INVALID;
  }
  public void setIOSDEEPLINKINVALID(Integer IOS_DEEP_LINK_INVALID) {
    this.IOS_DEEP_LINK_INVALID = IOS_DEEP_LINK_INVALID;
  }

    
  @JsonProperty("ANDROID_DEEP_LINK_INVALID")
  public Integer getANDROIDDEEPLINKINVALID() {
    return ANDROID_DEEP_LINK_INVALID;
  }
  public void setANDROIDDEEPLINKINVALID(Integer ANDROID_DEEP_LINK_INVALID) {
    this.ANDROID_DEEP_LINK_INVALID = ANDROID_DEEP_LINK_INVALID;
  }

    
  @JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
  public Integer getUTMSOURCEAUTOCORRECTED() {
    return UTM_SOURCE_AUTO_CORRECTED;
  }
  public void setUTMSOURCEAUTOCORRECTED(Integer UTM_SOURCE_AUTO_CORRECTED) {
    this.UTM_SOURCE_AUTO_CORRECTED = UTM_SOURCE_AUTO_CORRECTED;
  }

    
  @JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
  public Integer getCOUNTRYDOESNOTMAPTOCURRENCY() {
    return COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }
  public void setCOUNTRYDOESNOTMAPTOCURRENCY(Integer COUNTRY_DOES_NOT_MAP_TO_CURRENCY) {
    this.COUNTRY_DOES_NOT_MAP_TO_CURRENCY = COUNTRY_DOES_NOT_MAP_TO_CURRENCY;
  }

    
  @JsonProperty("MIN_AD_PRICE_INVALID")
  public Integer getMINADPRICEINVALID() {
    return MIN_AD_PRICE_INVALID;
  }
  public void setMINADPRICEINVALID(Integer MIN_AD_PRICE_INVALID) {
    this.MIN_AD_PRICE_INVALID = MIN_AD_PRICE_INVALID;
  }

    
  @JsonProperty("GTIN_INVALID")
  public Integer getGTININVALID() {
    return GTIN_INVALID;
  }
  public void setGTININVALID(Integer GTIN_INVALID) {
    this.GTIN_INVALID = GTIN_INVALID;
  }

    
  @JsonProperty("INCONSISTENT_CURRENCY_VALUES")
  public Integer getINCONSISTENTCURRENCYVALUES() {
    return INCONSISTENT_CURRENCY_VALUES;
  }
  public void setINCONSISTENTCURRENCYVALUES(Integer INCONSISTENT_CURRENCY_VALUES) {
    this.INCONSISTENT_CURRENCY_VALUES = INCONSISTENT_CURRENCY_VALUES;
  }

    
  @JsonProperty("SALES_PRICE_TOO_LOW")
  public Integer getSALESPRICETOOLOW() {
    return SALES_PRICE_TOO_LOW;
  }
  public void setSALESPRICETOOLOW(Integer SALES_PRICE_TOO_LOW) {
    this.SALES_PRICE_TOO_LOW = SALES_PRICE_TOO_LOW;
  }

    
  @JsonProperty("SHIPPING_WIDTH_INVALID")
  public Integer getSHIPPINGWIDTHINVALID() {
    return SHIPPING_WIDTH_INVALID;
  }
  public void setSHIPPINGWIDTHINVALID(Integer SHIPPING_WIDTH_INVALID) {
    this.SHIPPING_WIDTH_INVALID = SHIPPING_WIDTH_INVALID;
  }

    
  @JsonProperty("SHIPPING_HEIGHT_INVALID")
  public Integer getSHIPPINGHEIGHTINVALID() {
    return SHIPPING_HEIGHT_INVALID;
  }
  public void setSHIPPINGHEIGHTINVALID(Integer SHIPPING_HEIGHT_INVALID) {
    this.SHIPPING_HEIGHT_INVALID = SHIPPING_HEIGHT_INVALID;
  }

    
  @JsonProperty("SALES_PRICE_TOO_HIGH")
  public Integer getSALESPRICETOOHIGH() {
    return SALES_PRICE_TOO_HIGH;
  }
  public void setSALESPRICETOOHIGH(Integer SALES_PRICE_TOO_HIGH) {
    this.SALES_PRICE_TOO_HIGH = SALES_PRICE_TOO_HIGH;
  }

    
  @JsonProperty("MPN_INVALID")
  public Integer getMPNINVALID() {
    return MPN_INVALID;
  }
  public void setMPNINVALID(Integer MPN_INVALID) {
    this.MPN_INVALID = MPN_INVALID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationWarnings catalogsFeedValidationWarnings = (CatalogsFeedValidationWarnings) o;
    return Objects.equals(AD_LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.AD_LINK_FORMAT_WARNING) &&
        Objects.equals(AD_LINK_SAME_AS_LINK, catalogsFeedValidationWarnings.AD_LINK_SAME_AS_LINK) &&
        Objects.equals(TITLE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.TITLE_LENGTH_TOO_LONG) &&
        Objects.equals(DESCRIPTION_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.DESCRIPTION_LENGTH_TOO_LONG) &&
        Objects.equals(GENDER_INVALID, catalogsFeedValidationWarnings.GENDER_INVALID) &&
        Objects.equals(AGE_GROUP_INVALID, catalogsFeedValidationWarnings.AGE_GROUP_INVALID) &&
        Objects.equals(SIZE_TYPE_INVALID, catalogsFeedValidationWarnings.SIZE_TYPE_INVALID) &&
        Objects.equals(SIZE_SYSTEM_INVALID, catalogsFeedValidationWarnings.SIZE_SYSTEM_INVALID) &&
        Objects.equals(LINK_FORMAT_WARNING, catalogsFeedValidationWarnings.LINK_FORMAT_WARNING) &&
        Objects.equals(SALES_PRICE_INVALID, catalogsFeedValidationWarnings.SALES_PRICE_INVALID) &&
        Objects.equals(PRODUCT_CATEGORY_DEPTH_WARNING, catalogsFeedValidationWarnings.PRODUCT_CATEGORY_DEPTH_WARNING) &&
        Objects.equals(ADWORDS_FORMAT_WARNING, catalogsFeedValidationWarnings.ADWORDS_FORMAT_WARNING) &&
        Objects.equals(ADWORDS_SAME_AS_LINK, catalogsFeedValidationWarnings.ADWORDS_SAME_AS_LINK) &&
        Objects.equals(DUPLICATE_HEADERS, catalogsFeedValidationWarnings.DUPLICATE_HEADERS) &&
        Objects.equals(FETCH_SAME_SIGNATURE, catalogsFeedValidationWarnings.FETCH_SAME_SIGNATURE) &&
        Objects.equals(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(ADDITIONAL_IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.ADDITIONAL_IMAGE_LINK_WARNING) &&
        Objects.equals(IMAGE_LINK_WARNING, catalogsFeedValidationWarnings.IMAGE_LINK_WARNING) &&
        Objects.equals(SHIPPING_INVALID, catalogsFeedValidationWarnings.SHIPPING_INVALID) &&
        Objects.equals(TAX_INVALID, catalogsFeedValidationWarnings.TAX_INVALID) &&
        Objects.equals(SHIPPING_WEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_WEIGHT_INVALID) &&
        Objects.equals(EXPIRATION_DATE_INVALID, catalogsFeedValidationWarnings.EXPIRATION_DATE_INVALID) &&
        Objects.equals(AVAILABILITY_DATE_INVALID, catalogsFeedValidationWarnings.AVAILABILITY_DATE_INVALID) &&
        Objects.equals(SALE_DATE_INVALID, catalogsFeedValidationWarnings.SALE_DATE_INVALID) &&
        Objects.equals(WEIGHT_UNIT_INVALID, catalogsFeedValidationWarnings.WEIGHT_UNIT_INVALID) &&
        Objects.equals(IS_BUNDLE_INVALID, catalogsFeedValidationWarnings.IS_BUNDLE_INVALID) &&
        Objects.equals(UPDATED_TIME_INVALID, catalogsFeedValidationWarnings.UPDATED_TIME_INVALID) &&
        Objects.equals(CUSTOM_LABEL_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.CUSTOM_LABEL_LENGTH_TOO_LONG) &&
        Objects.equals(PRODUCT_TYPE_LENGTH_TOO_LONG, catalogsFeedValidationWarnings.PRODUCT_TYPE_LENGTH_TOO_LONG) &&
        Objects.equals(TOO_MANY_ADDITIONAL_IMAGE_LINKS, catalogsFeedValidationWarnings.TOO_MANY_ADDITIONAL_IMAGE_LINKS) &&
        Objects.equals(MULTIPACK_INVALID, catalogsFeedValidationWarnings.MULTIPACK_INVALID) &&
        Objects.equals(INDEXED_PRODUCT_COUNT_LARGE_DELTA, catalogsFeedValidationWarnings.INDEXED_PRODUCT_COUNT_LARGE_DELTA) &&
        Objects.equals(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, catalogsFeedValidationWarnings.ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(OPTIONAL_PRODUCT_CATEGORY_MISSING, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_MISSING) &&
        Objects.equals(OPTIONAL_PRODUCT_CATEGORY_INVALID, catalogsFeedValidationWarnings.OPTIONAL_PRODUCT_CATEGORY_INVALID) &&
        Objects.equals(OPTIONAL_CONDITION_MISSING, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_MISSING) &&
        Objects.equals(OPTIONAL_CONDITION_INVALID, catalogsFeedValidationWarnings.OPTIONAL_CONDITION_INVALID) &&
        Objects.equals(IOS_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.IOS_DEEP_LINK_INVALID) &&
        Objects.equals(ANDROID_DEEP_LINK_INVALID, catalogsFeedValidationWarnings.ANDROID_DEEP_LINK_INVALID) &&
        Objects.equals(UTM_SOURCE_AUTO_CORRECTED, catalogsFeedValidationWarnings.UTM_SOURCE_AUTO_CORRECTED) &&
        Objects.equals(COUNTRY_DOES_NOT_MAP_TO_CURRENCY, catalogsFeedValidationWarnings.COUNTRY_DOES_NOT_MAP_TO_CURRENCY) &&
        Objects.equals(MIN_AD_PRICE_INVALID, catalogsFeedValidationWarnings.MIN_AD_PRICE_INVALID) &&
        Objects.equals(GTIN_INVALID, catalogsFeedValidationWarnings.GTIN_INVALID) &&
        Objects.equals(INCONSISTENT_CURRENCY_VALUES, catalogsFeedValidationWarnings.INCONSISTENT_CURRENCY_VALUES) &&
        Objects.equals(SALES_PRICE_TOO_LOW, catalogsFeedValidationWarnings.SALES_PRICE_TOO_LOW) &&
        Objects.equals(SHIPPING_WIDTH_INVALID, catalogsFeedValidationWarnings.SHIPPING_WIDTH_INVALID) &&
        Objects.equals(SHIPPING_HEIGHT_INVALID, catalogsFeedValidationWarnings.SHIPPING_HEIGHT_INVALID) &&
        Objects.equals(SALES_PRICE_TOO_HIGH, catalogsFeedValidationWarnings.SALES_PRICE_TOO_HIGH) &&
        Objects.equals(MPN_INVALID, catalogsFeedValidationWarnings.MPN_INVALID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, TITLE_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, GENDER_INVALID, AGE_GROUP_INVALID, SIZE_TYPE_INVALID, SIZE_SYSTEM_INVALID, LINK_FORMAT_WARNING, SALES_PRICE_INVALID, PRODUCT_CATEGORY_DEPTH_WARNING, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, DUPLICATE_HEADERS, FETCH_SAME_SIGNATURE, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, IMAGE_LINK_WARNING, SHIPPING_INVALID, TAX_INVALID, SHIPPING_WEIGHT_INVALID, EXPIRATION_DATE_INVALID, AVAILABILITY_DATE_INVALID, SALE_DATE_INVALID, WEIGHT_UNIT_INVALID, IS_BUNDLE_INVALID, UPDATED_TIME_INVALID, CUSTOM_LABEL_LENGTH_TOO_LONG, PRODUCT_TYPE_LENGTH_TOO_LONG, TOO_MANY_ADDITIONAL_IMAGE_LINKS, MULTIPACK_INVALID, INDEXED_PRODUCT_COUNT_LARGE_DELTA, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, OPTIONAL_PRODUCT_CATEGORY_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_CONDITION_INVALID, IOS_DEEP_LINK_INVALID, ANDROID_DEEP_LINK_INVALID, UTM_SOURCE_AUTO_CORRECTED, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, MIN_AD_PRICE_INVALID, GTIN_INVALID, INCONSISTENT_CURRENCY_VALUES, SALES_PRICE_TOO_LOW, SHIPPING_WIDTH_INVALID, SHIPPING_HEIGHT_INVALID, SALES_PRICE_TOO_HIGH, MPN_INVALID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationWarnings {\n");
    
    sb.append("    AD_LINK_FORMAT_WARNING: ").append(toIndentedString(AD_LINK_FORMAT_WARNING)).append("\n");
    sb.append("    AD_LINK_SAME_AS_LINK: ").append(toIndentedString(AD_LINK_SAME_AS_LINK)).append("\n");
    sb.append("    TITLE_LENGTH_TOO_LONG: ").append(toIndentedString(TITLE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    DESCRIPTION_LENGTH_TOO_LONG: ").append(toIndentedString(DESCRIPTION_LENGTH_TOO_LONG)).append("\n");
    sb.append("    GENDER_INVALID: ").append(toIndentedString(GENDER_INVALID)).append("\n");
    sb.append("    AGE_GROUP_INVALID: ").append(toIndentedString(AGE_GROUP_INVALID)).append("\n");
    sb.append("    SIZE_TYPE_INVALID: ").append(toIndentedString(SIZE_TYPE_INVALID)).append("\n");
    sb.append("    SIZE_SYSTEM_INVALID: ").append(toIndentedString(SIZE_SYSTEM_INVALID)).append("\n");
    sb.append("    LINK_FORMAT_WARNING: ").append(toIndentedString(LINK_FORMAT_WARNING)).append("\n");
    sb.append("    SALES_PRICE_INVALID: ").append(toIndentedString(SALES_PRICE_INVALID)).append("\n");
    sb.append("    PRODUCT_CATEGORY_DEPTH_WARNING: ").append(toIndentedString(PRODUCT_CATEGORY_DEPTH_WARNING)).append("\n");
    sb.append("    ADWORDS_FORMAT_WARNING: ").append(toIndentedString(ADWORDS_FORMAT_WARNING)).append("\n");
    sb.append("    ADWORDS_SAME_AS_LINK: ").append(toIndentedString(ADWORDS_SAME_AS_LINK)).append("\n");
    sb.append("    DUPLICATE_HEADERS: ").append(toIndentedString(DUPLICATE_HEADERS)).append("\n");
    sb.append("    FETCH_SAME_SIGNATURE: ").append(toIndentedString(FETCH_SAME_SIGNATURE)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    ADDITIONAL_IMAGE_LINK_WARNING: ").append(toIndentedString(ADDITIONAL_IMAGE_LINK_WARNING)).append("\n");
    sb.append("    IMAGE_LINK_WARNING: ").append(toIndentedString(IMAGE_LINK_WARNING)).append("\n");
    sb.append("    SHIPPING_INVALID: ").append(toIndentedString(SHIPPING_INVALID)).append("\n");
    sb.append("    TAX_INVALID: ").append(toIndentedString(TAX_INVALID)).append("\n");
    sb.append("    SHIPPING_WEIGHT_INVALID: ").append(toIndentedString(SHIPPING_WEIGHT_INVALID)).append("\n");
    sb.append("    EXPIRATION_DATE_INVALID: ").append(toIndentedString(EXPIRATION_DATE_INVALID)).append("\n");
    sb.append("    AVAILABILITY_DATE_INVALID: ").append(toIndentedString(AVAILABILITY_DATE_INVALID)).append("\n");
    sb.append("    SALE_DATE_INVALID: ").append(toIndentedString(SALE_DATE_INVALID)).append("\n");
    sb.append("    WEIGHT_UNIT_INVALID: ").append(toIndentedString(WEIGHT_UNIT_INVALID)).append("\n");
    sb.append("    IS_BUNDLE_INVALID: ").append(toIndentedString(IS_BUNDLE_INVALID)).append("\n");
    sb.append("    UPDATED_TIME_INVALID: ").append(toIndentedString(UPDATED_TIME_INVALID)).append("\n");
    sb.append("    CUSTOM_LABEL_LENGTH_TOO_LONG: ").append(toIndentedString(CUSTOM_LABEL_LENGTH_TOO_LONG)).append("\n");
    sb.append("    PRODUCT_TYPE_LENGTH_TOO_LONG: ").append(toIndentedString(PRODUCT_TYPE_LENGTH_TOO_LONG)).append("\n");
    sb.append("    TOO_MANY_ADDITIONAL_IMAGE_LINKS: ").append(toIndentedString(TOO_MANY_ADDITIONAL_IMAGE_LINKS)).append("\n");
    sb.append("    MULTIPACK_INVALID: ").append(toIndentedString(MULTIPACK_INVALID)).append("\n");
    sb.append("    INDEXED_PRODUCT_COUNT_LARGE_DELTA: ").append(toIndentedString(INDEXED_PRODUCT_COUNT_LARGE_DELTA)).append("\n");
    sb.append("    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_MISSING: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_MISSING)).append("\n");
    sb.append("    OPTIONAL_PRODUCT_CATEGORY_INVALID: ").append(toIndentedString(OPTIONAL_PRODUCT_CATEGORY_INVALID)).append("\n");
    sb.append("    OPTIONAL_CONDITION_MISSING: ").append(toIndentedString(OPTIONAL_CONDITION_MISSING)).append("\n");
    sb.append("    OPTIONAL_CONDITION_INVALID: ").append(toIndentedString(OPTIONAL_CONDITION_INVALID)).append("\n");
    sb.append("    IOS_DEEP_LINK_INVALID: ").append(toIndentedString(IOS_DEEP_LINK_INVALID)).append("\n");
    sb.append("    ANDROID_DEEP_LINK_INVALID: ").append(toIndentedString(ANDROID_DEEP_LINK_INVALID)).append("\n");
    sb.append("    UTM_SOURCE_AUTO_CORRECTED: ").append(toIndentedString(UTM_SOURCE_AUTO_CORRECTED)).append("\n");
    sb.append("    COUNTRY_DOES_NOT_MAP_TO_CURRENCY: ").append(toIndentedString(COUNTRY_DOES_NOT_MAP_TO_CURRENCY)).append("\n");
    sb.append("    MIN_AD_PRICE_INVALID: ").append(toIndentedString(MIN_AD_PRICE_INVALID)).append("\n");
    sb.append("    GTIN_INVALID: ").append(toIndentedString(GTIN_INVALID)).append("\n");
    sb.append("    INCONSISTENT_CURRENCY_VALUES: ").append(toIndentedString(INCONSISTENT_CURRENCY_VALUES)).append("\n");
    sb.append("    SALES_PRICE_TOO_LOW: ").append(toIndentedString(SALES_PRICE_TOO_LOW)).append("\n");
    sb.append("    SHIPPING_WIDTH_INVALID: ").append(toIndentedString(SHIPPING_WIDTH_INVALID)).append("\n");
    sb.append("    SHIPPING_HEIGHT_INVALID: ").append(toIndentedString(SHIPPING_HEIGHT_INVALID)).append("\n");
    sb.append("    SALES_PRICE_TOO_HIGH: ").append(toIndentedString(SALES_PRICE_TOO_HIGH)).append("\n");
    sb.append("    MPN_INVALID: ").append(toIndentedString(MPN_INVALID)).append("\n");
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
