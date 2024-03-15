goog.provide('API.Client.CatalogsProductMetadata');

/**
 * Product metadata entity
 * @record
 */
API.Client.CatalogsProductMetadata = function() {}

/**
 * The user-created unique ID that represents the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.itemId;

/**
 * The parent ID of the product.
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.itemGroupId;

/**
 * @type {!API.Client.NonNullableProductAvailabilityType}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.availability;

/**
 * The price of the product.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.price;

/**
 * The discounted price of the product.
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.salePrice;

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.CatalogsProductMetadata.prototype.currency;

