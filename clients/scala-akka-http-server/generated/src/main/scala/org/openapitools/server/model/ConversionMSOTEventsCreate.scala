package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. for example: ''[1451410040]''
 * @param adGroupId The ID of the ad group that was attributed to the conversion event. for example: ''2680060704746''
 * @param attributionModel The attribution model used to attribute the conversion event. for example: ''multi_touch''
 * @param attributionScope Ad event type. for example: ''click''
 * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. for example: ''0.5''
 * @param campaignId The ID of the campaign that was attributed to the conversion event. for example: ''626736533506''
 * @param clickWindow Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`). for example: ''null''
 * @param currency Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard. for example: ''null''
 * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. for example: ''eventId0001''
 * @param eventName Type of user event. for example: ''add_to_cart''
 * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds. for example: ''1451431341''
 * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms. for example: ''2''
 * @param totalEvents Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. for example: ''2''
 * @param totalEventsFractional Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). for example: ''null''
 * @param value Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`. for example: ''123.45''
 * @param viewWindow View window used for attribution (for example, `1d`, `7d`, `30d`). for example: ''null''
*/
final case class ConversionMSOTEventsCreate (
  actionTimestamps: Option[Seq[Long]] = None,
  adGroupId: String,
  attributionModel: Option[AttributionModel] = None,
  attributionScope: Option[AttributionScope] = None,
  attributionScore: Option[Double] = None,
  campaignId: Option[String] = None,
  clickWindow: Option[String] = None,
  currency: Option[Currency] = None,
  eventId: String,
  eventName: MsotEventName,
  eventTimestamp: Long,
  totalEventTouchpoints: Option[Int] = None,
  totalEvents: Option[Int] = None,
  totalEventsFractional: Option[Double] = None,
  value: Option[Double] = None,
  viewWindow: Option[String] = None
)

