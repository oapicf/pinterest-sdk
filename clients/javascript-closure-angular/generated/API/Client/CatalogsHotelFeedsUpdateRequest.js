goog.provide('API.Client.CatalogsHotelFeedsUpdateRequest');

/**
 * Request object for updating a feed.
 * @record
 */
API.Client.CatalogsHotelFeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelFeedsUpdateRequest.prototype.catalogType;

