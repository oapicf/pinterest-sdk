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
 * 
 * @export
 * @interface CatalogsRetailItemsPostFilter
 */
export interface CatalogsRetailItemsPostFilter  {
    /**
     * 
     * @type {string}
     * @memberof CatalogsRetailItemsPostFilter
     */
    catalogType: CatalogsRetailItemsPostFilterCatalogTypeEnum;
    /**
     * 
     * @type {Array<string>}
     * @memberof CatalogsRetailItemsPostFilter
     */
    itemIds: Array<string>;
    /**
     * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
     * @type {string}
     * @memberof CatalogsRetailItemsPostFilter
     */
    catalogId?: string;
}

export function CatalogsRetailItemsPostFilterFromJSON(json: any): CatalogsRetailItemsPostFilter {
    return {
        'catalogType': json['catalog_type'],
        'itemIds': json['item_ids'],
        'catalogId': !exists(json, 'catalog_id') ? undefined : json['catalog_id'],
    };
}

export function CatalogsRetailItemsPostFilterToJSON(value?: CatalogsRetailItemsPostFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_type': value.catalogType,
        'item_ids': value.itemIds,
        'catalog_id': value.catalogId,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsRetailItemsPostFilterCatalogTypeEnum {
    Retail = 'RETAIL'
}


