goog.provide('API.Client.ConversionEvents');

/**
 * Conversion events.
 * @record
 */
API.Client.ConversionEvents = function() {}

/**
 * Specific messages for each event received. The order will match the order in which the events were received in the request.
 * @type {!Array<!API.Client.ConversionApiResponseEventsItems>}
 * @export
 */
API.Client.ConversionEvents.prototype.events;

/**
 * Number of events that were successfully processed from the events.
 * @type {!number}
 * @export
 */
API.Client.ConversionEvents.prototype.numEventsProcessed;

/**
 * Total number of events received in the request.
 * @type {!number}
 * @export
 */
API.Client.ConversionEvents.prototype.numEventsReceived;

