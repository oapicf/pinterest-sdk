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

import { CatalogsProductGroupPricingCriteria } from '../models/CatalogsProductGroupPricingCriteria';
import { HttpFile } from '../http/http';

export class MaxPriceFilter {
    'MAX_PRICE': CatalogsProductGroupPricingCriteria;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "MAX_PRICE",
            "baseName": "MAX_PRICE",
            "type": "CatalogsProductGroupPricingCriteria",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MaxPriceFilter.attributeTypeMap;
    }

    public constructor() {
    }
}
