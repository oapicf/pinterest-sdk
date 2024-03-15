package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductType0Filter._

case class ProductType0Filter (
  PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria)

object ProductType0Filter {
  import DateTimeCodecs._

  implicit val ProductType0FilterCodecJson: CodecJson[ProductType0Filter] = CodecJson.derive[ProductType0Filter]
  implicit val ProductType0FilterDecoder: EntityDecoder[ProductType0Filter] = jsonOf[ProductType0Filter]
  implicit val ProductType0FilterEncoder: EntityEncoder[ProductType0Filter] = jsonEncoderOf[ProductType0Filter]
}
