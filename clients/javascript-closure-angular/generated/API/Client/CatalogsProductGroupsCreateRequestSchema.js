goog.provide('API.Client.CatalogsProductGroupsCreateRequestSchema');

/**
 * @record
 */
API.Client.CatalogsProductGroupsCreateRequestSchema = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.description;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.name;

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsProductGroupsCreateRequestSchema.prototype.locale;

/** @enum {string} */
API.Client.CatalogsProductGroupsCreateRequestSchema.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
