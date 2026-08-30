goog.provide('API.Client.CatalogsProductGroupsCreateManyRequestItems');

/**
 * @record
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.description;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.name;

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsProductGroupsCreateManyRequestItems.prototype.locale;

/** @enum {string} */
API.Client.CatalogsProductGroupsCreateManyRequestItems.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
