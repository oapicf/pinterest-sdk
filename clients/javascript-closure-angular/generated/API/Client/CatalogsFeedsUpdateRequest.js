goog.provide('API.Client.CatalogsFeedsUpdateRequest');

/**
 * Request object for updating a feed.
 * @record
 */
API.Client.CatalogsFeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.defaultAvailability;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsFeedsUpdateRequest.prototype.status;

