package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public CatalogsFeedValidationErrors() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedValidationErrors.
     *
     * @param ADULT_INVALID Some items have invalid adult values.
     * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
     * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
     * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @param DELIMITER_ERROR Your feed includes data with formatting errors.
     * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
     * @param DUPLICATE_PRODUCTS Some products are duplicated.
     * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
     * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
     * @param FEED_TOO_SMALL Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.
     * @param FETCH_ERROR Pinterest couldn&#39;t download your feed.
     * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days.
     * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
     * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
     * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
     * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     * @param INVALID_DOMAIN Some of your product link values don&#39;t match the verified domain associated with this account.
     * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items&#39; main images can&#39;t be found.
     * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
     * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
     * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
     * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
     * @param MALFORMED_XML Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.
     * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
     * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
     * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
     * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     * @param PRICE_MISSING Some products are missing a price, those items will not be published.
     * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
     * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
     * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
     * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
     */
    public CatalogsFeedValidationErrors(
        Integer ADULT_INVALID, 
        Integer ADWORDS_FORMAT_INVALID, 
        Integer AVAILABILITY_INVALID, 
        Integer BLOCKLISTED_IMAGE_SIGNATURE, 
        Integer DELIMITER_ERROR, 
        Integer DESCRIPTION_MISSING, 
        Integer DUPLICATE_PRODUCTS, 
        Integer ENCODING_ERROR, 
        Integer FEED_LENGTH_TOO_LONG, 
        Integer FEED_TOO_SMALL, 
        Integer FETCH_ERROR, 
        Integer FETCH_INACTIVE_FEED_ERROR, 
        Integer IMAGE_LINK_INVALID, 
        Integer IMAGE_LINK_LENGTH_TOO_LONG, 
        Integer IMAGE_LINK_MISSING, 
        Integer INTERNAL_SERVICE_ERROR, 
        Integer INVALID_DOMAIN, 
        Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, 
        Integer ITEMID_MISSING, 
        Integer LINK_FORMAT_INVALID, 
        Integer LINK_LENGTH_TOO_LONG, 
        Integer LIST_PRICE_INVALID, 
        Integer MALFORMED_XML, 
        Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, 
        Integer NO_VERIFIED_DOMAIN, 
        Integer PARSE_LINE_ERROR, 
        Integer PINJOIN_CONTENT_UNSAFE, 
        Integer PRICE_CANNOT_BE_DETERMINED, 
        Integer PRICE_MISSING, 
        Integer PRODUCT_LINK_MISSING, 
        Integer PRODUCT_PRICE_INVALID, 
        Integer REQUIRED_COLUMNS_MISSING, 
        Integer TITLE_MISSING
    ) {
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



    /**
     * Some items have invalid adult values.
     * @return ADULT_INVALID
     */
    public Integer getADULTINVALID() {
        return ADULT_INVALID;
    }

    public void setADULTINVALID(Integer ADULT_INVALID) {
        this.ADULT_INVALID = ADULT_INVALID;
    }

    /**
     * Some adwords links contain too many characters.
     * @return ADWORDS_FORMAT_INVALID
     */
    public Integer getADWORDSFORMATINVALID() {
        return ADWORDS_FORMAT_INVALID;
    }

    public void setADWORDSFORMATINVALID(Integer ADWORDS_FORMAT_INVALID) {
        this.ADWORDS_FORMAT_INVALID = ADWORDS_FORMAT_INVALID;
    }

    /**
     * Some items are missing an availability value in their product metadata, those items will not be published.
     * @return AVAILABILITY_INVALID
     */
    public Integer getAVAILABILITYINVALID() {
        return AVAILABILITY_INVALID;
    }

    public void setAVAILABILITYINVALID(Integer AVAILABILITY_INVALID) {
        this.AVAILABILITY_INVALID = AVAILABILITY_INVALID;
    }

    /**
     * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
     * @return BLOCKLISTED_IMAGE_SIGNATURE
     */
    public Integer getBLOCKLISTEDIMAGESIGNATURE() {
        return BLOCKLISTED_IMAGE_SIGNATURE;
    }

    public void setBLOCKLISTEDIMAGESIGNATURE(Integer BLOCKLISTED_IMAGE_SIGNATURE) {
        this.BLOCKLISTED_IMAGE_SIGNATURE = BLOCKLISTED_IMAGE_SIGNATURE;
    }

    /**
     * Your feed includes data with formatting errors.
     * @return DELIMITER_ERROR
     */
    public Integer getDELIMITERERROR() {
        return DELIMITER_ERROR;
    }

    public void setDELIMITERERROR(Integer DELIMITER_ERROR) {
        this.DELIMITER_ERROR = DELIMITER_ERROR;
    }

    /**
     * Some items are missing a description in their product metadata, those items will not be published.
     * @return DESCRIPTION_MISSING
     */
    public Integer getDESCRIPTIONMISSING() {
        return DESCRIPTION_MISSING;
    }

    public void setDESCRIPTIONMISSING(Integer DESCRIPTION_MISSING) {
        this.DESCRIPTION_MISSING = DESCRIPTION_MISSING;
    }

    /**
     * Some products are duplicated.
     * @return DUPLICATE_PRODUCTS
     */
    public Integer getDUPLICATEPRODUCTS() {
        return DUPLICATE_PRODUCTS;
    }

    public void setDUPLICATEPRODUCTS(Integer DUPLICATE_PRODUCTS) {
        this.DUPLICATE_PRODUCTS = DUPLICATE_PRODUCTS;
    }

    /**
     * Your feed includes data with an unsupported encoding format.
     * @return ENCODING_ERROR
     */
    public Integer getENCODINGERROR() {
        return ENCODING_ERROR;
    }

    public void setENCODINGERROR(Integer ENCODING_ERROR) {
        this.ENCODING_ERROR = ENCODING_ERROR;
    }

    /**
     * Your feed contains too many items, some items will not be published.
     * @return FEED_LENGTH_TOO_LONG
     */
    public Integer getFEEDLENGTHTOOLONG() {
        return FEED_LENGTH_TOO_LONG;
    }

    public void setFEEDLENGTHTOOLONG(Integer FEED_LENGTH_TOO_LONG) {
        this.FEED_LENGTH_TOO_LONG = FEED_LENGTH_TOO_LONG;
    }

    /**
     * Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
     * @return FEED_TOO_SMALL
     */
    public Integer getFEEDTOOSMALL() {
        return FEED_TOO_SMALL;
    }

    public void setFEEDTOOSMALL(Integer FEED_TOO_SMALL) {
        this.FEED_TOO_SMALL = FEED_TOO_SMALL;
    }

    /**
     * Pinterest couldn't download your feed.
     * @return FETCH_ERROR
     */
    public Integer getFETCHERROR() {
        return FETCH_ERROR;
    }

    public void setFETCHERROR(Integer FETCH_ERROR) {
        this.FETCH_ERROR = FETCH_ERROR;
    }

    /**
     * Your feed wasn't ingested because it hasn't changed in the previous 90 days.
     * @return FETCH_INACTIVE_FEED_ERROR
     */
    public Integer getFETCHINACTIVEFEEDERROR() {
        return FETCH_INACTIVE_FEED_ERROR;
    }

    public void setFETCHINACTIVEFEEDERROR(Integer FETCH_INACTIVE_FEED_ERROR) {
        this.FETCH_INACTIVE_FEED_ERROR = FETCH_INACTIVE_FEED_ERROR;
    }

    /**
     * Some image links are formatted incorrectly.
     * @return IMAGE_LINK_INVALID
     */
    public Integer getIMAGELINKINVALID() {
        return IMAGE_LINK_INVALID;
    }

    public void setIMAGELINKINVALID(Integer IMAGE_LINK_INVALID) {
        this.IMAGE_LINK_INVALID = IMAGE_LINK_INVALID;
    }

    /**
     * Some items have image_link URLs that contain too many characters, so those items will not be published.
     * @return IMAGE_LINK_LENGTH_TOO_LONG
     */
    public Integer getIMAGELINKLENGTHTOOLONG() {
        return IMAGE_LINK_LENGTH_TOO_LONG;
    }

    public void setIMAGELINKLENGTHTOOLONG(Integer IMAGE_LINK_LENGTH_TOO_LONG) {
        this.IMAGE_LINK_LENGTH_TOO_LONG = IMAGE_LINK_LENGTH_TOO_LONG;
    }

    /**
     * Some items are missing an image link URL in their product metadata, those items will not be published.
     * @return IMAGE_LINK_MISSING
     */
    public Integer getIMAGELINKMISSING() {
        return IMAGE_LINK_MISSING;
    }

    public void setIMAGELINKMISSING(Integer IMAGE_LINK_MISSING) {
        this.IMAGE_LINK_MISSING = IMAGE_LINK_MISSING;
    }

    /**
     * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     * @return INTERNAL_SERVICE_ERROR
     */
    public Integer getINTERNALSERVICEERROR() {
        return INTERNAL_SERVICE_ERROR;
    }

    public void setINTERNALSERVICEERROR(Integer INTERNAL_SERVICE_ERROR) {
        this.INTERNAL_SERVICE_ERROR = INTERNAL_SERVICE_ERROR;
    }

    /**
     * Some of your product link values don't match the verified domain associated with this account.
     * @return INVALID_DOMAIN
     */
    public Integer getINVALIDDOMAIN() {
        return INVALID_DOMAIN;
    }

    public void setINVALIDDOMAIN(Integer INVALID_DOMAIN) {
        this.INVALID_DOMAIN = INVALID_DOMAIN;
    }

    /**
     * Some items' main images can't be found.
     * @return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
     */
    public Integer getITEMMAINIMAGEDOWNLOADFAILURE() {
        return ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    }

    public void setITEMMAINIMAGEDOWNLOADFAILURE(Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) {
        this.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE = ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
    }

    /**
     * Some items are missing an item id in their product metadata, those items will not be published.
     * @return ITEMID_MISSING
     */
    public Integer getITEMIDMISSING() {
        return ITEMID_MISSING;
    }

    public void setITEMIDMISSING(Integer ITEMID_MISSING) {
        this.ITEMID_MISSING = ITEMID_MISSING;
    }

    /**
     * Some link values are formatted incorrectly.
     * @return LINK_FORMAT_INVALID
     */
    public Integer getLINKFORMATINVALID() {
        return LINK_FORMAT_INVALID;
    }

    public void setLINKFORMATINVALID(Integer LINK_FORMAT_INVALID) {
        this.LINK_FORMAT_INVALID = LINK_FORMAT_INVALID;
    }

    /**
     * Some product links contain too many characters, those items will not be published.
     * @return LINK_LENGTH_TOO_LONG
     */
    public Integer getLINKLENGTHTOOLONG() {
        return LINK_LENGTH_TOO_LONG;
    }

    public void setLINKLENGTHTOOLONG(Integer LINK_LENGTH_TOO_LONG) {
        this.LINK_LENGTH_TOO_LONG = LINK_LENGTH_TOO_LONG;
    }

    /**
     * Some items have list price formatting errors in their product metadata, those items will not be published.
     * @return LIST_PRICE_INVALID
     */
    public Integer getLISTPRICEINVALID() {
        return LIST_PRICE_INVALID;
    }

    public void setLISTPRICEINVALID(Integer LIST_PRICE_INVALID) {
        this.LIST_PRICE_INVALID = LIST_PRICE_INVALID;
    }

    /**
     * Your feed couldn't be validated because the xml file is formatted incorrectly.
     * @return MALFORMED_XML
     */
    public Integer getMALFORMEDXML() {
        return MALFORMED_XML;
    }

    public void setMALFORMEDXML(Integer MALFORMED_XML) {
        this.MALFORMED_XML = MALFORMED_XML;
    }

    /**
     * Some items exceed the maximum number of items per item group, those items will not be published.
     * @return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
     */
    public Integer getMAXITEMSPERITEMGROUPEXCEEDED() {
        return MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    }

    public void setMAXITEMSPERITEMGROUPEXCEEDED(Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) {
        this.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
    }

    /**
     * Your merchant domain needs to be claimed.
     * @return NO_VERIFIED_DOMAIN
     */
    public Integer getNOVERIFIEDDOMAIN() {
        return NO_VERIFIED_DOMAIN;
    }

    public void setNOVERIFIEDDOMAIN(Integer NO_VERIFIED_DOMAIN) {
        this.NO_VERIFIED_DOMAIN = NO_VERIFIED_DOMAIN;
    }

    /**
     * Your feed contains formatting errors for some items.
     * @return PARSE_LINE_ERROR
     */
    public Integer getPARSELINEERROR() {
        return PARSE_LINE_ERROR;
    }

    public void setPARSELINEERROR(Integer PARSE_LINE_ERROR) {
        this.PARSE_LINE_ERROR = PARSE_LINE_ERROR;
    }

    /**
     * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
     * @return PINJOIN_CONTENT_UNSAFE
     */
    public Integer getPINJOINCONTENTUNSAFE() {
        return PINJOIN_CONTENT_UNSAFE;
    }

    public void setPINJOINCONTENTUNSAFE(Integer PINJOIN_CONTENT_UNSAFE) {
        this.PINJOIN_CONTENT_UNSAFE = PINJOIN_CONTENT_UNSAFE;
    }

    /**
     * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     * @return PRICE_CANNOT_BE_DETERMINED
     */
    public Integer getPRICECANNOTBEDETERMINED() {
        return PRICE_CANNOT_BE_DETERMINED;
    }

    public void setPRICECANNOTBEDETERMINED(Integer PRICE_CANNOT_BE_DETERMINED) {
        this.PRICE_CANNOT_BE_DETERMINED = PRICE_CANNOT_BE_DETERMINED;
    }

    /**
     * Some products are missing a price, those items will not be published.
     * @return PRICE_MISSING
     */
    public Integer getPRICEMISSING() {
        return PRICE_MISSING;
    }

    public void setPRICEMISSING(Integer PRICE_MISSING) {
        this.PRICE_MISSING = PRICE_MISSING;
    }

    /**
     * Some items are missing a link URL in their product metadata, those items will not be published.
     * @return PRODUCT_LINK_MISSING
     */
    public Integer getPRODUCTLINKMISSING() {
        return PRODUCT_LINK_MISSING;
    }

    public void setPRODUCTLINKMISSING(Integer PRODUCT_LINK_MISSING) {
        this.PRODUCT_LINK_MISSING = PRODUCT_LINK_MISSING;
    }

    /**
     * Some items have price formatting errors in their product metadata, those items will not be published.
     * @return PRODUCT_PRICE_INVALID
     */
    public Integer getPRODUCTPRICEINVALID() {
        return PRODUCT_PRICE_INVALID;
    }

    public void setPRODUCTPRICEINVALID(Integer PRODUCT_PRICE_INVALID) {
        this.PRODUCT_PRICE_INVALID = PRODUCT_PRICE_INVALID;
    }

    /**
     * Your feed is missing some required column headers.
     * @return REQUIRED_COLUMNS_MISSING
     */
    public Integer getREQUIREDCOLUMNSMISSING() {
        return REQUIRED_COLUMNS_MISSING;
    }

    public void setREQUIREDCOLUMNSMISSING(Integer REQUIRED_COLUMNS_MISSING) {
        this.REQUIRED_COLUMNS_MISSING = REQUIRED_COLUMNS_MISSING;
    }

    /**
     * Some items are missing a title in their product metadata, those items will not be published.
     * @return TITLE_MISSING
     */
    public Integer getTITLEMISSING() {
        return TITLE_MISSING;
    }

    public void setTITLEMISSING(Integer TITLE_MISSING) {
        this.TITLE_MISSING = TITLE_MISSING;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

