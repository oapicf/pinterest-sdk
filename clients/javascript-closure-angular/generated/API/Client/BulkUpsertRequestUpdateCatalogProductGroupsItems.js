goog.provide('API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems');

/**
 * @record
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.isFeatured;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.prototype.locale;

/** @enum {string} */
API.Client.BulkUpsertRequestUpdateCatalogProductGroupsItems.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
