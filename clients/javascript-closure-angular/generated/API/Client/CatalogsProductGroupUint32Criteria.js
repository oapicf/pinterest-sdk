goog.provide('API.Client.CatalogsProductGroupUint32Criteria');

/**
 * @record
 */
API.Client.CatalogsProductGroupUint32Criteria = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.CatalogsProductGroupUint32Criteria.prototype.negated;

/**
 * @type {!string}
 * @export
 */
API.Client.CatalogsProductGroupUint32Criteria.prototype.operator;

/**
 * @type {!number}
 * @export
 */
API.Client.CatalogsProductGroupUint32Criteria.prototype.value;

/** @enum {string} */
API.Client.CatalogsProductGroupUint32Criteria.OperatorEnum = { 
  GREATER_THAN: 'GREATER_THAN',
  GREATER_THAN_OR_EQUALS: 'GREATER_THAN_OR_EQUALS',
  LESS_THAN: 'LESS_THAN',
  LESS_THAN_OR_EQUALS: 'LESS_THAN_OR_EQUALS',
}
