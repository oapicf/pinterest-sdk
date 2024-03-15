goog.provide('API.Client.CatalogsFeedsCreateRequest');

/**
 * Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @record
 */
API.Client.CatalogsFeedsCreateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsFeedsCreateRequest.prototype.defaultAvailability;

