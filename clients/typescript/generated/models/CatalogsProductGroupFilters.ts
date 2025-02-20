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

import { CatalogsProductGroupFilterKeys } from '../models/CatalogsProductGroupFilterKeys';
import { CatalogsProductGroupFiltersAllOf } from '../models/CatalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from '../models/CatalogsProductGroupFiltersAnyOf';
import { HttpFile } from '../http/http';

/**
* Object holding a group of filters for a catalog product group
*/
export class CatalogsProductGroupFilters {
    'anyOf': Array<CatalogsProductGroupFilterKeys>;
    'allOf': Array<CatalogsProductGroupFilterKeys>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "anyOf",
            "baseName": "any_of",
            "type": "Array<CatalogsProductGroupFilterKeys>",
            "format": ""
        },
        {
            "name": "allOf",
            "baseName": "all_of",
            "type": "Array<CatalogsProductGroupFilterKeys>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsProductGroupFilters.attributeTypeMap;
    }

    public constructor() {
    }
}
