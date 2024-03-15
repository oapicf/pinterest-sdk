goog.provide('API.Client.OrderLines');

/**
 * Order Line
 * @record
 */
API.Client.OrderLines = function() {}

/**
 * Order line ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.id;

/**
 * Always \"orderline\".
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.type;

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.adAccountId;

/**
 * Purchase order ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.purchaseOrderId;

/**
 * Start time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.startTime;

/**
 * End time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.endTime;

/**
 * Order line budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.budget;

/**
 * Order line paid budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.paidBudget;

/**
 * Order line status.
 * @type {!API.Client.OrderLineStatus}
 * @export
 */
API.Client.OrderLines.prototype.status;

/**
 * Order line name.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.name;

/**
 * Order line paid type.
 * @type {!API.Client.OrderLinePaidType}
 * @export
 */
API.Client.OrderLines.prototype.paidType;

