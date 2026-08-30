goog.provide('API.Client.AdGroupTrackingURLs');

/**
 *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
 * @record
 */
API.Client.AdGroupTrackingURLs = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupTrackingURLs.prototype.audienceVerification;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupTrackingURLs.prototype.buyableButton;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupTrackingURLs.prototype.click;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupTrackingURLs.prototype.engagement;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupTrackingURLs.prototype.impression;

