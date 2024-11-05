goog.provide('API.Client.CatalogsRetailFeedsCreateRequest');

/**
 * Request object for creating a retail feed.
 * @record
 */
API.Client.CatalogsRetailFeedsCreateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultAvailability;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.status;

