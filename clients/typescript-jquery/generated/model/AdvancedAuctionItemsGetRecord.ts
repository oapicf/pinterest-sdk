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
 * Object uniquely identifying a retail catalog item
 */
export interface AdvancedAuctionItemsGetRecord {
    /**
     * The catalog retail item id in the merchant namespace
     */
    item_id: string;

    country: models.Country;

    language: models.Language;

}
export namespace AdvancedAuctionItemsGetRecord {
}
