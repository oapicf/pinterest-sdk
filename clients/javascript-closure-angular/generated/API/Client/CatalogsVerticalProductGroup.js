goog.provide('API.Client.CatalogsVerticalProductGroup');

/**
 * @record
 */
API.Client.CatalogsVerticalProductGroup = function() {}

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.country;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.description;

/**
 * id of the catalogs feed belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.feedId;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.filters;

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.id;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.locale;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.name;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.status;

/**
 * @type {!API.Client.CatalogsHotelProductGroupType}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.type;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.updatedAt;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroup.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
