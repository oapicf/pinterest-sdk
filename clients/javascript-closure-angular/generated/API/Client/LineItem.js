goog.provide('API.Client.LineItem');

/**
 * @record
 */
API.Client.LineItem = function() {}

/**
 * Product brand. For example, \"Parker\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productBrand;

/**
 * Product category. For example, \"Shoes\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productCategory;

/**
 * Product ID. For example, 1414.
 * @type {!number}
 * @export
 */
API.Client.LineItem.prototype.productId;

/**
 * Product name. For example, \"Parker Boots\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productName;

/**
 * Product price. For example, \"99.99\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productPrice;

/**
 * Product quantity. For example, 2.
 * @type {!number}
 * @export
 */
API.Client.LineItem.prototype.productQuantity;

/**
 * Product variant. For example, \"Red\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productVariant;

/**
 * Product variant ID. For example, \"1414-34832\".
 * @type {!string}
 * @export
 */
API.Client.LineItem.prototype.productVariantId;

