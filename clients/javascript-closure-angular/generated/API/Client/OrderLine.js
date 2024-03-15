goog.provide('API.Client.OrderLine');

/**
 * @record
 */
API.Client.OrderLine = function() {}

/**
 * Order line ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.id;

/**
 * Always \"orderline\".
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.type;

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.adAccountId;

/**
 * Purchase order ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.purchaseOrderId;

/**
 * Start time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.startTime;

/**
 * End time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.endTime;

/**
 * Order line budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.budget;

/**
 * Order line paid budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.paidBudget;

/**
 * Order line status.
 * @type {!API.Client.OrderLineStatus}
 * @export
 */
API.Client.OrderLine.prototype.status;

/**
 * Order line name.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.name;

/**
 * Order line paid type.
 * @type {!API.Client.OrderLinePaidType}
 * @export
 */
API.Client.OrderLine.prototype.paidType;

/**
 * Associated List of campaign IDs.
 * @type {!Array<!string>}
 * @export
 */
API.Client.OrderLine.prototype.campaignIds;

