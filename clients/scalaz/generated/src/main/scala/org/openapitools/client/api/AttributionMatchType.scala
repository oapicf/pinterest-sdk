package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AttributionMatchType._

case class AttributionMatchType (
  
object AttributionMatchType {
  import DateTimeCodecs._

  implicit val AttributionMatchTypeCodecJson: CodecJson[AttributionMatchType] = CodecJson.derive[AttributionMatchType]
  implicit val AttributionMatchTypeDecoder: EntityDecoder[AttributionMatchType] = jsonOf[AttributionMatchType]
  implicit val AttributionMatchTypeEncoder: EntityEncoder[AttributionMatchType] = jsonEncoderOf[AttributionMatchType]
}
