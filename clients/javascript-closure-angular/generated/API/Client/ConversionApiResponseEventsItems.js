goog.provide('API.Client.ConversionApiResponseEventsItems');

/**
 * @record
 */
API.Client.ConversionApiResponseEventsItems = function() {}

/**
 * Error message containing more information about why the event failed to be processed.
 * @type {!string}
 * @export
 */
API.Client.ConversionApiResponseEventsItems.prototype.errorMessage;

/**
 * Whether the event was processed successfully.
 * @type {!API.Client.EventProcessingStatus}
 * @export
 */
API.Client.ConversionApiResponseEventsItems.prototype.status;

/**
 * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
 * @type {!string}
 * @export
 */
API.Client.ConversionApiResponseEventsItems.prototype.warningMessage;

