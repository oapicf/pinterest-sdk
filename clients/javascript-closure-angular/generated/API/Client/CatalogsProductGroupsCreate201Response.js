goog.provide('API.Client.catalogs_product_groups_create_201_response');

/**
 * @record
 */
API.Client.CatalogsProductGroupsCreate201Response = function() {}

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.id;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.type;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.status;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.updatedAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsCreate201Response.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsProductGroupsCreate201Response.FeedIdEnum = { 
  : '',
}
/** @enum {string} */
API.Client.CatalogsProductGroupsCreate201Response.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
