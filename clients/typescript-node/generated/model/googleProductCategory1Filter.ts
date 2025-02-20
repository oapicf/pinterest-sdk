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
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';

export class GoogleProductCategory1Filter {
    'gOOGLEPRODUCTCATEGORY1': CatalogsProductGroupMultipleStringListCriteria;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "gOOGLEPRODUCTCATEGORY1",
            "baseName": "GOOGLE_PRODUCT_CATEGORY_1",
            "type": "CatalogsProductGroupMultipleStringListCriteria"
        }    ];

    static getAttributeTypeMap() {
        return GoogleProductCategory1Filter.attributeTypeMap;
    }
}

