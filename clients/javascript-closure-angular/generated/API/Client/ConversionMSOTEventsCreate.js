goog.provide('API.Client.ConversionMSOTEventsCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.ConversionMSOTEventsCreate = function() {}

/**
 * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
 * @type {!Array<!number>}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.actionTimestamps;

/**
 * The ID of the ad group that was attributed to the conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.adGroupId;

/**
 * The attribution model used to attribute the conversion event.
 * @type {!API.Client.AttributionModel}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.attributionModel;

/**
 * Ad event type.
 * @type {!API.Client.AttributionScope}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.attributionScope;

/**
 * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.attributionScore;

/**
 * The ID of the campaign that was attributed to the conversion event.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.campaignId;

/**
 * Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.clickWindow;

/**
 * Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
 * @type {!API.Client.Currency}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.currency;

/**
 * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.eventId;

/**
 * Type of user event.
 * @type {!API.Client.MsotEventName}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.eventName;

/**
 * The time when the event occurred. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.eventTimestamp;

/**
 * Total number of ad events including other non-Pinterest ad platforms.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.totalEventTouchpoints;

/**
 * Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.totalEvents;

/**
 * Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.totalEventsFractional;

/**
 * Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
 * @type {!number}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.value;

/**
 * View window used for attribution (for example, `1d`, `7d`, `30d`).
 * @type {!string}
 * @export
 */
API.Client.ConversionMSOTEventsCreate.prototype.viewWindow;

