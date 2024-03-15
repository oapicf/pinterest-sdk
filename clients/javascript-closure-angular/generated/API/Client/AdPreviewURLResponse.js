goog.provide('API.Client.AdPreviewURLResponse');

/**
 * @record
 */
API.Client.AdPreviewURLResponse = function() {}

/**
 * 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
 * @type {!string}
 * @export
 */
API.Client.AdPreviewURLResponse.prototype.url;

