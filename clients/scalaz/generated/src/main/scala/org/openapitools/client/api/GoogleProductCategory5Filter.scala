package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoogleProductCategory5Filter._

case class GoogleProductCategory5Filter (
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria)

object GoogleProductCategory5Filter {
  import DateTimeCodecs._

  implicit val GoogleProductCategory5FilterCodecJson: CodecJson[GoogleProductCategory5Filter] = CodecJson.derive[GoogleProductCategory5Filter]
  implicit val GoogleProductCategory5FilterDecoder: EntityDecoder[GoogleProductCategory5Filter] = jsonOf[GoogleProductCategory5Filter]
  implicit val GoogleProductCategory5FilterEncoder: EntityEncoder[GoogleProductCategory5Filter] = jsonEncoderOf[GoogleProductCategory5Filter]
}
