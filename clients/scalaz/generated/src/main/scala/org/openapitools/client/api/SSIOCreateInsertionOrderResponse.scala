package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOCreateInsertionOrderResponse._

case class SSIOCreateInsertionOrderResponse (
  /* Salesforce order id */
  pinOrderId: Option[String])

object SSIOCreateInsertionOrderResponse {
  import DateTimeCodecs._

  implicit val SSIOCreateInsertionOrderResponseCodecJson: CodecJson[SSIOCreateInsertionOrderResponse] = CodecJson.derive[SSIOCreateInsertionOrderResponse]
  implicit val SSIOCreateInsertionOrderResponseDecoder: EntityDecoder[SSIOCreateInsertionOrderResponse] = jsonOf[SSIOCreateInsertionOrderResponse]
  implicit val SSIOCreateInsertionOrderResponseEncoder: EntityEncoder[SSIOCreateInsertionOrderResponse] = jsonEncoderOf[SSIOCreateInsertionOrderResponse]
}
