/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsProductGroupFilterKeys } from './catalogsProductGroupFilterKeys';
import { CatalogsProductGroupFiltersAllOf } from './catalogsProductGroupFiltersAllOf';
import { CatalogsProductGroupFiltersAnyOf } from './catalogsProductGroupFiltersAnyOf';


/**
 * Object holding a group of filters for a catalog product group
 */
export interface CatalogsProductGroupFilters { 
    any_of: Array<CatalogsProductGroupFilterKeys>;
    all_of: Array<CatalogsProductGroupFilterKeys>;
}