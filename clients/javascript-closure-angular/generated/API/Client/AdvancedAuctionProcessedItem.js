goog.provide('API.Client.AdvancedAuctionProcessedItem');

/**
 * Object describing the result of an operation on an item bid option
 * @record
 */
API.Client.AdvancedAuctionProcessedItem = function() {}

/**
 * @type {!API.Client.AdvancedAuctionOperation}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.operation;

/**
 * The catalog retail item id in the merchant namespace
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.itemId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.country;

/**
 * @type {!API.Client.Language}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.language;

/**
 * @type {!API.Client.AdvancedAuctionBidOptions}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.bidOptions;

/**
 * The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
 * @type {!Array<!API.Client.UpdateMaskBidOptionField>}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.updateMask;

/**
 * Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
 * @type {!Array<!API.Client.AdvancedAuctionOperationError>}
 * @export
 */
API.Client.AdvancedAuctionProcessedItem.prototype.errors;

