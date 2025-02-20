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

import {
    AdvancedAuctionBidOptions,
    AdvancedAuctionBidOptionsFromJSON,
    AdvancedAuctionBidOptionsToJSON,
    Country,
    CountryFromJSON,
    CountryToJSON,
    Language,
    LanguageFromJSON,
    LanguageToJSON,
    UpdateMaskBidOptionField,
    UpdateMaskBidOptionFieldFromJSON,
    UpdateMaskBidOptionFieldToJSON,
} from './';

/**
 * @type AdvancedAuctionItemsSubmitUpsertRecord
 * Object describing an item bid option upsert operation
 * @export
 */
export interface AdvancedAuctionItemsSubmitUpsertRecord extends AdvancedAuctionItem {
}

export function AdvancedAuctionItemsSubmitUpsertRecordFromJSON(json: any): AdvancedAuctionItemsSubmitUpsertRecord {
    return {
        ...AdvancedAuctionItemFromJSON(json),
    };
}

export function AdvancedAuctionItemsSubmitUpsertRecordToJSON(value?: AdvancedAuctionItemsSubmitUpsertRecord): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...AdvancedAuctionItemToJSON(value),
    };
}
