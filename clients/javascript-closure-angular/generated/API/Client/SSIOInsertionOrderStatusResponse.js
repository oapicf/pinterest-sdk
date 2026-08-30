goog.provide('API.Client.SSIOInsertionOrderStatusResponse');

/**
 * SSIO insertion order status response for a single pin order id lookup.
 * @record
 */
API.Client.SSIOInsertionOrderStatusResponse = function() {}

/**
 * Salesforce insertion order creation time
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatusResponse.prototype.creationTime;

/**
 * Salesforce order id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatusResponse.prototype.pinOrderId;

/**
 * Salesforce insertion order status
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatusResponse.prototype.status;

