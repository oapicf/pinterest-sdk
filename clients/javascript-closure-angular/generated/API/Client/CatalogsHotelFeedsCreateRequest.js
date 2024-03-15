goog.provide('API.Client.CatalogsHotelFeedsCreateRequest');

/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @record
 */
API.Client.CatalogsHotelFeedsCreateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeedsCreateRequest.prototype.catalogId;

