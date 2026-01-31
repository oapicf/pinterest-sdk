package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoryDetailLookbackWindow._

case class ProductCategoryDetailLookbackWindow (
  
object ProductCategoryDetailLookbackWindow {
  import DateTimeCodecs._

  implicit val ProductCategoryDetailLookbackWindowCodecJson: CodecJson[ProductCategoryDetailLookbackWindow] = CodecJson.derive[ProductCategoryDetailLookbackWindow]
  implicit val ProductCategoryDetailLookbackWindowDecoder: EntityDecoder[ProductCategoryDetailLookbackWindow] = jsonOf[ProductCategoryDetailLookbackWindow]
  implicit val ProductCategoryDetailLookbackWindowEncoder: EntityEncoder[ProductCategoryDetailLookbackWindow] = jsonEncoderOf[ProductCategoryDetailLookbackWindow]
}
