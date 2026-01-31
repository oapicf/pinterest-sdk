goog.provide('API.Client.EventQualityScore');

/**
 * Schema for GET Conversion EQS response.
 * @record
 */
API.Client.EventQualityScore = function() {}

/**
 * @type {!API.Client.IngestionSourceOptions}
 * @export
 */
API.Client.EventQualityScore.prototype.ingestionSource;

/**
 * @type {!API.Client.LookbackPeriodOptions}
 * @export
 */
API.Client.EventQualityScore.prototype.lookbackPeriod;

/**
 * @type {!API.Client.OverallStatusOptions}
 * @export
 */
API.Client.EventQualityScore.prototype.overallStatus;

/**
 * @type {!API.Client.QualityComponents}
 * @export
 */
API.Client.EventQualityScore.prototype.qualityComponents;

/**
 * @type {!API.Client.SourcePlatformOptions}
 * @export
 */
API.Client.EventQualityScore.prototype.sourcePlatform;

