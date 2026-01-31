goog.provide('API.Client.CatalogsRetailItemsFilter');

/**
 * @record
 */
API.Client.CatalogsRetailItemsFilter = function() {}

/**
 * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsFilter.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailItemsFilter.prototype.itemIds;

/** @enum {string} */
API.Client.CatalogsRetailItemsFilter.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
