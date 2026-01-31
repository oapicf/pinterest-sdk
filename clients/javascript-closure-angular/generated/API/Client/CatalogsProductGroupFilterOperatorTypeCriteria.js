goog.provide('API.Client.CatalogsProductGroupFilterOperatorTypeCriteria');

/**
 * @record
 */
API.Client.CatalogsProductGroupFilterOperatorTypeCriteria = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupFilterOperatorTypeCriteria.prototype.filterOperatorType;

/**
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupFilterOperatorTypeCriteria.prototype.negated;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsProductGroupFilterOperatorTypeCriteria.prototype.values;

/** @enum {string} */
API.Client.CatalogsProductGroupFilterOperatorTypeCriteria.FilterOperatorTypeEnum = { 
  IS: 'IS',
  CONTAINS: 'CONTAINS',
}
