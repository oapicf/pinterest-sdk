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
 * @interface CatalogsCreativeAssetsItemsFilter
 */
export interface CatalogsCreativeAssetsItemsFilter  {
    /**
     * 
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    catalogType: CatalogsCreativeAssetsItemsFilterCatalogTypeEnum;
    /**
     * 
     * @type {Array<string>}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    creativeAssetsIds: Array<string>;
    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    catalogId?: string;
}

export function CatalogsCreativeAssetsItemsFilterFromJSON(json: any): CatalogsCreativeAssetsItemsFilter {
    return {
        'catalogType': json['catalog_type'],
        'creativeAssetsIds': json['creative_assets_ids'],
        'catalogId': !exists(json, 'catalog_id') ? undefined : json['catalog_id'],
    };
}

export function CatalogsCreativeAssetsItemsFilterToJSON(value?: CatalogsCreativeAssetsItemsFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_type': value.catalogType,
        'creative_assets_ids': value.creativeAssetsIds,
        'catalog_id': value.catalogId,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsCreativeAssetsItemsFilterCatalogTypeEnum {
    CreativeAssets = 'CREATIVE_ASSETS'
}


