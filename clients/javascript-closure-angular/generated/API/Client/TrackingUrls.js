goog.provide('API.Client.TrackingUrls');

/**
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @record
 */
API.Client.TrackingUrls = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrackingUrls.prototype.impression;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrackingUrls.prototype.click;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrackingUrls.prototype.engagement;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrackingUrls.prototype.buyableButton;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TrackingUrls.prototype.audienceVerification;

