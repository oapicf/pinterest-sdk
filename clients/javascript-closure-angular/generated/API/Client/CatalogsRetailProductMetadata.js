goog.provide('API.Client.CatalogsRetailProductMetadata');

/**
 * Retail product metadata entity
 * @record
 */
API.Client.CatalogsRetailProductMetadata = function() {}

/**
 * The user-created unique ID that represents the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.itemId;

/**
 * The parent ID of the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.itemGroupId;

/**
 * @type {!API.Client.NonNullableProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.availability;

/**
 * The price of the product.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.price;

/**
 * The discounted price of the product.
 * @type {!number}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.salePrice;

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.currency;

