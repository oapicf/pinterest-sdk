package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory1Filter._

case class GoogleProductCategory1Filter (
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory1Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory1FilterCodecJson: CodecJson[GoogleProductCategory1Filter] = CodecJson.derive[GoogleProductCategory1Filter]
  implicit val GoogleProductCategory1FilterDecoder: EntityDecoder[GoogleProductCategory1Filter] = jsonOf[GoogleProductCategory1Filter]
  implicit val GoogleProductCategory1FilterEncoder: EntityEncoder[GoogleProductCategory1Filter] = jsonEncoderOf[GoogleProductCategory1Filter]
}
