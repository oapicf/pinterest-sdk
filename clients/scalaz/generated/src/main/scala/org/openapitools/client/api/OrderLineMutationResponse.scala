package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderLineMutationResponse._

case class OrderLineMutationResponse (
  data: Option[OrderLineMutationResult])

object OrderLineMutationResponse {
  import DateTimeCodecs._

  implicit val OrderLineMutationResponseCodecJson: CodecJson[OrderLineMutationResponse] = CodecJson.derive[OrderLineMutationResponse]
  implicit val OrderLineMutationResponseDecoder: EntityDecoder[OrderLineMutationResponse] = jsonOf[OrderLineMutationResponse]
  implicit val OrderLineMutationResponseEncoder: EntityEncoder[OrderLineMutationResponse] = jsonEncoderOf[OrderLineMutationResponse]
}
