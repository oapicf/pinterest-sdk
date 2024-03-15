goog.provide('API.Client.CatalogsProductGroup');

/**
 * catalog product group entity
 * @record
 */
API.Client.CatalogsProductGroup = function() {}

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.id;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.type;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.status;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.updatedAt;

/**
 * id of the catalogs feed belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroup.prototype.catalogType;

/** @enum {string} */
API.Client.CatalogsProductGroup.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
