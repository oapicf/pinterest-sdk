/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { ConversionTagConfigs } from './conversionTagConfigs';
import { EnhancedMatchStatusType } from './enhancedMatchStatusType';
import { EntityStatus } from './entityStatus';

export class ConversionTagResponse {
    /**
    * Ad account ID.
    */
    'adAccountId'?: string;
    /**
    * Tag code snippet.
    */
    'codeSnippet'?: string;
    'enhancedMatchStatus'?: EnhancedMatchStatusType | null;
    /**
    * Tag ID.
    */
    'id'?: string;
    /**
    * Time for the last event fired.
    */
    'lastFiredTimeMs'?: number | null;
    /**
    * Conversion tag name.
    */
    'name'?: string;
    'status'?: EntityStatus;
    /**
    * Version number.
    */
    'version'?: string;
    'configs'?: ConversionTagConfigs;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "adAccountId",
            "baseName": "ad_account_id",
            "type": "string"
        },
        {
            "name": "codeSnippet",
            "baseName": "code_snippet",
            "type": "string"
        },
        {
            "name": "enhancedMatchStatus",
            "baseName": "enhanced_match_status",
            "type": "EnhancedMatchStatusType"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "lastFiredTimeMs",
            "baseName": "last_fired_time_ms",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "EntityStatus"
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string"
        },
        {
            "name": "configs",
            "baseName": "configs",
            "type": "ConversionTagConfigs"
        }    ];

    static getAttributeTypeMap() {
        return ConversionTagResponse.attributeTypeMap;
    }
}

export namespace ConversionTagResponse {
}