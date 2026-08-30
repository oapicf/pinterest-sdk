package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsInvalidLogResponseRejectedLogsItems._

case class IntegrationLogsInvalidLogResponseRejectedLogsItems (
  /* The field name containing an invalid value. */
  field: String,
/* Index of the log in the batch. */
  logIndex: Option[Integer],
/* The reason the value is invalid. */
  reason: String,
/* The value that is invalid. */
  value: String)

object IntegrationLogsInvalidLogResponseRejectedLogsItems {
  import DateTimeCodecs._

  implicit val IntegrationLogsInvalidLogResponseRejectedLogsItemsCodecJson: CodecJson[IntegrationLogsInvalidLogResponseRejectedLogsItems] = CodecJson.derive[IntegrationLogsInvalidLogResponseRejectedLogsItems]
  implicit val IntegrationLogsInvalidLogResponseRejectedLogsItemsDecoder: EntityDecoder[IntegrationLogsInvalidLogResponseRejectedLogsItems] = jsonOf[IntegrationLogsInvalidLogResponseRejectedLogsItems]
  implicit val IntegrationLogsInvalidLogResponseRejectedLogsItemsEncoder: EntityEncoder[IntegrationLogsInvalidLogResponseRejectedLogsItems] = jsonEncoderOf[IntegrationLogsInvalidLogResponseRejectedLogsItems]
}
