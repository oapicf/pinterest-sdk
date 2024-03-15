goog.provide('API.Client.catalogs_product_groups_create_request');

/**
 * @record
 */
API.Client.CatalogsProductGroupsCreateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.description;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.filters;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.catalogType;

/**
 * Catalog id pertaining to the hotel product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequest.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsProductGroupsCreateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
