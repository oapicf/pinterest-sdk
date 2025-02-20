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
 * @interface CatalogsFeedIngestionErrors
 */
export interface CatalogsFeedIngestionErrors  {
    /**
     * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    lINELEVELINTERNALERROR?: number;
    /**
     * The product count has decreased by more than 99% compared to the last successful ingestion.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    lARGEPRODUCTCOUNTDECREASE?: CatalogsFeedIngestionErrorsLARGEPRODUCTCOUNTDECREASEEnum;
    /**
     * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    aCCOUNTFLAGGED?: number;
    /**
     * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    iMAGELEVELINTERNALERROR?: number;
    /**
     * Image files are unreadable. Please upload new files to continue.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    iMAGEFILENOTACCESSIBLE?: number;
    /**
     * Image files are unreadable. Please check your link and upload new files to continue.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    iMAGEMALFORMEDURL?: number;
    /**
     * Image files are unreadable. Please upload new files to continue.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    iMAGEFILENOTFOUND?: number;
    /**
     * Image files are unreadable. Please upload new files to continue.
     * @type {number}
     * @memberof CatalogsFeedIngestionErrors
     */
    iMAGEINVALIDFILE?: number;
}

export function CatalogsFeedIngestionErrorsFromJSON(json: any): CatalogsFeedIngestionErrors {
    return {
        'lINELEVELINTERNALERROR': !exists(json, 'LINE_LEVEL_INTERNAL_ERROR') ? undefined : json['LINE_LEVEL_INTERNAL_ERROR'],
        'lARGEPRODUCTCOUNTDECREASE': !exists(json, 'LARGE_PRODUCT_COUNT_DECREASE') ? undefined : json['LARGE_PRODUCT_COUNT_DECREASE'],
        'aCCOUNTFLAGGED': !exists(json, 'ACCOUNT_FLAGGED') ? undefined : json['ACCOUNT_FLAGGED'],
        'iMAGELEVELINTERNALERROR': !exists(json, 'IMAGE_LEVEL_INTERNAL_ERROR') ? undefined : json['IMAGE_LEVEL_INTERNAL_ERROR'],
        'iMAGEFILENOTACCESSIBLE': !exists(json, 'IMAGE_FILE_NOT_ACCESSIBLE') ? undefined : json['IMAGE_FILE_NOT_ACCESSIBLE'],
        'iMAGEMALFORMEDURL': !exists(json, 'IMAGE_MALFORMED_URL') ? undefined : json['IMAGE_MALFORMED_URL'],
        'iMAGEFILENOTFOUND': !exists(json, 'IMAGE_FILE_NOT_FOUND') ? undefined : json['IMAGE_FILE_NOT_FOUND'],
        'iMAGEINVALIDFILE': !exists(json, 'IMAGE_INVALID_FILE') ? undefined : json['IMAGE_INVALID_FILE'],
    };
}

export function CatalogsFeedIngestionErrorsToJSON(value?: CatalogsFeedIngestionErrors): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'LINE_LEVEL_INTERNAL_ERROR': value.lINELEVELINTERNALERROR,
        'LARGE_PRODUCT_COUNT_DECREASE': value.lARGEPRODUCTCOUNTDECREASE,
        'ACCOUNT_FLAGGED': value.aCCOUNTFLAGGED,
        'IMAGE_LEVEL_INTERNAL_ERROR': value.iMAGELEVELINTERNALERROR,
        'IMAGE_FILE_NOT_ACCESSIBLE': value.iMAGEFILENOTACCESSIBLE,
        'IMAGE_MALFORMED_URL': value.iMAGEMALFORMEDURL,
        'IMAGE_FILE_NOT_FOUND': value.iMAGEFILENOTFOUND,
        'IMAGE_INVALID_FILE': value.iMAGEINVALIDFILE,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsFeedIngestionErrorsLARGEPRODUCTCOUNTDECREASEEnum {
    NUMBER_1 = 1
}


