goog.provide('API.Client.SSIOInsertionOrderStatus');

/**
 * @record
 */
API.Client.SSIOInsertionOrderStatus = function() {}

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

/**
 * Salesforce insertion order creation time
 * @type {!string}
 * @export
 */
API.Client.SSIOInsertionOrderStatus.prototype.creationTime;

