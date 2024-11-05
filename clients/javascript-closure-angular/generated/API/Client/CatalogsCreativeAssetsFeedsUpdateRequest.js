goog.provide('API.Client.CatalogsCreativeAssetsFeedsUpdateRequest');

/**
 * Request object for updating a feed.
 * @record
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest = function() {}

/**
 * @type {!API.Client.NullableCurrency}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.defaultCurrency;

/**
 * A human-friendly name associated to a given feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.name;

/**
 * @type {!API.Client.CatalogsFormat}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.format;

/**
 * @type {!API.Client.CatalogsFeedCredentials}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.credentials;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.location;

/**
 * @type {!API.Client.CatalogsFeedProcessingSchedule}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.preferredProcessingSchedule;

/**
 * @type {!API.Client.CatalogsStatus}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.status;

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsCreativeAssetsFeedsUpdateRequest.prototype.catalogType;

