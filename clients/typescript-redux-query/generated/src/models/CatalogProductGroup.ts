// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    Board,
    BoardFromJSON,
    BoardToJSON,
    EntityStatus,
    EntityStatusFromJSON,
    EntityStatusToJSON,
} from './';

/**
 * non-promoted catalog product group entity
 * @export
 * @interface CatalogProductGroup
 */
export interface CatalogProductGroup  {
    /**
     * ID of the catalog product group.
     * @type {string}
     * @memberof CatalogProductGroup
     */
    id?: string;
    /**
     * Merchant ID pertaining to the owner of the catalog product group.
     * @type {string}
     * @memberof CatalogProductGroup
     */
    merchantId?: string;
    /**
     * Name of catalog product group
     * @type {string}
     * @memberof CatalogProductGroup
     */
    name?: string;
    /**
     * Object holding a list of filters
     * @type {object}
     * @memberof CatalogProductGroup
     */
    filters?: object;
    /**
     * Object holding a list of filters
     * @type {object}
     * @memberof CatalogProductGroup
     */
    filterV2?: object;
    /**
     * 
     * @type {Board}
     * @memberof CatalogProductGroup
     */
    type?: Board;
    /**
     * 
     * @type {EntityStatus}
     * @memberof CatalogProductGroup
     */
    status?: EntityStatus;
    /**
     * id of the feed profile belonging to this catalog product group
     * @type {string}
     * @memberof CatalogProductGroup
     */
    feedProfileId?: string;
    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @type {number}
     * @memberof CatalogProductGroup
     */
    createdAt?: number;
    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @type {number}
     * @memberof CatalogProductGroup
     */
    lastUpdate?: number;
    /**
     * Amount of products in the catalog product group
     * @type {number}
     * @memberof CatalogProductGroup
     */
    productCount?: number;
    /**
     * index of the featured position of the catalog product group
     * @type {number}
     * @memberof CatalogProductGroup
     */
    featuredPosition?: number;
}

export function CatalogProductGroupFromJSON(json: any): CatalogProductGroup {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'merchantId': !exists(json, 'merchant_id') ? undefined : json['merchant_id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'filters': !exists(json, 'filters') ? undefined : json['filters'],
        'filterV2': !exists(json, 'filter_v2') ? undefined : json['filter_v2'],
        'type': !exists(json, 'type') ? undefined : BoardFromJSON(json['type']),
        'status': !exists(json, 'status') ? undefined : EntityStatusFromJSON(json['status']),
        'feedProfileId': !exists(json, 'feed_profile_id') ? undefined : json['feed_profile_id'],
        'createdAt': !exists(json, 'created_at') ? undefined : json['created_at'],
        'lastUpdate': !exists(json, 'last_update') ? undefined : json['last_update'],
        'productCount': !exists(json, 'product_count') ? undefined : json['product_count'],
        'featuredPosition': !exists(json, 'featured_position') ? undefined : json['featured_position'],
    };
}

export function CatalogProductGroupToJSON(value?: CatalogProductGroup): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'merchant_id': value.merchantId,
        'name': value.name,
        'filters': value.filters,
        'filter_v2': value.filterV2,
        'type': BoardToJSON(value.type),
        'status': EntityStatusToJSON(value.status),
        'feed_profile_id': value.feedProfileId,
        'created_at': value.createdAt,
        'last_update': value.lastUpdate,
        'product_count': value.productCount,
        'featured_position': value.featuredPosition,
    };
}


