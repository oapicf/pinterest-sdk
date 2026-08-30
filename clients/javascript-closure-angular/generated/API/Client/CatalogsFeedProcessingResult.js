goog.provide('API.Client.CatalogsFeedProcessingResult');

/**
 * @record
 */
API.Client.CatalogsFeedProcessingResult = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.createdAt;

/**
 * ID of the feed processing result.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.id;

/**
 * @type {!API.Client.CatalogsFeedIngestionDetails}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.ingestionDetails;

/**
 * @type {!API.Client.CatalogsFeedProductCounts}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.productCounts;

/**
 * @type {!API.Client.CatalogsFeedProcessingStatus}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.status;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.updatedAt;

/**
 * @type {!API.Client.CatalogsFeedValidationDetails}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.validationDetails;

/**
 * @type {!API.Client.CatalogsFeedVideoCounts}
 * @export
 */
API.Client.CatalogsFeedProcessingResult.prototype.videoCounts;

