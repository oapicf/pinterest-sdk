goog.provide('API.Client.AdvancedAuctionItemsSubmitUpsertRecord');

/**
 * Object describing an item bid option upsert operation
 * @record
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord = function() {}

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord.prototype.language;

/**
 * @type {!API.Client.AdvancedAuctionBidOptions}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord.prototype.bidOptions;

/**
 * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 * @type {!Array<!API.Client.UpdateMaskBidOptionField>}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitUpsertRecord.prototype.updateMask;

