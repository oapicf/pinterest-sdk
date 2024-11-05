goog.provide('API.Client.CatalogsVerticalProductGroup');

/**
 * @record
 */
API.Client.CatalogsVerticalProductGroup = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.catalogType;

/**
 * ID of the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.id;

/**
 * Name of creative assets product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.description;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.type;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.status;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.updatedAt;

/**
 * Catalog id pertaining to the creative assets product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.catalogId;

/**
 * id of the catalogs feed belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.locale;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroup.CatalogTypeEnum = { 
  CREATIVE_ASSETS: 'CREATIVE_ASSETS',
}
