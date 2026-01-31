package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedValidationErrors   {
  
  private Integer ADULT_INVALID;
  private Integer ADWORDS_FORMAT_INVALID;
  private Integer AVAILABILITY_INVALID;
  private Integer BLOCKLISTED_IMAGE_SIGNATURE;
  private Integer DELIMITER_ERROR;
  private Integer DESCRIPTION_MISSING;
  private Integer DUPLICATE_PRODUCTS;
  private Integer ENCODING_ERROR;
  private Integer FEED_LENGTH_TOO_LONG;
  private Integer FEED_TOO_SMALL;
  private Integer FETCH_ERROR;
  private Integer FETCH_INACTIVE_FEED_ERROR;
  private Integer IMAGE_LINK_INVALID;
  private Integer IMAGE_LINK_LENGTH_TOO_LONG;
  private Integer IMAGE_LINK_MISSING;
  private Integer INTERNAL_SERVICE_ERROR;
  private Integer INVALID_DOMAIN;
  private Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  private Integer ITEMID_MISSING;
  private Integer LINK_FORMAT_INVALID;
  private Integer LINK_LENGTH_TOO_LONG;
  private Integer LIST_PRICE_INVALID;
  private Integer MALFORMED_XML;
  private Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  private Integer NO_VERIFIED_DOMAIN;
  private Integer PARSE_LINE_ERROR;
  private Integer PINJOIN_CONTENT_UNSAFE;
  private Integer PRICE_CANNOT_BE_DETERMINED;
  private Integer PRICE_MISSING;
  private Integer PRODUCT_LINK_MISSING;
  private Integer PRODUCT_PRICE_INVALID;
  private Integer REQUIRED_COLUMNS_MISSING;
  private Integer TITLE_MISSING;

  public CatalogsFeedValidationErrors () {

  }

  public CatalogsFeedValidationErrors (Integer ADULT_INVALID, Integer ADWORDS_FORMAT_INVALID, Integer AVAILABILITY_INVALID, Integer BLOCKLISTED_IMAGE_SIGNATURE, Integer DELIMITER_ERROR, Integer DESCRIPTION_MISSING, Integer DUPLICATE_PRODUCTS, Integer ENCODING_ERROR, Integer FEED_LENGTH_TOO_LONG, Integer FEED_TOO_SMALL, Integer FETCH_ERROR, Integer FETCH_INACTIVE_FEED_ERROR, Integer IMAGE_LINK_INVALID, Integer IMAGE_LINK_LENGTH_TOO_LONG, Integer IMAGE_LINK_MISSING, Integer INTERNAL_SERVICE_ERROR, Integer INVALID_DOMAIN, Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, Integer ITEMID_MISSING, Integer LINK_FORMAT_INVALID, Integer LINK_LENGTH_TOO_LONG, Integer LIST_PRICE_INVALID, Integer MALFORMED_XML, Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, Integer NO_VERIFIED_DOMAIN, Integer PARSE_LINE_ERROR, Integer PINJOIN_CONTENT_UNSAFE, Integer PRICE_CANNOT_BE_DETERMINED, Integer PRICE_MISSING, Integer PRODUCT_LINK_MISSING, Integer PRODUCT_PRICE_INVALID, Integer REQUIRED_COLUMNS_MISSING, Integer TITLE_MISSING) {
    this.ADULT_INVALID = ADULT_INVALID;
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    this.DELIMITER_ERROR = DELIMITER_ERROR;
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    this.ENCODING_ERROR = ENCODING_ERROR;
    this.FEED_LENGTH_TOO_LONG = FEED_LENGTH_TOO_LONG;
    this.FEED_TOO_SMALL = FEED_TOO_SMALL;
    this.FETCH_ERROR = FETCH_ERROR;
    this.FETCH_INACTIVE_FEED_ERROR = FETCH_INACTIVE_FEED_ERROR;
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    this.INTERNAL_SERVICE_ERROR = INTERNAL_SERVICE_ERROR;
    this.INVALID_DOMAIN = INVALID_DOMAIN;
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    this.ITEMID_MISSING = ITEMID_MISSING;
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    this.MALFORMED_XML = MALFORMED_XML;
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    this.NO_VERIFIED_DOMAIN = NO_VERIFIED_DOMAIN;
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    this.PRICE_MISSING = PRICE_MISSING;
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    this.REQUIRED_COLUMNS_MISSING = REQUIRED_COLUMNS_MISSING;
    this.TITLE_MISSING = TITLE_MISSING;
  }

    
  @JsonProperty("ADULT_INVALID")
  public Integer getADULTINVALID() {
    return ADULT_INVALID;
  }
  public void setADULTINVALID(Integer ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
  }

    
  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public Integer getADWORDSFORMATINVALID() {
    return ADWORDS_FORMAT_INVALID;
  }
  public void setADWORDSFORMATINVALID(Integer ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
  }

    
  @JsonProperty("AVAILABILITY_INVALID")
  public Integer getAVAILABILITYINVALID() {
    return AVAILABILITY_INVALID;
  }
  public void setAVAILABILITYINVALID(Integer AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
  }

    
  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public Integer getBLOCKLISTEDIMAGESIGNATURE() {
    return BLOCKLISTED_IMAGE_SIGNATURE;
  }
  public void setBLOCKLISTEDIMAGESIGNATURE(Integer BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
  }

    
  @JsonProperty("DELIMITER_ERROR")
  public Integer getDELIMITERERROR() {
    return DELIMITER_ERROR;
  }
  public void setDELIMITERERROR(Integer DELIMITER_ERROR) {
    this.DELIMITER_ERROR = DELIMITER_ERROR;
  }

    
  @JsonProperty("DESCRIPTION_MISSING")
  public Integer getDESCRIPTIONMISSING() {
    return DESCRIPTION_MISSING;
  }
  public void setDESCRIPTIONMISSING(Integer DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
  }

    
  @JsonProperty("DUPLICATE_PRODUCTS")
  public Integer getDUPLICATEPRODUCTS() {
    return DUPLICATE_PRODUCTS;
  }
  public void setDUPLICATEPRODUCTS(Integer DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
  }

    
  @JsonProperty("ENCODING_ERROR")
  public Integer getENCODINGERROR() {
    return ENCODING_ERROR;
  }
  public void setENCODINGERROR(Integer ENCODING_ERROR) {
    this.ENCODING_ERROR = ENCODING_ERROR;
  }

    
  @JsonProperty("FEED_LENGTH_TOO_LONG")
  public Integer getFEEDLENGTHTOOLONG() {
    return FEED_LENGTH_TOO_LONG;
  }
  public void setFEEDLENGTHTOOLONG(Integer FEED_LENGTH_TOO_LONG) {
    this.FEED_LENGTH_TOO_LONG = FEED_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("FEED_TOO_SMALL")
  public Integer getFEEDTOOSMALL() {
    return FEED_TOO_SMALL;
  }
  public void setFEEDTOOSMALL(Integer FEED_TOO_SMALL) {
    this.FEED_TOO_SMALL = FEED_TOO_SMALL;
  }

    
  @JsonProperty("FETCH_ERROR")
  public Integer getFETCHERROR() {
    return FETCH_ERROR;
  }
  public void setFETCHERROR(Integer FETCH_ERROR) {
    this.FETCH_ERROR = FETCH_ERROR;
  }

    
  @JsonProperty("FETCH_INACTIVE_FEED_ERROR")
  public Integer getFETCHINACTIVEFEEDERROR() {
    return FETCH_INACTIVE_FEED_ERROR;
  }
  public void setFETCHINACTIVEFEEDERROR(Integer FETCH_INACTIVE_FEED_ERROR) {
    this.FETCH_INACTIVE_FEED_ERROR = FETCH_INACTIVE_FEED_ERROR;
  }

    
  @JsonProperty("IMAGE_LINK_INVALID")
  public Integer getIMAGELINKINVALID() {
    return IMAGE_LINK_INVALID;
  }
  public void setIMAGELINKINVALID(Integer IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
  }

    
  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public Integer getIMAGELINKLENGTHTOOLONG() {
    return IMAGE_LINK_LENGTH_TOO_LONG;
  }
  public void setIMAGELINKLENGTHTOOLONG(Integer IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("IMAGE_LINK_MISSING")
  public Integer getIMAGELINKMISSING() {
    return IMAGE_LINK_MISSING;
  }
  public void setIMAGELINKMISSING(Integer IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
  }

    
  @JsonProperty("INTERNAL_SERVICE_ERROR")
  public Integer getINTERNALSERVICEERROR() {
    return INTERNAL_SERVICE_ERROR;
  }
  public void setINTERNALSERVICEERROR(Integer INTERNAL_SERVICE_ERROR) {
    this.INTERNAL_SERVICE_ERROR = INTERNAL_SERVICE_ERROR;
  }

    
  @JsonProperty("INVALID_DOMAIN")
  public Integer getINVALIDDOMAIN() {
    return INVALID_DOMAIN;
  }
  public void setINVALIDDOMAIN(Integer INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
  }

    
  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public Integer getITEMMAINIMAGEDOWNLOADFAILURE() {
    return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }
  public void setITEMMAINIMAGEDOWNLOADFAILURE(Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

    
  @JsonProperty("ITEMID_MISSING")
  public Integer getITEMIDMISSING() {
    return ITEMID_MISSING;
  }
  public void setITEMIDMISSING(Integer ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
  }

    
  @JsonProperty("LINK_FORMAT_INVALID")
  public Integer getLINKFORMATINVALID() {
    return LINK_FORMAT_INVALID;
  }
  public void setLINKFORMATINVALID(Integer LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
  }

    
  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public Integer getLINKLENGTHTOOLONG() {
    return LINK_LENGTH_TOO_LONG;
  }
  public void setLINKLENGTHTOOLONG(Integer LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
  }

    
  @JsonProperty("LIST_PRICE_INVALID")
  public Integer getLISTPRICEINVALID() {
    return LIST_PRICE_INVALID;
  }
  public void setLISTPRICEINVALID(Integer LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
  }

    
  @JsonProperty("MALFORMED_XML")
  public Integer getMALFORMEDXML() {
    return MALFORMED_XML;
  }
  public void setMALFORMEDXML(Integer MALFORMED_XML) {
    this.MALFORMED_XML = MALFORMED_XML;
  }

    
  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public Integer getMAXITEMSPERITEMGROUPEXCEEDED() {
    return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }
  public void setMAXITEMSPERITEMGROUPEXCEEDED(Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

    
  @JsonProperty("NO_VERIFIED_DOMAIN")
  public Integer getNOVERIFIEDDOMAIN() {
    return NO_VERIFIED_DOMAIN;
  }
  public void setNOVERIFIEDDOMAIN(Integer NO_VERIFIED_DOMAIN) {
    this.NO_VERIFIED_DOMAIN = NO_VERIFIED_DOMAIN;
  }

    
  @JsonProperty("PARSE_LINE_ERROR")
  public Integer getPARSELINEERROR() {
    return PARSE_LINE_ERROR;
  }
  public void setPARSELINEERROR(Integer PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
  }

    
  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public Integer getPINJOINCONTENTUNSAFE() {
    return PINJOIN_CONTENT_UNSAFE;
  }
  public void setPINJOINCONTENTUNSAFE(Integer PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
  }

    
  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public Integer getPRICECANNOTBEDETERMINED() {
    return PRICE_CANNOT_BE_DETERMINED;
  }
  public void setPRICECANNOTBEDETERMINED(Integer PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
  }

    
  @JsonProperty("PRICE_MISSING")
  public Integer getPRICEMISSING() {
    return PRICE_MISSING;
  }
  public void setPRICEMISSING(Integer PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
  }

    
  @JsonProperty("PRODUCT_LINK_MISSING")
  public Integer getPRODUCTLINKMISSING() {
    return PRODUCT_LINK_MISSING;
  }
  public void setPRODUCTLINKMISSING(Integer PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
  }

    
  @JsonProperty("PRODUCT_PRICE_INVALID")
  public Integer getPRODUCTPRICEINVALID() {
    return PRODUCT_PRICE_INVALID;
  }
  public void setPRODUCTPRICEINVALID(Integer PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
  }

    
  @JsonProperty("REQUIRED_COLUMNS_MISSING")
  public Integer getREQUIREDCOLUMNSMISSING() {
    return REQUIRED_COLUMNS_MISSING;
  }
  public void setREQUIREDCOLUMNSMISSING(Integer REQUIRED_COLUMNS_MISSING) {
    this.REQUIRED_COLUMNS_MISSING = REQUIRED_COLUMNS_MISSING;
  }

    
  @JsonProperty("TITLE_MISSING")
  public Integer getTITLEMISSING() {
    return TITLE_MISSING;
  }
  public void setTITLEMISSING(Integer TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedValidationErrors catalogsFeedValidationErrors = (CatalogsFeedValidationErrors) o;
    return Objects.equals(ADULT_INVALID, catalogsFeedValidationErrors.ADULT_INVALID) &&
        Objects.equals(ADWORDS_FORMAT_INVALID, catalogsFeedValidationErrors.ADWORDS_FORMAT_INVALID) &&
        Objects.equals(AVAILABILITY_INVALID, catalogsFeedValidationErrors.AVAILABILITY_INVALID) &&
        Objects.equals(BLOCKLISTED_IMAGE_SIGNATURE, catalogsFeedValidationErrors.BLOCKLISTED_IMAGE_SIGNATURE) &&
        Objects.equals(DELIMITER_ERROR, catalogsFeedValidationErrors.DELIMITER_ERROR) &&
        Objects.equals(DESCRIPTION_MISSING, catalogsFeedValidationErrors.DESCRIPTION_MISSING) &&
        Objects.equals(DUPLICATE_PRODUCTS, catalogsFeedValidationErrors.DUPLICATE_PRODUCTS) &&
        Objects.equals(ENCODING_ERROR, catalogsFeedValidationErrors.ENCODING_ERROR) &&
        Objects.equals(FEED_LENGTH_TOO_LONG, catalogsFeedValidationErrors.FEED_LENGTH_TOO_LONG) &&
        Objects.equals(FEED_TOO_SMALL, catalogsFeedValidationErrors.FEED_TOO_SMALL) &&
        Objects.equals(FETCH_ERROR, catalogsFeedValidationErrors.FETCH_ERROR) &&
        Objects.equals(FETCH_INACTIVE_FEED_ERROR, catalogsFeedValidationErrors.FETCH_INACTIVE_FEED_ERROR) &&
        Objects.equals(IMAGE_LINK_INVALID, catalogsFeedValidationErrors.IMAGE_LINK_INVALID) &&
        Objects.equals(IMAGE_LINK_LENGTH_TOO_LONG, catalogsFeedValidationErrors.IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(IMAGE_LINK_MISSING, catalogsFeedValidationErrors.IMAGE_LINK_MISSING) &&
        Objects.equals(INTERNAL_SERVICE_ERROR, catalogsFeedValidationErrors.INTERNAL_SERVICE_ERROR) &&
        Objects.equals(INVALID_DOMAIN, catalogsFeedValidationErrors.INVALID_DOMAIN) &&
        Objects.equals(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsFeedValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(ITEMID_MISSING, catalogsFeedValidationErrors.ITEMID_MISSING) &&
        Objects.equals(LINK_FORMAT_INVALID, catalogsFeedValidationErrors.LINK_FORMAT_INVALID) &&
        Objects.equals(LINK_LENGTH_TOO_LONG, catalogsFeedValidationErrors.LINK_LENGTH_TOO_LONG) &&
        Objects.equals(LIST_PRICE_INVALID, catalogsFeedValidationErrors.LIST_PRICE_INVALID) &&
        Objects.equals(MALFORMED_XML, catalogsFeedValidationErrors.MALFORMED_XML) &&
        Objects.equals(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, catalogsFeedValidationErrors.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) &&
        Objects.equals(NO_VERIFIED_DOMAIN, catalogsFeedValidationErrors.NO_VERIFIED_DOMAIN) &&
        Objects.equals(PARSE_LINE_ERROR, catalogsFeedValidationErrors.PARSE_LINE_ERROR) &&
        Objects.equals(PINJOIN_CONTENT_UNSAFE, catalogsFeedValidationErrors.PINJOIN_CONTENT_UNSAFE) &&
        Objects.equals(PRICE_CANNOT_BE_DETERMINED, catalogsFeedValidationErrors.PRICE_CANNOT_BE_DETERMINED) &&
        Objects.equals(PRICE_MISSING, catalogsFeedValidationErrors.PRICE_MISSING) &&
        Objects.equals(PRODUCT_LINK_MISSING, catalogsFeedValidationErrors.PRODUCT_LINK_MISSING) &&
        Objects.equals(PRODUCT_PRICE_INVALID, catalogsFeedValidationErrors.PRODUCT_PRICE_INVALID) &&
        Objects.equals(REQUIRED_COLUMNS_MISSING, catalogsFeedValidationErrors.REQUIRED_COLUMNS_MISSING) &&
        Objects.equals(TITLE_MISSING, catalogsFeedValidationErrors.TITLE_MISSING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADULT_INVALID, ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, DELIMITER_ERROR, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, ENCODING_ERROR, FEED_LENGTH_TOO_LONG, FEED_TOO_SMALL, FETCH_ERROR, FETCH_INACTIVE_FEED_ERROR, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, INTERNAL_SERVICE_ERROR, INVALID_DOMAIN, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MALFORMED_XML, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, NO_VERIFIED_DOMAIN, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, REQUIRED_COLUMNS_MISSING, TITLE_MISSING);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationErrors {\n");
    
    sb.append("    ADULT_INVALID: ").append(toIndentedString(ADULT_INVALID)).append("\n");
    sb.append("    ADWORDS_FORMAT_INVALID: ").append(toIndentedString(ADWORDS_FORMAT_INVALID)).append("\n");
    sb.append("    AVAILABILITY_INVALID: ").append(toIndentedString(AVAILABILITY_INVALID)).append("\n");
    sb.append("    BLOCKLISTED_IMAGE_SIGNATURE: ").append(toIndentedString(BLOCKLISTED_IMAGE_SIGNATURE)).append("\n");
    sb.append("    DELIMITER_ERROR: ").append(toIndentedString(DELIMITER_ERROR)).append("\n");
    sb.append("    DESCRIPTION_MISSING: ").append(toIndentedString(DESCRIPTION_MISSING)).append("\n");
    sb.append("    DUPLICATE_PRODUCTS: ").append(toIndentedString(DUPLICATE_PRODUCTS)).append("\n");
    sb.append("    ENCODING_ERROR: ").append(toIndentedString(ENCODING_ERROR)).append("\n");
    sb.append("    FEED_LENGTH_TOO_LONG: ").append(toIndentedString(FEED_LENGTH_TOO_LONG)).append("\n");
    sb.append("    FEED_TOO_SMALL: ").append(toIndentedString(FEED_TOO_SMALL)).append("\n");
    sb.append("    FETCH_ERROR: ").append(toIndentedString(FETCH_ERROR)).append("\n");
    sb.append("    FETCH_INACTIVE_FEED_ERROR: ").append(toIndentedString(FETCH_INACTIVE_FEED_ERROR)).append("\n");
    sb.append("    IMAGE_LINK_INVALID: ").append(toIndentedString(IMAGE_LINK_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    IMAGE_LINK_MISSING: ").append(toIndentedString(IMAGE_LINK_MISSING)).append("\n");
    sb.append("    INTERNAL_SERVICE_ERROR: ").append(toIndentedString(INTERNAL_SERVICE_ERROR)).append("\n");
    sb.append("    INVALID_DOMAIN: ").append(toIndentedString(INVALID_DOMAIN)).append("\n");
    sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
    sb.append("    LINK_FORMAT_INVALID: ").append(toIndentedString(LINK_FORMAT_INVALID)).append("\n");
    sb.append("    LINK_LENGTH_TOO_LONG: ").append(toIndentedString(LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    LIST_PRICE_INVALID: ").append(toIndentedString(LIST_PRICE_INVALID)).append("\n");
    sb.append("    MALFORMED_XML: ").append(toIndentedString(MALFORMED_XML)).append("\n");
    sb.append("    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: ").append(toIndentedString(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)).append("\n");
    sb.append("    NO_VERIFIED_DOMAIN: ").append(toIndentedString(NO_VERIFIED_DOMAIN)).append("\n");
    sb.append("    PARSE_LINE_ERROR: ").append(toIndentedString(PARSE_LINE_ERROR)).append("\n");
    sb.append("    PINJOIN_CONTENT_UNSAFE: ").append(toIndentedString(PINJOIN_CONTENT_UNSAFE)).append("\n");
    sb.append("    PRICE_CANNOT_BE_DETERMINED: ").append(toIndentedString(PRICE_CANNOT_BE_DETERMINED)).append("\n");
    sb.append("    PRICE_MISSING: ").append(toIndentedString(PRICE_MISSING)).append("\n");
    sb.append("    PRODUCT_LINK_MISSING: ").append(toIndentedString(PRODUCT_LINK_MISSING)).append("\n");
    sb.append("    PRODUCT_PRICE_INVALID: ").append(toIndentedString(PRODUCT_PRICE_INVALID)).append("\n");
    sb.append("    REQUIRED_COLUMNS_MISSING: ").append(toIndentedString(REQUIRED_COLUMNS_MISSING)).append("\n");
    sb.append("    TITLE_MISSING: ").append(toIndentedString(TITLE_MISSING)).append("\n");
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
