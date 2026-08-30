
package org.openapitools.client.model


case class ConversionMSOTEventsCreate (
    /* Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. */
    _actionTimestamps: Option[List[Long]],
    /* The ID of the ad group that was attributed to the conversion event. */
    _adGroupId: String,
    /* The attribution model used to attribute the conversion event. */
    _attributionModel: Option[AttributionModel],
    /* Ad event type. */
    _attributionScope: Option[AttributionScope],
    /* Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. */
    _attributionScore: Option[Double],
    /* The ID of the campaign that was attributed to the conversion event. */
    _campaignId: Option[String],
    /* Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`). */
    _clickWindow: Option[String],
    /* Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard. */
    _currency: Option[Currency],
    /* A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. */
    _eventId: String,
    /* Type of user event. */
    _eventName: MsotEventName,
    /* The time when the event occurred. Unix timestamp in seconds. */
    _eventTimestamp: Long,
    /* Total number of ad events including other non-Pinterest ad platforms. */
    _totalEventTouchpoints: Option[Integer],
    /* Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. */
    _totalEvents: Option[Integer],
    /* Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). */
    _totalEventsFractional: Option[Double],
    /* Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`. */
    _value: Option[Double],
    /* View window used for attribution (for example, `1d`, `7d`, `30d`). */
    _viewWindow: Option[String]
)
object ConversionMSOTEventsCreate {
    def toStringBody(var_actionTimestamps: Object, var_adGroupId: Object, var_attributionModel: Object, var_attributionScope: Object, var_attributionScore: Object, var_campaignId: Object, var_clickWindow: Object, var_currency: Object, var_eventId: Object, var_eventName: Object, var_eventTimestamp: Object, var_totalEventTouchpoints: Object, var_totalEvents: Object, var_totalEventsFractional: Object, var_value: Object, var_viewWindow: Object) =
        s"""
        | {
        | "actionTimestamps":$var_actionTimestamps,"adGroupId":$var_adGroupId,"attributionModel":$var_attributionModel,"attributionScope":$var_attributionScope,"attributionScore":$var_attributionScore,"campaignId":$var_campaignId,"clickWindow":$var_clickWindow,"currency":$var_currency,"eventId":$var_eventId,"eventName":$var_eventName,"eventTimestamp":$var_eventTimestamp,"totalEventTouchpoints":$var_totalEventTouchpoints,"totalEvents":$var_totalEvents,"totalEventsFractional":$var_totalEventsFractional,"value":$var_value,"viewWindow":$var_viewWindow
        | }
        """.stripMargin
}
