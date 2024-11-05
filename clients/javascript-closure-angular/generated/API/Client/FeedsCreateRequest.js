goog.provide('API.Client.feeds_create_request');

/**
 * @record
 */
API.Client.FeedsCreateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.defaultAvailability;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.status;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 * @type {!string}
 * @export
 */
API.Client.FeedsCreateRequest.prototype.catalogId;

