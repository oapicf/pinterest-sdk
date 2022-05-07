package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory4Filter._

case class GoogleProductCategory4Filter (
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory4Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory4FilterCodecJson: CodecJson[GoogleProductCategory4Filter] = CodecJson.derive[GoogleProductCategory4Filter]
  implicit val GoogleProductCategory4FilterDecoder: EntityDecoder[GoogleProductCategory4Filter] = jsonOf[GoogleProductCategory4Filter]
  implicit val GoogleProductCategory4FilterEncoder: EntityEncoder[GoogleProductCategory4Filter] = jsonEncoderOf[GoogleProductCategory4Filter]
}
