goog.provide('API.Client.CatalogsProductGroupFilters');

/**
 * Object holding a group of filters for a catalog product group
 * @record
 */
API.Client.CatalogsProductGroupFilters = function() {}

/**
 * @type {!Array<!API.Client.CatalogsProductGroupFilterKeys>}
 * @export
 */
API.Client.CatalogsProductGroupFilters.prototype.anyOf;

/**
 * @type {!Array<!API.Client.CatalogsProductGroupFilterKeys>}
 * @export
 */
API.Client.CatalogsProductGroupFilters.prototype.allOf;

