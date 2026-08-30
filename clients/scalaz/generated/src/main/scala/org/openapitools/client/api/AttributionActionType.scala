package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AttributionActionType._

case class AttributionActionType (
  
object AttributionActionType {
  import DateTimeCodecs._

  implicit val AttributionActionTypeCodecJson: CodecJson[AttributionActionType] = CodecJson.derive[AttributionActionType]
  implicit val AttributionActionTypeDecoder: EntityDecoder[AttributionActionType] = jsonOf[AttributionActionType]
  implicit val AttributionActionTypeEncoder: EntityEncoder[AttributionActionType] = jsonEncoderOf[AttributionActionType]
}
