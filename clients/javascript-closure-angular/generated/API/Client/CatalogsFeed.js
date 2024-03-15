goog.provide('API.Client.CatalogsFeed');

/**
 * Catalogs Feed object
 * @record
 */
API.Client.CatalogsFeed = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeed.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeed.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsFeed.prototype.updatedAt;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeed.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsFeed.prototype.format;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsFeed.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsFeed.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeed.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsFeed.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsFeed.prototype.status;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsFeed.prototype.defaultCurrency;

/**
 * The locale used within a feed for product descriptions.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeed.prototype.defaultLocale;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsFeed.prototype.defaultCountry;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsFeed.prototype.defaultAvailability;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeed.prototype.catalogId;

