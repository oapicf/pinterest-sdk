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

export class CampaignsAnalyticsResponseInner {
    /**
    * The ID of the campaing that this metrics belongs to.
    */
    'CAMPAIGN_ID': string;
    /**
    * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
    */
    'DATE'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "CAMPAIGN_ID",
            "baseName": "CAMPAIGN_ID",
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
        return CampaignsAnalyticsResponseInner.attributeTypeMap;
    }

    public constructor() {
    }
}
