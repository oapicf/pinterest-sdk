goog.provide('API.Client.CatalogsItemsFilters');

/**
 * @record
 */
API.Client.CatalogsItemsFilters = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.itemIds;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.catalogId;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.hotelIds;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.creativeAssetsIds;

