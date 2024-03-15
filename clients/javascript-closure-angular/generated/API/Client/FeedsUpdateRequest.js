goog.provide('API.Client.feeds_update_request');

/**
 * @record
 */
API.Client.FeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.FeedsUpdateRequest.prototype.defaultAvailability;

