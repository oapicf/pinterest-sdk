goog.provide('API.Client.CatalogsRetailProductGroupCreateRequest');

/**
 * Request object for creating a product group.
 * @record
 */
API.Client.CatalogsRetailProductGroupCreateRequest = function() {}

/**
 * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.catalogType;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.name;

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
 * Catalog id pertaining to the retail product group.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.catalogId;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.country;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsRetailProductGroupCreateRequest.prototype.locale;

/** @enum {string} */
API.Client.CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
