package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AttributionModel._

case class AttributionModel (
  
object AttributionModel {
  import DateTimeCodecs._

  implicit val AttributionModelCodecJson: CodecJson[AttributionModel] = CodecJson.derive[AttributionModel]
  implicit val AttributionModelDecoder: EntityDecoder[AttributionModel] = jsonOf[AttributionModel]
  implicit val AttributionModelEncoder: EntityEncoder[AttributionModel] = jsonEncoderOf[AttributionModel]
}
