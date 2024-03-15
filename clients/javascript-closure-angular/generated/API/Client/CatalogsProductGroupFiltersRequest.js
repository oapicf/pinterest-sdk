goog.provide('API.Client.CatalogsProductGroupFiltersRequest');

/**
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 * @record
 */
API.Client.CatalogsProductGroupFiltersRequest = function() {}

/**
 * @type {!Array<!API.Client.CatalogsProductGroupFilterKeys>}
 * @export
 */
API.Client.CatalogsProductGroupFiltersRequest.prototype.anyOf;

/**
 * @type {!Array<!API.Client.CatalogsProductGroupFilterKeys>}
 * @export
 */
API.Client.CatalogsProductGroupFiltersRequest.prototype.allOf;

