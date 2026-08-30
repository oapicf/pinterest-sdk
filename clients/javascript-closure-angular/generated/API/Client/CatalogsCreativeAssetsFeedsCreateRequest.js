goog.provide('API.Client.CatalogsCreativeAssetsFeedsCreateRequest');

/**
 * Request object for creating a feed.
 * @record
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest = function() {}

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.credentials;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.defaultCountry;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.defaultCurrency;

/**
 * @type {!API.Client.CatalogsCreativeAssetsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.format;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.location;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.prototype.status;

/** @enum {string} */
API.Client.CatalogsCreativeAssetsFeedsCreateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
