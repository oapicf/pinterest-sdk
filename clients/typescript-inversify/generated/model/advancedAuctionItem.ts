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
import { AdvancedAuctionBidOptions } from './advancedAuctionBidOptions';
import { Country } from './country';
import { Language } from './language';


export interface AdvancedAuctionItem { 
    /**
     * The catalog retail item id in the merchant namespace
     */
    item_id: string;
    country: Country;
    language: Language;
    bid_options: AdvancedAuctionBidOptions;
}
export namespace AdvancedAuctionItem {
}
