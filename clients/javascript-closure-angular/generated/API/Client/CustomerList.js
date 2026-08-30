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
 * Customer list errors.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CustomerList.prototype.exceptions;

/**
 * Customer list ID.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.id;

/**
 * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
 * @type {!boolean}
 * @export
 */
API.Client.CustomerList.prototype.isNca;

/**
 * Customer list name.
 * @type {!string}
 * @export
 */
API.Client.CustomerList.prototype.name;

/**
 * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numBatches;

/**
 * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numRemovedUserRecords;

/**
 * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
 * @type {!number}
 * @export
 */
API.Client.CustomerList.prototype.numUploadedUserRecords;

/**
 * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 * @type {!API.Client.CustomerListStatus}
 * @export
 */
API.Client.CustomerList.prototype.status;

/**
 * Always `customerlist`.
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

