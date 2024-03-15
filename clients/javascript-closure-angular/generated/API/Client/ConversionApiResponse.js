goog.provide('API.Client.ConversionApiResponse');

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 * @record
 */
API.Client.ConversionApiResponse = function() {}

/**
 * Total number of events received in the request.
 * @type {!number}
 * @export
 */
API.Client.ConversionApiResponse.prototype.numEventsReceived;

/**
 * Number of events that were successfully processed from the events.
 * @type {!number}
 * @export
 */
API.Client.ConversionApiResponse.prototype.numEventsProcessed;

/**
 * Specific messages for each event received. The order will match the order in which the events were received in the request.
 * @type {!Array<!API.Client.ConversionApiResponse_events_inner>}
 * @export
 */
API.Client.ConversionApiResponse.prototype.events;

