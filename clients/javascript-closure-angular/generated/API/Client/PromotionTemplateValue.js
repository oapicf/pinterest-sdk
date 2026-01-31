goog.provide('API.Client.PromotionTemplateValue');

/**
 * @record
 */
API.Client.PromotionTemplateValue = function() {}

/**
 * Numeric value.
 * @type {!number}
 * @export
 */
API.Client.PromotionTemplateValue.prototype.amount;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.PromotionTemplateValue.prototype.currencyCode;

/**
 * Custom text.
 * @type {!string}
 * @export
 */
API.Client.PromotionTemplateValue.prototype.customText;

/**
 * Percent value.
 * @type {!number}
 * @export
 */
API.Client.PromotionTemplateValue.prototype.percent;

