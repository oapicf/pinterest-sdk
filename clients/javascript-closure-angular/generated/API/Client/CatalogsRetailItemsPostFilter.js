goog.provide('API.Client.CatalogsRetailItemsPostFilter');

/**
 * @record
 */
API.Client.CatalogsRetailItemsPostFilter = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsPostFilter.prototype.catalogType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailItemsPostFilter.prototype.itemIds;

/**
 * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailItemsPostFilter.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsRetailItemsPostFilter.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
