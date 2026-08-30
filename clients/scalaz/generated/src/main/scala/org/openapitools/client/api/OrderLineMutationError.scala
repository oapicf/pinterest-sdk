package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineMutationError._

case class OrderLineMutationError (
  data: Option[OrderLine],
/* Error messages. */
  errorMessages: Option[List[String]])

object OrderLineMutationError {
  import DateTimeCodecs._

  implicit val OrderLineMutationErrorCodecJson: CodecJson[OrderLineMutationError] = CodecJson.derive[OrderLineMutationError]
  implicit val OrderLineMutationErrorDecoder: EntityDecoder[OrderLineMutationError] = jsonOf[OrderLineMutationError]
  implicit val OrderLineMutationErrorEncoder: EntityEncoder[OrderLineMutationError] = jsonEncoderOf[OrderLineMutationError]
}
