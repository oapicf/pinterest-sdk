goog.provide('API.Client.catalogs_product_groups_update_request');

/**
 * @record
 */
API.Client.CatalogsProductGroupsUpdateRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.description;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsHotelProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.filters;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.catalogType;

/** @enum {string} */
API.Client.CatalogsProductGroupsUpdateRequest.CatalogTypeEnum = { 
  HOTEL: 'HOTEL',
}
