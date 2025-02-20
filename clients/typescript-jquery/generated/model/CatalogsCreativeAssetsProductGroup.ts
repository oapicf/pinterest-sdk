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

import * as models from './models';

export interface CatalogsCreativeAssetsProductGroup {
    catalog_type: CatalogsCreativeAssetsProductGroup.CatalogTypeEnum;

    /**
     * ID of the creative assets product group.
     */
    id: string;

    /**
     * Name of creative assets product group
     */
    name?: string;

    description?: string;

    filters: models.CatalogsCreativeAssetsProductGroupFilters;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     */
    created_at?: number;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     */
    updated_at?: number;

    /**
     * Catalog id pertaining to the creative assets product group.
     */
    catalog_id: string;

}
export namespace CatalogsCreativeAssetsProductGroup {
    export enum CatalogTypeEnum {
        CreativeAssets = <any> 'CREATIVE_ASSETS'
    }
}
