goog.provide('API.Client.OrderLines');

/**
 * Order Line
 * @record
 */
API.Client.OrderLines = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.adAccountId;

/**
 * Order line budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.budget;

/**
 * End time. Unix timestamp.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.endTime;

/**
 * Order line ID.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.id;

/**
 * Order line name.
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.name;

/**
 * Order line paid budget in micro currency.
 * @type {!number}
 * @export
 */
API.Client.OrderLines.prototype.paidBudget;

/**
 * Order line paid type.
 * @type {!API.Client.OrderLinePaidType}
 * @export
 */
API.Client.OrderLines.prototype.paidType;

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
 * Order line status.
 * @type {!API.Client.OrderLineStatus}
 * @export
 */
API.Client.OrderLines.prototype.status;

/**
 * Always \"orderline\".
 * @type {!string}
 * @export
 */
API.Client.OrderLines.prototype.type;

