goog.provide('API.Client.multiple_product_groups_inner');

/**
 * @record
 */
API.Client.MultipleProductGroupsInner = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.description;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.name;

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.MultipleProductGroupsInner.prototype.locale;

/** @enum {string} */
API.Client.MultipleProductGroupsInner.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
