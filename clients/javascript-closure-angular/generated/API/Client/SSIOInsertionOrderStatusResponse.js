goog.provide('API.Client.SSIOInsertionOrderStatusResponse');

/**
 * @record
 */
API.Client.SSIOInsertionOrderStatusResponse = function() {}

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

/**
 * Salesforce insertion order creation time
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatusResponse.prototype.creationTime;

