/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsCreativeAssetsProductGroupFilterKeys } from './catalogsCreativeAssetsProductGroupFilterKeys';
import { CatalogsCreativeAssetsProductGroupFiltersAnyOf } from './catalogsCreativeAssetsProductGroupFiltersAnyOf';
import { CatalogsCreativeAssetsProductGroupFiltersAllOf } from './catalogsCreativeAssetsProductGroupFiltersAllOf';


/**
 * Object holding a group of filters for a creative assets product group
 */
export interface CatalogsCreativeAssetsProductGroupFilters { 
    any_of: Array<CatalogsCreativeAssetsProductGroupFilterKeys>;
    all_of: Array<CatalogsCreativeAssetsProductGroupFilterKeys>;
}

