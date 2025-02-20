// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CatalogsFeedValidationErrors
 */
export interface CatalogsFeedValidationErrors  {
    /**
     * Pinterest couldn\'t download your feed.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    fETCHERROR?: number;
    /**
     * Your feed wasn\'t ingested because it hasn’t changed in the previous 90 days.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    fETCHINACTIVEFEEDERROR?: number;
    /**
     * Your feed includes data with an unsupported encoding format.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    eNCODINGERROR?: number;
    /**
     * Your feed includes data with formatting errors.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    dELIMITERERROR?: number;
    /**
     * Your feed is missing some required column headers.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    rEQUIREDCOLUMNSMISSING?: number;
    /**
     * Some products are duplicated.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    dUPLICATEPRODUCTS?: number;
    /**
     * Some image links are formatted incorrectly.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iMAGELINKINVALID?: number;
    /**
     * Some items are missing an item id in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iTEMIDMISSING?: number;
    /**
     * Some items are missing a title in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    tITLEMISSING?: number;
    /**
     * Some items are missing a description in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    dESCRIPTIONMISSING?: number;
    /**
     * Some items are missing a link URL in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pRODUCTLINKMISSING?: number;
    /**
     * Some items are missing an image link URL in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iMAGELINKMISSING?: number;
    /**
     * Some items are missing an availability value in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    aVAILABILITYINVALID?: number;
    /**
     * Some items have price formatting errors in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pRODUCTPRICEINVALID?: number;
    /**
     * Some link values are formatted incorrectly.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    lINKFORMATINVALID?: number;
    /**
     * Your feed contains formatting errors for some items.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pARSELINEERROR?: number;
    /**
     * Some adwords links contain too many characters.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    aDWORDSFORMATINVALID?: number;
    /**
     * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iNTERNALSERVICEERROR?: number;
    /**
     * Your merchant domain needs to be claimed.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    nOVERIFIEDDOMAIN?: number;
    /**
     * Some items have invalid adult values.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    aDULTINVALID?: number;
    /**
     * Some items have image_link URLs that contain too many characters, so those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iMAGELINKLENGTHTOOLONG?: number;
    /**
     * Some of your product link values don\'t match the verified domain associated with this account.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iNVALIDDOMAIN?: number;
    /**
     * Your feed contains too many items, some items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    fEEDLENGTHTOOLONG?: number;
    /**
     * Some product links contain too many characters, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    lINKLENGTHTOOLONG?: number;
    /**
     * Your feed couldn\'t be validated because the xml file is formatted incorrectly.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    mALFORMEDXML?: number;
    /**
     * Some products are missing a price, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pRICEMISSING?: number;
    /**
     * Your feed couldn\'t be validated because the file doesn\'t contain the minimum number of lines required.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    fEEDTOOSMALL?: number;
    /**
     * Some items exceed the maximum number of items per item group, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    mAXITEMSPERITEMGROUPEXCEEDED?: number;
    /**
     * Some items\' main images can\'t be found.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    iTEMMAINIMAGEDOWNLOADFAILURE?: number;
    /**
     * Some items were not published because they don\'t meet Pinterest\'s Merchant Guidelines.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pINJOINCONTENTUNSAFE?: number;
    /**
     * Some items were not published because they don\'t meet Pinterest\'s Merchant Guidelines.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    bLOCKLISTEDIMAGESIGNATURE?: number;
    /**
     * Some items have list price formatting errors in their product metadata, those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    lISTPRICEINVALID?: number;
    /**
     * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     * @type {number}
     * @memberof CatalogsFeedValidationErrors
     */
    pRICECANNOTBEDETERMINED?: number;
}

