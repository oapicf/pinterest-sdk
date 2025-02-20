/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CatalogsCreativeAssetsItemsPostFilter
 */
export interface CatalogsCreativeAssetsItemsPostFilter {
    /**
     * 
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsPostFilter
     */
    catalogType: CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum;
    /**
     * 
     * @type {Array<string>}
     * @memberof CatalogsCreativeAssetsItemsPostFilter
     */
    creativeAssetsIds: Array<string>;
    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsPostFilter
     */
    catalogId?: string;
}


/**
 * @export
 */
export const CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum = {
    CreativeAssets: 'CREATIVE_ASSETS'
} as const;
export type CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum = typeof CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum[keyof typeof CatalogsCreativeAssetsItemsPostFilterCatalogTypeEnum];


/**
 * Check if a given object implements the CatalogsCreativeAssetsItemsPostFilter interface.
 */
export function instanceOfCatalogsCreativeAssetsItemsPostFilter(value: object): value is CatalogsCreativeAssetsItemsPostFilter {
    if (!('catalogType' in value) || value['catalogType'] === undefined) return false;
    if (!('creativeAssetsIds' in value) || value['creativeAssetsIds'] === undefined) return false;
    return true;
}

export function CatalogsCreativeAssetsItemsPostFilterFromJSON(json: any): CatalogsCreativeAssetsItemsPostFilter {
    return CatalogsCreativeAssetsItemsPostFilterFromJSONTyped(json, false);
}

export function CatalogsCreativeAssetsItemsPostFilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsCreativeAssetsItemsPostFilter {
    if (json == null) {
        return json;
    }
    return {
        
        'catalogType': json['catalog_type'],
        'creativeAssetsIds': json['creative_assets_ids'],
        'catalogId': json['catalog_id'] == null ? undefined : json['catalog_id'],
    };
}

  export function CatalogsCreativeAssetsItemsPostFilterToJSON(json: any): CatalogsCreativeAssetsItemsPostFilter {
      return CatalogsCreativeAssetsItemsPostFilterToJSONTyped(json, false);
  }

  export function CatalogsCreativeAssetsItemsPostFilterToJSONTyped(value?: CatalogsCreativeAssetsItemsPostFilter | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'catalog_type': value['catalogType'],
        'creative_assets_ids': value['creativeAssetsIds'],
        'catalog_id': value['catalogId'],
    };
}

