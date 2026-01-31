goog.provide('API.Client.ConversionHealthSelectionItem');

/**
 * User selection of conversion health criteria for a single feature
 * @record
 */
API.Client.ConversionHealthSelectionItem = function() {}

/**
 * Status for conversion types
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ConversionHealthSelectionItem.prototype.conversionType;

/**
 * Status for criteria
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ConversionHealthSelectionItem.prototype.criteria;

/**
 * Status for ingestion sources
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ConversionHealthSelectionItem.prototype.ingestionSource;

/**
 * Overall status for this selection item
 * @type {!API.Client.AnyType}
 * @export
 */
API.Client.ConversionHealthSelectionItem.prototype.status;

