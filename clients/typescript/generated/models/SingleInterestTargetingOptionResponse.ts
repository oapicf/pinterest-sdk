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

export class SingleInterestTargetingOptionResponse {
    'id'?: string;
    'name'?: string;
    'childInterests'?: Array<string>;
    'level'?: number;

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
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "childInterests",
            "baseName": "child_interests",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "level",
            "baseName": "level",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return SingleInterestTargetingOptionResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
