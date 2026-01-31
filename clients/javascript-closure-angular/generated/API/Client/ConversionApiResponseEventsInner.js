goog.provide('API.Client.ConversionApiResponse_events_inner');

/**
 * @record
 */
API.Client.ConversionApiResponseEventsInner = function() {}

/**
 * Error message containing more information about why the event failed to be processed.
 * @type {!string}
 * @export
 */
API.Client.ConversionApiResponseEventsInner.prototype.errorMessage;

/**
 * Whether the event was processed successfully.
 * @type {!string}
 * @export
 */
API.Client.ConversionApiResponseEventsInner.prototype.status;

/**
 * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
 * @type {!string}
 * @export
 */
API.Client.ConversionApiResponseEventsInner.prototype.warningMessage;

/** @enum {string} */
API.Client.ConversionApiResponseEventsInner.StatusEnum = { 
  failed: 'failed',
  processed: 'processed',
}
