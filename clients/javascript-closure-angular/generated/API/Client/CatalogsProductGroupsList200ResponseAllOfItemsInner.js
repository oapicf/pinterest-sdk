goog.provide('API.Client.catalogs_product_groups_list_200_response_allOf_items_inner');

/**
 * @record
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner = function() {}

/**
 * ID of the catalog product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.id;

/**
 * Name of catalog product group
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFilters}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.filters;

/**
 * boolean indicator of whether the product group is being featured or not
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.isFeatured;

/**
 * @type {!API.Client.CatalogsProductGroupType}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.type;

/**
 * @type {!API.Client.CatalogsProductGroupStatus}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.status;

/**
 * Unix timestamp in seconds of when catalog product group was created.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.createdAt;

/**
 * Unix timestamp in seconds of last time catalog product group was updated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.updatedAt;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.feedId;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.prototype.catalogId;

/** @enum {string} */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.FeedIdEnum = { 
  : '',
}
/** @enum {string} */
API.Client.CatalogsProductGroupsList200ResponseAllOfItemsInner.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
