package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrder._

case class SSIOInsertionOrder (
  /* Salesforce order id */
  pinOrderId: Option[String])

object SSIOInsertionOrder {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderCodecJson: CodecJson[SSIOInsertionOrder] = CodecJson.derive[SSIOInsertionOrder]
  implicit val SSIOInsertionOrderDecoder: EntityDecoder[SSIOInsertionOrder] = jsonOf[SSIOInsertionOrder]
  implicit val SSIOInsertionOrderEncoder: EntityEncoder[SSIOInsertionOrder] = jsonEncoderOf[SSIOInsertionOrder]
}
