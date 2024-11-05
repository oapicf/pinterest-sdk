goog.provide('API.Client.AdvancedAuctionItemsSubmitRecord');

/**
 * Object describing an item bid option operation
 * @record
 */
API.Client.AdvancedAuctionItemsSubmitRecord = function() {}

/**
 * @type {!API.Client.AdvancedAuctionOperation}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.operation;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.language;

/**
 * @type {!API.Client.AdvancedAuctionBidOptions}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.bidOptions;

/**
 * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 * @type {!Array<!API.Client.UpdateMaskBidOptionField>}
 * @export
 */
API.Client.AdvancedAuctionItemsSubmitRecord.prototype.updateMask;

