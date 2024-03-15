goog.provide('API.Client.AdGroupCommon_tracking_urls');

/**
 * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @record
 */
API.Client.AdGroupCommonTrackingUrls = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommonTrackingUrls.prototype.impression;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommonTrackingUrls.prototype.click;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommonTrackingUrls.prototype.engagement;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommonTrackingUrls.prototype.buyableButton;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.AdGroupCommonTrackingUrls.prototype.audienceVerification;

