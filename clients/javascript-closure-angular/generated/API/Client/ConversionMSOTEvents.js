goog.provide('API.Client.ConversionMSOTEvents');

/**
 * Object containing the MSOT conversion events.
 * @record
 */
API.Client.ConversionMSOTEvents = function() {}

/**
 * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
 * @type {!Array<!number>}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.actionTimestamps;

/**
 * The ID of the ad group that was attributed to the conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.adGroupId;

/**
 * The attribution model used to attribute the conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.attributionModel;

/**
 * Ad event type.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.attributionScope;

/**
 * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.attributionScore;

/**
 * The ID of the campaign that was attributed to the conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.campaignId;

/**
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.currency;

/**
 * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.eventId;

/**
 * Type of user event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.eventName;

/**
 * The time when the event occurred. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.eventTimestamp;

/**
 * Total number of ad events including other non-Pinterest ad platforms.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.totalEventTouchpoints;

/**
 * Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.totalEvents;

/**
 * Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEvents.prototype.value;

/** @enum {string} */
API.Client.ConversionMSOTEvents.AttributionModelEnum = { 
  first_touch: 'first_touch',
  last_touch: 'last_touch',
  multi_touch: 'multi_touch',
}
/** @enum {string} */
API.Client.ConversionMSOTEvents.AttributionScopeEnum = { 
  view: 'view',
  engagement: 'engagement',
  click: 'click',
}
/** @enum {string} */
API.Client.ConversionMSOTEvents.EventNameEnum = { 
  add_to_cart: 'add_to_cart',
  checkout: 'checkout',
  lead: 'lead',
  signup: 'signup',
}
