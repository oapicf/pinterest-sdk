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
import { BatchOperation } from './batchOperation';
import { CatalogsItemsRequestLanguage } from './catalogsItemsRequestLanguage';
import { Country } from './country';
import { ItemCreateBatchRecord } from './itemCreateBatchRecord';

/**
* Request object to create catalogs items
*/
export class CatalogsItemsCreateBatchRequest {
    'country': Country;
    'language': CatalogsItemsRequestLanguage;
    'operation': BatchOperation;
    /**
    * Array with catalogs items
    */
    'items': Array<ItemCreateBatchRecord>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "country",
            "baseName": "country",
            "type": "Country"
        },
        {
            "name": "language",
            "baseName": "language",
            "type": "CatalogsItemsRequestLanguage"
        },
        {
            "name": "operation",
            "baseName": "operation",
            "type": "BatchOperation"
        },
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<ItemCreateBatchRecord>"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsItemsCreateBatchRequest.attributeTypeMap;
    }
}

export namespace CatalogsItemsCreateBatchRequest {
}
