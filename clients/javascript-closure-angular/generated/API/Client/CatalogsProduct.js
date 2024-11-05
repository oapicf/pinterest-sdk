goog.provide('API.Client.CatalogsProduct');

/**
 * Catalogs product for all verticals
 * @record
 */
API.Client.CatalogsProduct = function() {}

/**
 * @type {!API.Client.CatalogsType}
 * @export
 */
API.Client.CatalogsProduct.prototype.catalogType;

/**
 * @type {!API.Client.CatalogsCreativeAssetsProductMetadata}
 * @export
 */
API.Client.CatalogsProduct.prototype.metadata;

/**
 * @type {!API.Client.Pin}
 * @export
 */
API.Client.CatalogsProduct.prototype.pin;

