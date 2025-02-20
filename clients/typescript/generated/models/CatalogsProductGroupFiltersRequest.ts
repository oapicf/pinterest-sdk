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
import { CatalogsProductGroupFiltersRequestAnyOf } from '../models/CatalogsProductGroupFiltersRequestAnyOf';
import { CatalogsProductGroupFiltersRequestAnyOf1 } from '../models/CatalogsProductGroupFiltersRequestAnyOf1';
import { HttpFile } from '../http/http';

/**
* Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
*/
export class CatalogsProductGroupFiltersRequest {
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
        return CatalogsProductGroupFiltersRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
