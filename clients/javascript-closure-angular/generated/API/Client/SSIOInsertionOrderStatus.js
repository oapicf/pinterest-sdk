goog.provide('API.Client.SSIOInsertionOrderStatus');

/**
 * SSIO insertion order status item in a list response.
 * @record
 */
API.Client.SSIOInsertionOrderStatus = function() {}

/**
 * Salesforce insertion order creation time
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatus.prototype.creationTime;

/**
 * Salesforce order id
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatus.prototype.pinOrderId;

/**
 * Salesforce insertion order status
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatus.prototype.status;

