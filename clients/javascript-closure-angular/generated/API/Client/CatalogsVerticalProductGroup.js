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
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.id;

/**
 * Name of catalog product group
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
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.filters;

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
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.catalogId;

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
 * @type {!string}
 * @export
 */
API.Client.CatalogsVerticalProductGroup.prototype.feedId;

/** @enum {string} */
API.Client.CatalogsVerticalProductGroup.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
/** @enum {string} */
API.Client.CatalogsVerticalProductGroup.FeedIdEnum = { 
  : '',
}
