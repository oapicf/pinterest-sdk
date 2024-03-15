package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionApiResponseEventsInner._

case class ConversionApiResponseEventsInner (
  /* Whether the event was processed successfully. */
  status: Status,
/* Error message containing more information about why the event failed to be processed. */
  errorMessage: Option[String],
/* Warning messages about any fields in the event which are not standard. These are not critical to event processing. */
  warningMessage: Option[String])

object ConversionApiResponseEventsInner {
  import DateTimeCodecs._
  sealed trait Status
  case object Failed extends Status
  case object Processed extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Failed" => Some(Failed)
      case "Processed" => Some(Processed)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Failed => "Failed"
      case Processed => "Processed"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val ConversionApiResponseEventsInnerCodecJson: CodecJson[ConversionApiResponseEventsInner] = CodecJson.derive[ConversionApiResponseEventsInner]
  implicit val ConversionApiResponseEventsInnerDecoder: EntityDecoder[ConversionApiResponseEventsInner] = jsonOf[ConversionApiResponseEventsInner]
  implicit val ConversionApiResponseEventsInnerEncoder: EntityEncoder[ConversionApiResponseEventsInner] = jsonEncoderOf[ConversionApiResponseEventsInner]
}
