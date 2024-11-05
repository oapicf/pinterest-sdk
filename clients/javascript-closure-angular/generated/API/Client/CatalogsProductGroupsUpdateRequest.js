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
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.filters;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequest.prototype.locale;

/** @enum {string} */
API.Client.CatalogsProductGroupsUpdateRequest.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
