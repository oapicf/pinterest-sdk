package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionMSOTEvents._

case class ConversionMSOTEvents (
  /* Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. */
  actionTimestamps: Option[List[Long]],
/* The ID of the ad group that was attributed to the conversion event. */
  adGroupId: String,
/* The attribution model used to attribute the conversion event. */
  attributionModel: Option[AttributionModel],
/* Ad event type. */
  attributionScope: AttributionScope,
/* Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. */
  attributionScore: Option[Double],
/* The ID of the campaign that was attributed to the conversion event. */
  campaignId: Option[String],
currency: Option[Currency],
/* A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. */
  eventId: String,
/* Type of user event. */
  eventName: EventName,
/* The time when the event occurred. Unix timestamp in seconds. */
  eventTimestamp: Long,
/* Total number of ad events including other non-Pinterest ad platforms. */
  totalEventTouchpoints: Option[Integer],
/* Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p> */
  totalEvents: Option[Integer],
/* Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'. */
  value: Option[Double])

object ConversionMSOTEvents {
  import DateTimeCodecs._
  sealed trait AttributionModel
  case object FirstTouch extends AttributionModel
  case object LastTouch extends AttributionModel
  case object MultiTouch extends AttributionModel

  object AttributionModel {
    def toAttributionModel(s: String): Option[AttributionModel] = s match {
      case "FirstTouch" => Some(FirstTouch)
      case "LastTouch" => Some(LastTouch)
      case "MultiTouch" => Some(MultiTouch)
      case _ => None
    }

    def fromAttributionModel(x: AttributionModel): String = x match {
      case FirstTouch => "FirstTouch"
      case LastTouch => "LastTouch"
      case MultiTouch => "MultiTouch"
    }
  }

  implicit val AttributionModelEnumEncoder: EncodeJson[AttributionModel] =
    EncodeJson[AttributionModel](is => StringEncodeJson(AttributionModel.fromAttributionModel(is)))

  implicit val AttributionModelEnumDecoder: DecodeJson[AttributionModel] =
    DecodeJson.optionDecoder[AttributionModel](n => n.string.flatMap(jStr => AttributionModel.toAttributionModel(jStr)), "AttributionModel failed to de-serialize")
  sealed trait AttributionScope
  case object View extends AttributionScope
  case object Engagement extends AttributionScope
  case object Click extends AttributionScope

  object AttributionScope {
    def toAttributionScope(s: String): Option[AttributionScope] = s match {
      case "View" => Some(View)
      case "Engagement" => Some(Engagement)
      case "Click" => Some(Click)
      case _ => None
    }

    def fromAttributionScope(x: AttributionScope): String = x match {
      case View => "View"
      case Engagement => "Engagement"
      case Click => "Click"
    }
  }

  implicit val AttributionScopeEnumEncoder: EncodeJson[AttributionScope] =
    EncodeJson[AttributionScope](is => StringEncodeJson(AttributionScope.fromAttributionScope(is)))

  implicit val AttributionScopeEnumDecoder: DecodeJson[AttributionScope] =
    DecodeJson.optionDecoder[AttributionScope](n => n.string.flatMap(jStr => AttributionScope.toAttributionScope(jStr)), "AttributionScope failed to de-serialize")
  sealed trait EventName
  case object AddToCart extends EventName
  case object Checkout extends EventName
  case object Lead extends EventName
  case object Signup extends EventName

  object EventName {
    def toEventName(s: String): Option[EventName] = s match {
      case "AddToCart" => Some(AddToCart)
      case "Checkout" => Some(Checkout)
      case "Lead" => Some(Lead)
      case "Signup" => Some(Signup)
      case _ => None
    }

    def fromEventName(x: EventName): String = x match {
      case AddToCart => "AddToCart"
      case Checkout => "Checkout"
      case Lead => "Lead"
      case Signup => "Signup"
    }
  }

  implicit val EventNameEnumEncoder: EncodeJson[EventName] =
    EncodeJson[EventName](is => StringEncodeJson(EventName.fromEventName(is)))

  implicit val EventNameEnumDecoder: DecodeJson[EventName] =
    DecodeJson.optionDecoder[EventName](n => n.string.flatMap(jStr => EventName.toEventName(jStr)), "EventName failed to de-serialize")

  implicit val ConversionMSOTEventsCodecJson: CodecJson[ConversionMSOTEvents] = CodecJson.derive[ConversionMSOTEvents]
  implicit val ConversionMSOTEventsDecoder: EntityDecoder[ConversionMSOTEvents] = jsonOf[ConversionMSOTEvents]
  implicit val ConversionMSOTEventsEncoder: EntityEncoder[ConversionMSOTEvents] = jsonEncoderOf[ConversionMSOTEvents]
}
