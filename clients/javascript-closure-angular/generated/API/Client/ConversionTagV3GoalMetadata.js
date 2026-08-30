goog.provide('API.Client.ConversionTagV3GoalMetadata');

/**
 * @record
 */
API.Client.ConversionTagV3GoalMetadata = function() {}

/**
 * @type {!API.Client.AttributionWindows}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.attributionWindows;

/**
 * @type {!API.Client.ConversionEvent}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.conversionEvent;

/**
 * @type {!string}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.conversionTagId;

/**
 * @type {!string}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.cpaGoalValueInMicroCurrency;

/**
 * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.isRoasOptimized;

/**
 * Event name for custom or standard events mapped to an oCPM model
 * @type {!string}
 * @export
 */
API.Client.ConversionTagV3GoalMetadata.prototype.reportingEvent;

