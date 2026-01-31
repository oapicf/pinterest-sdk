goog.provide('API.Client.CatalogsProductGroupCreateRequest');

/**
 * Request object for creating a product group.
 * @record
 */
API.Client.CatalogsProductGroupCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupCreateRequest.prototype.description;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupCreateRequest.prototype.feedId;

/**
 * @type {!API.Client.CatalogsProductGroupFiltersRequest}
 * @export
 */
API.Client.CatalogsProductGroupCreateRequest.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupCreateRequest.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupCreateRequest.prototype.name;

