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

import { exists, mapValues } from '../runtime';
import {
    AdvancedAuctionItemsSubmitRecord,
    AdvancedAuctionItemsSubmitRecordFromJSON,
    AdvancedAuctionItemsSubmitRecordToJSON,
} from './';

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 * @export
 * @interface AdvancedAuctionItemsSubmitRequest
 */
export interface AdvancedAuctionItemsSubmitRequest  {
    /**
     * Catalog id pertaining to all items
     * @type {string}
     * @memberof AdvancedAuctionItemsSubmitRequest
     */
    catalogId: string;
    /**
     * Array of item bid option operations
     * @type {Array<AdvancedAuctionItemsSubmitRecord>}
     * @memberof AdvancedAuctionItemsSubmitRequest
     */
    items: Array<AdvancedAuctionItemsSubmitRecord>;
}

export function AdvancedAuctionItemsSubmitRequestFromJSON(json: any): AdvancedAuctionItemsSubmitRequest {
    return {
        'catalogId': json['catalog_id'],
        'items': (json['items'] as Array<any>).map(AdvancedAuctionItemsSubmitRecordFromJSON),
    };
}

export function AdvancedAuctionItemsSubmitRequestToJSON(value?: AdvancedAuctionItemsSubmitRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'catalog_id': value.catalogId,
        'items': (value.items as Array<any>).map(AdvancedAuctionItemsSubmitRecordToJSON),
    };
}


