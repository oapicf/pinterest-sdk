goog.provide('API.Client.CatalogsProductGroupsUpdateRequestSchema');

/**
 * @record
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.isFeatured;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsProductGroupsUpdateRequestSchema.prototype.locale;

/** @enum {string} */
API.Client.CatalogsProductGroupsUpdateRequestSchema.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
