package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrderStatusResponse._

case class SSIOInsertionOrderStatusResponse (
  /* Salesforce order id */
  pinOrderId: Option[String],
/* Salesforce insertion order status */
  status: Option[String],
/* Salesforce insertion order creation time */
  creationTime: Option[String])

object SSIOInsertionOrderStatusResponse {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderStatusResponseCodecJson: CodecJson[SSIOInsertionOrderStatusResponse] = CodecJson.derive[SSIOInsertionOrderStatusResponse]
  implicit val SSIOInsertionOrderStatusResponseDecoder: EntityDecoder[SSIOInsertionOrderStatusResponse] = jsonOf[SSIOInsertionOrderStatusResponse]
  implicit val SSIOInsertionOrderStatusResponseEncoder: EntityEncoder[SSIOInsertionOrderStatusResponse] = jsonEncoderOf[SSIOInsertionOrderStatusResponse]
}
