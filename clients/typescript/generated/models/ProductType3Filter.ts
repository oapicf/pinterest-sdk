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

import { CatalogsProductGroupMultipleStringListCriteria } from '../models/CatalogsProductGroupMultipleStringListCriteria';
import { HttpFile } from '../http/http';

export class ProductType3Filter {
    'pRODUCTTYPE3': CatalogsProductGroupMultipleStringListCriteria;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "pRODUCTTYPE3",
            "baseName": "PRODUCT_TYPE_3",
            "type": "CatalogsProductGroupMultipleStringListCriteria",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ProductType3Filter.attributeTypeMap;
    }

    public constructor() {
    }
}
