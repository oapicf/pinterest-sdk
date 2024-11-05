goog.provide('API.Client.AdvancedAuctionOperationError');

/**
 * Error which occurred when applying a bid options operation to a specific item.
 * @record
 */
API.Client.AdvancedAuctionOperationError = function() {}

/**
 * The error code for the item bid option operation validation error
 * @type {!number}
 * @export
 */
API.Client.AdvancedAuctionOperationError.prototype.code;

/**
 * Message describing the item bid option operation validation error
 * @type {!string}
 * @export
 */
API.Client.AdvancedAuctionOperationError.prototype.message;

