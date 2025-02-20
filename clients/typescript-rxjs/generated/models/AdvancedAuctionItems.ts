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
    AdvancedAuctionItem,
} from './';

/**
 * Response object containing item bid options
 * @export
 * @interface AdvancedAuctionItems
 */
export interface AdvancedAuctionItems {
    /**
     * Response object of item bid options
     * @type {string}
     * @memberof AdvancedAuctionItems
     */
    catalog_id?: string;
    /**
     * Array with item bid options
     * @type {Array<AdvancedAuctionItem>}
     * @memberof AdvancedAuctionItems
     */
    items?: Array<AdvancedAuctionItem>;
}
