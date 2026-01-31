package model

import play.api.libs.json._

/**
  * Object containing the MSOT conversion events.
  * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  * @param adGroupId The ID of the ad group that was attributed to the conversion event.
  * @param attributionModel The attribution model used to attribute the conversion event.
  * @param attributionScope Ad event type.
  * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  * @param campaignId The ID of the campaign that was attributed to the conversion event.
  * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  * @param eventName Type of user event.
  * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds.
  * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms.
  * @param totalEvents Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
  * @param value Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionMSOTEvents(
  actionTimestamps: Option[List[Long]],
  adGroupId: String,
  attributionModel: Option[ConversionMSOTEvents.AttributionModel.Value],
  attributionScope: ConversionMSOTEvents.AttributionScope.Value,
  attributionScore: Option[Double],
  campaignId: Option[String],
  currency: Option[Currency],
  eventId: String,
  eventName: ConversionMSOTEvents.EventName.Value,
  eventTimestamp: Long,
  totalEventTouchpoints: Option[Int],
  totalEvents: Option[Int],
  value: Option[Double]
)

object ConversionMSOTEvents {
  implicit lazy val conversionMSOTEventsJsonFormat: Format[ConversionMSOTEvents] = Json.format[ConversionMSOTEvents]

  // noinspection TypeAnnotation
  object AttributionModel extends Enumeration {
    val FirstTouch = Value("first_touch")
    val LastTouch = Value("last_touch")
    val MultiTouch = Value("multi_touch")

    type AttributionModel = Value
    implicit lazy val AttributionModelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object AttributionScope extends Enumeration {
    val View = Value("view")
    val Engagement = Value("engagement")
    val Click = Value("click")

    type AttributionScope = Value
    implicit lazy val AttributionScopeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object EventName extends Enumeration {
    val AddToCart = Value("add_to_cart")
    val Checkout = Value("checkout")
    val Lead = Value("lead")
    val Signup = Value("signup")

    type EventName = Value
    implicit lazy val EventNameJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

