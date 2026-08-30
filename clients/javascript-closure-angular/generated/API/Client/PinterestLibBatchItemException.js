goog.provide('API.Client.Pinterest.Lib.BatchItemException');

/**
 * Exception details for a batch operation item.
 * @record
 */
API.Client.PinterestLibBatchItemException = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PinterestLibBatchItemException.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.PinterestLibBatchItemException.prototype.message;

