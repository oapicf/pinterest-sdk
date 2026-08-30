goog.provide('API.Client.AdBatchItem');

/**
 * @record
 */
API.Client.AdBatchItem = function() {}

/**
 * @type {!API.Client.Ad}
 * @export
 */
API.Client.AdBatchItem.prototype.data;

/**
 * @type {!API.Client.Pinterest.Lib.Error}
 * @export
 */
API.Client.AdBatchItem.prototype.exceptions;

