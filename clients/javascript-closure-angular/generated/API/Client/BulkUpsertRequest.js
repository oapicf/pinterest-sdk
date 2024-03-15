goog.provide('API.Client.BulkUpsertRequest');

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 * @record
 */
API.Client.BulkUpsertRequest = function() {}

/**
 * @type {!API.Client.BulkUpsertRequestCreate}
 * @export
 */
API.Client.BulkUpsertRequest.prototype.create;

/**
 * @type {!API.Client.BulkUpsertRequestUpdate}
 * @export
 */
API.Client.BulkUpsertRequest.prototype.update;

