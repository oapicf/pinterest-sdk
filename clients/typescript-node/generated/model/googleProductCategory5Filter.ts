/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { CatalogsProductGroupMultipleStringListCriteria } from './catalogsProductGroupMultipleStringListCriteria';

export class GoogleProductCategory5Filter {
    'gOOGLEPRODUCTCATEGORY5': CatalogsProductGroupMultipleStringListCriteria;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "gOOGLEPRODUCTCATEGORY5",
            "baseName": "GOOGLE_PRODUCT_CATEGORY_5",
            "type": "CatalogsProductGroupMultipleStringListCriteria"
        }    ];

    static getAttributeTypeMap() {
        return GoogleProductCategory5Filter.attributeTypeMap;
    }
}
