goog.provide('API.Client.CatalogProductGroup');

/**
 * non-promoted catalog product group entity
 * @record
 */
API.Client.CatalogProductGroup = function() {}

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogProductGroup.prototype.id;

/**
 * Merchant ID pertaining to the owner of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogProductGroup.prototype.merchantId;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogProductGroup.prototype.name;

/**
 * Object holding a list of filters
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CatalogProductGroup.prototype.filters;

/**
 * Object holding a list of filters
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CatalogProductGroup.prototype.filterV2;

/**
 * @type {!API.Client.Board}
 * @export
 */
API.Client.CatalogProductGroup.prototype.type;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.CatalogProductGroup.prototype.status;

/**
 * id of the feed profile belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogProductGroup.prototype.feedProfileId;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogProductGroup.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogProductGroup.prototype.lastUpdate;

/**
 * Amount of products in the catalog product group
 * @type {!number}
 * @export
 */
API.Client.CatalogProductGroup.prototype.productCount;

/**
 * index of the featured position of the catalog product group
 * @type {!number}
 * @export
 */
API.Client.CatalogProductGroup.prototype.featuredPosition;

