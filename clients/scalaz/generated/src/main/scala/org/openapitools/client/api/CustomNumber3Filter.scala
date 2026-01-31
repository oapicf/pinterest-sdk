package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomNumber3Filter._

case class CustomNumber3Filter (
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria)

object CustomNumber3Filter {
  import DateTimeCodecs._

  implicit val CustomNumber3FilterCodecJson: CodecJson[CustomNumber3Filter] = CodecJson.derive[CustomNumber3Filter]
  implicit val CustomNumber3FilterDecoder: EntityDecoder[CustomNumber3Filter] = jsonOf[CustomNumber3Filter]
  implicit val CustomNumber3FilterEncoder: EntityEncoder[CustomNumber3Filter] = jsonEncoderOf[CustomNumber3Filter]
}
