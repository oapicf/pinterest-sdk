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

/**
* Request object for creating a catalog.
*/
export class CatalogsCreateRequest {
    /**
    * Type of the catalog entity.
    */
    'catalogType': CatalogsCreateRequest.CatalogTypeEnum;
    /**
    * A human-friendly name associated to a given catalog.
    */
    'name': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsCreateRequest.CatalogTypeEnum"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsCreateRequest.attributeTypeMap;
    }
}

export namespace CatalogsCreateRequest {
    export enum CatalogTypeEnum {
        Hotel = <any> 'HOTEL'
    }
}
