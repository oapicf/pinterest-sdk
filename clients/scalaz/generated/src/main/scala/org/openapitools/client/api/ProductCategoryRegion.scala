package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoryRegion._

case class ProductCategoryRegion (
  
object ProductCategoryRegion {
  import DateTimeCodecs._

  implicit val ProductCategoryRegionCodecJson: CodecJson[ProductCategoryRegion] = CodecJson.derive[ProductCategoryRegion]
  implicit val ProductCategoryRegionDecoder: EntityDecoder[ProductCategoryRegion] = jsonOf[ProductCategoryRegion]
  implicit val ProductCategoryRegionEncoder: EntityEncoder[ProductCategoryRegion] = jsonEncoderOf[ProductCategoryRegion]
}
