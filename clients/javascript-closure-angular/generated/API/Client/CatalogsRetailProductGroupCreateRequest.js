goog.provide('API.Client.CatalogsRetailProductGroupCreateRequest');

/**
 * Request object for creating a product group.
 * @record
 */
API.Client.CatalogsRetailProductGroupCreateRequest = function() {}

/**
 * Catalog ID pertaining to the product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.catalogId;

/**
 * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFiltersRequest}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.filters;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.locale;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
