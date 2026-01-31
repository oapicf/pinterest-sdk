goog.provide('API.Client.CatalogsProductGroupCurrencyCriteria');

/**
 * A currency filter. This filter cannot be negated
 * @record
 */
API.Client.CatalogsProductGroupCurrencyCriteria = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupCurrencyCriteria.prototype.negated;

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.CatalogsProductGroupCurrencyCriteria.prototype.values;

