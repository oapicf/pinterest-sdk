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
* Product counts for a Retail CatalogsProductGroup
*/
export class CatalogsRetailProductGroupProductCounts {
    'catalogType': CatalogsRetailProductGroupProductCounts.CatalogTypeEnum;
    'inStock': number;
    'outOfStock': number;
    'preorder': number;
    'total': number;
    'videos'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsRetailProductGroupProductCounts.CatalogTypeEnum"
        },
        {
            "name": "inStock",
            "baseName": "in_stock",
            "type": "number"
        },
        {
            "name": "outOfStock",
            "baseName": "out_of_stock",
            "type": "number"
        },
        {
            "name": "preorder",
            "baseName": "preorder",
            "type": "number"
        },
        {
            "name": "total",
            "baseName": "total",
            "type": "number"
        },
        {
            "name": "videos",
            "baseName": "videos",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsRetailProductGroupProductCounts.attributeTypeMap;
    }
}

export namespace CatalogsRetailProductGroupProductCounts {
    export enum CatalogTypeEnum {
        Retail = <any> 'RETAIL'
    }
}
