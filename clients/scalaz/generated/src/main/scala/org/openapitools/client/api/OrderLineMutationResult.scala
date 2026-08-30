package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineMutationResult._

case class OrderLineMutationResult (
  /* Error list if update(s) fail. */
  errors: Option[List[OrderLineMutationError]],
/* Order Line object array. */
  orderLine: Option[List[OrderLine]])

object OrderLineMutationResult {
  import DateTimeCodecs._

  implicit val OrderLineMutationResultCodecJson: CodecJson[OrderLineMutationResult] = CodecJson.derive[OrderLineMutationResult]
  implicit val OrderLineMutationResultDecoder: EntityDecoder[OrderLineMutationResult] = jsonOf[OrderLineMutationResult]
  implicit val OrderLineMutationResultEncoder: EntityEncoder[OrderLineMutationResult] = jsonEncoderOf[OrderLineMutationResult]
}
