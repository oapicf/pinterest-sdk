goog.provide('API.Client.BillingInvoiceDownloadResponse');

/**
 * @record
 */
API.Client.BillingInvoiceDownloadResponse = function() {}

/**
 * The download url for the billing invoice
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceDownloadResponse.prototype.downloadUrl;

/**
 * The billing invoice id
 * @type {!string}
 * @export
 */
API.Client.BillingInvoiceDownloadResponse.prototype.id;

