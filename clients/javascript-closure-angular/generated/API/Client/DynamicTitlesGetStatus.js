goog.provide('API.Client.DynamicTitlesGetStatus');

/**
 * @record
 */
API.Client.DynamicTitlesGetStatus = function() {}

/**
 * The count of generated titles.
 * @type {!number}
 * @export
 */
API.Client.DynamicTitlesGetStatus.prototype.generatedCount;

/**
 * Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
 * @type {!boolean}
 * @export
 */
API.Client.DynamicTitlesGetStatus.prototype.isReady;

/**
 * The count of advertiser reviewed titles.
 * @type {!number}
 * @export
 */
API.Client.DynamicTitlesGetStatus.prototype.reviewedCount;

