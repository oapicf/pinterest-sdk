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
 * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.catalogId;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsFilters.prototype.hotelIds;

