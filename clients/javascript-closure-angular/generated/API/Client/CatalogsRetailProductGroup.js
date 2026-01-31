goog.provide('API.Client.CatalogsRetailProductGroup');

/**
 * @record
 */
API.Client.CatalogsRetailProductGroup = function() {}

/**
 * Catalog id pertaining to the retail product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.catalogId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.country;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.description;

/**
 * id of the catalogs feed belonging to this catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.feedId;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.filters;

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.id;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.isFeatured;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.locale;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.name;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.status;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.type;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductGroup.prototype.updatedAt;

/** @enum {string} */
API.Client.CatalogsRetailProductGroup.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
