package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOEditInsertionOrderResponse._

case class SSIOEditInsertionOrderResponse (
  /* Salesforce order id */
  pinOrderId: Option[String])

object SSIOEditInsertionOrderResponse {
  import DateTimeCodecs._

  implicit val SSIOEditInsertionOrderResponseCodecJson: CodecJson[SSIOEditInsertionOrderResponse] = CodecJson.derive[SSIOEditInsertionOrderResponse]
  implicit val SSIOEditInsertionOrderResponseDecoder: EntityDecoder[SSIOEditInsertionOrderResponse] = jsonOf[SSIOEditInsertionOrderResponse]
  implicit val SSIOEditInsertionOrderResponseEncoder: EntityEncoder[SSIOEditInsertionOrderResponse] = jsonEncoderOf[SSIOEditInsertionOrderResponse]
}
