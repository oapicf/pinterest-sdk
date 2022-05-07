package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory3Filter._

case class GoogleProductCategory3Filter (
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory3Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory3FilterCodecJson: CodecJson[GoogleProductCategory3Filter] = CodecJson.derive[GoogleProductCategory3Filter]
  implicit val GoogleProductCategory3FilterDecoder: EntityDecoder[GoogleProductCategory3Filter] = jsonOf[GoogleProductCategory3Filter]
  implicit val GoogleProductCategory3FilterEncoder: EntityEncoder[GoogleProductCategory3Filter] = jsonEncoderOf[GoogleProductCategory3Filter]
}
