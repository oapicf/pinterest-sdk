// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * Product counts for a Retail CatalogsProductGroup
 * @export
 * @interface CatalogsRetailProductGroupProductCounts
 */
export interface CatalogsRetailProductGroupProductCounts  {
    /**
     * 
     * @type {string}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    catalogType: CatalogsRetailProductGroupProductCountsCatalogTypeEnum;
    /**
     * 
     * @type {number}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    inStock: number;
    /**
     * 
     * @type {number}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    outOfStock: number;
    /**
     * 
     * @type {number}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    preorder: number;
    /**
     * 
     * @type {number}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    total: number;
    /**
     * 
     * @type {number}
     * @memberof CatalogsRetailProductGroupProductCounts
     */
    videos?: number;
}

export function CatalogsRetailProductGroupProductCountsFromJSON(json: any): CatalogsRetailProductGroupProductCounts {
    return {
        'catalogType': json['catalog_type'],
        'inStock': json['in_stock'],
        'outOfStock': json['out_of_stock'],
        'preorder': json['preorder'],
        'total': json['total'],
        'videos': !exists(json, 'videos') ? undefined : json['videos'],
    };
}

export function CatalogsRetailProductGroupProductCountsToJSON(value?: CatalogsRetailProductGroupProductCounts): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_type': value.catalogType,
        'in_stock': value.inStock,
        'out_of_stock': value.outOfStock,
        'preorder': value.preorder,
        'total': value.total,
        'videos': value.videos,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsRetailProductGroupProductCountsCatalogTypeEnum {
    Retail = 'RETAIL'
}


