goog.provide('API.Client.CustomerList');

/**
 * @record
 */
API.Client.CustomerList = function() {}

/**
 * Associated ad account ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.adAccountId;

/**
 * Creation time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.createdTime;

/**
 * Customer list ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.id;

/**
 * Customer list name.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.name;

/**
 * Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numBatches;

/**
 * Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numRemovedUserRecords;

/**
 * Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numUploadedUserRecords;

/**
 * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.status;

/**
 * Always \"customerlist\".
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.type;

/**
 * Last update time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.updatedTime;

/**
 * Customer list errors
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CustomerList.prototype.exceptions;

/** @enum {string} */
API.Client.CustomerList.StatusEnum = { 
  PROCESSING: 'PROCESSING',
  READY: 'READY',
  TOO_SMALL: 'TOO_SMALL',
  UPLOADING: 'UPLOADING',
}
