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
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogsCreativeAssetsProductGroupFilters';


/**
 * Request object for updating a creative assets product group.
 */
export interface CatalogsCreativeAssetsProductGroupUpdateRequest { 
    catalog_type?: CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum;
    name?: string;
    description?: string | null;
    filters?: CatalogsCreativeAssetsProductGroupFilters;
}
export namespace CatalogsCreativeAssetsProductGroupUpdateRequest {
    export type CatalogTypeEnum = 'CREATIVE_ASSETS';
    export const CatalogTypeEnum = {
        CreativeAssets: 'CREATIVE_ASSETS' as CatalogTypeEnum
    };
}