export function CatalogsFeedValidationErrorsFromJSON(json: any): CatalogsFeedValidationErrors {
    return {
        'fETCHERROR': !exists(json, 'FETCH_ERROR') ? undefined : json['FETCH_ERROR'],
        'fETCHINACTIVEFEEDERROR': !exists(json, 'FETCH_INACTIVE_FEED_ERROR') ? undefined : json['FETCH_INACTIVE_FEED_ERROR'],
        'eNCODINGERROR': !exists(json, 'ENCODING_ERROR') ? undefined : json['ENCODING_ERROR'],
        'dELIMITERERROR': !exists(json, 'DELIMITER_ERROR') ? undefined : json['DELIMITER_ERROR'],
        'rEQUIREDCOLUMNSMISSING': !exists(json, 'REQUIRED_COLUMNS_MISSING') ? undefined : json['REQUIRED_COLUMNS_MISSING'],
        'dUPLICATEPRODUCTS': !exists(json, 'DUPLICATE_PRODUCTS') ? undefined : json['DUPLICATE_PRODUCTS'],
        'iMAGELINKINVALID': !exists(json, 'IMAGE_LINK_INVALID') ? undefined : json['IMAGE_LINK_INVALID'],
        'iTEMIDMISSING': !exists(json, 'ITEMID_MISSING') ? undefined : json['ITEMID_MISSING'],
        'tITLEMISSING': !exists(json, 'TITLE_MISSING') ? undefined : json['TITLE_MISSING'],
        'dESCRIPTIONMISSING': !exists(json, 'DESCRIPTION_MISSING') ? undefined : json['DESCRIPTION_MISSING'],
        'pRODUCTLINKMISSING': !exists(json, 'PRODUCT_LINK_MISSING') ? undefined : json['PRODUCT_LINK_MISSING'],
        'iMAGELINKMISSING': !exists(json, 'IMAGE_LINK_MISSING') ? undefined : json['IMAGE_LINK_MISSING'],
        'aVAILABILITYINVALID': !exists(json, 'AVAILABILITY_INVALID') ? undefined : json['AVAILABILITY_INVALID'],
        'pRODUCTPRICEINVALID': !exists(json, 'PRODUCT_PRICE_INVALID') ? undefined : json['PRODUCT_PRICE_INVALID'],
        'lINKFORMATINVALID': !exists(json, 'LINK_FORMAT_INVALID') ? undefined : json['LINK_FORMAT_INVALID'],
        'pARSELINEERROR': !exists(json, 'PARSE_LINE_ERROR') ? undefined : json['PARSE_LINE_ERROR'],
        'aDWORDSFORMATINVALID': !exists(json, 'ADWORDS_FORMAT_INVALID') ? undefined : json['ADWORDS_FORMAT_INVALID'],
        'iNTERNALSERVICEERROR': !exists(json, 'INTERNAL_SERVICE_ERROR') ? undefined : json['INTERNAL_SERVICE_ERROR'],
        'nOVERIFIEDDOMAIN': !exists(json, 'NO_VERIFIED_DOMAIN') ? undefined : json['NO_VERIFIED_DOMAIN'],
        'aDULTINVALID': !exists(json, 'ADULT_INVALID') ? undefined : json['ADULT_INVALID'],
        'iMAGELINKLENGTHTOOLONG': !exists(json, 'IMAGE_LINK_LENGTH_TOO_LONG') ? undefined : json['IMAGE_LINK_LENGTH_TOO_LONG'],
        'iNVALIDDOMAIN': !exists(json, 'INVALID_DOMAIN') ? undefined : json['INVALID_DOMAIN'],
        'fEEDLENGTHTOOLONG': !exists(json, 'FEED_LENGTH_TOO_LONG') ? undefined : json['FEED_LENGTH_TOO_LONG'],
        'lINKLENGTHTOOLONG': !exists(json, 'LINK_LENGTH_TOO_LONG') ? undefined : json['LINK_LENGTH_TOO_LONG'],
        'mALFORMEDXML': !exists(json, 'MALFORMED_XML') ? undefined : json['MALFORMED_XML'],
        'pRICEMISSING': !exists(json, 'PRICE_MISSING') ? undefined : json['PRICE_MISSING'],
        'fEEDTOOSMALL': !exists(json, 'FEED_TOO_SMALL') ? undefined : json['FEED_TOO_SMALL'],
        'mAXITEMSPERITEMGROUPEXCEEDED': !exists(json, 'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED') ? undefined : json['MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED'],
        'iTEMMAINIMAGEDOWNLOADFAILURE': !exists(json, 'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE') ? undefined : json['ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE'],
        'pINJOINCONTENTUNSAFE': !exists(json, 'PINJOIN_CONTENT_UNSAFE') ? undefined : json['PINJOIN_CONTENT_UNSAFE'],
        'bLOCKLISTEDIMAGESIGNATURE': !exists(json, 'BLOCKLISTED_IMAGE_SIGNATURE') ? undefined : json['BLOCKLISTED_IMAGE_SIGNATURE'],
        'lISTPRICEINVALID': !exists(json, 'LIST_PRICE_INVALID') ? undefined : json['LIST_PRICE_INVALID'],
        'pRICECANNOTBEDETERMINED': !exists(json, 'PRICE_CANNOT_BE_DETERMINED') ? undefined : json['PRICE_CANNOT_BE_DETERMINED'],
    };
}

