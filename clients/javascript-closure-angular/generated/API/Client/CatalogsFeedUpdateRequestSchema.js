goog.provide('API.Client.CatalogsFeedUpdateRequestSchema');

/**
 * @record
 */
API.Client.CatalogsFeedUpdateRequestSchema = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.credentials;

/**
 * @type {!API.Client.ProductAvailabilityType}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.defaultAvailability;

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.defaultCurrency;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.format;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.location;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.name;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsFeedUpdateRequestSchema.prototype.status;

/** @enum {string} */
API.Client.CatalogsFeedUpdateRequestSchema.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
