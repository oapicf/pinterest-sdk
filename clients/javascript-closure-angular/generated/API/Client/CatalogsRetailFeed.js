goog.provide('API.Client.CatalogsRetailFeed');

/**
 * Catalogs Retail Feed object
 * @record
 */
API.Client.CatalogsRetailFeed = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.catalogType;

/**
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.createdAt;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.credentials;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultAvailability;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.defaultCountry;

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
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.format;

/**
 * ID of the feed entity.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.id;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.location;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.name;

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
 * @type {!Date}
 * @export
 */
API.Client.CatalogsRetailFeed.prototype.updatedAt;

/** @enum {string} */
API.Client.CatalogsRetailFeed.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
