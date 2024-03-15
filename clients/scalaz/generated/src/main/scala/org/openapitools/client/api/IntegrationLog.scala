package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLog._

case class IntegrationLog (
  /* Timestamp in milliseconds of when the log was executed at the client. */
  clientTimestamp: Integer,
/* Log event type */
  eventType: EventType,
/* Log level type */
  logLevel: LogLevel,
externalBusinessId: Option[String],
advertiserId: Option[String],
merchantId: Option[String],
tagId: Option[String],
feedProfileId: Option[String],
/* Explanation of the event that occured. */
  message: Option[String],
/* Version number of the integration application. */
  appVersionNumber: Option[String],
/* Version number of the platform the integration application is running on. */
  platformVersionNumber: Option[String],
error: Option[IntegrationLogClientError],
request: Option[IntegrationLogClientRequest])

object IntegrationLog {
  import DateTimeCodecs._
  sealed trait EventType
  case object APP extends EventType
  case object API extends EventType

  object EventType {
    def toEventType(s: String): Option[EventType] = s match {
      case "APP" => Some(APP)
      case "API" => Some(API)
      case _ => None
    }

    def fromEventType(x: EventType): String = x match {
      case APP => "APP"
      case API => "API"
    }
  }

  implicit val EventTypeEnumEncoder: EncodeJson[EventType] =
    EncodeJson[EventType](is => StringEncodeJson(EventType.fromEventType(is)))

  implicit val EventTypeEnumDecoder: DecodeJson[EventType] =
    DecodeJson.optionDecoder[EventType](n => n.string.flatMap(jStr => EventType.toEventType(jStr)), "EventType failed to de-serialize")
  sealed trait LogLevel
  case object INFO extends LogLevel
  case object WARN extends LogLevel
  case object ERROR extends LogLevel

  object LogLevel {
    def toLogLevel(s: String): Option[LogLevel] = s match {
      case "INFO" => Some(INFO)
      case "WARN" => Some(WARN)
      case "ERROR" => Some(ERROR)
      case _ => None
    }

    def fromLogLevel(x: LogLevel): String = x match {
      case INFO => "INFO"
      case WARN => "WARN"
      case ERROR => "ERROR"
    }
  }

  implicit val LogLevelEnumEncoder: EncodeJson[LogLevel] =
    EncodeJson[LogLevel](is => StringEncodeJson(LogLevel.fromLogLevel(is)))

  implicit val LogLevelEnumDecoder: DecodeJson[LogLevel] =
    DecodeJson.optionDecoder[LogLevel](n => n.string.flatMap(jStr => LogLevel.toLogLevel(jStr)), "LogLevel failed to de-serialize")

  implicit val IntegrationLogCodecJson: CodecJson[IntegrationLog] = CodecJson.derive[IntegrationLog]
  implicit val IntegrationLogDecoder: EntityDecoder[IntegrationLog] = jsonOf[IntegrationLog]
  implicit val IntegrationLogEncoder: EntityEncoder[IntegrationLog] = jsonEncoderOf[IntegrationLog]
}
