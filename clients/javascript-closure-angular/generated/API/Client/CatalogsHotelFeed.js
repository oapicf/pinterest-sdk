goog.provide('API.Client.CatalogsHotelFeed');

/**
 * Catalogs Hotel Feed object
 * @record
 */
API.Client.CatalogsHotelFeed = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.updatedAt;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.format;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.status;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.defaultCurrency;

/**
 * The locale used within a feed for product descriptions.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.defaultLocale;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelFeed.prototype.catalogId;

