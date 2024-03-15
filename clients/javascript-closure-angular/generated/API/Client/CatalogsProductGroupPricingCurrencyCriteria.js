goog.provide('API.Client.catalogs_product_group_pricing_currency_criteria');

/**
 * @record
 */
API.Client.CatalogsProductGroupPricingCurrencyCriteria = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupPricingCurrencyCriteria.prototype.operator;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupPricingCurrencyCriteria.prototype.value;

/**
 * @type {!API.Client.NonNullableCatalogsCurrency}
 * @export
 */
API.Client.CatalogsProductGroupPricingCurrencyCriteria.prototype.currency;

/**
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupPricingCurrencyCriteria.prototype.negated;

/** @enum {string} */
API.Client.CatalogsProductGroupPricingCurrencyCriteria.OperatorEnum = { 
  GREATER_THAN: 'GREATER_THAN',
  GREATER_THAN_OR_EQUALS: 'GREATER_THAN_OR_EQUALS',
  LESS_THAN: 'LESS_THAN',
  LESS_THAN_OR_EQUALS: 'LESS_THAN_OR_EQUALS',
}
