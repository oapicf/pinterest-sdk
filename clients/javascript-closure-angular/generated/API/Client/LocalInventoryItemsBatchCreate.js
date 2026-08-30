goog.provide('API.Client.LocalInventoryItemsBatchCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.LocalInventoryItemsBatchCreate = function() {}

/**
 * Array of inventory operations. Up to 1000 items per request.
 * @type {!Array<!API.Client.LocalInventoryOperation>}
 * @export
 */
API.Client.LocalInventoryItemsBatchCreate.prototype.operations;

