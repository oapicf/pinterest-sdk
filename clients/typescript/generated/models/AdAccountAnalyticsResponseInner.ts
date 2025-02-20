/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class AdAccountAnalyticsResponseInner {
    /**
    * The ID of the advertiser that this metrics belongs to.
    */
    'AD_ACCOUNT_ID': string;
    /**
    * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    */
    'DATE'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "AD_ACCOUNT_ID",
            "baseName": "AD_ACCOUNT_ID",
            "type": "string",
            "format": ""
        },
        {
            "name": "DATE",
            "baseName": "DATE",
            "type": "string",
            "format": "date"
        }    ];

    static getAttributeTypeMap() {
        return AdAccountAnalyticsResponseInner.attributeTypeMap;
    }

    public constructor() {
    }
}
