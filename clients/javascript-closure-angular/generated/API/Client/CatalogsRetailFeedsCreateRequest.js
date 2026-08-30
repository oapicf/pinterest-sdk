goog.provide('API.Client.CatalogsRetailFeedsCreateRequest');

/**
 * Request object for creating a retail feed.
 * @record
 */
API.Client.CatalogsRetailFeedsCreateRequest = function() {}

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.credentials;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultAvailability;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultCurrency;

/**
 * @type {!API.Client.CatalogsCreativeAssetsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.format;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.location;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsRetailFeedsCreateRequest.prototype.status;

/** @enum {string} */
API.Client.CatalogsRetailFeedsCreateRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
