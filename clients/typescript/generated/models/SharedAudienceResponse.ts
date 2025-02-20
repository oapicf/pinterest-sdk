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

import { Role } from '../models/Role';
import { HttpFile } from '../http/http';

export class SharedAudienceResponse {
    /**
    * Audience ID that was shared
    */
    'audienceId'?: string;
    'permissions'?: Array<Role>;
    /**
    * Account IDs that received the audience
    */
    'recipientAccountIds'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "audienceId",
            "baseName": "audience_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "permissions",
            "baseName": "permissions",
            "type": "Array<Role>",
            "format": ""
        },
        {
            "name": "recipientAccountIds",
            "baseName": "recipient_account_ids",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SharedAudienceResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
