goog.provide('API.Client.CatalogsVerticalFeedsUpdateRequest');

/**
 * Request object for updating a feed.
 * @record
 */
API.Client.CatalogsVerticalFeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsVerticalFeedsUpdateRequest.prototype.defaultAvailability;

