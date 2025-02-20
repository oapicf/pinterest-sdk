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

export interface CatalogsHotelProductGroup {
    catalog_type: CatalogsHotelProductGroup.CatalogTypeEnum;

    /**
     * ID of the hotel product group.
     */
    id: string;

    /**
     * Name of hotel product group
     */
    name?: string;

    description?: string;

    filters: models.CatalogsHotelProductGroupFilters;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     */
    created_at?: number;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     */
    updated_at?: number;

    /**
     * Catalog id pertaining to the hotel product group.
     */
    catalog_id: string;

}
export namespace CatalogsHotelProductGroup {
    export enum CatalogTypeEnum {
        Hotel = <any> 'HOTEL'
    }
}
