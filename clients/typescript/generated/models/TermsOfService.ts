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

export class TermsOfService {
    /**
    * The ID of the terms of service
    */
    'id'?: string;
    /**
    * The terms of service content
    */
    'html'?: string | null;
    /**
    * Whether the ad account has accepted terms of service.
    */
    'hasAccepted'?: boolean;
    /**
    * The ID of the ad account.
    */
    'adAccountId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "html",
            "baseName": "html",
            "type": "string",
            "format": ""
        },
        {
            "name": "hasAccepted",
            "baseName": "has_accepted",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "adAccountId",
            "baseName": "ad_account_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TermsOfService.attributeTypeMap;
    }

    public constructor() {
    }
}
