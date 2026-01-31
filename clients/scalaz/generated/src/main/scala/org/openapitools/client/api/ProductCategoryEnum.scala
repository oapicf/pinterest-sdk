package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoryEnum._

case class ProductCategoryEnum (
  
object ProductCategoryEnum {
  import DateTimeCodecs._

  implicit val ProductCategoryEnumCodecJson: CodecJson[ProductCategoryEnum] = CodecJson.derive[ProductCategoryEnum]
  implicit val ProductCategoryEnumDecoder: EntityDecoder[ProductCategoryEnum] = jsonOf[ProductCategoryEnum]
  implicit val ProductCategoryEnumEncoder: EntityEncoder[ProductCategoryEnum] = jsonEncoderOf[ProductCategoryEnum]
}
