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

export class AudienceSubcategory {
    /**
    * Interest unique key (same as ID).
    */
    'key'?: string;
    /**
    * Subinterest name.
    */
    'name'?: string;
    /**
    * Subinterest\'s percent of category\'s total audience.
    */
    'ratio'?: number;
    /**
    * Subinterest affinity index.
    */
    'index'?: number;
    /**
    * Subinterest ID.
    */
    'id'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "key",
            "baseName": "key",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "ratio",
            "baseName": "ratio",
            "type": "number"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return AudienceSubcategory.attributeTypeMap;
    }
}
