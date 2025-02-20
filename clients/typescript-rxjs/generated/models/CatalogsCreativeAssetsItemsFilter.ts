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

/**
 * @export
 * @interface CatalogsCreativeAssetsItemsFilter
 */
export interface CatalogsCreativeAssetsItemsFilter {
    /**
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    catalog_type: CatalogsCreativeAssetsItemsFilterCatalogTypeEnum;
    /**
     * @type {Array<string>}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    creative_assets_ids: Array<string>;
    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsFilter
     */
    catalog_id?: string;
}

/**
 * @export
 * @enum {string}
 */
export enum CatalogsCreativeAssetsItemsFilterCatalogTypeEnum {
    CreativeAssets = 'CREATIVE_ASSETS'
}

