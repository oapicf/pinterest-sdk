package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CartingRetailer._

case class CartingRetailer (
  /* Unique identifier for the retailer */
  retailerId: String,
/* Name of the retailer */
  retailerName: String)

object CartingRetailer {
  import DateTimeCodecs._

  implicit val CartingRetailerCodecJson: CodecJson[CartingRetailer] = CodecJson.derive[CartingRetailer]
  implicit val CartingRetailerDecoder: EntityDecoder[CartingRetailer] = jsonOf[CartingRetailer]
  implicit val CartingRetailerEncoder: EntityEncoder[CartingRetailer] = jsonEncoderOf[CartingRetailer]
}
