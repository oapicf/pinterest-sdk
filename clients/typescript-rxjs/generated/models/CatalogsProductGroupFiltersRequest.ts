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

import type {
    CatalogsProductGroupFilterKeys,
    CatalogsProductGroupFiltersRequestAnyOf,
    CatalogsProductGroupFiltersRequestAnyOf1,
} from './';

/**
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 * @export
 * @interface CatalogsProductGroupFiltersRequest
 */
export interface CatalogsProductGroupFiltersRequest {
    /**
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFiltersRequest
     */
    any_of: Array<CatalogsProductGroupFilterKeys>;
    /**
     * @type {Array<CatalogsProductGroupFilterKeys>}
     * @memberof CatalogsProductGroupFiltersRequest
     */
    all_of: Array<CatalogsProductGroupFilterKeys>;
}
