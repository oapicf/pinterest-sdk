package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemValidationDetails;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsItemValidationErrors   {
  @JsonProperty("ADULT_INVALID")
  private CatalogsItemValidationDetails ADULT_INVALID;

  @JsonProperty("ADWORDS_FORMAT_INVALID")
  private CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID;

  @JsonProperty("AVAILABILITY_INVALID")
  private CatalogsItemValidationDetails AVAILABILITY_INVALID;

  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  private CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE;

  @JsonProperty("DESCRIPTION_MISSING")
  private CatalogsItemValidationDetails DESCRIPTION_MISSING;

  @JsonProperty("DUPLICATE_PRODUCTS")
  private CatalogsItemValidationDetails DUPLICATE_PRODUCTS;

  @JsonProperty("IMAGE_LINK_INVALID")
  private CatalogsItemValidationDetails IMAGE_LINK_INVALID;

  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  private CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG;

  @JsonProperty("IMAGE_LINK_MISSING")
  private CatalogsItemValidationDetails IMAGE_LINK_MISSING;

  @JsonProperty("INVALID_DOMAIN")
  private CatalogsItemValidationDetails INVALID_DOMAIN;

  @JsonProperty("ITEMID_MISSING")
  private CatalogsItemValidationDetails ITEMID_MISSING;

  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  private CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

  @JsonProperty("LINK_FORMAT_INVALID")
  private CatalogsItemValidationDetails LINK_FORMAT_INVALID;

  @JsonProperty("LINK_LENGTH_TOO_LONG")
  private CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG;

  @JsonProperty("LIST_PRICE_INVALID")
  private CatalogsItemValidationDetails LIST_PRICE_INVALID;

  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  private CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

  @JsonProperty("PARSE_LINE_ERROR")
  private CatalogsItemValidationDetails PARSE_LINE_ERROR;

  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  private CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE;

  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  private CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED;

  @JsonProperty("PRICE_MISSING")
  private CatalogsItemValidationDetails PRICE_MISSING;

  @JsonProperty("PRODUCT_LINK_MISSING")
  private CatalogsItemValidationDetails PRODUCT_LINK_MISSING;

  @JsonProperty("PRODUCT_PRICE_INVALID")
  private CatalogsItemValidationDetails PRODUCT_PRICE_INVALID;

  @JsonProperty("TITLE_MISSING")
  private CatalogsItemValidationDetails TITLE_MISSING;

  /**
   **/
  public CatalogsItemValidationErrors ADULT_INVALID(CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ADULT_INVALID")
  public CatalogsItemValidationDetails getADULTINVALID() {
    return ADULT_INVALID;
  }
  public void setADULTINVALID(CatalogsItemValidationDetails ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors ADWORDS_FORMAT_INVALID(CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public CatalogsItemValidationDetails getADWORDSFORMATINVALID() {
    return ADWORDS_FORMAT_INVALID;
  }
  public void setADWORDSFORMATINVALID(CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors AVAILABILITY_INVALID(CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AVAILABILITY_INVALID")
  public CatalogsItemValidationDetails getAVAILABILITYINVALID() {
    return AVAILABILITY_INVALID;
  }
  public void setAVAILABILITYINVALID(CatalogsItemValidationDetails AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors BLOCKLISTED_IMAGE_SIGNATURE(CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public CatalogsItemValidationDetails getBLOCKLISTEDIMAGESIGNATURE() {
    return BLOCKLISTED_IMAGE_SIGNATURE;
  }
  public void setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
  }

  /**
   **/
  public CatalogsItemValidationErrors DESCRIPTION_MISSING(CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DESCRIPTION_MISSING")
  public CatalogsItemValidationDetails getDESCRIPTIONMISSING() {
    return DESCRIPTION_MISSING;
  }
  public void setDESCRIPTIONMISSING(CatalogsItemValidationDetails DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
  }

  /**
   **/
  public CatalogsItemValidationErrors DUPLICATE_PRODUCTS(CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DUPLICATE_PRODUCTS")
  public CatalogsItemValidationDetails getDUPLICATEPRODUCTS() {
    return DUPLICATE_PRODUCTS;
  }
  public void setDUPLICATEPRODUCTS(CatalogsItemValidationDetails DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
  }

  /**
   **/
  public CatalogsItemValidationErrors IMAGE_LINK_INVALID(CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IMAGE_LINK_INVALID")
  public CatalogsItemValidationDetails getIMAGELINKINVALID() {
    return IMAGE_LINK_INVALID;
  }
  public void setIMAGELINKINVALID(CatalogsItemValidationDetails IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors IMAGE_LINK_LENGTH_TOO_LONG(CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public CatalogsItemValidationDetails getIMAGELINKLENGTHTOOLONG() {
    return IMAGE_LINK_LENGTH_TOO_LONG;
  }
  public void setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
  }

  /**
   **/
  public CatalogsItemValidationErrors IMAGE_LINK_MISSING(CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IMAGE_LINK_MISSING")
  public CatalogsItemValidationDetails getIMAGELINKMISSING() {
    return IMAGE_LINK_MISSING;
  }
  public void setIMAGELINKMISSING(CatalogsItemValidationDetails IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
  }

  /**
   **/
  public CatalogsItemValidationErrors INVALID_DOMAIN(CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("INVALID_DOMAIN")
  public CatalogsItemValidationDetails getINVALIDDOMAIN() {
    return INVALID_DOMAIN;
  }
  public void setINVALIDDOMAIN(CatalogsItemValidationDetails INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
  }

  /**
   **/
  public CatalogsItemValidationErrors ITEMID_MISSING(CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ITEMID_MISSING")
  public CatalogsItemValidationDetails getITEMIDMISSING() {
    return ITEMID_MISSING;
  }
  public void setITEMIDMISSING(CatalogsItemValidationDetails ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
  }

  /**
   **/
  public CatalogsItemValidationErrors ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public CatalogsItemValidationDetails getITEMMAINIMAGEDOWNLOADFAILURE() {
    return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }
  public void setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  /**
   **/
  public CatalogsItemValidationErrors LINK_FORMAT_INVALID(CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LINK_FORMAT_INVALID")
  public CatalogsItemValidationDetails getLINKFORMATINVALID() {
    return LINK_FORMAT_INVALID;
  }
  public void setLINKFORMATINVALID(CatalogsItemValidationDetails LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors LINK_LENGTH_TOO_LONG(CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public CatalogsItemValidationDetails getLINKLENGTHTOOLONG() {
    return LINK_LENGTH_TOO_LONG;
  }
  public void setLINKLENGTHTOOLONG(CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
  }

  /**
   **/
  public CatalogsItemValidationErrors LIST_PRICE_INVALID(CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LIST_PRICE_INVALID")
  public CatalogsItemValidationDetails getLISTPRICEINVALID() {
    return LIST_PRICE_INVALID;
  }
  public void setLISTPRICEINVALID(CatalogsItemValidationDetails LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public CatalogsItemValidationDetails getMAXITEMSPERITEMGROUPEXCEEDED() {
    return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }
  public void setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  /**
   **/
  public CatalogsItemValidationErrors PARSE_LINE_ERROR(CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PARSE_LINE_ERROR")
  public CatalogsItemValidationDetails getPARSELINEERROR() {
    return PARSE_LINE_ERROR;
  }
  public void setPARSELINEERROR(CatalogsItemValidationDetails PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
  }

  /**
   **/
  public CatalogsItemValidationErrors PINJOIN_CONTENT_UNSAFE(CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public CatalogsItemValidationDetails getPINJOINCONTENTUNSAFE() {
    return PINJOIN_CONTENT_UNSAFE;
  }
  public void setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
  }

  /**
   **/
  public CatalogsItemValidationErrors PRICE_CANNOT_BE_DETERMINED(CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public CatalogsItemValidationDetails getPRICECANNOTBEDETERMINED() {
    return PRICE_CANNOT_BE_DETERMINED;
  }
  public void setPRICECANNOTBEDETERMINED(CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
  }

  /**
   **/
  public CatalogsItemValidationErrors PRICE_MISSING(CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PRICE_MISSING")
  public CatalogsItemValidationDetails getPRICEMISSING() {
    return PRICE_MISSING;
  }
  public void setPRICEMISSING(CatalogsItemValidationDetails PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
  }

  /**
   **/
  public CatalogsItemValidationErrors PRODUCT_LINK_MISSING(CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PRODUCT_LINK_MISSING")
  public CatalogsItemValidationDetails getPRODUCTLINKMISSING() {
    return PRODUCT_LINK_MISSING;
  }
  public void setPRODUCTLINKMISSING(CatalogsItemValidationDetails PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
  }

  /**
   **/
  public CatalogsItemValidationErrors PRODUCT_PRICE_INVALID(CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PRODUCT_PRICE_INVALID")
  public CatalogsItemValidationDetails getPRODUCTPRICEINVALID() {
    return PRODUCT_PRICE_INVALID;
  }
  public void setPRODUCTPRICEINVALID(CatalogsItemValidationDetails PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
  }

  /**
   **/
  public CatalogsItemValidationErrors TITLE_MISSING(CatalogsItemValidationDetails TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("TITLE_MISSING")
  public CatalogsItemValidationDetails getTITLEMISSING() {
    return TITLE_MISSING;
  }
  public void setTITLEMISSING(CatalogsItemValidationDetails TITLE_MISSING) {
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
    CatalogsItemValidationErrors catalogsItemValidationErrors = (CatalogsItemValidationErrors) o;
    return Objects.equals(ADULT_INVALID, catalogsItemValidationErrors.ADULT_INVALID) &&
        Objects.equals(ADWORDS_FORMAT_INVALID, catalogsItemValidationErrors.ADWORDS_FORMAT_INVALID) &&
        Objects.equals(AVAILABILITY_INVALID, catalogsItemValidationErrors.AVAILABILITY_INVALID) &&
        Objects.equals(BLOCKLISTED_IMAGE_SIGNATURE, catalogsItemValidationErrors.BLOCKLISTED_IMAGE_SIGNATURE) &&
        Objects.equals(DESCRIPTION_MISSING, catalogsItemValidationErrors.DESCRIPTION_MISSING) &&
        Objects.equals(DUPLICATE_PRODUCTS, catalogsItemValidationErrors.DUPLICATE_PRODUCTS) &&
        Objects.equals(IMAGE_LINK_INVALID, catalogsItemValidationErrors.IMAGE_LINK_INVALID) &&
        Objects.equals(IMAGE_LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(IMAGE_LINK_MISSING, catalogsItemValidationErrors.IMAGE_LINK_MISSING) &&
        Objects.equals(INVALID_DOMAIN, catalogsItemValidationErrors.INVALID_DOMAIN) &&
        Objects.equals(ITEMID_MISSING, catalogsItemValidationErrors.ITEMID_MISSING) &&
        Objects.equals(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsItemValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(LINK_FORMAT_INVALID, catalogsItemValidationErrors.LINK_FORMAT_INVALID) &&
        Objects.equals(LINK_LENGTH_TOO_LONG, catalogsItemValidationErrors.LINK_LENGTH_TOO_LONG) &&
        Objects.equals(LIST_PRICE_INVALID, catalogsItemValidationErrors.LIST_PRICE_INVALID) &&
        Objects.equals(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, catalogsItemValidationErrors.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) &&
        Objects.equals(PARSE_LINE_ERROR, catalogsItemValidationErrors.PARSE_LINE_ERROR) &&
        Objects.equals(PINJOIN_CONTENT_UNSAFE, catalogsItemValidationErrors.PINJOIN_CONTENT_UNSAFE) &&
        Objects.equals(PRICE_CANNOT_BE_DETERMINED, catalogsItemValidationErrors.PRICE_CANNOT_BE_DETERMINED) &&
        Objects.equals(PRICE_MISSING, catalogsItemValidationErrors.PRICE_MISSING) &&
        Objects.equals(PRODUCT_LINK_MISSING, catalogsItemValidationErrors.PRODUCT_LINK_MISSING) &&
        Objects.equals(PRODUCT_PRICE_INVALID, catalogsItemValidationErrors.PRODUCT_PRICE_INVALID) &&
        Objects.equals(TITLE_MISSING, catalogsItemValidationErrors.TITLE_MISSING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADULT_INVALID, ADWORDS_FORMAT_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, INVALID_DOMAIN, ITEMID_MISSING, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, LINK_FORMAT_INVALID, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, TITLE_MISSING);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationErrors {\n");
    
    sb.append("    ADULT_INVALID: ").append(toIndentedString(ADULT_INVALID)).append("\n");
    sb.append("    ADWORDS_FORMAT_INVALID: ").append(toIndentedString(ADWORDS_FORMAT_INVALID)).append("\n");
    sb.append("    AVAILABILITY_INVALID: ").append(toIndentedString(AVAILABILITY_INVALID)).append("\n");
    sb.append("    BLOCKLISTED_IMAGE_SIGNATURE: ").append(toIndentedString(BLOCKLISTED_IMAGE_SIGNATURE)).append("\n");
    sb.append("    DESCRIPTION_MISSING: ").append(toIndentedString(DESCRIPTION_MISSING)).append("\n");
    sb.append("    DUPLICATE_PRODUCTS: ").append(toIndentedString(DUPLICATE_PRODUCTS)).append("\n");
    sb.append("    IMAGE_LINK_INVALID: ").append(toIndentedString(IMAGE_LINK_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    IMAGE_LINK_MISSING: ").append(toIndentedString(IMAGE_LINK_MISSING)).append("\n");
    sb.append("    INVALID_DOMAIN: ").append(toIndentedString(INVALID_DOMAIN)).append("\n");
    sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
    sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    LINK_FORMAT_INVALID: ").append(toIndentedString(LINK_FORMAT_INVALID)).append("\n");
    sb.append("    LINK_LENGTH_TOO_LONG: ").append(toIndentedString(LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    LIST_PRICE_INVALID: ").append(toIndentedString(LIST_PRICE_INVALID)).append("\n");
    sb.append("    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: ").append(toIndentedString(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)).append("\n");
    sb.append("    PARSE_LINE_ERROR: ").append(toIndentedString(PARSE_LINE_ERROR)).append("\n");
    sb.append("    PINJOIN_CONTENT_UNSAFE: ").append(toIndentedString(PINJOIN_CONTENT_UNSAFE)).append("\n");
    sb.append("    PRICE_CANNOT_BE_DETERMINED: ").append(toIndentedString(PRICE_CANNOT_BE_DETERMINED)).append("\n");
    sb.append("    PRICE_MISSING: ").append(toIndentedString(PRICE_MISSING)).append("\n");
    sb.append("    PRODUCT_LINK_MISSING: ").append(toIndentedString(PRODUCT_LINK_MISSING)).append("\n");
    sb.append("    PRODUCT_PRICE_INVALID: ").append(toIndentedString(PRODUCT_PRICE_INVALID)).append("\n");
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

