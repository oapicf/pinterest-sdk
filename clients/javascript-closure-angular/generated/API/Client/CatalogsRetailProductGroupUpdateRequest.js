goog.provide('API.Client.CatalogsRetailProductGroupUpdateRequest');

/**
 * Request object for updating a retail product group.
 * @record
 */
API.Client.CatalogsRetailProductGroupUpdateRequest = function() {}

/**
 * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.catalogType;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.country;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.description;

/**
 * @type {!API.Client.CatalogsProductGroupFiltersRequest}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.filters;

/**
 * @type {!API.Client.CatalogsLocale}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.locale;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductGroupUpdateRequest.prototype.name;

/** @enum {string} */
API.Client.CatalogsRetailProductGroupUpdateRequest.CatalogTypeEnum = { 
  RETAIL: 'RETAIL',
}
