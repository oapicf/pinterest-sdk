package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductTagItem._

case class ProductTagItem (
  /* Pin ID of the product pin to tag onto the hero pin. */
  pinId: String)

object ProductTagItem {
  import DateTimeCodecs._

  implicit val ProductTagItemCodecJson: CodecJson[ProductTagItem] = CodecJson.derive[ProductTagItem]
  implicit val ProductTagItemDecoder: EntityDecoder[ProductTagItem] = jsonOf[ProductTagItem]
  implicit val ProductTagItemEncoder: EntityEncoder[ProductTagItem] = jsonEncoderOf[ProductTagItem]
}
