goog.provide('API.Client.CatalogsItemsPostFilters');

/**
 * @record
 */
API.Client.CatalogsItemsPostFilters = function() {}

/**
 * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsItemsPostFilters.prototype.itemIds;

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

/** @enum {string} */
API.Client.CatalogsItemsPostFilters.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
