goog.provide('API.Client.CatalogsItemsPostFilters');

/**
 * @record
 */
API.Client.CatalogsItemsPostFilters = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.itemIds;

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.catalogId;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.hotelIds;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.creativeAssetsIds;

