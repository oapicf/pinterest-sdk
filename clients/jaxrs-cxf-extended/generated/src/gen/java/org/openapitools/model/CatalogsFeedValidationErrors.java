package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedValidationErrors  {
  
 /**
  * Pinterest couldn't download your feed.
  */
  @ApiModelProperty(value = "Pinterest couldn't download your feed.")
  private Integer FETCH_ERROR;

 /**
  * Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
  */
  @ApiModelProperty(value = "Your feed wasn't ingested because it hasn’t changed in the previous 90 days.")
  private Integer FETCH_INACTIVE_FEED_ERROR;

 /**
  * Your feed includes data with an unsupported encoding format.
  */
  @ApiModelProperty(value = "Your feed includes data with an unsupported encoding format.")
  private Integer ENCODING_ERROR;

 /**
  * Your feed includes data with formatting errors.
  */
  @ApiModelProperty(value = "Your feed includes data with formatting errors.")
  private Integer DELIMITER_ERROR;

 /**
  * Your feed is missing some required column headers.
  */
  @ApiModelProperty(value = "Your feed is missing some required column headers.")
  private Integer REQUIRED_COLUMNS_MISSING;

 /**
  * Some products are duplicated.
  */
  @ApiModelProperty(value = "Some products are duplicated.")
  private Integer DUPLICATE_PRODUCTS;

 /**
  * Some image links are formatted incorrectly.
  */
  @ApiModelProperty(value = "Some image links are formatted incorrectly.")
  private Integer IMAGE_LINK_INVALID;

 /**
  * Some items are missing an item id in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing an item id in their product metadata, those items will not be published.")
  private Integer ITEMID_MISSING;

 /**
  * Some items are missing a title in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing a title in their product metadata, those items will not be published.")
  private Integer TITLE_MISSING;

 /**
  * Some items are missing a description in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing a description in their product metadata, those items will not be published.")
  private Integer DESCRIPTION_MISSING;

 /**
  * Some items are missing a link URL in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing a link URL in their product metadata, those items will not be published.")
  private Integer PRODUCT_LINK_MISSING;

 /**
  * Some items are missing an image link URL in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing an image link URL in their product metadata, those items will not be published.")
  private Integer IMAGE_LINK_MISSING;

 /**
  * Some items are missing an availability value in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items are missing an availability value in their product metadata, those items will not be published.")
  private Integer AVAILABILITY_INVALID;

 /**
  * Some items have price formatting errors in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items have price formatting errors in their product metadata, those items will not be published.")
  private Integer PRODUCT_PRICE_INVALID;

 /**
  * Some link values are formatted incorrectly.
  */
  @ApiModelProperty(value = "Some link values are formatted incorrectly.")
  private Integer LINK_FORMAT_INVALID;

 /**
  * Your feed contains formatting errors for some items.
  */
  @ApiModelProperty(value = "Your feed contains formatting errors for some items.")
  private Integer PARSE_LINE_ERROR;

 /**
  * Some adwords links contain too many characters.
  */
  @ApiModelProperty(value = "Some adwords links contain too many characters.")
  private Integer ADWORDS_FORMAT_INVALID;

 /**
  * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  */
  @ApiModelProperty(value = "We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.")
  private Integer INTERNAL_SERVICE_ERROR;

 /**
  * Your merchant domain needs to be claimed.
  */
  @ApiModelProperty(value = "Your merchant domain needs to be claimed.")
  private Integer NO_VERIFIED_DOMAIN;

 /**
  * Some items have invalid adult values.
  */
  @ApiModelProperty(value = "Some items have invalid adult values.")
  private Integer ADULT_INVALID;

 /**
  * Some items have image_link URLs that contain too many characters, so those items will not be published.
  */
  @ApiModelProperty(value = "Some items have image_link URLs that contain too many characters, so those items will not be published.")
  private Integer IMAGE_LINK_LENGTH_TOO_LONG;

 /**
  * Some of your product link values don't match the verified domain associated with this account.
  */
  @ApiModelProperty(value = "Some of your product link values don't match the verified domain associated with this account.")
  private Integer INVALID_DOMAIN;

 /**
  * Your feed contains too many items, some items will not be published.
  */
  @ApiModelProperty(value = "Your feed contains too many items, some items will not be published.")
  private Integer FEED_LENGTH_TOO_LONG;

 /**
  * Some product links contain too many characters, those items will not be published.
  */
  @ApiModelProperty(value = "Some product links contain too many characters, those items will not be published.")
  private Integer LINK_LENGTH_TOO_LONG;

 /**
  * Your feed couldn't be validated because the xml file is formatted incorrectly.
  */
  @ApiModelProperty(value = "Your feed couldn't be validated because the xml file is formatted incorrectly.")
  private Integer MALFORMED_XML;

 /**
  * Some products are missing a price, those items will not be published.
  */
  @ApiModelProperty(value = "Some products are missing a price, those items will not be published.")
  private Integer PRICE_MISSING;

 /**
  * Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  */
  @ApiModelProperty(value = "Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.")
  private Integer FEED_TOO_SMALL;

 /**
  * Some items exceed the maximum number of items per item group, those items will not be published.
  */
  @ApiModelProperty(value = "Some items exceed the maximum number of items per item group, those items will not be published.")
  private Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

 /**
  * Some items' main images can't be found.
  */
  @ApiModelProperty(value = "Some items' main images can't be found.")
  private Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

 /**
  * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  */
  @ApiModelProperty(value = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
  private Integer PINJOIN_CONTENT_UNSAFE;

 /**
  * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  */
  @ApiModelProperty(value = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
  private Integer BLOCKLISTED_IMAGE_SIGNATURE;

 /**
  * Some items have list price formatting errors in their product metadata, those items will not be published.
  */
  @ApiModelProperty(value = "Some items have list price formatting errors in their product metadata, those items will not be published.")
  private Integer LIST_PRICE_INVALID;

 /**
  * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  */
  @ApiModelProperty(value = "Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.")
  private Integer PRICE_CANNOT_BE_DETERMINED;
 /**
  * Pinterest couldn&#39;t download your feed.
  * @return FETCH_ERROR
  */
  @JsonProperty("FETCH_ERROR")
  public Integer getFETCHERROR() {
    return FETCH_ERROR;
  }

  /**
   * Sets the <code>FETCH_ERROR</code> property.
   */
 public void setFETCHERROR(Integer FETCH_ERROR) {
    this.FETCH_ERROR = FETCH_ERROR;
  }

  /**
   * Sets the <code>FETCH_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors FETCH_ERROR(Integer FETCH_ERROR) {
    this.FETCH_ERROR = FETCH_ERROR;
    return this;
  }

 /**
  * Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.
  * @return FETCH_INACTIVE_FEED_ERROR
  */
  @JsonProperty("FETCH_INACTIVE_FEED_ERROR")
  public Integer getFETCHINACTIVEFEEDERROR() {
    return FETCH_INACTIVE_FEED_ERROR;
  }

  /**
   * Sets the <code>FETCH_INACTIVE_FEED_ERROR</code> property.
   */
 public void setFETCHINACTIVEFEEDERROR(Integer FETCH_INACTIVE_FEED_ERROR) {
    this.FETCH_INACTIVE_FEED_ERROR = FETCH_INACTIVE_FEED_ERROR;
  }

  /**
   * Sets the <code>FETCH_INACTIVE_FEED_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors FETCH_INACTIVE_FEED_ERROR(Integer FETCH_INACTIVE_FEED_ERROR) {
    this.FETCH_INACTIVE_FEED_ERROR = FETCH_INACTIVE_FEED_ERROR;
    return this;
  }

 /**
  * Your feed includes data with an unsupported encoding format.
  * @return ENCODING_ERROR
  */
  @JsonProperty("ENCODING_ERROR")
  public Integer getENCODINGERROR() {
    return ENCODING_ERROR;
  }

  /**
   * Sets the <code>ENCODING_ERROR</code> property.
   */
 public void setENCODINGERROR(Integer ENCODING_ERROR) {
    this.ENCODING_ERROR = ENCODING_ERROR;
  }

  /**
   * Sets the <code>ENCODING_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors ENCODING_ERROR(Integer ENCODING_ERROR) {
    this.ENCODING_ERROR = ENCODING_ERROR;
    return this;
  }

 /**
  * Your feed includes data with formatting errors.
  * @return DELIMITER_ERROR
  */
  @JsonProperty("DELIMITER_ERROR")
  public Integer getDELIMITERERROR() {
    return DELIMITER_ERROR;
  }

  /**
   * Sets the <code>DELIMITER_ERROR</code> property.
   */
 public void setDELIMITERERROR(Integer DELIMITER_ERROR) {
    this.DELIMITER_ERROR = DELIMITER_ERROR;
  }

  /**
   * Sets the <code>DELIMITER_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors DELIMITER_ERROR(Integer DELIMITER_ERROR) {
    this.DELIMITER_ERROR = DELIMITER_ERROR;
    return this;
  }

 /**
  * Your feed is missing some required column headers.
  * @return REQUIRED_COLUMNS_MISSING
  */
  @JsonProperty("REQUIRED_COLUMNS_MISSING")
  public Integer getREQUIREDCOLUMNSMISSING() {
    return REQUIRED_COLUMNS_MISSING;
  }

  /**
   * Sets the <code>REQUIRED_COLUMNS_MISSING</code> property.
   */
 public void setREQUIREDCOLUMNSMISSING(Integer REQUIRED_COLUMNS_MISSING) {
    this.REQUIRED_COLUMNS_MISSING = REQUIRED_COLUMNS_MISSING;
  }

  /**
   * Sets the <code>REQUIRED_COLUMNS_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors REQUIRED_COLUMNS_MISSING(Integer REQUIRED_COLUMNS_MISSING) {
    this.REQUIRED_COLUMNS_MISSING = REQUIRED_COLUMNS_MISSING;
    return this;
  }

 /**
  * Some products are duplicated.
  * @return DUPLICATE_PRODUCTS
  */
  @JsonProperty("DUPLICATE_PRODUCTS")
  public Integer getDUPLICATEPRODUCTS() {
    return DUPLICATE_PRODUCTS;
  }

  /**
   * Sets the <code>DUPLICATE_PRODUCTS</code> property.
   */
 public void setDUPLICATEPRODUCTS(Integer DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
  }

  /**
   * Sets the <code>DUPLICATE_PRODUCTS</code> property.
   */
  public CatalogsFeedValidationErrors DUPLICATE_PRODUCTS(Integer DUPLICATE_PRODUCTS) {
    this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    return this;
  }

 /**
  * Some image links are formatted incorrectly.
  * @return IMAGE_LINK_INVALID
  */
  @JsonProperty("IMAGE_LINK_INVALID")
  public Integer getIMAGELINKINVALID() {
    return IMAGE_LINK_INVALID;
  }

  /**
   * Sets the <code>IMAGE_LINK_INVALID</code> property.
   */
 public void setIMAGELINKINVALID(Integer IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
  }

  /**
   * Sets the <code>IMAGE_LINK_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors IMAGE_LINK_INVALID(Integer IMAGE_LINK_INVALID) {
    this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    return this;
  }

 /**
  * Some items are missing an item id in their product metadata, those items will not be published.
  * @return ITEMID_MISSING
  */
  @JsonProperty("ITEMID_MISSING")
  public Integer getITEMIDMISSING() {
    return ITEMID_MISSING;
  }

  /**
   * Sets the <code>ITEMID_MISSING</code> property.
   */
 public void setITEMIDMISSING(Integer ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
  }

  /**
   * Sets the <code>ITEMID_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors ITEMID_MISSING(Integer ITEMID_MISSING) {
    this.ITEMID_MISSING = ITEMID_MISSING;
    return this;
  }

 /**
  * Some items are missing a title in their product metadata, those items will not be published.
  * @return TITLE_MISSING
  */
  @JsonProperty("TITLE_MISSING")
  public Integer getTITLEMISSING() {
    return TITLE_MISSING;
  }

  /**
   * Sets the <code>TITLE_MISSING</code> property.
   */
 public void setTITLEMISSING(Integer TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
  }

  /**
   * Sets the <code>TITLE_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors TITLE_MISSING(Integer TITLE_MISSING) {
    this.TITLE_MISSING = TITLE_MISSING;
    return this;
  }

 /**
  * Some items are missing a description in their product metadata, those items will not be published.
  * @return DESCRIPTION_MISSING
  */
  @JsonProperty("DESCRIPTION_MISSING")
  public Integer getDESCRIPTIONMISSING() {
    return DESCRIPTION_MISSING;
  }

  /**
   * Sets the <code>DESCRIPTION_MISSING</code> property.
   */
 public void setDESCRIPTIONMISSING(Integer DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
  }

  /**
   * Sets the <code>DESCRIPTION_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors DESCRIPTION_MISSING(Integer DESCRIPTION_MISSING) {
    this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    return this;
  }

 /**
  * Some items are missing a link URL in their product metadata, those items will not be published.
  * @return PRODUCT_LINK_MISSING
  */
  @JsonProperty("PRODUCT_LINK_MISSING")
  public Integer getPRODUCTLINKMISSING() {
    return PRODUCT_LINK_MISSING;
  }

  /**
   * Sets the <code>PRODUCT_LINK_MISSING</code> property.
   */
 public void setPRODUCTLINKMISSING(Integer PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
  }

  /**
   * Sets the <code>PRODUCT_LINK_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors PRODUCT_LINK_MISSING(Integer PRODUCT_LINK_MISSING) {
    this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    return this;
  }

 /**
  * Some items are missing an image link URL in their product metadata, those items will not be published.
  * @return IMAGE_LINK_MISSING
  */
  @JsonProperty("IMAGE_LINK_MISSING")
  public Integer getIMAGELINKMISSING() {
    return IMAGE_LINK_MISSING;
  }

  /**
   * Sets the <code>IMAGE_LINK_MISSING</code> property.
   */
 public void setIMAGELINKMISSING(Integer IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
  }

  /**
   * Sets the <code>IMAGE_LINK_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors IMAGE_LINK_MISSING(Integer IMAGE_LINK_MISSING) {
    this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    return this;
  }

 /**
  * Some items are missing an availability value in their product metadata, those items will not be published.
  * @return AVAILABILITY_INVALID
  */
  @JsonProperty("AVAILABILITY_INVALID")
  public Integer getAVAILABILITYINVALID() {
    return AVAILABILITY_INVALID;
  }

  /**
   * Sets the <code>AVAILABILITY_INVALID</code> property.
   */
 public void setAVAILABILITYINVALID(Integer AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
  }

  /**
   * Sets the <code>AVAILABILITY_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors AVAILABILITY_INVALID(Integer AVAILABILITY_INVALID) {
    this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    return this;
  }

 /**
  * Some items have price formatting errors in their product metadata, those items will not be published.
  * @return PRODUCT_PRICE_INVALID
  */
  @JsonProperty("PRODUCT_PRICE_INVALID")
  public Integer getPRODUCTPRICEINVALID() {
    return PRODUCT_PRICE_INVALID;
  }

  /**
   * Sets the <code>PRODUCT_PRICE_INVALID</code> property.
   */
 public void setPRODUCTPRICEINVALID(Integer PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
  }

  /**
   * Sets the <code>PRODUCT_PRICE_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors PRODUCT_PRICE_INVALID(Integer PRODUCT_PRICE_INVALID) {
    this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    return this;
  }

 /**
  * Some link values are formatted incorrectly.
  * @return LINK_FORMAT_INVALID
  */
  @JsonProperty("LINK_FORMAT_INVALID")
  public Integer getLINKFORMATINVALID() {
    return LINK_FORMAT_INVALID;
  }

  /**
   * Sets the <code>LINK_FORMAT_INVALID</code> property.
   */
 public void setLINKFORMATINVALID(Integer LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
  }

  /**
   * Sets the <code>LINK_FORMAT_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors LINK_FORMAT_INVALID(Integer LINK_FORMAT_INVALID) {
    this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    return this;
  }

 /**
  * Your feed contains formatting errors for some items.
  * @return PARSE_LINE_ERROR
  */
  @JsonProperty("PARSE_LINE_ERROR")
  public Integer getPARSELINEERROR() {
    return PARSE_LINE_ERROR;
  }

  /**
   * Sets the <code>PARSE_LINE_ERROR</code> property.
   */
 public void setPARSELINEERROR(Integer PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
  }

  /**
   * Sets the <code>PARSE_LINE_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors PARSE_LINE_ERROR(Integer PARSE_LINE_ERROR) {
    this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    return this;
  }

 /**
  * Some adwords links contain too many characters.
  * @return ADWORDS_FORMAT_INVALID
  */
  @JsonProperty("ADWORDS_FORMAT_INVALID")
  public Integer getADWORDSFORMATINVALID() {
    return ADWORDS_FORMAT_INVALID;
  }

  /**
   * Sets the <code>ADWORDS_FORMAT_INVALID</code> property.
   */
 public void setADWORDSFORMATINVALID(Integer ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
  }

  /**
   * Sets the <code>ADWORDS_FORMAT_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors ADWORDS_FORMAT_INVALID(Integer ADWORDS_FORMAT_INVALID) {
    this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    return this;
  }

 /**
  * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  * @return INTERNAL_SERVICE_ERROR
  */
  @JsonProperty("INTERNAL_SERVICE_ERROR")
  public Integer getINTERNALSERVICEERROR() {
    return INTERNAL_SERVICE_ERROR;
  }

  /**
   * Sets the <code>INTERNAL_SERVICE_ERROR</code> property.
   */
 public void setINTERNALSERVICEERROR(Integer INTERNAL_SERVICE_ERROR) {
    this.INTERNAL_SERVICE_ERROR = INTERNAL_SERVICE_ERROR;
  }

  /**
   * Sets the <code>INTERNAL_SERVICE_ERROR</code> property.
   */
  public CatalogsFeedValidationErrors INTERNAL_SERVICE_ERROR(Integer INTERNAL_SERVICE_ERROR) {
    this.INTERNAL_SERVICE_ERROR = INTERNAL_SERVICE_ERROR;
    return this;
  }

 /**
  * Your merchant domain needs to be claimed.
  * @return NO_VERIFIED_DOMAIN
  */
  @JsonProperty("NO_VERIFIED_DOMAIN")
  public Integer getNOVERIFIEDDOMAIN() {
    return NO_VERIFIED_DOMAIN;
  }

  /**
   * Sets the <code>NO_VERIFIED_DOMAIN</code> property.
   */
 public void setNOVERIFIEDDOMAIN(Integer NO_VERIFIED_DOMAIN) {
    this.NO_VERIFIED_DOMAIN = NO_VERIFIED_DOMAIN;
  }

  /**
   * Sets the <code>NO_VERIFIED_DOMAIN</code> property.
   */
  public CatalogsFeedValidationErrors NO_VERIFIED_DOMAIN(Integer NO_VERIFIED_DOMAIN) {
    this.NO_VERIFIED_DOMAIN = NO_VERIFIED_DOMAIN;
    return this;
  }

 /**
  * Some items have invalid adult values.
  * @return ADULT_INVALID
  */
  @JsonProperty("ADULT_INVALID")
  public Integer getADULTINVALID() {
    return ADULT_INVALID;
  }

  /**
   * Sets the <code>ADULT_INVALID</code> property.
   */
 public void setADULTINVALID(Integer ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
  }

  /**
   * Sets the <code>ADULT_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors ADULT_INVALID(Integer ADULT_INVALID) {
    this.ADULT_INVALID = ADULT_INVALID;
    return this;
  }

 /**
  * Some items have image_link URLs that contain too many characters, so those items will not be published.
  * @return IMAGE_LINK_LENGTH_TOO_LONG
  */
  @JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
  public Integer getIMAGELINKLENGTHTOOLONG() {
    return IMAGE_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>IMAGE_LINK_LENGTH_TOO_LONG</code> property.
   */
 public void setIMAGELINKLENGTHTOOLONG(Integer IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>IMAGE_LINK_LENGTH_TOO_LONG</code> property.
   */
  public CatalogsFeedValidationErrors IMAGE_LINK_LENGTH_TOO_LONG(Integer IMAGE_LINK_LENGTH_TOO_LONG) {
    this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    return this;
  }

 /**
  * Some of your product link values don&#39;t match the verified domain associated with this account.
  * @return INVALID_DOMAIN
  */
  @JsonProperty("INVALID_DOMAIN")
  public Integer getINVALIDDOMAIN() {
    return INVALID_DOMAIN;
  }

  /**
   * Sets the <code>INVALID_DOMAIN</code> property.
   */
 public void setINVALIDDOMAIN(Integer INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
  }

  /**
   * Sets the <code>INVALID_DOMAIN</code> property.
   */
  public CatalogsFeedValidationErrors INVALID_DOMAIN(Integer INVALID_DOMAIN) {
    this.INVALID_DOMAIN = INVALID_DOMAIN;
    return this;
  }

 /**
  * Your feed contains too many items, some items will not be published.
  * @return FEED_LENGTH_TOO_LONG
  */
  @JsonProperty("FEED_LENGTH_TOO_LONG")
  public Integer getFEEDLENGTHTOOLONG() {
    return FEED_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>FEED_LENGTH_TOO_LONG</code> property.
   */
 public void setFEEDLENGTHTOOLONG(Integer FEED_LENGTH_TOO_LONG) {
    this.FEED_LENGTH_TOO_LONG = FEED_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>FEED_LENGTH_TOO_LONG</code> property.
   */
  public CatalogsFeedValidationErrors FEED_LENGTH_TOO_LONG(Integer FEED_LENGTH_TOO_LONG) {
    this.FEED_LENGTH_TOO_LONG = FEED_LENGTH_TOO_LONG;
    return this;
  }

 /**
  * Some product links contain too many characters, those items will not be published.
  * @return LINK_LENGTH_TOO_LONG
  */
  @JsonProperty("LINK_LENGTH_TOO_LONG")
  public Integer getLINKLENGTHTOOLONG() {
    return LINK_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>LINK_LENGTH_TOO_LONG</code> property.
   */
 public void setLINKLENGTHTOOLONG(Integer LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
  }

  /**
   * Sets the <code>LINK_LENGTH_TOO_LONG</code> property.
   */
  public CatalogsFeedValidationErrors LINK_LENGTH_TOO_LONG(Integer LINK_LENGTH_TOO_LONG) {
    this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    return this;
  }

 /**
  * Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.
  * @return MALFORMED_XML
  */
  @JsonProperty("MALFORMED_XML")
  public Integer getMALFORMEDXML() {
    return MALFORMED_XML;
  }

  /**
   * Sets the <code>MALFORMED_XML</code> property.
   */
 public void setMALFORMEDXML(Integer MALFORMED_XML) {
    this.MALFORMED_XML = MALFORMED_XML;
  }

  /**
   * Sets the <code>MALFORMED_XML</code> property.
   */
  public CatalogsFeedValidationErrors MALFORMED_XML(Integer MALFORMED_XML) {
    this.MALFORMED_XML = MALFORMED_XML;
    return this;
  }

 /**
  * Some products are missing a price, those items will not be published.
  * @return PRICE_MISSING
  */
  @JsonProperty("PRICE_MISSING")
  public Integer getPRICEMISSING() {
    return PRICE_MISSING;
  }

  /**
   * Sets the <code>PRICE_MISSING</code> property.
   */
 public void setPRICEMISSING(Integer PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
  }

  /**
   * Sets the <code>PRICE_MISSING</code> property.
   */
  public CatalogsFeedValidationErrors PRICE_MISSING(Integer PRICE_MISSING) {
    this.PRICE_MISSING = PRICE_MISSING;
    return this;
  }

 /**
  * Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.
  * @return FEED_TOO_SMALL
  */
  @JsonProperty("FEED_TOO_SMALL")
  public Integer getFEEDTOOSMALL() {
    return FEED_TOO_SMALL;
  }

  /**
   * Sets the <code>FEED_TOO_SMALL</code> property.
   */
 public void setFEEDTOOSMALL(Integer FEED_TOO_SMALL) {
    this.FEED_TOO_SMALL = FEED_TOO_SMALL;
  }

  /**
   * Sets the <code>FEED_TOO_SMALL</code> property.
   */
  public CatalogsFeedValidationErrors FEED_TOO_SMALL(Integer FEED_TOO_SMALL) {
    this.FEED_TOO_SMALL = FEED_TOO_SMALL;
    return this;
  }

 /**
  * Some items exceed the maximum number of items per item group, those items will not be published.
  * @return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
  */
  @JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
  public Integer getMAXITEMSPERITEMGROUPEXCEEDED() {
    return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  /**
   * Sets the <code>MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED</code> property.
   */
 public void setMAXITEMSPERITEMGROUPEXCEEDED(Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
  }

  /**
   * Sets the <code>MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED</code> property.
   */
  public CatalogsFeedValidationErrors MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
    this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    return this;
  }

 /**
  * Some items&#39; main images can&#39;t be found.
  * @return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
  */
  @JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
  public Integer getITEMMAINIMAGEDOWNLOADFAILURE() {
    return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  /**
   * Sets the <code>ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE</code> property.
   */
 public void setITEMMAINIMAGEDOWNLOADFAILURE(Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
  }

  /**
   * Sets the <code>ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE</code> property.
   */
  public CatalogsFeedValidationErrors ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
    this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    return this;
  }

 /**
  * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
  * @return PINJOIN_CONTENT_UNSAFE
  */
  @JsonProperty("PINJOIN_CONTENT_UNSAFE")
  public Integer getPINJOINCONTENTUNSAFE() {
    return PINJOIN_CONTENT_UNSAFE;
  }

  /**
   * Sets the <code>PINJOIN_CONTENT_UNSAFE</code> property.
   */
 public void setPINJOINCONTENTUNSAFE(Integer PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
  }

  /**
   * Sets the <code>PINJOIN_CONTENT_UNSAFE</code> property.
   */
  public CatalogsFeedValidationErrors PINJOIN_CONTENT_UNSAFE(Integer PINJOIN_CONTENT_UNSAFE) {
    this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    return this;
  }

 /**
  * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
  * @return BLOCKLISTED_IMAGE_SIGNATURE
  */
  @JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
  public Integer getBLOCKLISTEDIMAGESIGNATURE() {
    return BLOCKLISTED_IMAGE_SIGNATURE;
  }

  /**
   * Sets the <code>BLOCKLISTED_IMAGE_SIGNATURE</code> property.
   */
 public void setBLOCKLISTEDIMAGESIGNATURE(Integer BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
  }

  /**
   * Sets the <code>BLOCKLISTED_IMAGE_SIGNATURE</code> property.
   */
  public CatalogsFeedValidationErrors BLOCKLISTED_IMAGE_SIGNATURE(Integer BLOCKLISTED_IMAGE_SIGNATURE) {
    this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    return this;
  }

 /**
  * Some items have list price formatting errors in their product metadata, those items will not be published.
  * @return LIST_PRICE_INVALID
  */
  @JsonProperty("LIST_PRICE_INVALID")
  public Integer getLISTPRICEINVALID() {
    return LIST_PRICE_INVALID;
  }

  /**
   * Sets the <code>LIST_PRICE_INVALID</code> property.
   */
 public void setLISTPRICEINVALID(Integer LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
  }

  /**
   * Sets the <code>LIST_PRICE_INVALID</code> property.
   */
  public CatalogsFeedValidationErrors LIST_PRICE_INVALID(Integer LIST_PRICE_INVALID) {
    this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    return this;
  }

 /**
  * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  * @return PRICE_CANNOT_BE_DETERMINED
  */
  @JsonProperty("PRICE_CANNOT_BE_DETERMINED")
  public Integer getPRICECANNOTBEDETERMINED() {
    return PRICE_CANNOT_BE_DETERMINED;
  }

  /**
   * Sets the <code>PRICE_CANNOT_BE_DETERMINED</code> property.
   */
 public void setPRICECANNOTBEDETERMINED(Integer PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
  }

  /**
   * Sets the <code>PRICE_CANNOT_BE_DETERMINED</code> property.
   */
  public CatalogsFeedValidationErrors PRICE_CANNOT_BE_DETERMINED(Integer PRICE_CANNOT_BE_DETERMINED) {
    this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    return this;
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
    return Objects.equals(this.FETCH_ERROR, catalogsFeedValidationErrors.FETCH_ERROR) &&
        Objects.equals(this.FETCH_INACTIVE_FEED_ERROR, catalogsFeedValidationErrors.FETCH_INACTIVE_FEED_ERROR) &&
        Objects.equals(this.ENCODING_ERROR, catalogsFeedValidationErrors.ENCODING_ERROR) &&
        Objects.equals(this.DELIMITER_ERROR, catalogsFeedValidationErrors.DELIMITER_ERROR) &&
        Objects.equals(this.REQUIRED_COLUMNS_MISSING, catalogsFeedValidationErrors.REQUIRED_COLUMNS_MISSING) &&
        Objects.equals(this.DUPLICATE_PRODUCTS, catalogsFeedValidationErrors.DUPLICATE_PRODUCTS) &&
        Objects.equals(this.IMAGE_LINK_INVALID, catalogsFeedValidationErrors.IMAGE_LINK_INVALID) &&
        Objects.equals(this.ITEMID_MISSING, catalogsFeedValidationErrors.ITEMID_MISSING) &&
        Objects.equals(this.TITLE_MISSING, catalogsFeedValidationErrors.TITLE_MISSING) &&
        Objects.equals(this.DESCRIPTION_MISSING, catalogsFeedValidationErrors.DESCRIPTION_MISSING) &&
        Objects.equals(this.PRODUCT_LINK_MISSING, catalogsFeedValidationErrors.PRODUCT_LINK_MISSING) &&
        Objects.equals(this.IMAGE_LINK_MISSING, catalogsFeedValidationErrors.IMAGE_LINK_MISSING) &&
        Objects.equals(this.AVAILABILITY_INVALID, catalogsFeedValidationErrors.AVAILABILITY_INVALID) &&
        Objects.equals(this.PRODUCT_PRICE_INVALID, catalogsFeedValidationErrors.PRODUCT_PRICE_INVALID) &&
        Objects.equals(this.LINK_FORMAT_INVALID, catalogsFeedValidationErrors.LINK_FORMAT_INVALID) &&
        Objects.equals(this.PARSE_LINE_ERROR, catalogsFeedValidationErrors.PARSE_LINE_ERROR) &&
        Objects.equals(this.ADWORDS_FORMAT_INVALID, catalogsFeedValidationErrors.ADWORDS_FORMAT_INVALID) &&
        Objects.equals(this.INTERNAL_SERVICE_ERROR, catalogsFeedValidationErrors.INTERNAL_SERVICE_ERROR) &&
        Objects.equals(this.NO_VERIFIED_DOMAIN, catalogsFeedValidationErrors.NO_VERIFIED_DOMAIN) &&
        Objects.equals(this.ADULT_INVALID, catalogsFeedValidationErrors.ADULT_INVALID) &&
        Objects.equals(this.IMAGE_LINK_LENGTH_TOO_LONG, catalogsFeedValidationErrors.IMAGE_LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.INVALID_DOMAIN, catalogsFeedValidationErrors.INVALID_DOMAIN) &&
        Objects.equals(this.FEED_LENGTH_TOO_LONG, catalogsFeedValidationErrors.FEED_LENGTH_TOO_LONG) &&
        Objects.equals(this.LINK_LENGTH_TOO_LONG, catalogsFeedValidationErrors.LINK_LENGTH_TOO_LONG) &&
        Objects.equals(this.MALFORMED_XML, catalogsFeedValidationErrors.MALFORMED_XML) &&
        Objects.equals(this.PRICE_MISSING, catalogsFeedValidationErrors.PRICE_MISSING) &&
        Objects.equals(this.FEED_TOO_SMALL, catalogsFeedValidationErrors.FEED_TOO_SMALL) &&
        Objects.equals(this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, catalogsFeedValidationErrors.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) &&
        Objects.equals(this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, catalogsFeedValidationErrors.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) &&
        Objects.equals(this.PINJOIN_CONTENT_UNSAFE, catalogsFeedValidationErrors.PINJOIN_CONTENT_UNSAFE) &&
        Objects.equals(this.BLOCKLISTED_IMAGE_SIGNATURE, catalogsFeedValidationErrors.BLOCKLISTED_IMAGE_SIGNATURE) &&
        Objects.equals(this.LIST_PRICE_INVALID, catalogsFeedValidationErrors.LIST_PRICE_INVALID) &&
        Objects.equals(this.PRICE_CANNOT_BE_DETERMINED, catalogsFeedValidationErrors.PRICE_CANNOT_BE_DETERMINED);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FETCH_ERROR, FETCH_INACTIVE_FEED_ERROR, ENCODING_ERROR, DELIMITER_ERROR, REQUIRED_COLUMNS_MISSING, DUPLICATE_PRODUCTS, IMAGE_LINK_INVALID, ITEMID_MISSING, TITLE_MISSING, DESCRIPTION_MISSING, PRODUCT_LINK_MISSING, IMAGE_LINK_MISSING, AVAILABILITY_INVALID, PRODUCT_PRICE_INVALID, LINK_FORMAT_INVALID, PARSE_LINE_ERROR, ADWORDS_FORMAT_INVALID, INTERNAL_SERVICE_ERROR, NO_VERIFIED_DOMAIN, ADULT_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, INVALID_DOMAIN, FEED_LENGTH_TOO_LONG, LINK_LENGTH_TOO_LONG, MALFORMED_XML, PRICE_MISSING, FEED_TOO_SMALL, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, PINJOIN_CONTENT_UNSAFE, BLOCKLISTED_IMAGE_SIGNATURE, LIST_PRICE_INVALID, PRICE_CANNOT_BE_DETERMINED);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedValidationErrors {\n");
    
    sb.append("    FETCH_ERROR: ").append(toIndentedString(FETCH_ERROR)).append("\n");
    sb.append("    FETCH_INACTIVE_FEED_ERROR: ").append(toIndentedString(FETCH_INACTIVE_FEED_ERROR)).append("\n");
    sb.append("    ENCODING_ERROR: ").append(toIndentedString(ENCODING_ERROR)).append("\n");
    sb.append("    DELIMITER_ERROR: ").append(toIndentedString(DELIMITER_ERROR)).append("\n");
    sb.append("    REQUIRED_COLUMNS_MISSING: ").append(toIndentedString(REQUIRED_COLUMNS_MISSING)).append("\n");
    sb.append("    DUPLICATE_PRODUCTS: ").append(toIndentedString(DUPLICATE_PRODUCTS)).append("\n");
    sb.append("    IMAGE_LINK_INVALID: ").append(toIndentedString(IMAGE_LINK_INVALID)).append("\n");
    sb.append("    ITEMID_MISSING: ").append(toIndentedString(ITEMID_MISSING)).append("\n");
    sb.append("    TITLE_MISSING: ").append(toIndentedString(TITLE_MISSING)).append("\n");
    sb.append("    DESCRIPTION_MISSING: ").append(toIndentedString(DESCRIPTION_MISSING)).append("\n");
    sb.append("    PRODUCT_LINK_MISSING: ").append(toIndentedString(PRODUCT_LINK_MISSING)).append("\n");
    sb.append("    IMAGE_LINK_MISSING: ").append(toIndentedString(IMAGE_LINK_MISSING)).append("\n");
    sb.append("    AVAILABILITY_INVALID: ").append(toIndentedString(AVAILABILITY_INVALID)).append("\n");
    sb.append("    PRODUCT_PRICE_INVALID: ").append(toIndentedString(PRODUCT_PRICE_INVALID)).append("\n");
    sb.append("    LINK_FORMAT_INVALID: ").append(toIndentedString(LINK_FORMAT_INVALID)).append("\n");
    sb.append("    PARSE_LINE_ERROR: ").append(toIndentedString(PARSE_LINE_ERROR)).append("\n");
    sb.append("    ADWORDS_FORMAT_INVALID: ").append(toIndentedString(ADWORDS_FORMAT_INVALID)).append("\n");
    sb.append("    INTERNAL_SERVICE_ERROR: ").append(toIndentedString(INTERNAL_SERVICE_ERROR)).append("\n");
    sb.append("    NO_VERIFIED_DOMAIN: ").append(toIndentedString(NO_VERIFIED_DOMAIN)).append("\n");
    sb.append("    ADULT_INVALID: ").append(toIndentedString(ADULT_INVALID)).append("\n");
    sb.append("    IMAGE_LINK_LENGTH_TOO_LONG: ").append(toIndentedString(IMAGE_LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    INVALID_DOMAIN: ").append(toIndentedString(INVALID_DOMAIN)).append("\n");
    sb.append("    FEED_LENGTH_TOO_LONG: ").append(toIndentedString(FEED_LENGTH_TOO_LONG)).append("\n");
    sb.append("    LINK_LENGTH_TOO_LONG: ").append(toIndentedString(LINK_LENGTH_TOO_LONG)).append("\n");
    sb.append("    MALFORMED_XML: ").append(toIndentedString(MALFORMED_XML)).append("\n");
    sb.append("    PRICE_MISSING: ").append(toIndentedString(PRICE_MISSING)).append("\n");
    sb.append("    FEED_TOO_SMALL: ").append(toIndentedString(FEED_TOO_SMALL)).append("\n");
    sb.append("    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: ").append(toIndentedString(MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)).append("\n");
    sb.append("    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: ").append(toIndentedString(ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE)).append("\n");
    sb.append("    PINJOIN_CONTENT_UNSAFE: ").append(toIndentedString(PINJOIN_CONTENT_UNSAFE)).append("\n");
    sb.append("    BLOCKLISTED_IMAGE_SIGNATURE: ").append(toIndentedString(BLOCKLISTED_IMAGE_SIGNATURE)).append("\n");
    sb.append("    LIST_PRICE_INVALID: ").append(toIndentedString(LIST_PRICE_INVALID)).append("\n");
    sb.append("    PRICE_CANNOT_BE_DETERMINED: ").append(toIndentedString(PRICE_CANNOT_BE_DETERMINED)).append("\n");
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

