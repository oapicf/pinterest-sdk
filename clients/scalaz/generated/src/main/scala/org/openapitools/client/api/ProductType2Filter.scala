package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductType2Filter._

case class ProductType2Filter (
  PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria)

object ProductType2Filter {
  import DateTimeCodecs._

  implicit val ProductType2FilterCodecJson: CodecJson[ProductType2Filter] = CodecJson.derive[ProductType2Filter]
  implicit val ProductType2FilterDecoder: EntityDecoder[ProductType2Filter] = jsonOf[ProductType2Filter]
  implicit val ProductType2FilterEncoder: EntityEncoder[ProductType2Filter] = jsonEncoderOf[ProductType2Filter]
}
