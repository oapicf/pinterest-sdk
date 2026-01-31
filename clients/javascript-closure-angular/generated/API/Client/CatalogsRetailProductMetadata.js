goog.provide('API.Client.CatalogsRetailProductMetadata');

/**
 * Retail product metadata entity
 * @record
 */
API.Client.CatalogsRetailProductMetadata = function() {}

/**
 * @type {!API.Client.NonNullableProductAvailabilityType}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.availability;

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.currency;

/**
 * The parent ID of the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.itemGroupId;

/**
 * The user-created unique ID that represents the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsRetailProductMetadata.prototype.itemId;

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

