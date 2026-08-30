package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AttributionScope._

case class AttributionScope (
  
object AttributionScope {
  import DateTimeCodecs._

  implicit val AttributionScopeCodecJson: CodecJson[AttributionScope] = CodecJson.derive[AttributionScope]
  implicit val AttributionScopeDecoder: EntityDecoder[AttributionScope] = jsonOf[AttributionScope]
  implicit val AttributionScopeEncoder: EntityEncoder[AttributionScope] = jsonEncoderOf[AttributionScope]
}
