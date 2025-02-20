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

/**
 * Object holding a group of filters for a hotel product group
 */
export interface CatalogsHotelProductGroupFilters {
    any_of: Array<models.CatalogsHotelProductGroupFilterKeys>;

    all_of: Array<models.CatalogsHotelProductGroupFilterKeys>;

}
