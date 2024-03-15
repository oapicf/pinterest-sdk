goog.provide('API.Client.CatalogsProductGroupUpdateRequest');

/**
 * Request object for updating a product group.
 * @record
 */
API.Client.CatalogsProductGroupUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupUpdateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupUpdateRequest.prototype.description;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupUpdateRequest.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupFiltersRequest}
 * @export
 */
API.Client.CatalogsProductGroupUpdateRequest.prototype.filters;

