package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrderStatus._

case class SSIOInsertionOrderStatus (
  /* Salesforce order id */
  pinOrderId: Option[String],
/* Salesforce insertion order status */
  status: Option[String],
/* Salesforce insertion order creation time */
  creationTime: Option[String])

object SSIOInsertionOrderStatus {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderStatusCodecJson: CodecJson[SSIOInsertionOrderStatus] = CodecJson.derive[SSIOInsertionOrderStatus]
  implicit val SSIOInsertionOrderStatusDecoder: EntityDecoder[SSIOInsertionOrderStatus] = jsonOf[SSIOInsertionOrderStatus]
  implicit val SSIOInsertionOrderStatusEncoder: EntityEncoder[SSIOInsertionOrderStatus] = jsonEncoderOf[SSIOInsertionOrderStatus]
}
