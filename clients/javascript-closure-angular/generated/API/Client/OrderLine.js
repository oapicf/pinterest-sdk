goog.provide('API.Client.OrderLine');

/**
 * @record
 */
API.Client.OrderLine = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.adAccountId;

/**
 * Order line budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.budget;

/**
 * End time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.endTime;

/**
 * Order line ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.id;

/**
 * Order line name.
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.name;

/**
 * Order line paid budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLine.prototype.paidBudget;

/**
 * Order line paid type.
 * @type {!API.Client.OrderLinePaidType}
 * @export
 */
API.Client.OrderLine.prototype.paidType;

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
 * Order line status.
 * @type {!API.Client.OrderLineStatus}
 * @export
 */
API.Client.OrderLine.prototype.status;

/**
 * Always \"orderline\".
 * @type {!string}
 * @export
 */
API.Client.OrderLine.prototype.type;

/**
 * Associated List of campaign IDs.
 * @type {!Array<!string>}
 * @export
 */
API.Client.OrderLine.prototype.campaignIds;

