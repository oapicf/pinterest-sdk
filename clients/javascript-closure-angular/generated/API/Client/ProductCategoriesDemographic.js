goog.provide('API.Client.ProductCategoriesDemographic');

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 * @record
 */
API.Client.ProductCategoriesDemographic = function() {}

/**
 * Age demographic distribution
 * @type {!Object<!string, number>}
 * @export
 */
API.Client.ProductCategoriesDemographic.prototype.age;

/**
 * @type {!API.Client.GenderDemographics}
 * @export
 */
API.Client.ProductCategoriesDemographic.prototype.gender;

