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
import { UpdateMaskBidOptionField } from './updateMaskBidOptionField';


/**
 * Object describing an item bid option upsert operation
 */
export interface AdvancedAuctionItemsSubmitUpsertRecord { 
    /**
     * The catalog retail item id in the merchant namespace
     */
    item_id: string;
    country: Country;
    language: Language;
    bid_options: AdvancedAuctionBidOptions;
    /**
     * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
     */
    update_mask: Array<UpdateMaskBidOptionField> | null;
}
export namespace AdvancedAuctionItemsSubmitUpsertRecord {
}
