goog.provide('API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems');

/**
 * @record
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.description;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.name;

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.prototype.locale;

/** @enum {string} */
API.Client.BulkUpsertRequestCreateCatalogProductGroupsItems.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
