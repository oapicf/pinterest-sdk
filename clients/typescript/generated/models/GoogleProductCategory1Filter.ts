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

export class GoogleProductCategory1Filter {
    'gOOGLEPRODUCTCATEGORY1': CatalogsProductGroupMultipleStringListCriteria;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "gOOGLEPRODUCTCATEGORY1",
            "baseName": "GOOGLE_PRODUCT_CATEGORY_1",
            "type": "CatalogsProductGroupMultipleStringListCriteria",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return GoogleProductCategory1Filter.attributeTypeMap;
    }

    public constructor() {
    }
}
