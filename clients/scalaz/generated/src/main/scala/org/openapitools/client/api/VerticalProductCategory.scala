package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VerticalProductCategory._

case class VerticalProductCategory (
  
object VerticalProductCategory {
  import DateTimeCodecs._

  implicit val VerticalProductCategoryCodecJson: CodecJson[VerticalProductCategory] = CodecJson.derive[VerticalProductCategory]
  implicit val VerticalProductCategoryDecoder: EntityDecoder[VerticalProductCategory] = jsonOf[VerticalProductCategory]
  implicit val VerticalProductCategoryEncoder: EntityEncoder[VerticalProductCategory] = jsonEncoderOf[VerticalProductCategory]
}
