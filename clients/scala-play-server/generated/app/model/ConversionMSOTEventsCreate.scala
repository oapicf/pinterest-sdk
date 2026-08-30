package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  * @param adGroupId The ID of the ad group that was attributed to the conversion event.
  * @param attributionModel The attribution model used to attribute the conversion event.
  * @param attributionScope Ad event type.
  * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  * @param campaignId The ID of the campaign that was attributed to the conversion event.
  * @param clickWindow Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
  * @param currency Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
  * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  * @param eventName Type of user event.
  * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds.
  * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms.
  * @param totalEvents Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
  * @param totalEventsFractional Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
  * @param value Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
  * @param viewWindow View window used for attribution (for example, `1d`, `7d`, `30d`).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionMSOTEventsCreate(
  actionTimestamps: Option[List[Long]],
  adGroupId: String,
  attributionModel: Option[AttributionModel],
  attributionScope: Option[AttributionScope],
  attributionScore: Option[Double],
  campaignId: Option[String],
  clickWindow: Option[String],
  currency: Option[Currency],
  eventId: String,
  eventName: MsotEventName,
  eventTimestamp: Long,
  totalEventTouchpoints: Option[Int],
  totalEvents: Option[Int],
  totalEventsFractional: Option[Double],
  value: Option[Double],
  viewWindow: Option[String]
)

object ConversionMSOTEventsCreate {
  implicit lazy val conversionMSOTEventsCreateJsonFormat: Format[ConversionMSOTEventsCreate] = Json.format[ConversionMSOTEventsCreate]
}

