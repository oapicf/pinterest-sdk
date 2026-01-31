package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomNumber4Filter._

case class CustomNumber4Filter (
  CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria)

object CustomNumber4Filter {
  import DateTimeCodecs._

  implicit val CustomNumber4FilterCodecJson: CodecJson[CustomNumber4Filter] = CodecJson.derive[CustomNumber4Filter]
  implicit val CustomNumber4FilterDecoder: EntityDecoder[CustomNumber4Filter] = jsonOf[CustomNumber4Filter]
  implicit val CustomNumber4FilterEncoder: EntityEncoder[CustomNumber4Filter] = jsonEncoderOf[CustomNumber4Filter]
}
