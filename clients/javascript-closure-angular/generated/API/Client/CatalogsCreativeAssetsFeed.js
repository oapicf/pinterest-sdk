goog.provide('API.Client.CatalogsCreativeAssetsFeed');

/**
 * Catalogs Creative Asset Feed object
 * @record
 */
API.Client.CatalogsCreativeAssetsFeed = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.updatedAt;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.format;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.status;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.defaultCurrency;

/**
 * The locale used within a feed for product descriptions.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.defaultLocale;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.defaultCountry;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeed.prototype.catalogId;

