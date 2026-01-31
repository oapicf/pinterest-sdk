package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsInvalidLogResponseRejectedLogsInner._

case class IntegrationLogsInvalidLogResponseRejectedLogsInner (
  /* The field name containing an invalid value. */
  field: String,
/* Index of the log in the batch. */
  logIndex: Option[Integer],
/* The reason the value is invalid. */
  reason: String,
/* The value that is invalid. */
  value: String)

object IntegrationLogsInvalidLogResponseRejectedLogsInner {
  import DateTimeCodecs._

  implicit val IntegrationLogsInvalidLogResponseRejectedLogsInnerCodecJson: CodecJson[IntegrationLogsInvalidLogResponseRejectedLogsInner] = CodecJson.derive[IntegrationLogsInvalidLogResponseRejectedLogsInner]
  implicit val IntegrationLogsInvalidLogResponseRejectedLogsInnerDecoder: EntityDecoder[IntegrationLogsInvalidLogResponseRejectedLogsInner] = jsonOf[IntegrationLogsInvalidLogResponseRejectedLogsInner]
  implicit val IntegrationLogsInvalidLogResponseRejectedLogsInnerEncoder: EntityEncoder[IntegrationLogsInvalidLogResponseRejectedLogsInner] = jsonEncoderOf[IntegrationLogsInvalidLogResponseRejectedLogsInner]
}
