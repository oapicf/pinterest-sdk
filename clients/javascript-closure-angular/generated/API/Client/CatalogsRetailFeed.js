goog.provide('API.Client.CatalogsRetailFeed');

/**
 * Catalogs Retail Feed object
 * @record
 */
API.Client.CatalogsRetailFeed = function() {}

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.updatedAt;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.format;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.status;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultCurrency;

/**
 * The locale used within a feed for product descriptions.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultLocale;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultCountry;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultAvailability;

