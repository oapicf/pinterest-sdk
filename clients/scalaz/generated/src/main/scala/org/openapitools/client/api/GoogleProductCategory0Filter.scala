package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory0Filter._

case class GoogleProductCategory0Filter (
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory0Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory0FilterCodecJson: CodecJson[GoogleProductCategory0Filter] = CodecJson.derive[GoogleProductCategory0Filter]
  implicit val GoogleProductCategory0FilterDecoder: EntityDecoder[GoogleProductCategory0Filter] = jsonOf[GoogleProductCategory0Filter]
  implicit val GoogleProductCategory0FilterEncoder: EntityEncoder[GoogleProductCategory0Filter] = jsonEncoderOf[GoogleProductCategory0Filter]
}
