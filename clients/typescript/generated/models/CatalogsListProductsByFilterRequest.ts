/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CatalogsListProductsByFilterRequestOneOf } from '../models/CatalogsListProductsByFilterRequestOneOf';
import { CatalogsProductGroupFilters } from '../models/CatalogsProductGroupFilters';
import { HttpFile } from '../http/http';

/**
* Request object to list products for a given product group filter.
*/
export class CatalogsListProductsByFilterRequest {
    /**
    * Catalog Feed id pertaining to the catalog product group filter.
    */
    'feedId': string;
    'filters': CatalogsProductGroupFilters;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "feedId",
            "baseName": "feed_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "filters",
            "baseName": "filters",
            "type": "CatalogsProductGroupFilters",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsListProductsByFilterRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
