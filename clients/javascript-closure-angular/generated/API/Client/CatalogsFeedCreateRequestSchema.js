goog.provide('API.Client.CatalogsFeedCreateRequestSchema');

/**
 * @record
 */
API.Client.CatalogsFeedCreateRequestSchema = function() {}

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.credentials;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.defaultAvailability;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.defaultCountry;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.defaultCurrency;

/**
 * @type {!API.Client.CatalogsCreativeAssetsFeedsCreateRequest_default_locale}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.defaultLocale;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.format;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.location;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.name;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsFeedCreateRequestSchema.prototype.status;

/** @enum {string} */
API.Client.CatalogsFeedCreateRequestSchema.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
