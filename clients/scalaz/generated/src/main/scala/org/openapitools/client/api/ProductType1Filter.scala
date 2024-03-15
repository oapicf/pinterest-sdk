package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductType1Filter._

case class ProductType1Filter (
  PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria)

object ProductType1Filter {
  import DateTimeCodecs._

  implicit val ProductType1FilterCodecJson: CodecJson[ProductType1Filter] = CodecJson.derive[ProductType1Filter]
  implicit val ProductType1FilterDecoder: EntityDecoder[ProductType1Filter] = jsonOf[ProductType1Filter]
  implicit val ProductType1FilterEncoder: EntityEncoder[ProductType1Filter] = jsonEncoderOf[ProductType1Filter]
}
