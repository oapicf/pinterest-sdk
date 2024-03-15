package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory6Filter._

case class GoogleProductCategory6Filter (
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory6Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory6FilterCodecJson: CodecJson[GoogleProductCategory6Filter] = CodecJson.derive[GoogleProductCategory6Filter]
  implicit val GoogleProductCategory6FilterDecoder: EntityDecoder[GoogleProductCategory6Filter] = jsonOf[GoogleProductCategory6Filter]
  implicit val GoogleProductCategory6FilterEncoder: EntityEncoder[GoogleProductCategory6Filter] = jsonEncoderOf[GoogleProductCategory6Filter]
}
