goog.provide('API.Client.CatalogsVerticalFeedsCreateRequest');

/**
 * Request object for creating a feed.
 * @record
 */
API.Client.CatalogsVerticalFeedsCreateRequest = function() {}

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.catalogId;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.credentials;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.defaultAvailability;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.defaultCurrency;

/**
 * @type {!API.Client.CatalogsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.format;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.location;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsVerticalFeedsCreateRequest.prototype.status;

