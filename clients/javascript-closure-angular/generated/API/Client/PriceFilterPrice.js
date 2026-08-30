goog.provide('API.Client.PriceFilterPrice');

/**
 * @record
 */
API.Client.PriceFilterPrice = function() {}

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.PriceFilterPrice.prototype.currency;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PriceFilterPrice.prototype.negated;

/**
 * @type {!API.Client.NumericFilterOperatorType}
 * @export
 */
API.Client.PriceFilterPrice.prototype.operator;

/**
 * @type {!number}
 * @export
 */
API.Client.PriceFilterPrice.prototype.value;

