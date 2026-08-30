package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLog._

case class IntegrationLog (
  advertiserId: Option[String],
/* Version number of the integration application. */
  appVersionNumber: Option[String],
/* Timestamp in milliseconds of when the log was executed at the client. */
  clientTimestamp: Integer,
error: Option[IntegrationLogClientError],
/* Log event type */
  eventType: IntegrationLogEventType,
externalBusinessId: Option[String],
feedProfileId: Option[String],
/* Log level type */
  logLevel: IntegrationLogLevel,
merchantId: Option[String],
/* Explanation of the event that occured. */
  message: Option[String],
/* Version number of the platform the integration application is running on. */
  platformVersionNumber: Option[String],
request: Option[IntegrationLogClientRequest],
tagId: Option[String])

object IntegrationLog {
  import DateTimeCodecs._

  implicit val IntegrationLogCodecJson: CodecJson[IntegrationLog] = CodecJson.derive[IntegrationLog]
  implicit val IntegrationLogDecoder: EntityDecoder[IntegrationLog] = jsonOf[IntegrationLog]
  implicit val IntegrationLogEncoder: EntityEncoder[IntegrationLog] = jsonEncoderOf[IntegrationLog]
}