export function CatalogsFeedValidationErrorsToJSON(value?: CatalogsFeedValidationErrors): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'FETCH_ERROR': value.fETCHERROR,
        'FETCH_INACTIVE_FEED_ERROR': value.fETCHINACTIVEFEEDERROR,
        'ENCODING_ERROR': value.eNCODINGERROR,
        'DELIMITER_ERROR': value.dELIMITERERROR,
        'REQUIRED_COLUMNS_MISSING': value.rEQUIREDCOLUMNSMISSING,
        'DUPLICATE_PRODUCTS': value.dUPLICATEPRODUCTS,
        'IMAGE_LINK_INVALID': value.iMAGELINKINVALID,
        'ITEMID_MISSING': value.iTEMIDMISSING,
        'TITLE_MISSING': value.tITLEMISSING,
        'DESCRIPTION_MISSING': value.dESCRIPTIONMISSING,
        'PRODUCT_LINK_MISSING': value.pRODUCTLINKMISSING,
        'IMAGE_LINK_MISSING': value.iMAGELINKMISSING,
        'AVAILABILITY_INVALID': value.aVAILABILITYINVALID,
        'PRODUCT_PRICE_INVALID': value.pRODUCTPRICEINVALID,
        'LINK_FORMAT_INVALID': value.lINKFORMATINVALID,
        'PARSE_LINE_ERROR': value.pARSELINEERROR,
        'ADWORDS_FORMAT_INVALID': value.aDWORDSFORMATINVALID,
        'INTERNAL_SERVICE_ERROR': value.iNTERNALSERVICEERROR,
        'NO_VERIFIED_DOMAIN': value.nOVERIFIEDDOMAIN,
        'ADULT_INVALID': value.aDULTINVALID,
        'IMAGE_LINK_LENGTH_TOO_LONG': value.iMAGELINKLENGTHTOOLONG,
        'INVALID_DOMAIN': value.iNVALIDDOMAIN,
        'FEED_LENGTH_TOO_LONG': value.fEEDLENGTHTOOLONG,
        'LINK_LENGTH_TOO_LONG': value.lINKLENGTHTOOLONG,
        'MALFORMED_XML': value.mALFORMEDXML,
        'PRICE_MISSING': value.pRICEMISSING,
        'FEED_TOO_SMALL': value.fEEDTOOSMALL,
        'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED': value.mAXITEMSPERITEMGROUPEXCEEDED,
        'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE': value.iTEMMAINIMAGEDOWNLOADFAILURE,
        'PINJOIN_CONTENT_UNSAFE': value.pINJOINCONTENTUNSAFE,
        'BLOCKLISTED_IMAGE_SIGNATURE': value.bLOCKLISTEDIMAGESIGNATURE,
        'LIST_PRICE_INVALID': value.lISTPRICEINVALID,
        'PRICE_CANNOT_BE_DETERMINED': value.pRICECANNOTBEDETERMINED,
    };
}


