goog.provide('API.Client.CatalogsRetailFeedsUpdateRequest');

/**
 * Request object for updating a feed.
 * @record
 */
API.Client.CatalogsRetailFeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailFeedsUpdateRequest.prototype.defaultAvailability;

