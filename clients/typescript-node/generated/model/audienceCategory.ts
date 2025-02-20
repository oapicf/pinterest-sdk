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

import { RequestFile } from './models';
import { AudienceSubcategory } from './audienceSubcategory';

export class AudienceCategory {
    /**
    * Interest unique key (same as ID).
    */
    'key'?: string;
    /**
    * Interest name.
    */
    'name'?: string;
    /**
    * Interest\'s percent of category\'s total audience.
    */
    'ratio'?: number;
    /**
    * Interest affinity index.
    */
    'index'?: number;
    /**
    * Interest ID.
    */
    'id'?: string;
    /**
    * Subcategory interest distribution
    */
    'subcategories'?: Array<AudienceSubcategory>;

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
        },
        {
            "name": "subcategories",
            "baseName": "subcategories",
            "type": "Array<AudienceSubcategory>"
        }    ];

    static getAttributeTypeMap() {
        return AudienceCategory.attributeTypeMap;
    }
}

