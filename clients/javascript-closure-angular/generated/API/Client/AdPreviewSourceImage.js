goog.provide('API.Client.AdPreviewSourceImage');

/**
 * Ad preview source from an image URL.
 * @record
 */
API.Client.AdPreviewSourceImage = function() {}

/**
 * Image URL.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewSourceImage.prototype.imageUrl;

/**
 * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewSourceImage.prototype.promotionId;

/**
 * Title displayed below ad.
 * @type {!string}
 * @export
 */
API.Client.AdPreviewSourceImage.prototype.title;

