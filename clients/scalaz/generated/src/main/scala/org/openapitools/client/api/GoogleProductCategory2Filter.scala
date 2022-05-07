package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory2Filter._

case class GoogleProductCategory2Filter (
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory2Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory2FilterCodecJson: CodecJson[GoogleProductCategory2Filter] = CodecJson.derive[GoogleProductCategory2Filter]
  implicit val GoogleProductCategory2FilterDecoder: EntityDecoder[GoogleProductCategory2Filter] = jsonOf[GoogleProductCategory2Filter]
  implicit val GoogleProductCategory2FilterEncoder: EntityEncoder[GoogleProductCategory2Filter] = jsonEncoderOf[GoogleProductCategory2Filter]
}
