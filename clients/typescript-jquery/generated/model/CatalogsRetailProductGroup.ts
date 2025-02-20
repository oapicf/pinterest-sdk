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

export interface CatalogsRetailProductGroup {
    catalog_type: CatalogsRetailProductGroup.CatalogTypeEnum;

    /**
     * ID of the catalog product group.
     */
    id: string;

    /**
     * Name of catalog product group
     */
    name?: string;

    description?: string;

    filters: models.CatalogsProductGroupFilters;

    /**
     * boolean indicator of whether the product group is being featured or not
     */
    is_featured?: boolean;

    type?: models.CatalogsProductGroupType;

    status?: models.CatalogsProductGroupStatus;

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     */
    created_at?: number;

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     */
    updated_at?: number;

    /**
     * Catalog id pertaining to the retail product group.
     */
    catalog_id: string;

    /**
     * id of the catalogs feed belonging to this catalog product group
     */
    feed_id: string;

    country?: string;

    locale?: string;

}
export namespace CatalogsRetailProductGroup {
    export enum CatalogTypeEnum {
        Retail = <any> 'RETAIL'
    }
}
