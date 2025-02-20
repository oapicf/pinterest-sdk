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
import { CatalogsHotelProductMetadata } from './catalogsHotelProductMetadata';
import { Pin } from './pin';

export class CatalogsHotelProduct {
    'catalogType': CatalogsHotelProduct.CatalogTypeEnum;
    'metadata': CatalogsHotelProductMetadata;
    'pin': Pin | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsHotelProduct.CatalogTypeEnum"
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "CatalogsHotelProductMetadata"
        },
        {
            "name": "pin",
            "baseName": "pin",
            "type": "Pin"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsHotelProduct.attributeTypeMap;
    }
}

export namespace CatalogsHotelProduct {
    export enum CatalogTypeEnum {
        Hotel = <any> 'HOTEL'
    }
}
