goog.provide('API.Client.AdPreviewSourcePinId');

/**
 * Ad preview source from an existing Pin.
 * @record
 */
API.Client.AdPreviewSourcePinId = function() {}

/**
 * Creative type of the ad preview.
 * @type {!API.Client.AdPinPreviewCreativeType}
 * @export
 */
API.Client.AdPreviewSourcePinId.prototype.creativeType;

/**
 * Pin ID.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewSourcePinId.prototype.pinId;

