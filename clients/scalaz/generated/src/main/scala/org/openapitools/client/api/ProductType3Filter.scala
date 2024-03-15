package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductType3Filter._

case class ProductType3Filter (
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria)

object ProductType3Filter {
  import DateTimeCodecs._

  implicit val ProductType3FilterCodecJson: CodecJson[ProductType3Filter] = CodecJson.derive[ProductType3Filter]
  implicit val ProductType3FilterDecoder: EntityDecoder[ProductType3Filter] = jsonOf[ProductType3Filter]
  implicit val ProductType3FilterEncoder: EntityEncoder[ProductType3Filter] = jsonEncoderOf[ProductType3Filter]
}
