package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductType4Filter._

case class ProductType4Filter (
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria)

object ProductType4Filter {
  import DateTimeCodecs._

  implicit val ProductType4FilterCodecJson: CodecJson[ProductType4Filter] = CodecJson.derive[ProductType4Filter]
  implicit val ProductType4FilterDecoder: EntityDecoder[ProductType4Filter] = jsonOf[ProductType4Filter]
  implicit val ProductType4FilterEncoder: EntityEncoder[ProductType4Filter] = jsonEncoderOf[ProductType4Filter]
}
