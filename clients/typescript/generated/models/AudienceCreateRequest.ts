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

import { AudienceCreateRequest1AudienceType } from '../models/AudienceCreateRequest1AudienceType';
import { AudienceRule } from '../models/AudienceRule';
import { HttpFile } from '../http/http';

export class AudienceCreateRequest {
    /**
    * Ad account ID.
    */
    'adAccountId'?: string;
    /**
    * Audience name.
    */
    'name': string;
    'rule': AudienceRule;
    /**
    * Audience description.
    */
    'description'?: string;
    'audienceType': AudienceCreateRequest1AudienceType;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "adAccountId",
            "baseName": "ad_account_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "rule",
            "baseName": "rule",
            "type": "AudienceRule",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "audienceType",
            "baseName": "audience_type",
            "type": "AudienceCreateRequest1AudienceType",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AudienceCreateRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
