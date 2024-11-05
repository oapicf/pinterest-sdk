goog.provide('API.Client.CatalogsRetailProductGroup');

/**
 * @record
 */
API.Client.CatalogsRetailProductGroup = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.catalogType;

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.id;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.type;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.status;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.updatedAt;

/**
 * Catalog id pertaining to the retail product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.catalogId;

/**
 * id of the catalogs feed belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.locale;

/** @enum {string} */
API.Client.CatalogsRetailProductGroup.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
